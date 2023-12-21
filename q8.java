import java.util.Scanner;
public class q8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int compGuess=(int)(9*Math.random()+1);
        int userGuess;
        boolean isCorrect=false;
        do {
            System.out.print("Guess the number: ");
            userGuess=in.nextInt();
            if (userGuess<compGuess)
                System.out.println("Too low, try again!\n");
            else if (userGuess>compGuess)
                System.out.println("Too high, try again!\n");
            else
                isCorrect=true;
        } while (!isCorrect);
        System.out.println("Good guess.");
        in.close();
    }
}
