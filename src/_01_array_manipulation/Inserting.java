package _01_array_manipulation;



public class Inserting {
      
	public static int[] insertAt(int[] testArray, int i, int j) {
		int[] array = new int[testArray.length+1];
		for(int x=0;x<i;x++) {
			array[x] = testArray[x];
		}
		array[i]=j;
		for(int y=i+1;y<array.length;y++) {
			array[y]=testArray[y-1];
		}
		return array;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		int i=-1;
		int temp= orderedArray[0].compareTo(orderedArray[orderedArray.length-1]);
		for(int j=0;j<orderedArray.length;j++) {
			int var = orderedArray[j].compareTo(string);
			if(var<temp) {
				temp = var;
				i = j;
			}
		}
		System.out.println(i);
		if(i<0) {
			i=orderedArray.length;
		}
		String[] array = new String[orderedArray.length+1];
		for(int x=0;x<i;x++) {
			array[x] = orderedArray[x];
		}
		array[i]=string;
		for(int y=i+1;y<array.length;y++) {
			array[y]=orderedArray[y-1];
		}
		for(String s : array) {
			System.out.println(s);
		}
		return array;
	}
	
}
