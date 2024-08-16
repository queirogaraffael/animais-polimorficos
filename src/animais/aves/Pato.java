package animais.aves;

public class Pato extends Ave {

    @Override
    public void locomover(int velocidade) {
        System.out.println("O pato esta nadando a " + velocidade + " m/h.");
    }


    @Override
    public void locomover(String terreno) {
        if (terreno.equalsIgnoreCase("agua")) {
            System.out.println("O pato esta nadando na agua.");
        } else {
            System.out.println("O pato esta caminhando em terra.");
        }
    }


    @Override
    public void emitirSom() {
        System.out.println("O pato esta grasnando.\n");
    }
}
