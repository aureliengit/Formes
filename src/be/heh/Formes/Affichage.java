package be.heh.Formes;

import java.util.ArrayList;

public class Affichage {

    public void affichage(ArrayList<Forme> f)
    {
        int carres = 0;
        int triangles = 0;
        for (Forme ff:Forme.formes) {
            if(ff.getClass().getSimpleName().equals("Carre")) carres++;
            if(ff.getClass().getSimpleName().equals("Triangle")) triangles++;
        }
        System.out.println("************");
        System.out.println("Formes (" + f.size() + ") : ");
        System.out.println("Carrés (" + carres + "),");
        System.out.println("Triangle (" + triangles + ")");
        System.out.println("************");
    }
}
