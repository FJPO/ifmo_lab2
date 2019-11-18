package Poke.Moves.ForGolett;
import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
  public Bulldoze(){super(Type.GROUND, 60, 100);}
  @Override protected String describe(){return "бульдозит";}

  @Override protected void applyOppEffects(Pokemon p){p.setMod(Stat.SPEED, -1);}
}
