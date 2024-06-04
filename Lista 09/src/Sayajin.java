// Definição da classe Sayajin que herda de PersonagemDragonBall e implementa a interface Transformavel
public class Sayajin extends PersonagemDragonBall implements Transformavel {
    // Declaração de variáveis privadas específicas da classe Sayajin
    private int nivelMaximoSSJ; // Nível máximo de Super Sayajin que o personagem pode alcançar
    private boolean temRabo; // Indica se o Sayajin tem rabo

    // Construtor da classe Sayajin, inicializa os atributos
    public Sayajin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        // Chama o construtor da classe base (PersonagemDragonBall) para inicializar os atributos herdados
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        // Inicializa os atributos específicos da classe Sayajin
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    // Sobrescreve o método calcularPoder da classe base
    @Override
    public int calcularPoder() {
        // Calcula o poder do Sayajin, aumentando com base no nível máximo de SSJ
        return (int)(ki * (1 + nivelMaximoSSJ * 0.1));
    }

    // Implementa o método transformar da interface Transformavel
    @Override
    public String transformar(int nivel) {
        // Verifica se o nível de transformação é válido para o personagem
        if ((nivel >= 1 && nivel <= 3) || (nivel >= 4 && nivel <= 5 && (nome.equals("Goku") || nome.equals("Vegeta")))) {
            // Retorna uma string indicando que a transformação foi bem-sucedida
            return String.format("%s transformou para super sayajin nível %d", nome, nivel);
        } else {
            // Retorna uma string indicando que a transformação falhou
            return "Não foi possível transformar esse sayajin";
        }
    }

    // Sobrescreve o método toString da classe base para incluir informações específicas de Sayajin
    @Override
    public String toString() {
        // Retorna a representação em string do objeto, incluindo os atributos da classe base e os específicos
        return super.toString() + String.format(", Nível Máximo SSJ: %d, Tem Rabo: %b", nivelMaximoSSJ, temRabo);
    }
}