public class Funcionario extends Pessoa {

    private Double salario;

    public Funcionario(String nome, int rg, Double salario) {
        super(nome, rg);
        this.salario = salario;
    }

    public Double aumentarSalario(Double percentual) {
        salario += ((salario/100)*percentual);
        return salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}