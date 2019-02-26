package pokemon.controller;

import java.util.ArrayList;
import pokemon.model.Blastoise;
import pokemon.model.Charizard;
import pokemon.model.Charmander;
import pokemon.model.IgglyBuff;
import pokemon.model.Squirtle;
import pokemon.view.PokedexFrame;
import pokemon.model.Pokemon;

public class PokedexController
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame frame;
	private Blastoise Blastoise;
	private Charizard Charizard;
	private Charmander Charmander;
	private IgglyBuff IgglyBuff;
	private Squirtle Squirtle;
	public void start()
	{
	
	}
	public void buildPokemonList()
	{
		this.Blastoise = new Blastoise(9, "Blastoise");
		this.Charizard = new Charizard(25, "Charizard");
		this.Charmander = new Charmander(10, "Charmander");
		this.IgglyBuff = new IgglyBuff(5, "IgglyBuff");
		this.Squirtle = new Squirtle(10, "Squirtle");
		pokemonList.add(Blastoise);
		pokemonList.add(Charizard);
		pokemonList.add(Charmander);
		pokemonList.add(IgglyBuff);
		pokemonList.add(Squirtle);
	}
	public PokedexController()
	{
		
		this.pokemonList = new ArrayList<Pokemon>(5);
		buildPokemonList();
		this.frame = new PokedexFrame(this);
	}
	public PokedexFrame getFrame()
	{
		return this.frame;
	}


	public String[] buildPokedexText()
	{
		String[] names = new String[pokemonList.size()];
		for (int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	public void updatePokemon(int index, String [] data)
	{
		if(data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	public boolean isInt(String maybeInt)
	{
		try
		{
			Integer.parseInt(maybeInt);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
		return true;
	}
	public boolean isDouble(String maybeDouble)
	{
		try
		{
			Double.parseDouble(maybeDouble);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
		return true;
	}


}
