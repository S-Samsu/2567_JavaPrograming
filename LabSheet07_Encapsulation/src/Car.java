
public class Car {
	
	private String companyName;
	private String modelName;
	private int years;
	private double mileage;
	
	Car(){
		companyName = "Unknown";
		modelName = "Unknown";
		years = 2000;
		mileage = 0.0;
		
	}
	
	Car(String companyName,String modelName,int years,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		
		this.years = years <1886?2000:years;
		this.mileage = mileage;
	}		
	
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public void setYear(int years) {
		if(years>1886) {
			this.years = years;
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	
	public int getYears() {
		return this.years;
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
}
