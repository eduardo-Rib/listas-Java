import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    public static Scanner sc = new Scanner(System.in);
    public static  List<Gerente> gerentes = new ArrayList<>();

    public static void main(String[] args) {
        int opc;
        do{
            System.out.print("Escolha uma opcao: \n1 - Adicionar gerente\n2 - Visualizar gerentes\n->");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    incluirGerente();
                    break;
                case 2:
                    if (gerentes.size() > 0){
                        consultarGerente();
                    }else{
                        System.out.println("Adicione mais gerentes");
                    }
                    break;
            }
        }while (opc != 0);
    }

    public static void incluirGerente(){
        System.out.print("Digite o nome do gerente: \n->");
        String nome = sc.next();

        System.out.print("Digite o cpf do gerente: \n->");
        int cpf = sc.nextInt();

        System.out.print("Digite o salario do gerente: \n->");
        Double  salario = sc.nextDouble();

        System.out.print("Digite a senha do gerente: \n->");
        int senha = sc.nextInt();

        gerentes.add(new Gerente(nome, cpf, salario, senha));
    }

    public static void consultarGerente(){
        System.out.println("Escolha um gerente:");
        for (Gerente gerente : gerentes){
            System.out.println("Nome: " + gerente.getNome());
        }
        System.out.print("->");
        int opc = sc.nextInt();

        System.out.print("Digite a senha do gerente: \n->");
        if (gerentes.get(opc).autentica(sc.nextInt())){
            System.out.println("Nome: " + gerentes.get(opc).getNome());
            System.out.println("CPF: " + gerentes.get(opc).getCpf());
            System.out.println("Salario: " + gerentes.get(opc).getSalario());
        }else{
            System.out.println("Senha incorreta");
        }
    }

}