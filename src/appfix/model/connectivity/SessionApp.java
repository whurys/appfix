package appfix.model.connectivity;

public class SessionApp {
	
	private int id;
	private String name;
	private String pathSessionSetting;
	
	public SessionApp() {
		super();
	}
	
	public SessionApp(int id, String name, String pathSessionSetting) {
		super();
		this.id = id;
		this.name = name;
		this.pathSessionSetting = pathSessionSetting;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPathSessionSetting() {
		return pathSessionSetting;
	}
	public void setPathSessionSetting(String pathSessionSetting) {
		this.pathSessionSetting = pathSessionSetting;
	}

}
