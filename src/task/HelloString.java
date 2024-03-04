package task;

public class HelloString {

	public static void main(String[] args) {
		String str="Hello world All";
		String str1="Hello world";
		logic(str);
		System.out.println("****************");
		logic(str1);
		System.out.println("--------------------");
	//	logic1(str1);
		System.out.println("______________________");
    //    logic2(str1);
        System.out.println(str1.replace(' ','_'));
		
	}
	public static void logic(String s)
	{
		String[] sArr=s.split(" ");
		for(int i=0;i<sArr.length;i++)
		{
			for(int j=i;j<sArr.length;j++)
			{
				System.out.print(" "+sArr[i]);
			}
			System.out.println();
		}
	}
	public static void logic1(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				)
					s[j]=s.replace('w','A');
				System.out.println(" "+sArr[i]);
			}
		}
		
	}
	public static void logic2(String s)
			for(int i=0;i<s.length();i++)
		{
			
				System.out.print(" "+s+" ");	
		}
		
	}
	

}
