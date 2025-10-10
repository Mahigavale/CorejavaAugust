package Practise;

public class First {

	public static void main(String[] args) {
		
		
		new StringBuffer("Abc");
//		 Object obj=new Demo();
//		 
//		 Object obj1=new Demo_1();
//		 
		
		
		Demo d=new Demo(100,"abc");
		
//		System.out.println(d);
		
	 System.out.println(d);
	 
	 //System.out.println(new String("abc").getClass());
;		
//		System.out.println(d.getClass());
//		
//		System.out.println(d.hashCode());
//		 System.out.println(d1.hashCode());
		
	//Practise.Demo@6f539caf
//Practise.Demo@6f539caf
	
	}
}


class Demo
{
	public Demo(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Demo()
	{
		
	}
	int id; 
	String name;
	
//	public String  toString()
//	{
//		return this.id +": ***id   "+ this.name+"     ***:name";
//	}
	public String toString() {
       
		return this.id +"  --   "+this.name;
		//return getClass().getName() + "@" + Integer.toHexString(hashCode())+"me punyat";
    }
	
	public Object getre(Object obj)
	{
		if(obj.getClass().equals(Demo.class))
			
		{
			return  "babare I am a demo class object:";
		}
		return obj;
	}
}

