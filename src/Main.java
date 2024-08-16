import animais.Animal;
import animais.aves.Pardal;
import animais.aves.Pato;
import animais.mamiferos.Cachorro;
import animais.mamiferos.Gato;
import animais.mamiferos.Mamifero;
import animais.repteis.Cobra;
import animais.repteis.Reptil;
import animais.repteis.Tartaruga;


public class Main {
    public static void main(String[] args) {

        // UPCASTING das AVES
        System.out.println("Aves:");

        Animal pardal = new Pardal();
        pardal.locomover(5);
        pardal.locomover("ceu");
        pardal.emitirSom();

        Animal pato = new Pato();
        pato.locomover(5);
        pato.locomover("agua");
        pato.emitirSom();


        // UPCASTING dos MAMIFEROS
        System.out.println("\nMamiferos:");

        Mamifero cachorro = new Cachorro();
        cachorro.locomover(5);
        cachorro.locomover("chao");
        cachorro.emitirSom();

        Mamifero gato = new Gato();
        gato.locomover(25);
        gato.locomover("chao");
        gato.emitirSom();


        // UPCASTING dos REPTEIS
        System.out.println("\nRepteis:");

        Reptil cobra = new Cobra();
        cobra.locomover(25);
        cobra.locomover("chao");
        cobra.emitirSom();

        
        Reptil tartaruga = new Tartaruga();
        tartaruga.locomover(2);
        tartaruga.locomover("chao");
        tartaruga.emitirSom();


    }
}