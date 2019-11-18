package Poke.Moves.ForSuicune;
import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove{
	public Bite(){super(Type.DARK, 60, 100);}
	@Override protected String describe(){return "кусает оппонента";}

	@Override
	protected void applyOppEffects(Pokemon p){
		if (Math.random() >= 0.7) Effect.flinch(p);
	}

}
