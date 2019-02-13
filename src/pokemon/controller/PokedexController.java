package pokemon.controller;

import java.util.ArrayList;

import pokemon.model.Pokemon;

public class PokedexController
{
	public ArrayList<Pokemon> pokemonList;
	public void start()
	{
		this.pokemonList = new ArrayList<Pokemon>();
	}

	public PokedexController()
	{

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

}
