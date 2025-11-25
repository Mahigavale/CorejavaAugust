package fifs;

import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {
		
		//Consumer.
		//void accept(T t);=> Syso=> because you can't return it.
		
		// Cons1.andThen(Cons2) =>  applies the same accept logic on the t.
		
		Consumer<Integer> cons=(t)->{System.out.println(t*2); };
		
          Consumer <Integer> cons2=(t)->{System.out.println(t*4);};
	
          
      Consumer<Integer> cons3=cons.andThen(cons2);
      
      cons3.accept(10);
		
	}

}
