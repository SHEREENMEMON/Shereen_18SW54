import java.util.Arrays;
import java.util.Scanner;
public class Task5{
 

Scanner input=new Scanner(System.in);

public int SecondLargeElement(int arr1[]){
    int large=arr1[2]; //
	int secondlarge=arr1[2];
  for(int i=0;i<arr1.length; i++){
	  
    if(large<arr1[i])
	{
	secondlarge = large;
	large= arr1[i];
	}
	else if(arr1[i]> secondlarge){
		secondlarge=arr1[i];
	}
  }
  return secondlarge;
}
public static void main(String args[]){
	int [] arr1={2,4,8,16,12,18,32,20};
	Task5 t5=new Task5();
	System.out.print(t5.SecondLargeElement(arr1));
}
}