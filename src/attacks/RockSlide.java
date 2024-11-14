package attacks;
import ru.ifmo.se.pokemon.*;
public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
        }
    }
    @Override
    public String describe() {
        return "Uses Rock Slide";
    }
}