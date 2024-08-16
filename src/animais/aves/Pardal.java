package animais.aves;

public class Pardal extends Ave {

    @Override
    public void locomover(int velocidade) {
        System.out.println("O pardal esta voando a " + velocidade + " km/h.");
    }

    @Override
    public void locomover(String terreno) {
        if (terreno.equalsIgnoreCase("ceu")) {
            System.out.println("O pardal esta voando.");
        } else  {
            System.out.println("O pardal esta pousado no chao.");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("O pardal esta piando.\n");
    }
}

