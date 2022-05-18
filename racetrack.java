class Racetrack{
	public static void main(String[] args){
		Car c1 = new Car(2022,"BMW",180);
		System.out.println(c1.getyear()+" "+c1.getmake()+" "+c1.getspeed());
		c1.accl();
		System.out.println(c1.getspeed());
	}
}