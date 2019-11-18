package Poke.Pokemons;
import ru.ifmo.se.pokemon.*;
import Poke.Moves.ForLotad.*;

public class Lotad extends Pokemon{
  public Lotad(String name, int level){
    super(name, level);
    setStats(40, 30, 30, 40, 50, 30);
    setType(Type.WATER, Type.GRASS);
    setMove(new Energy_ball(), new Scald());
  }
}
