package animais.mamiferos;

public class Gato extends Mamifero {

    @Override
    public void locomover(int velocidade) {
        System.out.println("O gato esta se movendo a " + velocidade + " km/h.");
    }

    @Override
    public void locomover(String terreno) {
        System.out.println("O gato esta se movendo no(a): " + terreno + ".");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato esta miando.\n");
    }
}
