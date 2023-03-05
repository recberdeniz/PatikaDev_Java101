package test;

import java.util.Arrays;

public class PatikaArrayP4 {

	public static void main(String[] args) {
		int list[] = {1,2,3,2,5,6,8,7,8,5,3,2,9};
		int dupEven[] = new int [list.length];
		int startIndex = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] % 2 == 0 || list[i] == 0) {
				for(int j = 0; j < list.length; j++) {
					if(i != j && list[i] == list[j]) {
						dupEven[startIndex] = list[i];
						startIndex++;
						break;
					}
				}
			}
		}
		System.out.println("Original List: " + Arrays.toString(list));
		System.out.println("Duplicate Even Num List: " + Arrays.toString(dupEven));

	}

}
