package Poke.Pokemons;
import ru.ifmo.se.pokemon.*;
import Poke.Moves.ForGolett.*;

public class Golurk extends Golett{
  public Golurk(String name, int level){
    super(name, level);
    setStats(89, 124, 80, 55, 80, 55);
    addMove(new Charge_beam());
  }
}
