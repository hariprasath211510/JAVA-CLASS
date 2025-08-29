import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = s.next();

        System.out.println("Enter the ID:");
        int Id = s.nextInt();
        s.nextLine(); 

        System.out.println("Enter the class name:");
        String group = s.nextLine();

        String[] questions = {
            "1. Who is known as the father of Java?",
            "2. What is the nature of Java in terms of platform?",
            "3. What is the main function of the main() method in Java?"
        };

        String[][] options = {
            {"Bjarne Stroustrup", "James Gosling", "Dennis Ritchie", "Guido van Rossum"},
            {"Platform dependent", "Platform independent", "Depends on OS", "None of the above"},
            {"It is where the program ends", "It handles exceptions", "It is the entry point of any Java program", "It defines class structure"}
        };

        String[] correctAnswers = {
            "James Gosling",
            "Platform independent",
            "It is the entry point of any Java program"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            
            for (int j = 0; j < options[i].length; j++) {
                char optionLabel = (char) ('A' + j);
                System.out.println(optionLabel + ". " + options[i][j]);
            }

            System.out.print("Enter your option (A/B/C/D): ");
            char userChoice = Character.toUpperCase(s.next().charAt(0));
            int selectedIndex = userChoice - 'A';

            if (selectedIndex < 0 || selectedIndex >= options[i].length) {
                System.out.println("Invalid choice\n");
                continue;
            }

            String selectedAnswer = options[i][selectedIndex];
            String correctAnswer = correctAnswers[i];

            if (selectedAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct\n");
                score++;
            } else {
                System.out.println("Incorrect. Correct answer: " + correctAnswer + "\n");
            }
        }


        System.out.println("\n--- Quiz Completed ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + Id);
        System.out.println("Group: " + group);
        System.out.println("Score: " + score + " out of " + questions.length);
    }
}
