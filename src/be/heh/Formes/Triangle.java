package be.heh.Formes;

public class Triangle extends Forme{

    public Triangle(float cote) {
        super(cote, 3);
    }

    @Override
    public float aire()
    {
        float hauteur = (float)Math.sqrt(Math.pow(this.cote,2)- (Math.pow(this.cote/2,2)));
        return (this.cote*hauteur)/2;
    }
}
