package misc2;

import java.util.Optional;

public class Optional_1 {

	public static void main(String[] args) {
		
		
		Optional<String> ops=Optional.ofNullable(null);
		
		
		
		
	 System.out.println(ops.map((i)->(i.length())));
		
	// System.out.println(ops.filter((i)->(i.length()>4)));
//		
//	  ops.ifPresent(System.out::println);
//		
//		ops.ifPresentOrElse((i)->{System.out.println(i.toUpperCase());},()->{System.out.println("Empty Optional detected!");});
//	
	
//		System.out.println(ops.isPresent());
//		
//		
// System.out.println( ops.or(()->(Optional.of("null value detected...."))).get().toUpperCase());
	 
	 
	 
	 //
	}

}
