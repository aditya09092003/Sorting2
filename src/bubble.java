import java.util.*;

public class bubble {
	void Bubblesort(int arr[]) {
		int temp;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		bubble b = new bubble();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		b.Bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

