package myPractise;

class BiCycle {

	public int gear;
	public int speed;

	
	public BiCycle(int gear, int speed) {

		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int decrement) {

		speed = speed - decrement;
	}

	public void speedUp(int increment) {

		speed = speed + increment;
	}

	@Override
	public String toString() {
		return "BiCycle [gear=" + gear + ", speed=" + speed + "]";
	}

}

class MountainBike extends BiCycle {

	public MountainBike(int gear, int speed, int height) {
		super(gear, speed);
		seatHeight= height;
	}

	public int seatHeight;

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setHeight(int newValue) {

		seatHeight = newValue;

	}
}

public class Test {
	public static void main(String[] args) {

		MountainBike mb = new MountainBike(3, 90, 200);
		mb.setHeight(250);
		System.out.println(mb);
		
		
	}

}
