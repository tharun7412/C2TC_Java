public class array {
public static void main(String args[]){
int arr[] = {10,20,30,40,50};
int key = 10;
int pos=0;
for(int i=0; i<arr.length; i++) {
pos++;
if(arr[i]==key) {
System.out.print("Element found at position "+pos);
}
}
}
}