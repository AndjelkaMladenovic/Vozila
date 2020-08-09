package prevoz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prevoz {

    public static void main(String[] args) throws InterruptedException, IOException {

        Putnicko p = new Putnicko("Audi", 2005, "6 000$", 3);
        Teretno t = new Teretno("Man", 2003, "8 000$", "3");
        Autobus a = new Autobus("Ikarbus", 2012, "20 000$", 120);

        Scanner s = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        int izbor;
        PrvaNit pn = new PrvaNit();
        System.out.println("Izaberite\n1. Putnicko vozilo\n2. Teretno vozilo\n3. Autobus");
        izbor = s.nextInt();

        if (izbor == 1) {
            p.Vozilo();
        }
        if (izbor == 2) {
            t.Vozilo();
        }
        if (izbor == 3) {
            a.Vozilo();
        }
        if ((izbor > 3) || (izbor < 1)) {
            throw new ArithmeticException("Morate izabrati jedan od ponudjenih izbora");
        }
        ArrayList kv = new ArrayList();
        kv.add(p.marka);
        kv.add(p.godiste);
        kv.add(p.cena);
        kv.add(p.brVrata);
        kv.add(t.marka);
        kv.add(t.godiste);
        kv.add(t.cena);
        kv.add(t.kilometraza);
        kv.add(a.marka);
        kv.add(a.cena);
        kv.add(a.godiste);
        kv.add(a.bms);
        String podaciK = kv.toString();

        System.out.println("Izaberite da li zelite\n1. Upis u fajl\n2. Ispis na izlazu");
        System.out.println("Molimo, sacekajte 5 sekundi");
        int iz = s.nextInt();
        System.out.println("Odbrojavanje pocinje:");
        for (int i = 0; i < 5; i++) {
            pn.sleep(900);
            System.out.println("Proteklo je " + i + " sekundi");
        }
        if (iz == 1) {
            FileWriter fw = new FileWriter("podaci.txt");

            fw.write(podaciK);
            fw.close();
            System.out.println("Podaci su upisani.");
        }
        if (iz == 2) {
            FileWriter fw = new FileWriter("podaci.txt");
            fw.write(podaciK);
            fw.close();
            System.out.println("Podaci su upisani.");
            FileReader fr = new FileReader("podaci.txt");
            int b;
            while((b=fr.read())!=-1){
                System.out.print((char)b);
                fw.close();
            }
        }

    }
}
//Moze se ubaciti jos exceptions, while koji vraca na
//ponovni izbor, ubacivanje vremena, unos vremena, 
//upis samo jednog od 3 izbora. upis novog vozila...itd