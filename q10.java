import java.util.Scanner;
public class q10{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number= ");
        int n=in.nextInt();
        int power=1;
        while (3 * power <= n) {
            power=power*3;
        }
        System.out.println("The largest power of 3 less than or equal to " + n + " is " + power);
        in.close();
    }
}
