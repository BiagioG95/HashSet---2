/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> oggetti = new HashSet<String>(Arrays.asList("1","2","3"));

        String newOggetto = "4";

        oggetti.add(newOggetto);

        if (oggetti.contains(newOggetto)) {
            System.out.println("L'elemento '" + newOggetto + "' è presente nel set.");
        } else {
            System.out.println("L'elemento '" + newOggetto + "' non è presente nel set.");
        }

    }


}