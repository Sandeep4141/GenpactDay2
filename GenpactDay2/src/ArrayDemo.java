import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		//In java array are created always at runtime . Behind array a class is working
		
		//Array of Primitive data type;
		
		int array[]  = new int[12];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<5 ;i++)
		{
			array[i] = sc.nextInt();
			//System.out.println(array[i]);
			
		}
		
		for(int x :array ) {
		System.out.println(x);
		}

	}

}
