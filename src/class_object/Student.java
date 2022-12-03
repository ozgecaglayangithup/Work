package class_object;

public  class  Student {




    public Student() {}
   // Create a constructor that takes 2 args

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        addStudent();
    }

        public static int numberOfStudents = 0;
        public static final String program = "Software Engineer in Test Program";

        public String firstName;
        public String lastName;
        public int age;
        public Teacher teacher;

        public void study() {
            System.out.println(this.firstName + " studies");
        }
        public void rests(){
            System.out.println(this.firstName + " " + this.lastName + " has rest");
        }
        public static void addStudent(){
            numberOfStudents++;
        }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}