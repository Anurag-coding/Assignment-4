import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=in.nextInt();
        System.out.print("Enter second number: ");
        int b=in.nextInt();
        System.out.print("Enter third number: ");
        int c=in.nextInt();
        int sum=0;
        for (int i=a;i<=b;i=i+c){
            sum=sum+i;
            System.out.println(i+" ");
        }
        System.out.println();
        System.out.print("The sum of displayed numbers is= " + sum);
        in.close();
    }
}
