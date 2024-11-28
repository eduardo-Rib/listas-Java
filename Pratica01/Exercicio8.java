import javax.swing.JOptionPane;

public class Exercicios{

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Escreva um numero: ");
            
        if (nome != null && nome.equals("") == false){
            
            int n = Integer.parseInt(nome);

            if (n % 2 == 0){
                nome = "Par";
            }else{
                nome = "Impar";
            }

            JOptionPane.showMessageDialog(null, nome, "Numero inserido eh ", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Insira um numero!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}