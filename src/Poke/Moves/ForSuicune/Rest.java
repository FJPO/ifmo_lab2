package Poke.Moves.ForSuicune;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
	public Rest(){super(Type.PSYCHIC, 0, 0);}
	@Override protected String describe(){return "отдыхает";}

	@Override
	protected void applySelfEffects(Pokemon p){
		p.setCondition(new Effect().turns(2).condition(Status.SLEEP));
		p.restore();
	}
	@Override protected boolean checkAccuracy(Pokemon att, Pokemon def){return true;}
}
