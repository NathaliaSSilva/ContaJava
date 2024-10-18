import java.util.Scanner;
public class UsarContaCorrente {
    public static void main(String[] args) throws Exception {

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente("Nathalia",1000f,2000f,'c');
        ContaCorrente c3 = new ContaCorrente("Pedro",10000f,'p' );
        
        Scanner dado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        c1.nome = dado.nextLine();
        System.out.println("Digite o saldo:");
        c1.saldo = dado.nextFloat();
        System.out.println("Digite o limite: ");
        c1.limite = dado.nextFloat();
        System.out.println("Digite o tipo: ");
        c1.tipo = dado.next().charAt(0);

        System.out.println("\n");

        System.out.println("Conta C1");
        System.out.println("nome: " + c1.nome);
        System.out.println("saldo: " + c1.saldo);
        System.out.println("tipo: " + c1.tipo);
        System.out.println("limite: " + c1.limite);

        System.out.println("\n");
        
        System.out.println("Conta C2");
        System.out.println("nome: " + c2.nome);
        System.out.println("saldo: " + c2.saldo);
        System.out.println("tipo: " + c2.tipo);
        System.out.println("limite: " + c2.limite);

        System.out.println("\n");

        System.out.println("Conta C3");
        System.out.println("nome: " + c3.nome);
        System.out.println("saldo: " + c3.saldo);
        System.out.println("tipo: " + c3.tipo);



    }
}
