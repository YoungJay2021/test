import java.util.Scanner;


public class for01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int columns;
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		row = sc.nextInt();
		System.out.println("������������");
		columns = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
