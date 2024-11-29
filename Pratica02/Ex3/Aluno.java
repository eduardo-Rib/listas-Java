public class Aluno {

    private String ra;
    private String nome;
    private String sexo;
    private String rg;
    private String cpf;
    private Data data;

    Aluno(String ra, String nome, String sexo, String rg, String cpf, Data data){
        setRa(ra);
        setNome(nome);
        setSexo(sexo);
        setRg(rg);
        setCpf(cpf);
        setData(data);
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

    public void setData(Data data){
        this.data = data;
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

    public Data geData(){
        return data;
    }
    
    public String imprimir(){
        return "Aluno " + nome + "\nRA: " + ra + "\nSexo: " + sexo + "\nRG: " + rg + "\nCPF: " + cpf + "\nData: " + data.formataData();
    }

}