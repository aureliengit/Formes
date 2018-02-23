package be.heh.EntryPoint;

import be.heh.Formes.*;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args)
    {
        ConstructeurPoly constructeurPoly = new ConstructeurPoly();
        ArrayList<Forme> formes = constructeurPoly.getFormes();

        Affichage affichage = new Affichage();
        affichage.affichage(formes);

        Geometrie geometrie = new Geometrie();
        DecimalFormat  f = new DecimalFormat();
        System.out.println("L'aire totale vaut : " + f.format(geometrie.calculAire(formes)));
        System.out.println("Le périmètre total vaut : " + f.format(geometrie.calculPerim(formes)));

    }
}
