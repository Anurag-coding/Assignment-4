import java.util.Scanner;
public class q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the base: ");
        System.out.println("Enter the power: ");
         int base=in.nextInt();
        int power=in.nextInt();
        int res=base;
        for (int i = 1; i < power; i++){
            res=res*base;
        }
        System.out.println(base + " to the power " + power + " is: " + res);
        in.close();
    }
}

