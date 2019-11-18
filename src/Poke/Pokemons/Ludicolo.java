package Poke.Pokemons;

import ru.ifmo.se.pokemon.*;
import Poke.Moves.ForLotad.*;
public class Ludicolo extends Lombre{
	public Ludicolo(String name, int level){
		super(name, level);
		setStats(80, 70, 70, 90, 100, 70);
    addMove(new Astonish());
	}
}
