import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Basculin basculin = new Basculin("Ba", 56);
        Lickitung lickitung = new Lickitung("Li", 3);
        Lickilicky lickilicky = new Lickilicky("K", 19);
        Seedot seedot = new Seedot("Se", 34);
        Nuzleaf nuzleaf = new Nuzleaf("Na", 11);
        Shiftry shiftry = new Shiftry("Sb", 51);
        battle.addAlly(basculin);
        battle.addAlly(lickitung);
        battle.addAlly(lickilicky);
        battle.addFoe(seedot);
        battle.addFoe(nuzleaf);
        battle.addFoe(shiftry);
        battle.go();
    }
}