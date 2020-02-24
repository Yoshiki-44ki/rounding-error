/*
 * Yoshiki 
 * Feburuary 24/2020
 * This code illustrates the rounding error for math method 
 */

package roundingerror.java;

/**
 *
 * @author yohar3320
 */
import java.io.*;
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{//crate a try and catch statement
    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));//declare a bufferedReader to get useinput
    System.out.println("please enter a number");//tell users to input value
    int input = Integer.parseInt(in.readLine());//input the userinput 
    double root= Math.sqrt(input);//squareroot the input value 
    double square = Math.pow(root,2);//square the input value
    System.out.println("square of square = "+ square);//display the square root of square 
    System.out.println("The round off error ="+ Math.abs(input-square) );/*display tne output value  
    to provide the difference, convert the difference into absolute value   */
        }catch (IOException e) { //catch the IOException 
        System.out.println(e + " this value is not valid");
    }
    
}
}
