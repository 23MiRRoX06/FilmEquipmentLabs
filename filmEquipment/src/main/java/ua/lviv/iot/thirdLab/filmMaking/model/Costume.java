package ua.lviv.iot.thirdLab.filmMaking.model;

public class Costume extends AbstarctShootingEquipment {
	
	private int yearOfUse;
	private String category;
	private String sizeEur;
	private Quality fabricQuality;
	private String components;

	public Costume(int productionYear, int yearOfUse, String category) {
		super(productionYear);
		this.setYearOfUse(yearOfUse);
		this.setCategory(category);
	}

	public String getSizeEur() {
		return sizeEur;
	}

	public void setSizeEur(String sizeEur) {
		this.sizeEur = sizeEur;
	}

	public Quality getFabricQuality() {
		return fabricQuality;
	}

	public void setFabricQuality(Quality fabricQuality) {
		this.fabricQuality = fabricQuality;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public int getYearOfUse() {
		return yearOfUse;
	}

	public void setYearOfUse(int yearOfUse) {
		this.yearOfUse = yearOfUse;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
