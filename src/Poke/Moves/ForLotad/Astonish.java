package Poke.Moves.ForLotad;
import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove{
	public Astonish(){super(Type.GHOST, 30, 100);}
	@Override protected String describe(){return "поражает оппонента";}

	@Override protected void applyOppEffects(Pokemon p){
    if(Math.random() >= 0.7) Effect.flinch(p);}
}
