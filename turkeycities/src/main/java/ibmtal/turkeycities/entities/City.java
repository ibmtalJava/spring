package ibmtal.turkeycities.entities;

public class City {
	private int id;
	private String name;
	private String postalCode;
	private String plateCode;
	public City() {
		super();
	}
	public City(int id, String name, String postalCode, String plateCode) {
		super();
		this.id = id;
		this.name = name;
		this.postalCode = postalCode;
		this.plateCode = plateCode;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPlateCode() {
		return plateCode;
	}
	public void setPlateCode(String plateCode) {
		this.plateCode = plateCode;
	}
	
}
