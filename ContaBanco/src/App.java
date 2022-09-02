import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaTerminal registro = new ContaTerminal();
        System.out.print("Digite o número da conta: ");
        registro.setConta(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite o número da agência: ");
        registro.setAgencia(sc.next());
        sc.nextLine();
        System.out.print("Digite o nome do clinete: ");
        registro.setNomeCliente(sc.next());
        sc.nextLine();
        System.out.print("Digite o saldo disponivel: ");
        registro.setSalto(sc.nextDouble());
        sc.nextLine();
        System.out.println(registro.toString());
    
    }
}
