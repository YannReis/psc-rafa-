public class Main {
    public static void main(String[] args) {
        // Criação de três personagens utilizando a fábrica de personagens
        PersonagemDragonBall goku = PersonagemFactory.criarPersonagem("Goku");
        PersonagemDragonBall gohan = PersonagemFactory.criarPersonagem("Gohan");
        PersonagemDragonBall dende = PersonagemFactory.criarPersonagem("Dende");
        
        // Verifica se o personagem Goku pode se transformar
        if (goku instanceof Transformavel) {
            // Executa a transformação de Goku e exibe o resultado
            System.out.println(((Transformavel) goku).transformar(5));
        }
        // Verifica se o personagem Gohan pode se transformar
        if (gohan instanceof Transformavel) {
            // Realiza a transformação de Gohan e guarda o resultado
            String resultadoTransformacao = ((Transformavel) gohan).transformar(5);
            // Se a transformação não for bem-sucedida, tenta com um nível menor
            if (resultadoTransformacao.contains("Não foi possível")) {
                resultadoTransformacao = ((Transformavel) gohan).transformar(3);
            }
            // Exibe o resultado da transformação 
            System.out.println(resultadoTransformacao);
        }
        // Verifica se o personagem Dende é um Namekuseijin 
        if (dende instanceof Namekuseijin) {
            // Realiza um desejo com o personagem Dende
            System.out.println(((Namekuseijin) dende).fazerDesejo("Eu quero mais poder e força"));
        }
    }
}
