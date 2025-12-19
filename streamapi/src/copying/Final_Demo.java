package copying;

public class Final_Demo {

	public static void main(String[] args) throws Exception {
		Subdivision sub=new Subdivision("Mumbai");
		
		
		Village v1=new Village(3001,"Alibaug",sub);
		
		Village v2=(Village) v1.clone();
		
		
		
		v2.sub.sub_name="Mulud";
		
		
		v2.population=1500;
		
		System.out.println(v2);
		System.out.println(v1);
	//	 java.lang.CloneNotSupportedException
		 
		
		 
		
		System.out.println(v2.hashCode());
		System.out.println(v1.hashCode());
		
		
		int[] arr= {1,23,45};
		int[] arr2=arr.clone();
		
		System.out.println("******************");
		System.out.println(arr);
		System.out.println(arr2);
		
		arr2[0]=100;
		
		for(int i :arr2)
		{
			System.out.println(i);
		}
		
		
		
		
		Actor actor=new Actor();
		actor.id=100;
		actor.name="Rahman";
		
		Actor actor2=new Actor();
		actor2.id=101;
		actor2.name="Khanna";
		
		Actor[] arr3=new Actor[2];
		arr3[0]=actor;
		arr3[1]=actor2;
		
		
		Actor[] arr4=arr3.clone();
		
		arr4[0]=(Actor)arr3[0].clone();
		arr4[1]=(Actor)arr3[1].clone();
		
		
		arr4[0].id=145;
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		for(Actor ac:arr3)
		{
			System.out.println(ac.id);
          System.out.println(ac.name);
		}
		
	}
}


class Village implements Cloneable
{
	int population;
	String name;
	Subdivision sub;
	
	public Village(int population, String name, Subdivision sub) throws Exception
	{
		if(population >3000) {
		this.name=name;
		this.population=population;
		this.sub=sub;
		}
		else {
		throw new Exception("NO object creation peremitted.....");
		}
		System.out.println("B");
	}
	
	
//	public Village(Village village) throws Exception
//	{
//		Subdivision sub1=new Subdivision(village.sub.sub_name);
//		Village village1=new Village(village.population,village.name,sub1);
//		
//		this.name=village1.name;
//		this.population=village1.population;
//		this.sub=village1.sub;
//	}
	
	
	  public Object clone() throws CloneNotSupportedException
	  {
		  
		  Village v1=(Village)super.clone();
		  //GC=> v1=sub, v=>sub
		  v1.sub=(Subdivision)this.sub.clone();
		  return v1;
	  }
	  
	  public String toString()
	  {
		  return this.name+" "+this.population+" "+this.sub.sub_name;
	  }
}

class  Subdivision  implements Cloneable
{
	String sub_name;
	
	public Subdivision(String sub_name)
	{
		this.sub_name=sub_name;
		
		System.out.println("A");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

  class Actor implements Cloneable
{
 	  int id;
	  String name;
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}