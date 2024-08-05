package vonal;

public class Vonal {
    
    private static final int MIN_HOSSZ = 1;
    private static final int ALAP_ELTOLAS = 0;
    private static final String ALAP_SZIN = "fekete";
    private static final String ALAP_STILUS = "folytonos";
    
    private final int hossz;
    private int eltolas;
    private String szin;
    private String stilus;
    
    public Vonal(int hossz){
        this(hossz, ALAP_ELTOLAS, ALAP_SZIN, ALAP_STILUS); 
    }
    
    public Vonal(int hossz, int eltolas){
        this(hossz, eltolas, ALAP_SZIN, ALAP_STILUS); 
    }
    
    public Vonal(int hossz, int eltolas, String szin, String stilus){
        if (hossz < MIN_HOSSZ) {
            throw new IllegalArgumentException("A hossz legalább 1 kell legyen!");
        }
        if (eltolas < 0) {
            throw new IllegalArgumentException("Az eltolás nem lehet negativ!");
        }
        this.hossz = hossz; 
        this.eltolas = eltolas; 
        this.szin = szin; 
        this.stilus = stilus; 
    }
    
     public int getHossz() {
        return hossz;
    }

    public int getEltolas() {
        return eltolas;
    }

    public void setEltolas(int eltolas) {
        if (eltolas < 0) {
            throw new IllegalArgumentException("Az eltolás nem lehet negatív");
        }
        this.eltolas = eltolas;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getStilus() {
        return stilus;
    }

    public void setStilus(String stilus) {
        this.stilus = stilus;
    }
    
    @Override
    public String toString(){
        return "Vonal{" + "hossz= " + hossz + ", eltolás= " + eltolas +
                ", szin= '" + szin + '\'' + ", stilus= '" + stilus + '\'' + '}';
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
