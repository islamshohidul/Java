import java.util.HashMap;

public class hashMap {
	public static void main(String[] args){
		HashMap<String, String> map = new HashMap<>();
		map.put("Dhaka", "Gazipur");
		map.put("Mymenshigh", "Jamalput");
		map.put("Dhaka", "Gazipur3");
		System.out.println(map);
		map.remove("Dhaka");
		System.out.println(map);
	}

}
