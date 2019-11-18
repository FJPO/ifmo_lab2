package Poke.Moves.ForLotad;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove{
	public Scald(){super(Type.WATER, 80, 100);}
	@Override protected String describe(){return "использует scald";}

	@Override protected void applyOppEffects(Pokemon p){
    if((!p.hasType(Type.FIRE)) && (Math.random() >= 0.7)) p.setCondition(new Effect().turns(-1).condition(Status.BURN));}
}
