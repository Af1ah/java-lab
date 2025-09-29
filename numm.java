import java.util.Arrays;
public class main
{
	public static void main(string[]args)
	{
		int[]myArray={10,50,20,40,60,90,100,40,10};
		Arrays.sort(myArray);
		System.out.println("smallest element="+myArray[0]);
		System.out.println("largest element="+myArray[myArray.length-1]);
		System.out.println("second largest="+myArray[myArray.length-2]);
	}
}
