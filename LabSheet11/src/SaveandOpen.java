import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
	
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtFile//employee.txt",true));
		String answer;
		do {
			super.header();
			
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			writeFile.println(name+","+dept);
			System.out.print("Do you want to input data again? : ");
			answer = input.next();
		}while(answer.equals("y"));
	}
	
	public void searchData() throws IOException {
		try{
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i=0;
			boolean check = false;
			super.header();
			while (readFile.hasNext()) {
				name =  readFile.next();
				dept =  readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.print("Employee in dept "+ super.getDept()+" is "+ i +" person(s)");
				}
				if(check) {
					super.header();
					System.out.print("Employee in dept "+ super.getDept()+
							" is "+ i +" person(s).");
					System.out.println();
					super.header();
				}
				else {
					System.out.println("\nSorry, no dept: "+super.getDept()+" in file.");
				}									
			}
		}catch (IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}
}
