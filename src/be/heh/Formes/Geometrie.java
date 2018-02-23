package be.heh.Formes;

import java.awt.*;
import java.util.ArrayList;

public class Geometrie {

    public double calculPerim(ArrayList<Forme> f)
    {
        double total = 0;
        for (Forme forme : f)
        {
            total += forme.perimetre();
        }
        return total;
    }

    public double calculAire(ArrayList<Forme> f)
    {
        double total = 0;
        for (Forme forme : f)
        {
            total += forme.aire();
        }

        return total;
    }
}
