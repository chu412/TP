import java.util.Random;

public class Exercise52 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
		System.out.println("This is array input:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Random rd = new Random();
				arr[i][j] = rd.nextInt(11); // return random number type int ing range [0...10]
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("This is array when rotated:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
    }
}
