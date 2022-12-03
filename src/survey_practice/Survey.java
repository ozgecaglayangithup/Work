package survey_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        ArrayList<Participant> participants = new ArrayList<>();
        int maxAge = 0, minAge = Integer.MAX_VALUE;


        do{
            System.out.println(SurveyQuestions.askToJoin);
            String answer1 = scanner.nextLine();

            if(answer1.toLowerCase().startsWith("y")){
                //Getting current participant's name
                System.out.println(SurveyQuestions.askName);
                String name = scanner.nextLine();

                //Getting current participant's age
                System.out.println(SurveyQuestions.askAge);
                int age = scanner.nextInt();
                scanner.nextLine();

                // Finding max and min age all participants
                if(age > maxAge) maxAge = age;
                if(age < minAge) minAge = age;

                //Getting current participant's gender
                System.out.println(SurveyQuestions.askGender);
                char gender = scanner.nextLine().toUpperCase().charAt(0);

                Participant participant = new Participant(name, age, gender);
                participants.add(participant);
                Participant.addParticipants();

                if(gender == 'M') Participant.addMaleParticipants();
                else Participant.addFemaleParticipants();

            }

        }while (Participant.totalNumberOfParticipants < 3);

        for (Participant p : participants) {
            System.out.println(p);
        }

        System.out.println("Total number of male  participants is = " + Participant.getTotalNumberOfMaleParticipants);
        System.out.println("Total number of female participants is = " + Participant.getTotalNumberOfFemaleParticipants);


        System.out.println("The youngest person is " + minAge);
        System.out.println("The oldest person is " + maxAge);

    }
}
