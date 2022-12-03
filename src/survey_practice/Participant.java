package survey_practice;

public class Participant {

    public static int totalNumberOfParticipants = 0;
    public static int getTotalNumberOfMaleParticipants;
    public static int getTotalNumberOfFemaleParticipants;

    public Participant(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String name;
    public int age;
    public char gender;


    public static void addParticipants() {
        totalNumberOfParticipants++;
    }
    public static void addMaleParticipants(){
        getTotalNumberOfMaleParticipants++;
    }
    public static void addFemaleParticipants(){
        getTotalNumberOfFemaleParticipants++;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
