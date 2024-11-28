public class Exercicios{

    public static void main(String[] args) {
        float soma = 0, total = 0;
        for (int i = 0; i <= 100; i++){
            if (i%2 != 0){
                soma = soma + i;
                total++;
            }
        }
        System.out.println(soma/total);
    }

}