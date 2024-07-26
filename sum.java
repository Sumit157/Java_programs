import java.util.*;

public class sum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); //taken new scanner

        System.out.println("Enter the first number:");//input taken as number
        int a = sc.nextInt();//using scanner value store in the variable

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of two Numbers is: "+sum);

        sc.close(); //scanner sc is closed

    }
}