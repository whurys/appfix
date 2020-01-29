package appfix.tools;

import java.io.InputStream;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class Resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		InputStream input = externalContext.getResourceAsStream("/resources/movies.xml");

	}

}
