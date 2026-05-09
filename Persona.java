import java.util.Map;

public class Persona {

    public Status status;

    public enum Racas {
        HUMANO, ELFO, DRACONATO
    }

    public enum Classes {
        LADINO, MAGO, GUERREIRO
    }

    record RacaStats(int vida, int mana, double forca, int vel) {}
    record ClassesStats(int bonusVida, int bonusMana, double bonusForca, int bonusVel) {}

    private static final Map<Racas, RacaStats> RACA_STATS = Map.of(
        Racas.HUMANO, new RacaStats(100, 90, 1.20, 80),
        Racas.ELFO, new RacaStats(80, 150, 0.8, 110),
        Racas.DRACONATO, new RacaStats(180, 120, 1.5, 60)
    );

    private static final Map<Classes, ClassesStats> CLASSE_BONUS = Map.of(
        Classes.GUERREIRO, new ClassesStats(40, 0, 1.5, 10),
        Classes.MAGO, new ClassesStats(0, 100, 0, 30),
        Classes.LADINO, new ClassesStats(25, 40, 1.25, 65)
    );

    public Persona(Racas raca, Classes classe) {
        RacaStats base = RACA_STATS.get(raca);
        ClassesStats bonus = CLASSE_BONUS.get(classe);
        int vidaFinal = base.vida() + bonus.bonusVida();
        int manaFinal = base.mana() + bonus.bonusMana();
        double forcaFinal = base.forca() + bonus.bonusForca();
        int velFinal = base.vel() + bonus.bonusVel();
        this.status = new Status(classe.name(), raca.name(), manaFinal, vidaFinal, forcaFinal, velFinal);
    }

    public Status getStatus() { return status; }
}
