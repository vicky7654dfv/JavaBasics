package task5;

		public class PetersonNum {

		    public static int factorial(int num) {
		        if (num >= 0 && num == 1) {
		            return 1;
		        } else {
		            return num * factorial(num - 1);
		        }
		    }

		    public static boolean isPetersonNum(int num) {
		        int res = 0, mind = 0, copy = num;

		        while (copy > 0) {
		            mind = copy % 10;
		            res += factorial(mind);
		            copy /= 10;
		        }

		        if (res == num) {
		            return true;
		        }

		        return false;
		    }
		    public static void main(String[] args) {

		        int num = 145;

		        boolean result = isPetersonNum(num);

		        if (result) {
		            System.out.println(num + " is a Peterson Number");
		        } else {
		            System.out.println(num + " is not a Peterson Number");
		        }
		    }
		}
