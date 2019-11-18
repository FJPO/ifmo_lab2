package Poke;
import ru.ifmo.se.pokemon.*;
import Poke.Pokemons.*;

public class Main{
	public static void main (String[] args){
		final int N = 6;
		final int lvl = 40;
		Pokemon[] list = new Pokemon[N];
		list[0] = new Suicune("Сью", lvl);
		list[1] = new Golett("Гел", lvl);
		list[2] = new Golurk("Рук", lvl);
		list[3] = new Lotad("Лотти", lvl);
		list[4] = new Lombre("Лом", lvl);
		list[5] = new Ludicolo("Люси", lvl);
		Battle  b = new Battle();

		for (int i=0; i < (int)(N/2); i++) {
			b.addAlly(list[i]);
			b.addFoe(list[N-i-1]);
		}
		b.go();
		}
	}
