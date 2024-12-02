import java.util.Scanner;

public class Main {

    private static int contFuncionario = 0;
    private static final Scanner scan = new Scanner(System.in);
    private static final Funcionario[] funcionario = new Funcionario[100];

    public static void main(String[] args) {

        int opc = 1;

        while(opc != 0){
            do{
                System.out.print("1 - Incluir funcionario\n2 - Visualizar funcionario\n3 - Aumentar salario\n->");
                opc = scan.nextInt();
            }while((opc < 0)||(opc > 3));

            switch(opc){
                    case 1:
                        Incluir();
                        break;
                    case 2:
                        if (contFuncionario > 0){
                            Consultar(escolher());
                        }else{
                            System.out.print("\nInclua um funcionario\n\n");
                        }
                        break;
                    case 3:
                        if (contFuncionario > 0){
                            mudarSalario(escolher());
                        }else{
                            System.out.print("\nInclua um funcionario\n\n");
                        }
                        break;
            }
        }
        scan.close();
    }

    public static int escolher(){
        int n = 0;

        System.out.print("Escolha um funcionario: \n");

        for (int i = 0; i < contFuncionario; i++) {
            System.out.print((i+1) + " - Funcionario: " + funcionario[i].getNome() + "\n");
        }

        do{
            n = scan.nextInt();
        }while((n < 1)||(n > contFuncionario));

        return n;
    }



    public static void mudarSalario(int n){
        Double p = 0.00;

        System.out.print("Salario atual do funcionario: " + funcionario[n-1].getSalario());
        do{
            System.out.print("\nInsira o percentual de aumento:\n->");
            p = scan.nextDouble();
        }while((p < 0)||(p > 100));



        System.out.print("Novo salario: " + funcionario[n-1].aumentarSalario(p) + "\n\n");
    }



    public static void Consultar(int n){
        System.out.print("\n" + n + "º Funcionario\nNome:" + funcionario[n-1].getNome() + "\nRG:" + funcionario[n-1].getRg() + "\nSalario: " + funcionario[n-1].getSalario() + "\n\n");
    }



    public static void Incluir(){
        System.out.print("Qual o nome do funcionario que deseja adicionar: \n->");
        String nome = scan.next();

        System.out.print("Qualo rg do funcionario que deseja adicionar: \n->");
        int rg = scan.nextInt();

        System.out.print("Qual o salario do funcionario que deseja adicionar: \n->");
        Double salario = scan.nextDouble();

        Funcionario f = new Funcionario(nome, rg, salario);
        funcionario[contFuncionario++] = f;
    }
}