class AddTwoNumbers
{  // Class Starts
// String args[] - it is called Command Line Arguments
// and it is used to take the value from the user from command line
public static void main(String args[])
{  // main starts
// Variable Declare
// parseInt() - it is a method in Integer class and it is predefine
// it will convert String into Integer
long firstNumber = Long.parseLong(args[0]);
long secondNumber = Long.parseLong(args[1]);
long result = firstNumber + secondNumber;
System.out.println("Sum of Two Numbers is "+result);

}  // main ends
}  // Class Ends