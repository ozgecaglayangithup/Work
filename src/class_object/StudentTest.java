package class_object;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(Student.numberOfStudents);
        System.out.println(Student.program);

        Student student1 = new Student("John", "Doe", 45);

        System.out.println(student1);

        // Student.addStudent();
        System.out.println(Student.numberOfStudents); // it will be now 1

       student1.study();
       student1.rests();



    }
}
