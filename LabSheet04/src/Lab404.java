import java.util.*;
public class Lab404 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {		
		inputStudent();
	}
	
	public static void inputStudent() {	
		String studentID, subjectCode;
		boolean isStudentValid, isSubjectCodeValid;
		while(true) {
		System.out.print("Enter Student Id: ");
		studentID = input.nextLine();
		
		System.out.print("Enter Subject Id: ");
		subjectCode = input.nextLine();
		
		isStudentValid = isLength(studentID, 10);
		isSubjectCodeValid = isLength(subjectCode, 7);
		
		if (isStudentValid && isSubjectCodeValid) {
			boolean isITStudent = isITStudent (studentID);
			boolean isITSubject = isITSubject (subjectCode);
			System.out.println("");
			System.out.print("Student Id: "+studentID);
			displayData(isITStudent,isITSubject);
			break;
		}
		}
	}
	
	public static boolean isITStudent(String checkId) {
		if(checkId.substring(0,6) == "211311") {
			return true;
		}
		else {
			return false;
		}
	}
	
    public static boolean isITSubject(String checkSub) {
    	if(checkSub.substring(0,2) == "21" && checkSub.charAt(4) == '1') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isLength(String input,int len) {		
		return input.length() == len;
	}
	
	public static void displayData(boolean isStu, boolean isSub) {
		if(isStu) {
			System.out.print(" 1st year student in IT\n");
		}else {
			System.out.print(" is not 1st year student in IT\n");
		}
		
		if(isSub) {
			System.out.print("Enroll in courses for Year 1");
		} else {
			System.out.print("Not enroll in courses for Year 1");
		}
		}
	}


