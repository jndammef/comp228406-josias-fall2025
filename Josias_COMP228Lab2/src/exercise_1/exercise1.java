import javax.swing.JOptionPane;
import java.util.Random;

public class exercise1 {
    // I define my instance variables
    private int correctAnswers;
    private int incorrectAnswers;
    private Random randomNum;

    // We define our non parameterized constructor that will be use when we call the class
    public exercise1() {
        correctAnswers = 0;
        incorrectAnswers = 0;
        randomNum = new Random();
    }

    public String simulateQuestion(int questionNumber) {
        String question = "";

        switch (questionNumber) {
            case 1:
                question = "Question 1: What is Java Class Library?\n\n" +
                        "1. A type of popular coffee\n" +
                        "2. list of all classes that are part of the JDK\n" +
                        "3. A collection of books written in Java\n" +
                        "4. A database system\n\n" +
                        "Enter your answer (1-4):";
                break;
            case 2:
                question = "Question 2: What does JVM stand for?\n\n" +
                        "1. Java Virtual Machine\n" +
                        "2. Java Variable Method\n" +
                        "3. Just Very Much\n" +
                        "4. Java Visual Manager\n\n" +
                        "Enter your answer (1-4):";
                break;
            case 3:
                question = "Question 3: How do you obtain an input from the user in Java?\n\n" +
                        "1. number1 = System.out.println('enter a number');\n" +
                        "2. number1 = input.nextInt();\n" +
                        "3. number1 = 'enter a number';\n" +
                        "4. number1 = ''\n\n" +
                        "Enter your answer (1-4):";
                break;
            case 4:
                question = "Question 4: Which one of the following symbols indicates a single line comment in Java application source code:\n\n" +
                        "1. //\n" +
                        "2. ##\n" +
                        "3. $\n" +
                        "4. #!\n\n" +
                        "Enter your answer (1-4):";
                break;
            case 5:
                question = "Question 5: What is the main function of a Java compiler?\n\n" +
                        "1. It places the program in memory to execute it\n" +
                        "2. It examines the bytecodes to ensure that they  are valid\n" +
                        "3. It translates the Java source code into bytecodes that represent the tasks to execute.\n" +
                        "4. It executes the bytecodes\n\n" +
                        "Enter your answer (1-4):";
                break;
        }

        return question;
    }

    //Here we will check the user's answer
    public boolean checkAnswer(int questionNum, int userSlection) {
        int correctAnswer = 0;

        switch (questionNum) {
            case 1:
                correctAnswer = 2;
                break;
            case 2:
                correctAnswer = 1;
                break;
            case 3:
                correctAnswer = 2;
                break;
            case 4:
                correctAnswer = 1;
                break;
            case 5:
                correctAnswer = 3;
                break;
        }

        if (userSlection == correctAnswer) {
            correctAnswers++; // Increment correct answer counter that will be displayed at the end
            return true;
        } else {
            incorrectAnswers++; // Increment incorrect answer counter that will be displayed at the end
            return false;
        }
    }

    // Method used to generate random message
    public String generateMessage(boolean isCorrect) {
        String message = "";

        if (isCorrect) {
            switch (randomNum.nextInt(4)) {
                case 0:
                    message = "Excellent!";
                    break;
                case 1:
                    message = "Good!";
                    break;
                case 2:
                    message = "Keep up the good work!";
                    break;
                case 3:
                    message = "Nice work!";
                    break;
            }
        } else {
            switch (randomNum.nextInt(4)) {
                case 0:
                    message = "No. Please try again";
                    break;
                case 1:
                    message = "Wrong. Try once more";
                    break;
                case 2:
                    message = "Don't give up!";
                    break;
                case 3:
                    message = "No. Keep trying...";
                    break;
            }
        }

        return message;
    }

    // This is the method that will interact with the user
    public void inputAnswer() {
        for (int i = 1; i <= 5; i++) {
            String question = simulateQuestion(i);

            String userInput = JOptionPane.showInputDialog(question);

            //This will check if user clicked Cancel or closed the dialog and display a custom message
            if (userInput == null) {
                JOptionPane.showMessageDialog(null, "Your test was cancelled!");
                return;
            }

            int userSlection = Integer.parseInt(userInput); //we convert the user input

            boolean isCorrect = checkAnswer(i, userSlection);

            String message = generateMessage(isCorrect);

            JOptionPane.showMessageDialog(null, message);
        }

        // Let's calculate the percentage of correct/incorrect answers
        int totalQuestions = correctAnswers + incorrectAnswers;
        double percentage = 0;
        if (totalQuestions > 0) {
            percentage = (double) correctAnswers / totalQuestions * 100;
        }

        // Results summary displayed to the user
        String results = "You have completed your test!\n\n" +
                "Correct Answers: " + correctAnswers + "\n" +
                "Incorrect Answers: " + incorrectAnswers + "\n" +
                "Percentage of correct answers: " + String.format("%.2f", percentage) + "%"; //format specifier is really handy here

        JOptionPane.showMessageDialog(null, results);
    }
}
