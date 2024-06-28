import java.util.*;


// public class Asgn7 {
//    public static void main(String args[]) {
//        int positive = 0, negative = 0, zeros = 0;
//        System.out.println("Press 1 to continue & 0 to stop");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();


//        while(input == 1) {
//            System.out.println("Enter your number : ");
//            int number = sc.nextInt();
//            if(number > 0) {
//                positive++;
//            } else if(number < 0) {
//                negative++;
//            } else {
//                zeros++;
//            }


//            System.out.println("Press 1 to continue & 0 to stop");
//            input = sc.nextInt();
//        }


//        System.out.println("Positives : "+ positive);
//        System.out.println("Negatives : "+ negative);
//        System.out.println("Zeros : "+ zeros);
//    }   
// }
 
public class Asgn7{
    public static void  main (String args []){
        int positive = 0  ; 
        int negative = 0 ; 
        int zeroes = 0  ; 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1 to continue or 0 to exit ");    
        int input =sc.nextInt () ; 
        while(input==1){
            System.out.println("Enter the numbers : ");
            int n = sc.nextInt() ; 
            if(n>0){
                positive ++ ;
            }
            else if(n<0){
                negative ++ ;
            }
            else{
                zeroes ++ ; 
            }
            System.out.println("Enter 1 to continue or 0 to exit ");
            input = sc.nextInt() ; 
        }
        System.out.println("Positive is : "+positive);
        System.out.println("Negative is : "+negative);
        System.out.println("Zeroes is : "+zeroes);

    }
}
