public class Data{

    private String dia;
    private String mes;
    private String ano;

    Data(String dia, String mes, String ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }
    
    public String formataData(){
        return dia + "/" + mes + "/" + ano;
    }
}