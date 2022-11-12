package question1;

/*
Section 1 question 1
Name: Marion Kariuki
Reg no: 21/07779
*creating a program that displays the Surname and current age of the user then print the number of characters
of their surname and even or odd depending on their age number

*/
import java.util.Scanner;
public class Question1
{
public static void main(String[] args) {
   //print the first message
System.out.println("Enter your surname and current age:");

// Declaring the variables
Scanner input = new Scanner(System.in);
String surname = input.nextLine();
int age = input.nextInt();

//Using if else statement to determine whether the no is even or odd
if(age % 2==0)
System.out.println(age + " " + "is an even number");
else
System.out.println(age + " " +  "is an odd number");

int count=0;

for(int i=0;i<surname.length();i++){
   if (surname.charAt(i)!=' '){
       count++;
  }
}

System.out.println("The number of characters in your surname is:"+count);

}
}

