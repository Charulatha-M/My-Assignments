package week1.day1;

public class Bike {
 public void Yahama() {
	 System.out.println("My Fav Bike");
 }
public static void main(String[] args) {
	Car action=new Car();
	Bike fav=new Bike();
	action.applyBrake();
	action.soundHorn();
	fav.Yahama();
}
}
