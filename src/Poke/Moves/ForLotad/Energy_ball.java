package Poke.Moves.ForLotad;
import ru.ifmo.se.pokemon.*;

public class Energy_ball extends SpecialMove{
	public Energy_ball(){super(Type.GRASS, 90, 100);}
	@Override protected String describe(){return "кидает энергетический шар";}

	@Override protected void applyOppEffects(Pokemon p){
    if(Math.random() >= 0.9) p.setMod(Stat.SPECIAL_DEFENSE, -1);}
}
