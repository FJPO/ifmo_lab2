package Poke.Moves.ForSuicune;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
	public Confide(){super(Type.NORMAL, 0, 0);}
	@Override protected String describe(){return "использует confide";}

	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -1);
	}
	@Override protected boolean checkAccuracy(Pokemon att, Pokemon def){return true;}
}
