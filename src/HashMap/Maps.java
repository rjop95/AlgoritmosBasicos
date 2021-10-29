package HashMap;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
			HashMap<String, Integer> empIds = new HashMap<>();
			
			empIds.put("Ricardo", 101);
			empIds.put("Leslie", 105);
			empIds.put("Carl", 109);
			
			System.out.println(empIds);
			System.out.println(empIds.get("Ricardo"));
			System.out.println(empIds.containsKey("lucy"));
			System.out.println(empIds.containsValue("101"));
			
			empIds.put("Ricardo", 1107);
			System.out.println(empIds);
			
			empIds.replace("Krames", 1107);
			System.out.println(empIds);
			
			empIds.putIfAbsent("steve", 5000);
			System.out.println(empIds);
			
			empIds.remove("steve");
			System.out.println(empIds);
	}

}
