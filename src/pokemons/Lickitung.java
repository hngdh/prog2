package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;
public class Lickitung extends Pokemon {
    public Lickitung(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(90, 55, 75, 60, 75, 30);
        this.setMove(new RockSlide(), new ShadowBall(), new IceBeam());
    }
}