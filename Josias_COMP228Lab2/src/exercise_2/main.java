import javax.swing.JOptionPane;

public static void main(String[] args) {

    String input = JOptionPane.showInputDialog("Welcome to our lotto game \n" + "Choose a number between 3 and 27:");
    int userNum = Integer.parseInt(input);

    boolean userWins = false;

    // Run the lotto up to 5 times
    for (int i = 1; i <= 5; i++) {
        //we instantiate a new object of exercise2
        exercise2 lottoGame = new exercise2();
        int[] numbers = lottoGame.getNumbers();
        int sum = numbers[0] + numbers[1] + numbers[2];

        JOptionPane.showMessageDialog(null, "Roll No: " + i + ":\nNumbers selected: " +
                numbers[0] + ", " + numbers[1] + ", " + numbers[2] +
                "\nSum of the numbers: " + sum);

        if (sum == userNum) {
            JOptionPane.showMessageDialog(null, "Congratulations! You won!\n" +
                    "The number you entered matches the sum of this roll!");
            userWins = true;
            break;
        }
    }

    //if after the loop (5 times) user does not win this condition below is executed
    if (!userWins) {
        JOptionPane.showMessageDialog(null, "Unfortunately computer wins!\n" +
                "The number you entered did not match any sum in 5 rolls.\n" + "Try another time, you might be luckier.");
    }
}
