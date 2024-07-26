import java.util.*;


public class area_of_circle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of circle: ");
        int Radius = sc.nextInt();
        
        final float PI = 3.14F;
        float area = PI * Radius * Radius;

        System.out.println("The area of circle is:"+area);

        sc.close();
        
    }
}
