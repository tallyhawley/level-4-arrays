package _01_array_manipulation;

public class Runner {
	public static void main(String[] args) {
		ArrayManipulation am = new ArrayManipulation();
		try {
			am.testSortAnArray();
			am.testSortARandomArray();
			am.testInsertIntoArray();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
