package excercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> csList = new ArrayList<String>();
		csList.add("student1");
		csList.add("student2");

		List<String> ecList = new ArrayList<String>();
		ecList.add("student3");
		ecList.add("student4");

		map.put("CS", csList);
		map.put("EC", ecList);

		for(Map.Entry<String,List<String>> entry: map.entrySet() ) {
			String key = entry.getKey();
			List<String> val = entry.getValue();
			System.out.println();
		}
	}

}
