package attacks;
import ru.ifmo.se.pokemon.*;
public class BubbleBeam extends SpecialMove {
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
        p.setMod(Stat.SPEED, -1);
        }
    }
    @Override
    public String describe() {
        return "Uses Bubble Beam";
    }
}