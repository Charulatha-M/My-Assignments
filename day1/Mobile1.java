package week1.day1;

public class Mobile1 {
public void makeCall() {
	String mobileModel;
	float mobileWeight;
	mobileModel="Vivo Y25";
	mobileWeight=400.25f;
	System.out.println("Mobile Model="+mobileModel);
	System.out.println("Mobile Weight="+mobileWeight);
}
public void sendMsg() {
	boolean isFullCharged;
	int mobileCost;
 mobileCost=25000;
 isFullCharged=true;
System.out.println("MobileCost="+mobileCost);
System.out.println("Charged=100%");
}
 public static void main(String[] args) {
	Mobile1 mob=new Mobile1();
	mob.makeCall();
	mob.sendMsg();
	System.out.println("This is my Mobile");
}

}
