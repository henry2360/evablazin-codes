public class EmployeeTest {
   public static void main (String[] args){
    Employee firstEmployee =new Employee("Janneth", "Jackson", 500.00);
Employee secondEmployee =new Employee("Micheal", "Jackson",200.00);


firstEmployee.setFirstName("Jane");
System.out.println(firstEmployee.getFirstName());
secondEmployee.setLastName("Jack");
System.out.println(secondEmployee.getLastName());

System.out.printf("Annual salary of first employee: %f%n", (firstEmployee.getSalary() *12));
System.out.printf("Annual salary of second employee: %f%n", (secondEmployee.getSalary() *12));


double firstEmployeeRaise = firstEmployee.getSalary() * 12 * 1.1;
double secondEmployeeRaise = secondEmployee.getSalary() * 12 * 1.1;

firstEmployee.setSalary(firstEmployeeRaise);
secondEmployee.setSalary(secondEmployeeRaise);

		System.out.printf("Annual salary of first employee: %f%n", firstEmployee.getSalary());
		System.out.printf("Annual salary of second employee: %f%n", secondEmployee.getSalary());
	}
}
