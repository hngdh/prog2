package attacks;
import ru.ifmo.se.pokemon.*;
public class Headbutt extends PhysicalMove {
    public Headbutt() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
        }
    }
    @Override
    public String describe() {
        return "Uses Headbutt";
    }
}