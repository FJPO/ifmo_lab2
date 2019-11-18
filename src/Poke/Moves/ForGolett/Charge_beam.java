package Poke.Moves.ForGolett;
import ru.ifmo.se.pokemon.*;

public class Charge_beam extends SpecialMove{
  public Charge_beam(){super(Type.ELECTRIC, 50, 90);}
  @Override protected String describe(){return "использует лучевой рывок";}

  @Override protected void applySelfEffects(Pokemon p){
    if (Math.random() >= 0.7) p.setMod(Stat.SPECIAL_ATTACK, 1);
  }
}
