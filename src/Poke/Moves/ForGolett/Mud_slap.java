package Poke.Moves.ForGolett;
import ru.ifmo.se.pokemon.*;

public class Mud_slap extends SpecialMove{
	public Mud_slap(){super(Type.GROUND, 20, 100);}
	@Override protected String describe(){return "кидает грязь";}

	@Override protected void applyOppEffects(Pokemon p){p.setMod(Stat.ACCURACY, -1);}
}
