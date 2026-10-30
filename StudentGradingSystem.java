import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int students = input.nextInt();

        System.out.print("Number of subjects: ");
        int subjects = input.nextInt();

        int[][] scores = new int[students][subjects];
        int[] totals = new int[students];

        for (int learner = 0; learner < students; learner++) {

            for (int subject = 0; subject < subjects; subject++) {

                System.out.print("Enter score: ");
                int score = input.nextInt();

                while (score < 0 || score > 100) {
                    System.out.print("Invalid score, please enter score between 0 and 100: ");
                    score = input.nextInt();
                }

                scores[learner][subject] = score;
                totals[learner] = totals[learner] + score;
            }
        

            System.out.println("Total: " + totals[learner]);
            System.out.println("Average: "
                    + totals[learner] / (double) subjects);
        }

        
    }
}


