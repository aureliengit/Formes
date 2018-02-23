package be.heh.Formes;

public class Carre extends Forme{

    public Carre(float cote) {
        super(cote, 4);  //va permettre d'appeler le constructeur de parent 
        /*question d'examen pour rappeler la methode du parent super.<nom de methode> 
        @ est une annotation (pour verifier qu'il existe la meme methode dans la classe parent pour la signature */
        
    }

    @Override
    public float aire()
    {
        return (float)Math.pow(this.cote,2);
    }
}
