public class Aluno {

    private String ra;
    private String nome;
    private String sexo;
    private String rg;
    private String cpf;

    Aluno(String ra, String nome, String sexo, String rg, String cpf){
        setRa(ra);
        setNome(nome);
        setSexo(sexo);
        setRg(rg);
        setCpf(cpf);
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
    
}