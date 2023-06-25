//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;
public abstract class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String codigo;
//---------------------------------------------------
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao){
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo)throws CodigoException {
            int countNum =0;
            int countLetra =0;
            for(int i =0;i<codigo.length();i++) {	
		if(Character.isLetter(codigo.charAt(i))) {
                    countLetra++;			
		}if(Character.isDigit(codigo.charAt(i))) {
                    countNum++;			
                }
            }
		
            if(countLetra>=1 && countNum>=1) {
               this.codigo = codigo;
            }else {
               throw new CodigoException();
            }
	}
//-----------------------------------------------------
//POLIMORFISMO POR SOBRECARGA NO CONSTRUTOR
	public Livro(){
		titulo = "";
		autor = "";
		anoPublicacao = 0;
	}
	public Livro(String titulo, String autor, int anoPublicacao, String codigo){
		this.titulo=titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
                this.codigo = codigo;
	}
//-------------------------------------------------------
//POLIMORFISMO POR SOBRESCRITA NO METODO ABSTRATO
	public abstract void impTipoLivro();
	
}
