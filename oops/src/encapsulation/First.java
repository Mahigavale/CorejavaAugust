package encapsulation;

public class First {

	public static void main(String[] args) {
		Animal animal=new Animal();
		
//		animal.setanimalId(1);
//		animal.setanimalName("Tiger");
//		animal.setfoodHabit("Non-veg");
//		
		
		/**
		 * Because animalId is Private.
		 * and it is accessible only within the same class.
		 */
		animal.setanimalId(101);
		//animal.animalId=100;
		
		System.out.println("ID is:{+"+animal.getId());

	}

}

class Animal
{  
	/**
	 * Meta Information=> extra Information.
	 */
	static int count=0;
	private int animalId;
	String animalName;
	String foodHabit;
	
	public Animal()
	{
		System.out.println(animalId);
		count++;
		System.out.println("Object created....");
		System.out.println("Object number :"+count);
	}
	
	public void setanimalId(int id)
	{
		if(id>100)
		{
		this.animalId=id;
		}
		System.out.println("Invalid ID");
	}
	
	public void setanimalName(String name)
	{
		this.animalName=name;
	}
	public void setfoodHabit(String habit)
	{
		this.foodHabit=habit;
	}
	
	
	public int getId()
	{
		return this.animalId;
	}
	
	public String getName()
	{
		return this.animalName;
	}
	
	public String getHabit()
	{
		return this.foodHabit;
	}
}