package Practice;

public class EmployeeMain {

	public static void main(String[] args) {
		// Create a Employe instance/object

				Employee emp1 = new Employee();
				emp1.eid = 100;
				emp1.ename = "melvin";
				emp1.dept = "Engineering";
				emp1.sal = 10000;
				emp1.display();
				
				
				Employee emp2 = new Employee();
				emp2.eid =101;
				emp2.ename = "kevin";
				emp2.dept = "HR";
				emp2.sal = 20000;
				emp2.display();
				

	}

}
