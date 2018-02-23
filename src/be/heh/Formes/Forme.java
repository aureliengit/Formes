package be.heh.Formes;

import java.util.ArrayList;

public abstract class Forme {

    protected float cote;
    protected int n;
    public static ArrayList<Forme> formes = new ArrayList<>();

    public Forme(float cote, int n)
    {
        this.cote = cote;
        this.n = n;
        Forme.formes.add(this);
    }

    public float perimetre()
    {
        return this.cote*this.n;
    }

    public abstract float aire();
}
