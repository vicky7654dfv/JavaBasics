package task;
	public class Loop {

		public static void main(String[] args) {
			int[] arr= {21,19,17,18,109,200};
			int total=0;
			Arith ob=new Arith();
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(i+": "+arr[i]);
				total=ob.add(total, arr[i]);
			}
	System.out.println("Total :"+ total);
		}
}