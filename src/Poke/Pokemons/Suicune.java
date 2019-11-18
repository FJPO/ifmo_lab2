package Poke.Pokemons;

import ru.ifmo.se.pokemon.*;
import Poke.Moves.ForSuicune.*;
public class Suicune extends Pokemon {
	public Suicune(String name, int level){
		super(name, level);
		setStats(100,75,115,90,115,85);
		setType(Type.WATER);
		setMove(new Facade(), new Rest(), new Bite(), new Confide());

	}

}
