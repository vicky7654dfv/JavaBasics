package doubleLLSort;

public class DLLSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DLLSort<Integer> table = new DLLSort<Integer>();
        System.out.println("Before sort");
        table.insert(44);
        table.insert(22);
        table.insert(11);
        table.insert(99);
        table.insert(66);
        table.insert(33);
        table.display();
        table.sort();
        System.out.println("After sort");
        table.display();
	}
}
