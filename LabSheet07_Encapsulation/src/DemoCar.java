
public class DemoCar {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		System.out.println("Company Name: "+car1.getCompanyName());
		System.out.println("Model Name: "+car1.getModelName());
		System.out.println("Year: "+car1.getYears());
		System.out.println("Mileage: "+car1.getMileage());
		System.out.println();
		System.out.println("Update Car Details");
		Car carUpdate = new Car("Toyota", "Chorolla", 2015, 150000.0);
		System.out.println("Company Name: "+carUpdate.getCompanyName());
		System.out.println("Model Name: "+carUpdate.getModelName());
		System.out.println("Year: "+carUpdate.getYears());
		carUpdate.setYear(0);
		carUpdate.setModelName("");
		
	}

}
