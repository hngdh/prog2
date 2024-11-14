package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;
public class Basculin extends Pokemon {
    public Basculin(String name, int level) {
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(70, 92, 65, 80, 55, 98);
        this.setMove(new IceBeam(), new BubbleBeam(), new Scald(), new Headbutt());
    }
}