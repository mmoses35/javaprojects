import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner UseInt = new Scanner(System.in);
         System.out.println("Please enter an integer");
        int number = UseInt.nextInt();
 
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");
    }
}
