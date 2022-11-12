/*
* Section 1 Question 2
*Name: Marion Kariuki
*Reg No: 21/07779
*A progam that ask students to enter marks of 5 units they did last semester and compute the average
and display it on the screen.(Average should be given in two decimal places
  
 */
package question2;

import java.util.Scanner;
public class Question2 {
    
 public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
   //declaring variables
   System.out.println("Enter 1st subject marks");
   int Programming=input.nextInt();
System.out.println("Enter 2nd subject marks");
int Enterpreneurship=input.nextInt();
System.out.println("Enter 3rd subject marks");
int Networks=input.nextInt();
System.out.println("Enter 4th subject marks");
int Accounting=input.nextInt();
System.out.println("Enter 5th subject marks");
int Datastructure=input.nextInt();
//Adding the total marks
double total= (Programming+Enterpreneurship+Networks+Accounting+Datastructure);
//Finding the average of the subjects
double Average=(total /5);
System.out.println("Your total marks is=" +total);
System.out.println("Your Average is=" + Average);


}
}
       
    
    

