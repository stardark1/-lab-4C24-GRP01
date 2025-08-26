public class StudentReport {

    public void generateReport(StudentModel student) {
        System.out.println("=== Student Report ===");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("======================");
    }
}
