import javax.swing.JOptionPane;

public class Exercicios{

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Escreva um nome: ");
        
        if (nome != null && nome.equals("") == false){
            JOptionPane.showMessageDialog(null, nome, "Nome inserido", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Insira um nome!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}