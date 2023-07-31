public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Tharindu");
        emp.setAge(22);
        emp.setSalary(75000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}