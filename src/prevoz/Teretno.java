
package prevoz;

public class Teretno extends Vozilo{

    String kilometraza;
    
    public Teretno(String marka, int godiste, String cena, String kilometraza) {
        super(marka, godiste, cena);
        this.kilometraza = kilometraza;
    }
    @Override
    public void Vozilo(){
        super.Vozilo();
        System.out.println(marka+" "+godiste+" "+cena+" "+kilometraza);   
    }
}
