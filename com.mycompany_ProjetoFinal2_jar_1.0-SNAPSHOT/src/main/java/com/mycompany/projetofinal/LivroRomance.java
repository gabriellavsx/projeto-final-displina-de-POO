//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;

public final class LivroRomance extends Livro implements  Emprestimo{
	private String enredo;
	private String limitePalavra;
//--------------------------------------------
	public String getEnredo() {
		return enredo;
	}
	public void setEnredo(String enredo) {
		this.enredo = enredo;
	}
	public String getLimitePalavra() {
		return limitePalavra;
	}
	public void setLimitePalavra(String limitePalavra) {
		this.limitePalavra = limitePalavra;
	}
//------------------------------------------------------
	public LivroRomance() {
		enredo ="";
		limitePalavra ="";
	}
//--------------------------------------------------------------------
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
            System.out.println("3 - Livro Romance");
	}
}
