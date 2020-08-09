
package prevoz;

public class Putnicko extends Vozilo {
    
    int brVrata;
    
    public Putnicko(String marka, int godiste, String cena, int brojVrata) {
        super(marka, godiste, cena);
        this.brVrata = brojVrata;
    }
    @Override
    public void Vozilo(){
        super.Vozilo();
        System.out.println(marka+" "+cena+" "+godiste+" "+brVrata);
    }
}
