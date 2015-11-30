// Decision Making Programs
// if else based program
class IfElseDemo
{
public static void main(String args[])
{
int firstNumber = Integer.parseInt(args[0]);
int secondNumber = Integer.parseInt(args[1]);
int thirdNumber = Integer.parseInt(args[2]);

if(firstNumber>secondNumber && firstNumber>thirdNumber)  // true
{
 System.out.println("First Number is Greater ");	
}
else
if(secondNumber>firstNumber && secondNumber>thirdNumber)
{
System.out.println("Second Number is Greater ");
}
else  
if(thirdNumber>firstNumber && thirdNumber>secondNumber)
{
System.out.println("Third Number is Greater ");
}
else
if(firstNumber == secondNumber && firstNumber == thirdNumber){
System.out.println("All are Same ");
}
}
}