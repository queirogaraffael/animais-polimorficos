package animais.mamiferos;

public class Cachorro extends Mamifero {
    @Override
    public void locomover(int velocidade) {
        System.out.println("O cachorro esta correndo a " + velocidade + " km/h.");
    }

    @Override
    public void locomover(String terreno) {
        System.out.println("O cachorro esta correndo no(a) : " + terreno + ".");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro esta latindo.\n");
    }
}
