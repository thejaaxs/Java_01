import java.util.*;
public class Asgn1 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The 3 Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3 ; 
        System.out.println("The average of the entered numbers is :"+average);
    }
}
