public class bitwise {
static int isEven(int n)
{
return (n & 1);
}
public static void main(String args[])
{
int n = 101;
if(isEven(n)==0)
System.out.print("Even");
else
System.out.print("Odd");
}
}