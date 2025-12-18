package mock_questions;

import java.util.Arrays;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("abc","xyz","abdue","sssss","a");
		//1,3,5
		
		list.stream().map(String::length).distinct().sorted().forEach(System.out::println);

	}

}
