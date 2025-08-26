public class StudentView {
    //gabo loca 
    public void printStudentDetails(StudentModel student) {
        System.out.println("Student: " + student.getName() 
            + " | ID: " + student.getId() 
            + " | Age: " + student.getAge());
    }
}
