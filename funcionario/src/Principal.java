import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Empregado> empregados = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); //limpa buffer
            switch (opcao) {
                case 1:
                    criarEmpregado();
                    break;
                case 2:
                    promoverEmpregado();
                    break;
                case 3:
                    aumentarSalarioEmpregado();
                    break;
                case 4:
                    demitirEmpregado();
                    break;
                case 5:
                    fazerAniversarioEmpregado();
                    break;
                case 6:
                    mostrarDetalhesEmpregados();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    //mostra o menu de opções para o usuário
    private static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Criar novo empregado");
        System.out.println("2. Promover empregado");
        System.out.println("3. Aumentar salário do empregado");
        System.out.println("4. Demitir empregado");
        System.out.println("5. Fazer aniversário do empregado");
        System.out.println("6. Mostrar detalhes dos empregados");
        System.out.println("7. Sair");
        System.out.println("Escolha uma opção:");
    }
     //cria um novo empregado com os dados fornecidos pelo usuário
     
    private static void criarEmpregado() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consome a nova linha
        Empregado empregado = new Empregado(nome, idade, salario);
        empregados.add(empregado);
        System.out.println("Empregado criado com sucesso.");
    }

    //promove um empregado 
    private static void promoverEmpregado() {
        Empregado empregado = selecionarEmpregado();
        if (empregado != null) {
            empregado.promover();
        }
    }

    //aumenta o salário de um empregado 
     
    private static void aumentarSalarioEmpregado() {
        Empregado empregado = selecionarEmpregado();
        if (empregado != null) {
            System.out.print("Percentual de aumento: ");
            double percentual = scanner.nextDouble();
            scanner.nextLine(); 
            empregado.aumentarSalario(percentual);
            System.out.println("Salário aumentado com sucesso.");
        }
    }

    //demite um empregado
    private static void demitirEmpregado() {
        Empregado empregado = selecionarEmpregado();
        if (empregado != null) {
            System.out.println("Motivo:\n1 Justa causa\n2 Decisão do empregador\n3 Aposentadoria ");
            int motivo = scanner.nextInt();
            scanner.nextLine();
            empregado.demitir(motivo);
        }
    }

    //aumenta a idade de um empregado
    private static void fazerAniversarioEmpregado() {
        Empregado empregado = selecionarEmpregado();
        if (empregado != null) {
            empregado.fazerAniversario();
            System.out.println("Empregado fez aniversário.");
        }
    }

    //mostra os detalhes de todos os empregados
    private static void mostrarDetalhesEmpregados() {
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
    //seleciona o empregad
    private static Empregado selecionarEmpregado() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado disponível.");
            return null;
        }
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println((i + 1) + ". " + empregados.get(i).getNome());
        }
        System.out.print("Escolha um empregado: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        if (indice < 1 || indice > empregados.size()) {
            System.out.println("Opção inválido.");
            return null;
        }
        return empregados.get(indice - 1);
    }
}
