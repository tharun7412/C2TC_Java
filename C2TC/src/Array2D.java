import java.util.Scanner;

public class Array2D {
	public static void main(String1 args[])
    {
		int arr[][];
		int rows,columns;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of rows");
		rows = sc.nextInt();
		System.out.println("enter size of columns");
		columns = sc.nextInt();
		System.out.println("enter values");
		arr=new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				arr[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Array elements ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println("After Transpose");
		for(int i=0;i<columns;i++){
			for(int j=0;j<rows;j++){
				System.out.print(arr[j][i]+" ");
			}System.out.println();
		}
    }
}

