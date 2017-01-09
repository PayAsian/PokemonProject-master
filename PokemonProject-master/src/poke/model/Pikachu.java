package poke.model;

public class Pikachu extends Pokemon implements Electric
{

	public Pikachu()
	{
		super("Pikachu", 25);
	}
	
	public Pikachu(String name)
	{
		super(name, 25);
	}
	
	/**
	 * Two parameter constructor for Raichu class
	 * If using with Pikachu supply 25 for number
	 * The Name of this Pikachu
	 * number should be 25 for Pikachu and 26 for Raichu
	 */
	
	public Pikachu(String name, int number)
	{
		super(name, number);
	}
	
	public int staticZap()
	{
		return 2;
	}
	
	public int thunder()
	{
		return this.getAttackPoints() * 2;
	}
	
}
