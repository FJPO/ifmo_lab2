package Poke.Moves.ForGolett;
import ru.ifmo.se.pokemon.*;

public class Iron_defense extends StatusMove{
	public Iron_defense(){super(Type.STEEL, 0, 0);}
	@Override protected String describe(){return "использует стальную защиту";}

	@Override protected boolean checkAccuracy(Pokemon att, Pokemon def){return true;}
	@Override protected void applySelfEffects(Pokemon p){p.setMod(Stat.DEFENSE, 2);}
}
