import java.util.Scanner;

public class GitC {

	public static void main(String[] args) 
	{
		System.out.println( "Type in two integers. The first one you type must be smaller than the second one."); //you used single quotes KIRT
		Scanner scan = new Scanner( System.in );
		int small = Integer.parseInt(scan.next()); // u gotta take ints KIRT
		int large = Integer.parseInt(scan.next()); // u gotta take ints KIRT
		scan.close();
		System.out.println( (int)(Math.random() * (large - small + 1) ) + small); // all fixed now KIRT
	}
}
