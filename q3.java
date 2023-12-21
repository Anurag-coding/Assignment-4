import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number=");
        int sum=0,avg,d=0;
        int n=in.nextInt();
        do{
            int c=(int)(Math.random()*n)+1;
            System.out.print(c);
            sum=sum+c;
            d=d+1;
        }
        while(n!=d);
        avg=sum/n;
        System.out.println("Average of "+n+" random number are= "+avg);
        in.close();
        
    }
    
}
