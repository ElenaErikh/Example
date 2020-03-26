import ru.hw.from.site.employee.Employee;

public class EmployeeTest {


    public static void main(String[] args) {
        Employee empOne = new Employee("Oleg Olegov");
        Employee empTwo = new Employee("Ivan Ivanov");

        empOne.empAge(26);
        empOne.empDesignation("Senior IT programmer");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Engeneer programmer");
        empTwo.empSalary(50000);
        empTwo.printEmployee();
    }



}
