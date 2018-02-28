package Exercicio01;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Usuario u = new Usuario();
        
        u.setNome(JOptionPane.showInputDialog("Digite o nome"));
        u.setNascimento(JOptionPane.showInputDialog("Digite o nascimento: "));
        u.setEmail(JOptionPane.showInputDialog("Digite o email: "));
        u.setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
        
        JOptionPane.showMessageDialog(null, "Nome: " + u.getNome() +
                "\n" + "Nascimento: " + u.getNascimento() +
                "\n" + "Email: " + u.getEmail() +
                "\n" + "Telefone: " + u.getTelefone());
    }
    
}
