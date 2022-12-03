package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Alex", "Morgan");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);



        Student student1 = new Student("Mike", "Simith", 25);
        Student student2 = new Student("Jane", "Smith", 30);
        Student student3 = new Student("Ozge", "Caglayan", 20);
        Student student4 = new Student("Ozan", "Atici", 30);
        Student student5 = new Student("Ozden", "Bostanci", 30);


        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);

        // Print all the students name for the teacher John
        // expected output = jane and Mike
        System.out.println(teacher1.getStudents());



        for(Student s : teacher1.getStudents()){
           System.out.println(s.firstName);
       }



       /*
       Find the average age of the students of Alex
        */
        int sumOfAges = 0;
        int totalStudents = 0;
        for(Teacher teacher : teachers) {
            if (teacher.fName.equals("Alex")) {
                totalStudents = teacher.getStudents().size();
               for(Student student : teacher.getStudents()){
                   sumOfAges += student.age;
               }
            }
        }
        System.out.println(sumOfAges / totalStudents);

    }
}
