import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

//        1- Write a Java method to find the smallest number among three
//        numbers.
//                Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29
//        Expected Output:
//        The smallest value is 25.0

//        System.out.println("Please enter three numbers.");
//
//        int [] numbers = new int [3];
//        for (int i = 0; i < 3; i++) {
//            numbers[i]= input.nextInt();
//        }
//        System.out.println("The smallest number is "+findSmallest(numbers));


//        2- Write a Java method that check if the entered number is negative or
//        positive or zero.

//          System.out.println("Please enter a number to check if its a positive or negative.");
//          int n = input.nextInt();
//          checkPosNev(n);

//        3- Write a Java method to check whether a string is a valid password.
//        Password rules:
//        A password must have at least ten characters. A
//        password consists of only letters and digits. A
//        password must contain at least two digits.
//
//        Expected Output:
//        1. A password must have at least eight characters.
//        2. A password consists of only letters and digits.
//        3. A password must contain at least two digits
//        Input a password (You are agreeing to the above Terms and
//                Conditions.):
//        abcd1234
//        Password is valid: abcd1234

//        System.out.println("Please enter a password, Password Rules:\n" +
//                "1. A password must have at least eight characters.                                          \n" +
//                "2. A password consists of only letters and digits.                                          \n" +
//                "3. A password must contain at least two digits                                         \n" +
//                "Input a password (You are agreeing to the above Terms and \n" +
//                "Conditions.):");
//        String pass = input.nextLine();
//        if (checkPass(pass)){
//            System.out.println("Password is valid: "+pass);
//        }else System.out.println("Password is invalid please check the rules and try again.");

    }
    // Q1 Related method.
    public static int findSmallest(int[]a){
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < temp){temp = a[i];}
        }
        return temp;
    }

    //Q2 Related method.
    public static void checkPosNev(int n){

        if (n > 0){
            System.out.println("Number is positive.");
        } else if (n == 0) {
            System.out.println("Number is equal to zero.");
        }else System.out.println("Number is negative.");

    }

    // Q3 Related method.
    public static boolean checkPass(String n){
        if (n.length() <10){
            return false;
        }else {
            char ch;
            int c = 0;
            for (int i = 0; i < n.length(); i++) {
                ch = n.charAt(i);
                if (!Character.isLetterOrDigit(ch)){
                    return false;
                }else if (Character.isDigit(ch)){
                    c++;}
            }
         if (c < 2){return false;}
        }
        return true;
    }
    }