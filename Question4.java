/*
 * Section one Question 4
 * Name:Marion Kariuki
  Reg no:21/07779

Creating a program that displays the multiples of 2,3 and 7 within the range of
71-150
  
 */
package question4;

public class Question4 {

    
    public static void main(String[] args) 

{
 System.out.println("\nThe following numbers are Multiples of 2:");
   
// using for loop
for(int num1=71; num1<=150; num1++){
   if(num1%2==0)
       System.out.println(num1 + ",");
   
}
   
   System.out.println("\nThe following numbers are Multiples of 3:");
   
// using for loop
for(int num1=71; num1<=150; num1++){
   if(num1%3==0)
       System.out.println(num1 + ",");
   
}

System.out.println("\nThe following numbers are Multiples of 7:");

// using for loop
for(int num1=71; num1<=150; num1++){
   if(num1%7==0)
       System.out.println(num1 + ",");
 
}





}
}
        
        
   








