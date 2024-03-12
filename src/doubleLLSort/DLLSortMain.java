package doubleLLSort;

public class DLLSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DLLSort<Integer> ob = new DLLSort<Integer>();
        System.out.println("Before sort");
        ob.insert(44);
        ob.insert(22);
        ob.insert(11);
        ob.insert(99);
        ob.insert(66);
        ob.insert(33);
        ob.print();
        ob.sort();
        System.out.println("After sort");
        ob.print();
        System.out.println("Reverse");
        ob.reverse();
	}
}
