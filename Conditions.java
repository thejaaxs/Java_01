import java.util.*;
public class Conditions {
    public static void main (String args []){
// Scanner sc = new Scanner (System.in);
// System.out.println("Enter The Age :");
// int age = sc.nextInt() ;
// if(age>18){
//     System.out.println("Adult");
// }
// else{
//     System.out.println("Not Adult");
// }


        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter The Number :");
        // int num = sc.nextInt();
        // if(num%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }


                        // Scanner sc = new Scanner (System.in);
                        // System.out.println("Enter The two Numbers :");
                        // int a = sc.nextInt();
                        // int b = sc.nextInt();
                        // if(a==b){
                        //     System.out.println("Equal");
                        // }
                        // else if(a>b){
                        //     System.out.println("a is greater than b");
                        // }
                        // else{
                        //     System.out.println("b is greater than a ");
                        // }


                                Scanner sc = new Scanner (System.in);
                                System.err.println("Enter The Number :");
                                int num = sc.nextInt();
                                switch(num) {
                                    case 1 : System.out.println("Hello");
                                    break ;
                                    case 2 : System.out.println("Namasthe");
                                    break;
                                    case 3 : System.out.println("Bonjour");
                                    break ; 
                                    default : System.out.println("Wrong Number Entered");
                                }

    }
}
