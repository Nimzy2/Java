/*
 * Section 1 question 3
* Name:Marion Kariuki
Reg No: 21/07779
*A program that helps kids learn the dvisibly test of numbers. it should check
whether the given interger is divisible by intergers in the range of 0-9.
 */
package question3;

import java.util.Scanner;
public class Question3 
        {
public static void main(String[] args) {
System.out.println("Enter Number");
int n;
Scanner r =new Scanner(System.in);
n=r.nextInt();

//if else condition
if(n%1==0)
{
   System.out.print("\nDivisible by 1 because every number is divisible by 1");
}
else
{
   System.out.print("\nNot Divisible by 1 ");
   
}

//if else condition
if(n%2==0)
{
   System.out.print("\nDivisible by 2 because the number ends in 0, 2, 4, 6 or 8");
}
else
{
   System.out.print("\nNot Divisible by 2");
   
}

//if else condition
if(n%3==0)
{
   System.out.print("\nDivisible by 3 because the sum of the number is divisible by 3");
}
else
{
   System.out.print("\nNot Divisible by 3");
   
}

//if else condition
if(n%4==0)
{
   System.out.print("\nDivisible by 4 because the last two digits are divisible by 4");
}
else
{
   System.out.print("\nNot Divisible by 4");
   
}

//if else condition
if(n%5==0)
{
   System.out.print("\nDivisible by 5 because the number ends with 0 or 5");
}
else
{
   System.out.print("\nNot Divisible by 5");
   
}

//if else condition
if(n%6==0)
{
   System.out.print("\nDivisible by 6 because the number is  divisible by both 2 and 3 ");
}
else
{
   System.out.print("\nNot Divisible by 6");
   
}

//if else condition
if(n%7==0)
{
   System.out.print("\nDivisible by 7");
}
else
{
   System.out.print("\nNot Divisible by 7");
   
}

//if else condition
if(n%8==0)
{
   System.out.print("\nDivisible by 8 because the number's last three digits are divisible by 8.");
}
else
{
   System.out.print("\nNot Divisible by 8");
   
}

//if else condition
if(n%9==0)
{
   System.out.print("\nDivisible by 9 because the the sum of digits of the number is divisible by 9");
}
else
{
   System.out.print("\nNot Divisible by 9");
   
}




}


}

    
    
    

