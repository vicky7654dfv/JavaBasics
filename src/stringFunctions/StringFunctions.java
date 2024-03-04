package stringFunctions;

public class StringFunctions
{

	public static void main(String[] args) 
	{
		String str1="Hello", str2="World",str3=null,str4="lo",str5="hello";
		System.out.println("str1: "+str1+ " str2:"+str2);
		String s="Hello world";
		//Equals
		if(str1.equals(str3))
			System.out.println("str1: "+str1+ " str2:"+str2+" : true");
		else
			System.out.println("str1: "+str1+ " str2:"+str2+" : false");
		if(str1.toLowerCase().equals(str5.toLowerCase()))
			System.out.println("str1: "+str1+ " str5:"+str5+" : true");
		else
			System.out.println("str1: "+str1+ " str5:"+str5+" : false");

		if(str1!=null && str3!=null && str1.contains(str3))
			System.out.println("str1: "+str1+ " str3:"+str3+" : true");
		else
			System.out.println("str1: "+str1+ " str3:"+str3+" : false");
		
		if(str1!=null && str4!=null && str1.contains(str4))
			System.out.println("str1: "+str1+ " str4:"+str4+" : true");
		else
			System.out.println("str1: "+str1+ " str4:"+str4+" : false");
		
		if(str1.equals(str5))
			System.out.println("true");
		else
			System.out.println("false");
			
		
		System.out.println("Length: "+s.length());
		System.out.println("Length: "+s.toCharArray().length);
		System.out.println("Replace: "+s.replace("world", "all"));
		System.out.println("SubString: "+s.substring(0,8));
		System.out.println("concat: "+s.concat("All"));
		System.out.println("Split: "+s.split(" ")[0]+"  2: "+s.split(" ")[1]);
		System.out.println("Trim: "+s.trim());
		System.out.println("index of: "+s.indexOf("l"));
		System.out.println("upper case: "+s.toUpperCase());
		System.out.println("upper case: "+s.toString());

		System.out.println("lower case: "+s.toLowerCase());

        int j=3;
        String s1=String.valueOf(j);
        System.out.println("equals: "+s1.equals("3"));

		String[] sArr=s.split(" ");
		char[] sArr1=s.toCharArray();
		
		System.out.println("************Split**********");
		for(int i=0;i<sArr.length;i++)
			System.out.println(sArr[i]);
		System.out.println("*************toChar array*********");
		for(int i=0;i<sArr1.length;i++)
			System.out.println(sArr1[i]);


	}

}
