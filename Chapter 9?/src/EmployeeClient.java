public class EmployeeClient {
    public static void main(String[] args)
    {
        Employee ed = new Lawyer(21);
        System.out.println(ed.getSalary());
        System.out.println(ed.getVacationForm());
    }
}
