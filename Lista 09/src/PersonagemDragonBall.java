public abstract class PersonagemDragonBall {
    // Declaração de variáveis 
    protected String nome;           // Nome do personagem
    protected int idade;             // Idade do personagem
    protected String sexo;           // Sexo do personagem
    protected String temporada;      // Temporada em que o personagem aparece
    protected int ki;                // Nível de poder (ki) do personagem
    protected String poderEspecial;  // Descrição do poder especial do personagem

    // Construtor da classe PersonagemDragonBall
    public PersonagemDragonBall(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }

    // Método abstrato para calcular o poder
    public abstract int calcularPoder();

    // Sobrescreve o método toString para fornecer uma representação em string do objeto
    @Override
    public String toString() {
        // Retorna uma string formatada com os atributos do personagem
        return String.format("Nome: %s, Idade: %d, Sexo: %s, Temporada: %s, Ki: %d, Poder Especial: %s", nome, idade, sexo, temporada, ki, poderEspecial);
    }
}
