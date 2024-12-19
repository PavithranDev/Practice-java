
class vehicle {
	 String brand;
	 int year;
	 void startEngine() {
		 System.out.println("engine on");
	 }
}
//subclass for vehicle
class car extends vehicle{
	String fueltype;
	void startEngine() {
		System.out.println("car started");
	}
	void drive() {
		System.out.println("car is driving");
	}
}
//subclass for vehicle
class truck extends vehicle{
	int loadcapacity;
	void startEngine() {
		System.out.println("truck engine starts");
	}
	void hual() {
		System.out.println("truck is hualing");
	}
}
public class Main {

	public static void main(String[] args) {
		car car=new car();
		car.brand="trio";
		car.year=2001;
		car.fueltype="petrol";
		car.startEngine();
		car.drive();
		
		truck truck=new truck();
		truck.brand="tipper";
		truck.year=2024;
		truck.loadcapacity=200;
		truck.startEngine();
		truck.hual();

	}

}
