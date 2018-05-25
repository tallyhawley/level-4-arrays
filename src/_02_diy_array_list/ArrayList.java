package _02_diy_array_list;

public class ArrayList<E>{
	
	int size = 10;
	Object[] a = new Object[size];
	int i = 0;
	
	public void add(E object) {
		// TODO Auto-generated method stub
		if(i!=a.length-1) {
			a[i] = object;
			i++;
		}else {
			Object[] temp = new Object[a.length];
			
		}
				
	}

//	public E get(int index) {
//		rangeCheck(index);
//		return void;
//	}

}
