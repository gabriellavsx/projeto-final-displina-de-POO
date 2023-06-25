//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;

public final class LivroPoema extends Livro implements  Emprestimo{
	private String rima;//faz parte da estrutura externa
	private String metrica;//metrica representa as medidas dos versos utilizados ex monossilabo....
//----------------------------------------------------
	public String getRima() {
		return rima;
	}
	public void setRima(String rima) {
		this.rima = rima;
	}
	
	public String getMetrica() {
		return metrica;
	}
	public void setMetrica(String metrica) {
		this.metrica = metrica;
	}
//---------------------------------------------------------
	public LivroPoema() {
		rima ="";
		metrica ="";
	}
//---------------------------------------------------
//INTERFACE impMenEmprestimo()
	public void impMenEmprestimo() {
            JOptionPane.showMessageDialog(
            null,
            "\"Parabens, acabou de pegar o livro emprestado, vc tem o prazo de 7 dias para renovar esse emprestimo!",
            "Empréstimo",
            1
            ); 
	}
//-----------------------------------------------------------------------------
//POLIMORFISMO POR SOBRESCRITA 
	public void impTipoLivro() {
		System.out.println("2 - Livro Poema");
	}
}
