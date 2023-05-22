import java.until.Scanner;

public class IntergerDemoInteractive {
   public static void main(String[] args)
     {  
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
       Scanner input = new Scanner(System.in);
   System.out.print("Please enter an integer >>");
   anInt =input.nextInt();
   
   System.out.print("Please enter a byte integer >>");
   aByte = input.nextByte();
  
   System.out.print("Please enter a short integer >>");
   aShort = input.nextShort();
  
   System.out.print("Please enter a long integer >>");
   aLong = input.nextLong(); 
   }



}