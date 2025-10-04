import java.util.Random;

public class exercise2 {
    private int[] playerNum;

    //we initialize an empty constructor
    public exercise2() {
    }

    public int[] getNumbers() {

        playerNum = new int[3];
        Random random = new Random();

        //we generate 3 random numbers
        for (int i = 0; i < 3; i++) {
            playerNum[i] = random.nextInt(9) + 1;
        }

        return playerNum;
    }
}