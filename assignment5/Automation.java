package assignment5;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		System.out.println("Testool is Selenium");
		
	}

	public void java() {
		System.out.println("Implement Selenium using Java");
		
	}
public static void main(String[] args) {
	Automation obj=new Automation();
	obj.java();
	obj.Selenium();
	obj.ruby();
}

@Override
public void ruby() {
	System.out.println("Ruby is overrided");
	
}
}
