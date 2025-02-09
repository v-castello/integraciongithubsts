package entities;

public class ObjectD {
	private int id;
	private String name;
	private String direcction;
	private String city;

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

	public String getDirecction() {
		return direcction;
	}

	public void setDirecction(String direcction) {
		this.direcction = direcction;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ObjectD(int id, String name, String direcction, String city) {
		super();
		this.id = id;
		this.name = name;
		this.direcction = direcction;
		this.city = city;
	}

	public ObjectD() {
		super();
	}

@Override
public String toString() {
	return "ObjectD [id=" + id + ", name=" + name + ", direcction=" + direcction + ", city=" + city + "]";
	}
}
