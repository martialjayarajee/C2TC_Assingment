package Assingment1.utilities;
import Assingment1.employees.Developers;
import Assingment1.employees.Manager;
import Assingment1.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
        manager m = new manager();
        m.setEmployeeId(1);
        m.setName("Alice");
        m.setSalary(90000);
        m.setDepartment("HR");

        Developers d = new Developers();
        d.setEmployeeId(2);
        d.setName("Bob");
        d.setSalary(70000);
        d.setProgrammingLanguage("Java");

        EmployeeUtilities util = new EmployeeUtilities();
        util.printEmployeeDetails(m);
        util.printEmployeeDetails(d);

        util.updateSalary(d, 80000);
        System.out.println("After salary update:");
        util.printEmployeeDetails(d);
    }
}
