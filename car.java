class Car{
	private int year;
	private String make;
	private double speed;
	Car(int year, String make, double speed){
		this.year = year;
		this.make = make;
		this.speed = speed;
	}
	int getyear(){
		return year;
	}
	String getmake(){
		return make;
	}
	double getspeed(){
		return speed;
	}
	void accl(){
		speed = speed+20;
	}
}