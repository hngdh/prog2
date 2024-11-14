package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;
public class Nuzleaf extends Seedot {
    public Nuzleaf(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.DARK);
        this.setStats(70, 70, 40, 60, 40, 60);
        this.setMove(new EnergyBall(), new ShadowBall(), new Growth());
    }
}