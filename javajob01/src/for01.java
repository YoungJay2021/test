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
		System.out.println("请输入行数：");
		row = sc.nextInt();
		System.out.println("请输入列数：");
		columns = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
