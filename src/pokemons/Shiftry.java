package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;
public class Shiftry extends Nuzleaf {
    public Shiftry(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.DARK);
        this.setStats(90, 100, 60, 90, 60, 80);
        this.setMove(new EnergyBall(), new ShadowBall(), new Growth(), new ShadowBall());
    }
}