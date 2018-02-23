package be.heh.Formes;

import java.util.ArrayList;

public class ConstructeurPoly {

    private ArrayList<Forme> formes = new ArrayList<>();

    private ArrayList<Forme> constructeurFormes()
    {
        this.formes.add(new Triangle(2));
        this.formes.add(new Triangle(3));
        this.formes.add(new Triangle(4));
        this.formes.add(new Carre(2));
        this.formes.add(new Carre(3));
        this.formes .add(new Carre(4));
        return this.formes;
    }

    public ArrayList<Forme> getFormes()
    {
        return this.constructeurFormes();
    }
}
