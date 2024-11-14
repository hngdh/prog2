package attacks;
import ru.ifmo.se.pokemon.*;
public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.burn(p);
        }
    }
    @Override
    public String describe() {
        return "Uses Scald";
    }
}