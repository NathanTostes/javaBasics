package binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int arrayInt[] = new int[100];
		for(int i = 0; i < 100; i++) {
			arrayInt[i] = i * 10;
		}
		System.out.println(binarySearch(arrayInt, 0));
	}
	
	private static int binarySearch(int arrayInt[], int element) {
		int index;
		int start = 0;
		int end = arrayInt.length - 1;
		 while(start <= end) {
			index = Math.round((start + end) / 2);
			if (arrayInt[index] < element) {
				start = index + 1;
			} else if(arrayInt[index] > element) {
				end = index - 1;
			} else {
				return index;
			}

		}
		return -1;
	}
}