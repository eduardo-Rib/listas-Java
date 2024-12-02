import java.util.Scanner;

public class Main {

    private static int cont = 0, contp= 0;
    private static final Scanner scan = new Scanner(System.in);
    private static final Peixe[] peixe = new Peixe[100];
    private static final Cachorro[] cachorro = new Cachorro[100];

    public static void main(String[] args) {
        int opc = 1;

        while(opc != 0){
            do{
                System.out.print("1 - Incluir animal\n2 - Visualizar animal\n->");
                opc = scan.nextInt();
            }while((opc < 0)||(opc > 3));

            switch(opc){
                case 1:
                    Incluir();
                    break;
                case 2:
                    if (cont + contp > 0){
                        Consultar();
                    }else{
                        System.out.print("\nInclua um animal\n\n");
                    }
                    break;
            }
        }
        scan.close();
    }

    public static int escolher(int tipo){
        int n = 0;

        System.out.print("Escolha um animal: \n");
        if (tipo == 1){
            for (int i = 0; i < contp; i++) {
                System.out.print((i+1) + " - Peixe: " + peixe[i].getNome() + "\n");
            }
        }else{
            for (int i = 0; i < cont; i++) {
                System.out.print((i+1) + " - Cachorro: " + cachorro[i].getNome() + "\n");
            }
        }

        n = scan.nextInt();

        return n;
    }

    public static void Consultar(){
        
        System.out.println("Escolha o tipo do animal\n1 - Peixe\n2 - Cachorro\n->");
        int tipo = scan.nextInt();

        int n = escolher(tipo);

        if (tipo == 1){
            System.out.print("\n" + n + "º Nome do animal\nNome:" + peixe[n-1].getNome() + "\nPeso:" + peixe[n-1].getPeso() + "\nHabitat: " + peixe[n-1].getTipoHabitat() + "\n\n");
        }else{
            System.out.print("\n" + n + "º Nome do animal\nNome:" + cachorro[n-1].getNome() + "\nPeso:" + cachorro[n-1].getPeso() + "\nHabitat: " + cachorro[n-1].getRaca() + "\n\n");
        }
    }


    public static void Incluir(){
        System.out.print("Qual o animal que deseja adicionar: \n1 - Peixe\n2 - Cachorro\n->");
        int tipo = scan.nextInt();

        System.out.print("Qual o nome do animal que deseja adicionar: \n->");
        String nome = scan.next();

        System.out.print("Qualo o peso do animal que deseja adicionar: \n->");
        Double peso = scan.nextDouble();

        if (tipo == 1){
            System.out.print("Qual o habitat do animal que deseja adicionar: \n->");
            String habitat = scan.next();

            Peixe a = new Peixe(nome, peso, habitat);
            peixe[contp++] = a;
        }else{
            System.out.print("Qual a caça do animal que deseja adicionar: \n->");
            String raca = scan.next();

            Cachorro a = new Cachorro(nome, peso, raca);
            cachorro[cont++] = a;
        }

    }

}