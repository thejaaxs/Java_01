import java.util.*;
public class Asgn4 {
    public static void cirCircum(float radius){
        float circumference = 2f * 3.142f * radius ;
        System.out.println(circumference); 
        return ; 
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius :");
        float radius = sc.nextFloat();
        System.out.println("The circumference is :");
        cirCircum(radius);
    }
}
