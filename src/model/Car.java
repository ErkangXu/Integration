package model;

public class Car implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vin;
	private String model;
	private String make;
	private String sellerName;
	private String sellerPhoneNumber;
	private int mileage;
	private int price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vinParameter) {
		vin = vinParameter;
	}
	public String getSellerPhoneNumber() {
		return sellerPhoneNumber;
	}
	public void setSellerPhoneNumber(String sellerPhoneNumber) {
		this.sellerPhoneNumber = sellerPhoneNumber;
	}

}
