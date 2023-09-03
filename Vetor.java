public class Vetor {
    private Jogador[] jogadores;
    private int tamanho;
    private static final int CAPACIDADE_PADRAO = 10;

    public Vetor() {
        this(CAPACIDADE_PADRAO);
    }

    public Vetor(int capacidade) {
        jogadores = new Jogador[capacidade];
        tamanho = 0;
    }

    public void adicionar(Jogador jogador) {
        if (tamanho < jogadores.length) {
            jogadores[tamanho] = jogador;
            tamanho++;
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    public Jogador obter(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return jogadores[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
    }

    public int tamanho() {
        return tamanho;
    }
}

