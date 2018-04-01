class switchit
{
public static void main(String args[])
  { 
   int a = 10;
   int b = 20;
   char c = '-'; // For checking value in switch case
   switch(c)
   {
    case '+':
    System.out.print("Sum of these two numbers is"+" "+a+b);
    break;
    case '-':
    System.out.print("Difference of these two numbers is"+" "+(a-b));
    break;
    case '/':
    System.out.print("Divide of these two numbers is"+" "+a/b);
    break;
    case '*':
    System.out.print("Multiplication of these two numbers is"+" "+a*b);
    break;
   }

  }
}