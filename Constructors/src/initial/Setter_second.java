package initial;

public class Setter_second {

	public static void main(String[] args) {
		
  /**
   * DATAMEMEBERS, (int number, String name),
   * MEMBERFUNCTIONS (public void display())
   * SETTER METHODS => used to set the values for the instance variable.
   * GETTER METHODS=> used to get the values for the class variables.
   */
  /**
   * CI=>use constructor to set instance variables values.
   * SI=> use the setter methods to set the instance variables values.
   */
  
  /*
   * If you set the values for the instance variable 
   * with the help of the setter methods it is called as
   *  SETTER INJECTION.
   */
		Plant plant=new Plant();//name=>null ,number=>0
        plant.setName("Mango Tree");
        plant.setNumber(100);
  /**
   * You should always use the getter methods to get the values
   * rather than directly calling the the variables.
   */
        /**
		 * directly giving the call to instance variable is
		 * not advisable.
		 */
  System.out.println(plant.number);
  System.out.println(plant.name);
  
  
  
  System.out.println("The name of the plant is:"+plant.getName());
  System.out.println("The number of the plant is:"+plant.getNumber());
	}

}
class Plant
{
	int number;
	String name;
	
	/**
	 * 
	 * @param num => the input param for the instance variable
	 * public void => return type of setter is always void.
	 *  start the method name with "set"
	 *  then followed by the variable name.
	 *  "set"+"Number"
	 */
	public void setNumber(int num)
	{
		this.number=num;
	}
	
	/**
	 *  
	 * @param nam
	 * 
	 * "Set"+"Name"=>setName.
	 */
	public void setName(String nam)
	{
		this.name=nam;
	}
	
	
	/**
	 *  Getter methods=> used to get the value.
	 * 
	 */
	
	/**
	 * 
	 * @return returns the data type of the given instance variable.
	 */
	public String getName()
	{
		return this.name; //name=>String
	}
	
	
	/**
	 * 
	 * @return int=> returns this.number => which has the data type of int.
	 */
	public int getNumber()
	{
		return this.number;
	}
}