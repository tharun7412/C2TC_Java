import java.util.Scanner;

public class bitwise_1 {
	static int isEven(int n)
    {   
		return (n & 1);
    }
    public static void main(String1 args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(isEven(n)==0)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
