package tasks;

public class task3 {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, };

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] % 2 == 0) {
					System.out.print(numbers[row][col] + " ");
				}
			}
		}

	}

}