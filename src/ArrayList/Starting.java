package ArrayList;

import java.util.ArrayList;

public class Starting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(12);
		arr.add(43);
		arr.add(75);
		arr.remove(1);
		arr.clear();
		arr.removeAll(arr);
		arr.get(1);
		arr.get(2);
		for(int i=0;i<arr.size();i++)
		System.out.println(arr.get(i));

	}

}
