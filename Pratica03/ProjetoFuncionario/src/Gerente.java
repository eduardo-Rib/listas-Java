public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, int cpf, Double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }
        return false;
    }

}
