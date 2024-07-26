import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (true) {

        System.out.println("Enter the number of month (from 1 - 12):    ");
        num = sc.nextInt();
        if (num >= 1 && num <= 12) {
            switch (num) {
                case 1:
                    System.out.println("1.January");
                    break;

                case 2:
                    System.out.println("2.February");
                    break;

                case 3:
                    System.out.println("3.March");
                    break;

                case 4 :
                    System.out.println("4.April");
                    break;

                case 5:
                    System.out.println("5.May");
                    break;

                case 6:
                    System.out.println("June");
                    break;

                case 7:
                    System.out.println("July");
                    break;

                case 8:
                    System.out.println("Agust");
                    break;

                case 9:
                    System.out.println("September");
                    break;

                case 10:
                    System.out.println("October");
                    break;

                case 11:
                    System.out.println("November");
                    break;

                case 12:
                    System.out.println("December");
                    break;
            
                default:
                    break;
            }

            break ;
        } 
        
        else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }


        }
        sc.close();
    }
}
