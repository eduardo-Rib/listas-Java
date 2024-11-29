public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(args[0], args[1], args[2], args[3], args[4]);
        System.out.println("Aluno " + aluno.getNome() + "\nRA: " + aluno.getRa() + "\nSexo: " + aluno.getSexo() + "\nRG: " + aluno.getRg() + "\nCPF: " + aluno.getCpf());
    }
}