import java.util.Scanner;

 class ContaBanco {
    private String nome;
    private int conta;
    private double saldo;

    public ContaBanco(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

 public void depositar(double valor){
    saldo += valor;
    System.out.println("DEPOSITO DE R$" +valor +" FEITO COM SUCESSO\n");
 }
   public void sacar ( double valor){
    if (valor > saldo) {
        System.out.println("SALDO INSUFICIENTE.\n");
    }
    else if (valor>5000) {
        System.out.println("VALOR DO SAQUE ACIMA DO PERMITIDO.\n");
    }
    else{
        saldo -= valor;
        System.out.println("SAQUE DE R$" +valor +" FEITO COM SUCESSO.");
    }
   }

public double obterSaldo(){
    return saldo;
}

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Numero da conta: ");
        int numerConta=scanner.nextInt();

        System.out.println("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBanco ContaBanco= new ContaBanco(nome, numerConta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.");
        int opcao;
        do{
            System.out.println("Esscolha uma opção: ");
            System.out.println("1. Depositar ");
            System.out.println("2.Sacar ");
            System.out.println("3. Obter saldo disponivel");
            System.out.println("0. Sair");

            opcao =scanner.nextInt();
            switch (opcao) {
                case 1:
                        System.out.println("Digite o valor do deposito:");
                        double valorDeposito= scanner.nextDouble();
                        ContaBanco.depositar(valorDeposito);
                    break;
                case 2:
                System.out.println("Digite o valor que deseja sacar: ");
                double valorSaque = scanner.nextDouble();
                ContaBanco.sacar(valorSaque);
                break;

                case 3:
                System.out.println("SALDO DISPONIVEL: "+ ContaBanco.saldo+"\n");
                break;
                case 0:
                System.out.println("Programa encerrado..");
                
                default:
                System.out.println("Opção invalida.");
                    break;
            }
            
        } while (opcao !=0);




        scanner.close();
    }
    
}
    
}

