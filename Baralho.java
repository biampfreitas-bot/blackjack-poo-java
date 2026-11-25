import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        reiniciar();
    }

    public void reiniciar() {
        cartas.clear();
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        int[] valores  = { 11,   2,   3,   4,   5,   6,   7,   8,   9,   10,     10,      10,     10};

        // Adiciona os 4 naipes (52 cartas no total)
        for (int naipe = 0; naipe < 4; naipe++) {
            for (int i = 0; i < nomes.length; i++) {
                cartas.add(new Carta(nomes[i], valores[i]));
            }
        }
    }

    public Carta comprarCarta() {
        if (cartas.isEmpty()) {
            reiniciar();
        }
        // Usa o método estático obrigatório da interface Jogo para sortear uma carta
        int indiceSorteado = Jogo.criarNumeroAleatorio(cartas.size());
        return cartas.remove(indiceSorteado);
    }

    public Carta espiarProxima() {
        if (cartas.isEmpty()) {
            reiniciar();
        }
        return cartas.get(0);
    }

    public Carta comprarDoTopo() {
        if (cartas.isEmpty()) {
            reiniciar();
        }
        return cartas.remove(0);
    }
}