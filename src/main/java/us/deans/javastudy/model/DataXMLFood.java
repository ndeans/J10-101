package us.deans.javastudy.model;

public class DataXMLFood {

	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", calories=" + calories + ", name=" + name + ", description=" + description + "]";
	}
	
	private String id;
	private String name;
	private String price;
	private String description;
	private String calories;
	
}
