import java.text.DecimalFormat;
import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Input empolyee id : ");
		String empID = input.next();
		input.nextLine();
		System.out.print("Input employee name : ");
		String empName = input.nextLine();
		System.out.print("Input employee salary : ");
		double empSalary = input.nextDouble();
		System.out.print("Input employee sales : ");
		double empSales = input.nextDouble();
		System.out.println();
		Sales emp1 = new Sales(empID, empName, empSalary, empSales);
		System.out.println(emp1);
		System.out.printf("Total salary "+frm.format(emp1.getSalary()+emp1.getCommission())+" baht.");
		
	}

}
