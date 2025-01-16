package bubbleshot;

public class p {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 30, 40, 2 };
		
//i/p:-		a1b2c3d4
//	o/p:-	abbcccddd
		// 0 1 2 3 4
		int size = arr.length - 1;
		for (int j = 0; j < size; j++) {
			for (int i = 0; i < size; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			}
		}
		for (int i = 0; i <= size; i++) {

			System.out.print(arr[i] + " ");

		}

	}
}
