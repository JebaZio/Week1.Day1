package week3.day1;

public class Students {	
	public void getStudentInfo(int id) {
		System.out.println("Student ID = " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID = " + id);
		System.out.println("Student Name = " + name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email = " + email);
		System.out.println("Student PhoneNumber = " + phoneNumber);
	}
	
	public static void main(String args[]) {
		Students stuObj = new Students();
		stuObj.getStudentInfo(12);
		stuObj.getStudentInfo(12, "Jeba");
		stuObj.getStudentInfo("jeba.xavier@gmail.com", 9884772552L);
	}

}

