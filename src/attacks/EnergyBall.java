package attacks;
import ru.ifmo.se.pokemon.*;
public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void  applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    public String describe() {
        return "Uses Energy Ball";
    }
}