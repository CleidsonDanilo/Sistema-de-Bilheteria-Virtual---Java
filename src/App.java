import model.*;
import service.*;
import util.ConsoleUI;
import java.util.*;


public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final BilheteriaService bilhe = new BilheteriaService();

    public static void main(String[] args) {
        while (true) {
            ConsoleUI.clearScreen();
            ConsoleUI.header("Bem-vindo à Bilheteria Virtual");
            exibirMenu();

            int op = sc.nextInt(); sc.nextLine();
            switch (op) {
                case 1 -> listarEventos();
                case 2 -> comprarIngresso();
                case 3 -> listarMeusIngressos();
                case 0 -> {
                    System.out.println(ConsoleUI.YELLOW + "Saindo..." + ConsoleUI.RESET);
                    return;
                }
                default -> System.out.println(ConsoleUI.RED + "Opção inválida!" + ConsoleUI.RESET);
            }
            ConsoleUI.pause();
        }
    }

    private static void exibirMenu() {
        System.out.println(" 1. Listar eventos");
        System.out.println(" 2. Comprar ingresso");
        System.out.println(" 3. Meus ingressos");
        System.out.println(" 0. Sair");
        System.out.print("Escolha: ");
    }

    private static void listarEventos() {
        List<Evento> evs = bilhe.listarEventos();
        ConsoleUI.printSeparator(60);
        System.out.printf("%-3s %-25s %-12s %-8s %-12s%n",
            "ID", "Evento", "Data", "Preço", "Disponível");
        ConsoleUI.printSeparator(60);
        for (int i = 0; i < evs.size(); i++) {
            Evento e = evs.get(i);
            System.out.printf("%-3d %-25s %-12s R$%-6.2f %-12d%n",
                              i, e.getNome(), e.getData(), e.getPreco(), e.getIngressos());
        }
    }

    private static void comprarIngresso() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        Cliente cli = new Cliente(nome, email);

        listarEventos();
        System.out.print("\nID do evento: ");
        int idx = sc.nextInt(); sc.nextLine();
        System.out.print("Pagamento (Pix/Cartão/Dinheiro): ");
        String metodo = sc.nextLine();

        boolean ok = bilhe.comprarIngresso(idx, cli, metodo);
        if (!ok) {
            System.out.println(ConsoleUI.RED + "Compra falhou!" + ConsoleUI.RESET);
        }
    }

    private static void listarMeusIngressos() {
        List<Ingresso> ingVend = bilhe.listarIngressosVendidos();
        if (ingVend.isEmpty()) {
            System.out.println(ConsoleUI.YELLOW + "Nenhum ingresso comprado ainda." + ConsoleUI.RESET);
            return;
        }
        ConsoleUI.printSeparator(60);
        System.out.printf("%-3s %-20s %-12s %-8s %-8s%n",
            "ID", "Evento", "Data", "Assento", "Preço");
        ConsoleUI.printSeparator(60);
        for (int i = 0; i < ingVend.size(); i++) {
            Ingresso ing = ingVend.get(i);
            Evento e     = ing.getEvento();
            System.out.printf("%-3d %-20s %-12s %-8d R$%-6.2f%n",
                i, e.getNome(), e.getData(), ing.getNumeroAssento(), ing.getPreco());
        }
    }
}