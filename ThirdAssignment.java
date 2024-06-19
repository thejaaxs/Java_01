import java.util.*;
public class ThirdAssignment {
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Number :");
        // int n = sc.nextInt();
        // for(int i=0 ;i<=n ; i++){
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

                // Scanner sc = new Scanner(System.in);
                // System.out.println("Choose the Number :");
                // int n = sc.nextInt();
                // switch(n){
                //     case 1 : System.out.println("Enter The marks of the student :");
                //     System.out.println("Enter the marks :");
                //     Double marks = sc.nextDouble() ;
                //      if(marks>=90){
                //         System.out.println("This is good");
                //      }
                //      else if (marks>=60 && marks<=89) {
                //         System.out.println("This is also good");
                //      }
                //      else {
                //         System.out.print("This is also Good"); 
                //      }
                //      break ;
                //      case 0 : System.out.println("Out of the program");
                //      break ; 
                //      default :System.out.println("Entered The wrong number");
                // }

                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter The Number :");
                            int n = sc.nextInt();
                            boolean isPrime = true ;
                            
                            for(int i = 2 ; i<=n/2 ; i++){
                                if(n%i==0){
                                    isPrime = false ;
                                }
                            }
                            if(n==1){
                                System.out.println("Neither Prime or Composite");
                            }
                            else if(isPrime){
                                System.out.println("Prime Number");
                            }
                            else{
                                System.out.println("Not Prime");
                            }
    }
}
