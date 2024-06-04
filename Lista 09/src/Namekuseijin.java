// Definição da classe Namekuseijin que estende a classe PersonagemDragonBall
public class Namekuseijin extends PersonagemDragonBall {
    private int quantidadeEsferas; // Número de esferas do dragão que o Namekuseijin possui
    private boolean podeCurar; // Indica se o Namekuseijin possui a habilidade de cura

    // Construtor da classe Namekuseijin que inicializa seus atributos
    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        // Chama o construtor da classe base PersonagemDragonBall para inicializar os atributos herdados
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        // Inicializa os atributos específicos da classe Namekuseijin
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    // Sobrescreve o método calcularPoder da classe base
    @Override
    public int calcularPoder() {
        // Calcula o poder do Namekuseijin, aumentando em 20% se ele possuir a habilidade de cura
        return (int)(ki * (1 + (podeCurar ? 0.2 : 0)));
    }

    // Método específico para Namekuseijin que realiza um desejo
    public String fazerDesejo(String desejo) {
        // Implementação simples de tradução do desejo, substituindo palavras específicas
        return desejo.replace("poder", "powar").replace("força", "furza");
    }

    // Sobrescreve o método toString da classe base para incluir informações específicas de Namekuseijin
    @Override
    public String toString() {
        // Retorna a representação em string do objeto, incluindo os atributos da classe base e os específicos
        return super.toString() + String.format(", Quantidade de Esferas: %d, Pode Curar: %b", quantidadeEsferas, podeCurar);
    }
}
