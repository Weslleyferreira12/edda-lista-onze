import java.util.HashMap;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        
        HashMap<String, String> contatos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o CPF da pessoa " + (i + 1) + ":");
            String cpf = scanner.nextLine();
            System.out.println("Digite o telefone da pessoa " + (i + 1) + ":");
            String telefone = scanner.nextLine();

            contatos.put(cpf, telefone);
        }

        System.out.println("\nLista de CPFs e seus respectivos telefones:");
        for (HashMap.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + " - Telefone: " + entry.getValue());
        }

        scanner.close();
    }
}
