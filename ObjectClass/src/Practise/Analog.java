package Practise;

public class Analog {

	public static void main(String args[])
	{
		
		Engine engine=new Engine();
		
		engine.engine_type="Diesel";
		
		engine.engine_weight=1234.67;
		
		
		Chopper chopper=new Chopper(engine);
		chopper.setType("military");
		chopper.setWeight(3456.98d);
		
		System.out.println(chopper.getType()+chopper.getWeight()+"     "+chopper.getEngine());
		
		
		chopper.start();
		
	}
}

class Chopper
{

	double weight;
	String type;
	
	/**
	 * Chopper HAS-A Engine.
	 */
	Engine engine;
	/**
	 * No new => reference.
	 */
	public Chopper(Engine engine2) {
		
		this.engine=engine2;
		//super();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start()
	{
		System.out.println(engine.engine_weight + engine.engine_type);
	}
	
}

class Engine
{
	double engine_weight;
	String engine_type;
	public Engine()
	{
		super();
	}
	
	public String toString()
	{
		return this.engine_type+this.engine_weight;
	}
}