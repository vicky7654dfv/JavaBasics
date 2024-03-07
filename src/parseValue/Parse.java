package parseValue;

public class Parse {

	public static void main(String[] args) {
		Integer age =new Integer("39");
		Integer age1=99;
		String pincode="625526";
		Integer pin=Integer.parseInt(pincode);
		String ageStr = age1.toString();
		System.out.println(age1.max(21,17));
        System.out.println(age1.min(21,17));
        System.out.println(Integer.sum(21,17));
        
        Double d=new Double(21.6);
        Double d1=32.9;
        System.out.println(Double.parseDouble(ageStr));
        System.out.println(Double.sum(21.3, 12.5));
        String dStr=d.toString();
        System.out.println(dStr);
        
        int ageint=30;
        String agestr=""+ageint;
        
        System.out.println(age);
	}

}
