package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Custom_One {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list2.add(30);
		list2.add(40);
		list3.add(50);
		list3.add(60);

		List<List<Integer>> list4 = new ArrayList<List<Integer>>();

		list4.add(list);
		list4.add(list3);
		list4.add(list2);

		list4.stream().forEach(new Two_D_List());

	}

}

class Two_D_List implements Consumer<List<Integer>> {

	public void accept(List<Integer> t) {

		t.stream().forEach(new One_d_List());
		System.out.println("******************");

	}

}

class One_d_List implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println(t * 2);

	}

}
