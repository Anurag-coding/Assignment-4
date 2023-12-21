import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number:");
        int x,sum=0,temp;
        int n=in.nextInt();
        temp=n;
        while(n!=0){
            x=n%10;
            sum=sum+x;
            n=n/10;
        }
        if(sum%9==0){
            System.out.println("The number "+temp+" is divisible by 9.");
        }
        in.close();
    }
}
