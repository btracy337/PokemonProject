package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
public Charmander(int number, String name)
	{
		super(number, name);
	}
public int fireKill()
{
	return this.getAttackPoints();
	
}
public void breatheFire()
{
	
	
}
}
