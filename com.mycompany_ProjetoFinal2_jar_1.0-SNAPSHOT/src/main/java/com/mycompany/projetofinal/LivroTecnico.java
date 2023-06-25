//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import javax.swing.JOptionPane;

public final class LivroTecnico extends Livro implements  Emprestimo{
	private String areaConhecimento;
	private String exercicios;
//---------------------------------------------
	public String getAreaConhecimento() {
		return areaConhecimento;
	}
	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}
	public String getExercicios() {
		return exercicios;
	}
	public void setExercicios(String exercicios) {
		this.exercicios = exercicios;
	}
//-------------------------------------------------------
	public LivroTecnico() {
		areaConhecimento = "";
		exercicios = "";
	}
//--------------------------------------------------------
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
            System.out.println("1 - Livro Tecnico");
	}
}
