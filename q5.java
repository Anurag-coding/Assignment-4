import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number:");
        int i,sum=0,c=0;
        int n=in.nextInt();
        for(i=1;i<=n;i++){
            if(n%2==0){
                c++;
                sum=sum+c;

            }
        if(sum==n){
            System.out.println(n+" is a perfect number.");
        }
        in.close();
       }

    }
    
}
