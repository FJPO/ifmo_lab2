package Poke.Moves.ForLotad;
import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove{
	public Bubble(){super(Type.WATER, 40, 100);}
	@Override protected String describe(){return "использует Пузырек";}

	@Override protected void applyOppEffects(Pokemon p){
    if(Math.random() >= 0.9) p.setMod(Stat.SPEED, -1);}
}
