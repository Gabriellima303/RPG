public class Status {

    private String classe;

    private String raca;

    private int vida;

    private int mana;

    private double forca;

    private int vel;


    public Status(String classe, String raca, int mana, int vida, double forca, int vel) {

        this.classe = classe;

        this.raca = raca;

        this.mana = mana;

        this.vida = vida;

        this.forca = forca;

        this.vel = vel;

    }
    public int getVel(){
        return vel;
    }
    public double getForca(){
        return forca;
    }
    public int getVida(){
        return vida;
    }
    public String getClasse(){
        return classe;
    }
    public String getRaca(){
        return raca;
    }

    public int getMana(){
        return mana;
    }
    
public void setVida(int vida) {
        this.vida = vida;
    }
public void setForca(double forca) {
        this.forca = forca;
    }
public void setMana(int mana) {
        this.mana = mana;
    }
public void setVel(int vel) {
        this.vel = vel;
    }


    
    
     @Override
    public String toString(){
      return raca + " " + classe;
  }
}
