import java.util.*;
public class Asgn5 {
    public static void isVote(int age){
        if(age>18){
            System.out.println("Eligible to Vote");
            return ;
        }
        else{
            System.out.println("Not Eligible to Vote");
            return ;
        }
    }
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the age :");
    int age = sc.nextInt();
    isVote(age);
    }
}
