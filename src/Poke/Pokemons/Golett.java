package Poke.Pokemons;

import ru.ifmo.se.pokemon.*;
import Poke.Moves.ForGolett.*;
public class Golett extends Pokemon{
	public Golett(String name, int level){
		super(name, level);
		setStats(59, 74, 50, 35, 50, 35);
		setType(Type.GROUND, Type.GHOST);
		setMove(new Mud_slap(), new Iron_defense(), new Bulldoze());
	}
}
