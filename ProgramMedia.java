import javax.swing.JOptionPane;
public class ProgramMedia {
    
    /**
     * @param args
     */
    public static void main (String []args){

        String nota1 =JOptionPane.showInputDialog(null, "Insira a Nota do Primeiro Bimestre:");
        String nota2 =JOptionPane.showInputDialog(null, "Insira a Nota do Segundo  Bimestre:");
        String nota3 =JOptionPane.showInputDialog(null, "Insira a Nota do Terceiro Bimestre:");
        String nota4 =JOptionPane.showInputDialog(null, "Insira a Nota do Quarto   Bimestre:");


        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
        
        if (media >=50) {
       
        if (media >= 70) {
            JOptionPane.showMessageDialog(null, "Aluno está aprovado com média :" + media);
        }else {
            JOptionPane.showMessageDialog(null, "Aluno está de recuperação Média:" + media);
        }
    }else{
        JOptionPane.showMessageDialog(null, "Aluno Reprovado com Média: " + media);
        }

    }
}
