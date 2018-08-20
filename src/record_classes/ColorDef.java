package record_classes;

public class ColorDef {

	private String name;
	private int level;
	
	public ColorDef(String name, int level) {
		this.name = name;
		this.setLevel(level);
	}
	
	public String toString() {
		return this.name + ", " + this.level;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
