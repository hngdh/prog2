package pokemons;
import ru.ifmo.se.pokemon.*;
import attacks.*;
public class Lickilicky extends Lickitung {
    public Lickilicky(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(110, 85, 95, 80, 95, 50);
        this.setMove(new RockSlide(), new ShadowBall(), new IceBeam(), new FocusBlast());
    }
}