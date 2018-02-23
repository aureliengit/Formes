package be.heh.Formes;

public class Carre extends Forme{

    public Carre(float cote) {
        super(cote, 4);
    }

    @Override
    public float aire()
    {
        return (float)Math.pow(this.cote,2);
    }
}
