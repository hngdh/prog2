package attacks;
import ru.ifmo.se.pokemon.*;
public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    public String describe() {
        return "Uses Growth";
    }
}