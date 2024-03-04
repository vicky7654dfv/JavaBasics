package stl;

import java.util.HashMap;
import java.util.Map;

public class StlMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", "RanjithKumar");
		map.put("age", "99");
		map.put("gender", "male");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("gg"));
		System.out.println(map.get("gender"));
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("Age", 99);
		map1.put("pincode", 625256);
		System.out.println(map1.get("pincode"));
		
		Map<Integer, Double> map2 = new HashMap<Integer, Double>();
		map2.put(0, 22.3);
		map2.put(1, 24.3);
		map2.put(2, 23.3);
		System.out.println(map2.get(2));
	}

}
