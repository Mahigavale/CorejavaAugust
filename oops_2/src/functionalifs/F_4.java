package functionalifs;

public class F_4 {

	public static void main(String[] args) {
		
        __A a=(s,m)->{ return s==m; };
        
      System.out.println(  a.checknum(12, 12));
	}
}
interface __A
{
	
	boolean checknum(int i, int j);
}