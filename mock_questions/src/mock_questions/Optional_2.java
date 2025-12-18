package mock_questions;

import java.util.Optional;

public class Optional_2 {

	public static void main(String[] args) {
	

		Optional<String> ps=Optional.ofNullable(null);
		
		
		 System.out.println(ps.orElse("default"));
	}
}
