package terminal_ops;

import java.util.Optional;

public class Third {

	public static void main(String[] args) {
		
		
	Optional<String> str=Optional.ofNullable(null);
	
	
	str.ifPresent(System.out::println);
	
	
	str.ifPresentOrElse(System.out::println,()->{System.out.println("empty value");} );
	
	
	
	  System.out.println(str.or(()->(Optional.of("String"))));
	

	

	}
}


