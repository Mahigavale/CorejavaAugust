package basic;

public class Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shared shared=new Shared();
		
		Ek ek=new Ek(shared);
		Don don=new Don(shared);
		
		don.Append_Second("world");
		ek.Append_first("hello");
		
		System.out.println(shared.showString());
		
		System.out.println(ek.shared.sb==don.shared.sb);

	}

}

class Shared
{
	StringBuffer sb=new StringBuffer();
	
	public String showString()
	{
		return sb.toString();
	}
}

class Ek
{
	 Shared shared;
	public Ek(Shared shared)
	{
		this.shared=shared;
	}
	
	public void Append_first(String str)
	{
		 shared.sb.append(str);
	}
	
}
class Don
{
	Shared shared;
	public Don(Shared shared)
	{
		this.shared=shared;
	}
	public void Append_Second(String str)
	{
		 shared.sb.append(str);
	}
}