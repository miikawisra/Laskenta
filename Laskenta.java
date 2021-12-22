import java.io.*;

class Laskenta {
    public static void main(String [] args){
        int valinta;
        int eka;
        int toka;
        int summa;
        int erotus;
        int tulo;
        double osamaara;
        int jakojaannos;


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Käytössäsi on seuraavat laskutoimitukset:\n1: vähennyslasku\n2: yhteenlasku\n3: kertolasku\n4: osamäärä\n5: jakojäännös\n\nValitse laskutoimitus:");
            valinta = Integer.parseInt(in.readLine());

            System.out.println("Anna eka luku:");
            eka = Integer.parseInt(in.readLine());

            System.out.println("Anna toka luku:");
            toka = Integer.parseInt(in.readLine());
            erotus = eka-toka;
            summa = eka+toka;
            tulo = eka*toka;
            osamaara = eka/toka;
            jakojaannos = eka%toka;

            switch (valinta){
                case 1:
                    System.out.println(eka+"-"+toka+"="+erotus);
                break;
                case 2:
                    System.out.println(eka+"+"+toka+"="+summa);
                break;
                case 3:
                    System.out.println(eka+"*"+toka+"="+tulo);
                break;
                case 4:
                    System.out.println(eka+"/"+toka+"="+osamaara);
                break;
                case 5:
                    System.out.println(eka+"%"+toka+"="+jakojaannos);
                break;
                default:
                System.out.println("Valitse laskutoimitus:");

            
            }
    
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
/*Käytössäsi on seuraavat laskutoimitukset:
1: vähennyslasku
2: yhteenlasku
3: kertolasku
4: osamäärä
5: jakojäännös

Valitse laskutoimitus:
2
Anna eka luku:4354
Anna toka luku:
432432
4354+432432 = 436786
switch (input){
    case1
    break
    case2
    break
    case3
    break
    default
}
*/