package animais.repteis;

public class Tartaruga extends Reptil {
    @Override
    public void locomover(int velocidade) {
        System.out.println("A tartaruga esta se movendo a " + velocidade + " centimetros/s.");
    }

    @Override
    public void locomover(String terreno) {
        System.out.println("A tartaruga estando caminhando sobre " + terreno + ".");
    }

    @Override
    public void emitirSom() {
        System.out.println("A tartaruga nao emite som audivel.\n");
    }
}
