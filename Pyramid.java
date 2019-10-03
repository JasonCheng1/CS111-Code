/* Write a program that reads in a number, n, via the via an argument from the command line, and then creates a horizontal pyramid of height n:

Ex: height = 5:
*
**
***
****
*****
****
***
**
* */
public class Pyramid{
	public static void main(String[] args){
		/* My version */
		int height = Integer.parseInt(args[0]);
		for(int r = 1; r <= height; r++){
			for(int c = 1; c <= r; c++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int r = height - 1; r >= 1; r--){
			for(int c = 1; c <= r; c++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("\n--------------\n");
		/* Another version */
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = n - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}