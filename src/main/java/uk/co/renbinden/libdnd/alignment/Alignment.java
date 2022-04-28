package uk.co.renbinden.libdnd.alignment;

public final class Alignment {

    public static final Alignment LAWFUL_GOOD = new Alignment(SocietalDisposition.LAWFUL, Morality.GOOD);
    public static final Alignment NEUTRAL_GOOD = new Alignment(SocietalDisposition.NEUTRAL, Morality.GOOD);
    public static final Alignment CHAOTIC_GOOD = new Alignment(SocietalDisposition.CHAOTIC, Morality.GOOD);
    public static final Alignment LAWFUL_NEUTRAL = new Alignment(SocietalDisposition.LAWFUL, Morality.NEUTRAL);
    public static final Alignment NEUTRAL = new Alignment(SocietalDisposition.NEUTRAL, Morality.NEUTRAL);
    public static final Alignment CHAOTIC_NEUTRAL = new Alignment(SocietalDisposition.CHAOTIC, Morality.NEUTRAL);
    public static final Alignment LAWFUL_EVIL = new Alignment(SocietalDisposition.LAWFUL, Morality.EVIL);
    public static final Alignment NEUTRAL_EVIL = new Alignment(SocietalDisposition.NEUTRAL, Morality.EVIL);

    enum Morality {
        GOOD,
        NEUTRAL,
        EVIL
    }

    enum SocietalDisposition {
        LAWFUL,
        NEUTRAL,
        CHAOTIC
    }

    private final SocietalDisposition societalDisposition;
    private final Morality morality;

    private Alignment(SocietalDisposition societalDisposition, Morality morality) {
        this.societalDisposition = societalDisposition;
        this.morality = morality;
    }

    public SocietalDisposition getSocietalDisposition() {
        return societalDisposition;
    }

    public Morality getMorality() {
        return morality;
    }

}
