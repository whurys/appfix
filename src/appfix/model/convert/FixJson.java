package appfix.model.convert;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import quickfix.FieldNotFound;
import quickfix.Message;

public class FixJson {
	
	//private static final Gson gson = new Gson();
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	private static Map<Integer, String> tagToNameMap = new HashMap<>();

	public static void main(String[] args) {
	

	}
	
	public static String fix2Json(Message message) {
		JsonObject jsonObject = new JsonObject();

		quickfix.Message.Header header = message.getHeader();
		Iterator<quickfix.Field<?>> headerIterator = header.iterator();
		while (headerIterator.hasNext()) {
			quickfix.Field<?> field = headerIterator.next();

			String name = tagToNameMap.get(field.getTag());
			if (name == null) {
				name = String.valueOf(field.getTag());
			}
			try {
				jsonObject.addProperty(name, header.getString(field.getTag()));
			} catch (FieldNotFound fieldNotFound) {
				// ignore, should not happen
			}
		}

		Iterator<quickfix.Field<?>> bodyIterator = message.iterator();
		while (bodyIterator.hasNext()) {
			quickfix.Field<?> field = bodyIterator.next();

			String name = tagToNameMap.get(field.getTag());
			if (name == null) {
				name = String.valueOf(field.getTag());
			}
			try {
				jsonObject.addProperty(name, message.getString(field.getTag()));
			} catch (FieldNotFound fieldNotFound) {
				// ignore, should not happen
			}
		}
		
		quickfix.Message.Trailer trailer = message.getTrailer();
		Iterator<quickfix.Field<?>> trailerIterator = trailer.iterator();
		while (trailerIterator.hasNext()) {
			quickfix.Field<?> field = trailerIterator.next();

			String name = tagToNameMap.get(field.getTag());
			if (name == null) {
				name = String.valueOf(field.getTag());
			}
			try {
				jsonObject.addProperty(name, trailer.getString(field.getTag()));
			} catch (FieldNotFound fieldNotFound) {
				// ignore, should not happen
			}
		}

		//jsonObject.addProperty("RawData", message.toString());

		return gson.toJson(jsonObject);
	}

}
