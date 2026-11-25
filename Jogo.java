import java.util.ArrayList;
import java.util.Random;

public interface Jogo {
    ArrayList<Jogador> iniciarJogo();
    void jogarTurno(Jogador jogador);
    boolean jogoAcabou();

    static int criarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100);
    }

    static int criarNumeroAleatorio(int limite) {
        Random random = new Random();
        return random.nextInt(limite);
    }
}{
}
