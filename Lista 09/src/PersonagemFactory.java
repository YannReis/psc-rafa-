public class PersonagemFactory {
    // Método estático para criar um personagem Dragon Ball com base no nome fornecido
    public static PersonagemDragonBall criarPersonagem(String nome) {
        // Utiliza uma instrução switch para determinar qual personagem criar
        switch (nome) {
            // Caso o nome seja "Kuririn"
            case "Kuririn":
                // Retorna uma nova instância de Terraqueo com os atributos específicos
                return new Terraqueo("Kuririn", 32, "Masculino", "DBZ", 500, "Kamehameha", "Terra", "Cidade do Leste");
            // Caso o nome seja "Goku"
            case "Goku":
                // Retorna uma nova instância de Sayajin com os atributos específicos
                return new Sayajin("Goku", 42, "Masculino", "DBZ", 9000, "Kamehameha", 5, true);
            // Caso o nome seja "Gohan"
            case "Gohan":
                // Retorna uma nova instância de Sayajin com os atributos específicos
                return new Sayajin("Gohan", 23, "Masculino", "DBZ", 7000, "Masenko", 3, true);
            // Caso o nome seja "Dende"
            case "Dende":
                // Retorna uma nova instância de Namekuseijin com os atributos específicos
                return new Namekuseijin("Dende", 30, "Masculino", "DBZ", 3000, "Cura", 7, true);
            // Caso o nome não corresponda a nenhum personagem conhecido
            default:
                // Retorna null indicando que o personagem não foi encontrado
                return null;
        }
    }
}