package Poke.Moves.ForSuicune;
import ru.ifmo.se.pokemon.*;
import java.util.Arrays;

public class Facade extends PhysicalMove {
	public Facade(){super(Type.NORMAL, 70, 100);}
	@Override protected String describe(){return "атакует facade'ом";}

	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def){
		Status[] baffs = new Status[]{Status.BURN, Status.POISON, Status.PARALYZE};
		if (Arrays.binarySearch(baffs, att.getCondition()) < 0) return 2;
		return super.calcCriticalHit(att, def);
	}
}
