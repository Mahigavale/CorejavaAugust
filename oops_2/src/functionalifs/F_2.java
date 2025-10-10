package functionalifs;

public class F_2 {

	public static void main(String[] args) {
		
		I_2_A_1 ref=(n)-> {return n*n;};
		
		System.out.println(ref.square(10));
	}
}

interface I_2_A_1
{
	int square(int num);
}