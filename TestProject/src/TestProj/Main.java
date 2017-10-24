package TestProj;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
				// fill code here
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the shipment number :");
        int n =  Integer.parseInt(sc.nextLine());
        if(n>0){
        while(n>0) {
            int l=n % 10;
            sum = sum+l;
            n=n/10;
        }
       boolean flag = false;
        for(int i = 2; i <= sum/2; ++i)
        {
            // condition for nonprime number
            if(sum % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("Eligible for free shipping");
        else
            System.out.println("Not Eligible for free shipping");
            
        }
        else
        System.out.println("Not Eligible for free shipping");
    }

}

