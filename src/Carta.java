public class Carta {
    private String nome;
    private String naipe;

    public Carta() {
    }

    public Carta(String nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }

    public Carta criaCarta(String nome, String naipe){
        return new Carta(nome,naipe);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nome='" + nome + '\'' +
                ", naipe='" + naipe + '\'' +
                '}';
    }
}
