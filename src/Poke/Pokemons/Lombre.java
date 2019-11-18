package Poke.Pokemons;
import ru.ifmo.se.pokemon.*;
import Poke.Moves.ForLotad.*;

public class Lombre extends Lotad {
  public Lombre(String name, int level){
    super(name, level);
    setStats(60, 50, 50, 60, 70, 50);
    addMove(new Bubble());
  }
}
