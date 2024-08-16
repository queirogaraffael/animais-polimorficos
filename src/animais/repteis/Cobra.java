package animais.repteis;

public class Cobra extends Reptil {
    @Override
    public void locomover(int velocidade) {
        System.out.println("A cobra esta rastejando a " + velocidade + " m/s.");
    }

    @Override
    public void locomover(String terreno) {
        System.out.println("A cobra esta se movendo sobre o(a)" + terreno + ".");
    }

    @Override
    public void emitirSom() {
        System.out.println("A cobra esta sibilando: ssssssss.\n");
    }
}
