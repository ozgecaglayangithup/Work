package class_object;

import java.util.Collections;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {

        /*
        Create a Teacher object
        Create 4 students objects

        Add student to Teacher Student List
        Find the age difference bt the oldest and youngest student
         */

        Teacher teacher1 = new Teacher("Alex", "Smith");

        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Smith", 25);
        Student student4 = new Student("Robert", "Smith", 50);

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher1.addStudent(student3);
        teacher1.addStudent(student4);


        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;
        for (Student student : teacher1.getStudents()) {
            if (student.age > maxAge) maxAge = student.age;
            if (student.age < minAge) minAge = student.age;

        }
        System.out.println(maxAge - minAge);

    }
}

