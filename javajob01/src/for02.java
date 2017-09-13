import java.util.Scanner;

public class for02 {
	public static void main(String[] args) {

		int row;
		int columns;
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞĞÊı£º");
		row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
