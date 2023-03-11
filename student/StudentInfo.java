package student;

public class StudentInfo {

	public int getStudentInfo(int id) {
		id=123;
		System.out.println("Student Id is "+id);
		return id;
	}
	public int getStudentInfo(int id, String Name) {
		id=123;
		Name="Charu";
		System.out.println("Student Id is "+id);
		System.out.println("Student Name is "+Name);
		return id;
}
	public void getStudentInfo(String mailid, String Phno) {
		mailid="charulathamohan.12@gmail.com";
		Phno="9840820082";
		System.out.println("Mail id: "+mailid);
		System.out.println("Phone Number: "+Phno);
}
	public static void main(String[] args) {
		StudentInfo info=new StudentInfo();
		info.getStudentInfo(123);
		info.getStudentInfo(123, "Charu");
		info.getStudentInfo(null, null);
	}
}