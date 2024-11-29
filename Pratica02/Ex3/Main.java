public class Main {

    public static void main(String[] args) {
        Data data = new Data(args[5], args[6], args[7]);
        Aluno aluno = new Aluno(args[0], args[1], args[2], args[3], args[4], data);
        System.out.println(aluno.imprimir());
    }
}