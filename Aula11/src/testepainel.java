package Painel;

import javax.swing.JOptionPane;

public class testepainel {
public static void main(String[] args) {
	JOptionPane.showInputDialog(null, "mensagem aki", "aki o tipo de mensagem: informação - erro - pergunta");
	
	String[] opcoes = {"Fechar", "Sair"};
	JOptionPane.showOptionDialog(null, "TEXTO", "TITULO!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
	
}
}
