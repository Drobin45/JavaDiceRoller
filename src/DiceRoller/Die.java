package DiceRoller;

import java.util.Random;

public class Die {

	//roll()
	//getValue()
	//getSides()
	//setSides(int sides)
	
	private int sides;
	private int value;
	private Random generator;
	
	//Using this. makes the appended word point to the object of the constructor
	// So, using this. in the below method will point to the above constructor
	
	public Die(int sides)
	{
	this.sides = sides;	
	this.generator = new Random();
	}
	
	//Overloaded constructor
	public Die(int sides, int seed)
	{
		this.sides = sides;
		this.generator = new Random(seed);
	}
	
	public int roll()
	{
		this.value = this.generator.nextInt(this.sides) + 1;
		return this.value;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public int getSides()
	{
		return this.sides;
	}
	
	public void setSides(int sides)
	{
		this.sides = sides;
	}
}
