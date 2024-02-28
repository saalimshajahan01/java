import java.io.*;
class Main1_2
{
public static void main(String args[])
{
DataInputStream din;
int a,b;
din = new DataInputStream(System.in);
try
{
System.out.println("Enter the first no");
a = Integer.parseInt(din.readLine());
System.out.println("Enter the second no");
b = Integer.parseInt(din.readLine());
System.out.println("Product of " + a + " and " + b +" is " + (a*b));
}
catch(Exception e)
{
System.out.println("Error : " + e);
}
}
}
