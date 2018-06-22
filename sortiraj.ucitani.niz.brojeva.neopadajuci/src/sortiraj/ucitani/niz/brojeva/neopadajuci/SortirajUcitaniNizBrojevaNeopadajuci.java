package sortiraj.ucitani.niz.brojeva.neopadajuci;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;   

public class SortirajUcitaniNizBrojevaNeopadajuci {

    public static void main(String[] args) {
        Scanner upis = new Scanner (System.in);
        int velicinaNiza;
        
        System.out.println("Upišite broj članova niza: ");
        
        velicinaNiza = upis.nextInt();
        
        System.out.println("Upišite članove niza: ");
        
        int[]niz = new int[velicinaNiza];
        
        for (int x=0;x<velicinaNiza;x++){
            niz[x]=upis.nextInt();
        
        };
        
    Arrays.sort(niz);
    System.out.println("Članovi niza su: ");
    
        for (int clan:niz){
        System.out.println(clan);
    }
 
}
}