/*
 * Section 1 Question 5
*Name:Marion Kariuki
*Reg No: 21/07779
 * A calculator that helps the user perform basic operation (+,-,*and/)
  *A user should be asked to enter a number,then an operation, the program computes
  *the operation and displays the output to the computer screen.
  
 */
package question5;

import java.util.Scanner;
public class Question5 {

    
    public static void main(String[] args) {
         //declare the variables
double num1;
double num2;
char operator;

Scanner input = new Scanner(System.in);
System.out.println("Enter two Numbers");
num1 = input.nextDouble();
num2 = input.nextDouble();

System.out.println("Enter the Operator(+,-,*,/)");
operator=input.next().charAt(0);
//close input stream
input.close();
// using the switch statement to switch to the operator the user has entered
switch(operator){
   
   //cases for the possible values that the operator variable can contain
   
    case '+':
       System.out.printf("%.2f + %.2f = %.2f",num1,num2,(num1+num2));
       //break statement
      
       break;
       
    case '-' :
       System.out.printf("%.2f - %.2f = %.2f",num1,num2,(num1-num2));
      //break statement
       
       break;
       
        case '*':
       System.out.printf("%.2f * %.2f = %.2f",num1,num2,(num1*num2));
      
       //break statement
       
       break;
       
        case '/':
               
            // if conditional statement
           
            if(num2!=0)
           
       System.out.printf("%.2f / %.2f = %.2f",num1,num2,(num1/num2));
        else
        System.out.println("Divide by zero situation");
        break;
        // default case
        default:
        System.out.printf("%c is an invalid operator",operator);
   
   
}


}
}
    
    

