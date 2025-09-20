import java.util.Scanner;

public class sumNthOdd {
    public static int sumOddnum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;
            
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:- ");int n = sc.nextInt();

        int sum = sumOddnum(n);
        System.out.println("Sum of odd number 1 to " + n + " is:- "+sum);
    }
    
}
