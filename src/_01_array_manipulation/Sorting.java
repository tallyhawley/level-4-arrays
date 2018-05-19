package _01_array_manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void sort(String[] testArray) {
		ArrayList<String> array = new ArrayList<String>();
		for(int i=0;i<testArray.length;i++) {
			array.add(testArray[i]);
		}
		Collections.sort(array);
		for(int i=0;i<array.size();i++) {
			testArray[i] = array.get(i);
		}
	}

}
