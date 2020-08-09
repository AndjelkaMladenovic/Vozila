
package prevoz;
public class Autobus extends Vozilo{
    int bms;
    public Autobus(String marka, int godiste, String cena, int bms) {
     super(marka, godiste, cena);
     this.bms = bms;
    }
    @Override
    public void Vozilo(){
        super.Vozilo();
        System.out.println(marka+" "+godiste+" "+cena+" "+bms);   
    }
    
}
