package excercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));

		for (Items items : list) {
			System.out.println(items);
		}

		System.out.println("--Sorting By Name in ascending order--");

		Comparator<Items> sortByNameAsc = new Comparator<Items>() {

			@Override
			public int compare(Items o1, Items o2) {
				return o1.getName().compareTo(o2.getName());
			}

		};

		Collections.sort(list, sortByNameAsc);
		for (Items items : list) {
			System.out.println(items);
		}

		System.out.println("--Sorting By name Descending order--");

		Comparator<Items> sortByNameDesc = new Comparator<Items>() {
			@Override
			public int compare(Items o1, Items o2) {
				return o2.getName().compareTo(o1.getName());
			}

		};
		Collections.sort(list, sortByNameDesc);
		for (Items items : list) {
			System.out.println(items);
		}

		System.out.println("--Sorting By id Ascending Order");

		Comparator<Items> sortByIdAsc = new Comparator<Items>() {
			@Override
			public int compare(Items o1, Items o2) {
				return o1.getId() - o2.getId();
			}

		};
		Collections.sort(list, sortByIdAsc);
		for (Items items : list) {
			System.out.println(items);
		}

		System.out.println("--Sorting By id Descending Order");

		Comparator<Items> sortByIdDesc = new Comparator<Items>() {
			@Override
			public int compare(Items o1, Items o2) {
				return o2.getId() - o1.getId();
			}

		};
		Collections.sort(list, sortByIdDesc);
		for (Items items : list) {
			System.out.println(items);
		}
		
		
		System.out.println("--Sorting By Price desc Order");

		Comparator<Items> sortByPriceDesc = new Comparator<Items>() {
			@Override
			public int compare(Items o1, Items o2) {
				if(o1.getPrice() > o2.getPrice()) {
					return -1;
				}else if(o1.getPrice() < o2.getPrice()) {
					return 1;
				}
				return 0;
			}

		};
		Collections.sort(list, sortByPriceDesc);
		for (Items items : list) {
			System.out.println(items);
		}
		
		System.out.println("--Sorting By Price Ascending Order");

		Comparator<Items> sortByPriceAsc = new Comparator<Items>() {
			@Override
			public int compare(Items o1, Items o2) {
				if(o1.getPrice() < o2.getPrice()) {
					return -1;
				}else if(o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return 0;
				
			}

		};
		Collections.sort(list, sortByPriceAsc);
		for (Items items : list) {
			System.out.println(items);
		}

	}
}
