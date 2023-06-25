//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Banco {
    static LivroTecnico t = new LivroTecnico();
    static LivroRomance r = new LivroRomance();
    static LivroPoema p = new LivroPoema();
    
    static List<LivroTecnico> bdLivroTecnico;
    static List<LivroRomance> bdLivroRomance;
    static List<LivroPoema> bdLivroPoema;

    private static Banco bdUnico;
    static Scanner teclado = new Scanner(System.in);
	
    private Banco() {	
	bdLivroTecnico = new ArrayList<LivroTecnico>();
        bdLivroRomance = new ArrayList<LivroRomance>();
        bdLivroPoema= new ArrayList<LivroPoema>();
    }
    public static Banco getBanco() {
	if(bdUnico == null) {
            bdUnico = new Banco();
        }
	return bdUnico;
    }
    public List<LivroTecnico> getBdLivroTecnico(){
	return bdLivroTecnico;
    }
    public List<LivroRomance> getBdLivroRomance(){
	return bdLivroRomance;
    }
    public List<LivroPoema> getBdLivroPoema(){
	return bdLivroPoema;
    }

    
    
    public static LivroTecnico cadastrarLivroTecnico (LivroTecnico t){
        if(consultarCodigoTec(t) == null){
            bdLivroTecnico.add(t);
            return t;
        }
        else{
            return null;
        }             
    } //fim cadastraLivroTecnico
    
    public static LivroRomance cadastrarLivroRomance(LivroRomance r){
        if(consultarLivroRomance(r) == null){
            bdLivroRomance.add(r);
            return r;
        }
        else{
            return null;
        }               
    }//fim cadastraLivroRomance
    public static LivroPoema cadastrarLivroPoema(LivroPoema p){   
        if(consultarLivroPoema(p) == null){
            bdLivroPoema.add(p);
            return p;
        }
        else{
            return null;
        }               
    }//fim cadastraLivroRomance
        
    public static LivroTecnico consultarCodigoTec(LivroTecnico t){
	for(int i = 0; i < bdLivroTecnico.size(); i++){
            if(t.getCodigo()==bdLivroTecnico.get(i).getCodigo()){
                return t;
            }
	}
	return null;
    }// fim consultaLivroTecnico

   
        
    public static LivroRomance consultarLivroRomance(LivroRomance r){
	for(int i = 0; i < bdLivroRomance.size(); i++){
            if(r.getCodigo() == bdLivroRomance.get(i).getCodigo()){
                return bdLivroRomance.get(i);
            }
	}
	return null;
    }// fim consultaLivroTecnico

        
    public static LivroPoema consultarLivroPoema(LivroPoema p){
	for(int i = 0; i < bdLivroPoema.size(); i++){
            if(p.getCodigo() == bdLivroPoema.get(i).getCodigo()){
                return bdLivroPoema.get(i);
            }
	}
	return null;
    }// fim consultaLivroTecnico
    
    

    
    public static LivroTecnico alterarLivroTecnico(LivroTecnico t){
        for(int i = 0; i < bdLivroTecnico.size(); i++){
            if(t.getCodigo().equals(bdLivroTecnico.get(i).getCodigo())){
                t = bdLivroTecnico.get(i);
                String titulo = JOptionPane.showInputDialog(null,"ATUALIZAR TITULO","ATUALIZAÇÃO",1 );
                t.setTitulo(titulo);
                bdLivroTecnico.set(i, t);
                String autor = JOptionPane.showInputDialog(null,"ATUALIZAR AUTOR","ATUALIZAÇÃO",1 );
                t.setAutor(autor);
                bdLivroTecnico.set(i, t);
                String ano = JOptionPane.showInputDialog(null,"ATUALIZAR ANO DE PUBLICACAO","ATUALIZAÇÃO",1 );
                t.setAnoPublicacao(Integer.parseInt(ano));
                bdLivroTecnico.set(i, t);
                String cod = JOptionPane.showInputDialog(null,"ATUALIZAR DO CÓDIGO","ATUALIZAÇÃO",1 );
                try {
                    t.setCodigo(cod);
                }catch (CodigoException c) {
                    t = c.reparaTecnico(t);
                }
                bdLivroTecnico.set(i, t);
                return bdLivroTecnico.get(i);
            }
        }
        return null;
    }//fim do alterarLivroTecnico
	
    public static LivroRomance alterarLivroRomance(LivroRomance r){
        for(int i = 0; i < bdLivroRomance.size(); i++){
            if(r.getCodigo().equals(bdLivroRomance.get(i).getCodigo())){
                r = bdLivroRomance.get(i);
                String titulo = JOptionPane.showInputDialog(null,"NOVO TITULO","ATUALIZAR TITULO",1 );
                r.setTitulo(titulo);
                bdLivroRomance.set(i, r);
                String autor = JOptionPane.showInputDialog(null,"ATUALIZAR AUTOR","ATUALIZAÇÃO",1 );
                r.setAutor(autor);
                bdLivroRomance.set(i, r);
                String ano = JOptionPane.showInputDialog(null,"ATUALIZAR ANO DE PUBLICACAO","ATUALIZAÇÃO",1 );
                r.setAnoPublicacao(Integer.parseInt(ano));
                bdLivroRomance.set(i, r);
                String cod = JOptionPane.showInputDialog(null,"ATUALIZAR DO CÓDIGO","ATUALIZAÇÃO",1 );
                try {
                    r.setCodigo(cod);
                }catch (CodigoException c) {
                    r = c.reparaRomance(r);
                }
                bdLivroRomance.set(i, r);
                return bdLivroRomance.get(i);
            }
        }
        return null;
    }//fim do alterarLivroRomance
    
    public static LivroPoema alterarLivroPoema(LivroPoema p){
        for(int i = 0; i < bdLivroPoema.size(); i++){
            if(p.getCodigo().equals(bdLivroPoema.get(i).getCodigo())){
                p = bdLivroPoema.get(i);
                String titulo = JOptionPane.showInputDialog(null,"NOVO TITULO","ATUALIZAR TITULO",1 );
                p.setTitulo(titulo);
                bdLivroPoema.set(i, p);
                String autor = JOptionPane.showInputDialog(null,"ATUALIZAR AUTOR","ATUALIZAÇÃO",1 );
                p.setAutor(autor);
                bdLivroPoema.set(i, p);
                String ano = JOptionPane.showInputDialog(null,"ATUALIZAR ANO DE PUBLICACAO","ATUALIZAÇÃO",1 );
                p.setAnoPublicacao(Integer.parseInt(ano));
                bdLivroPoema.set(i, p);
                String cod = JOptionPane.showInputDialog(null,"ATUALIZAR DO CÓDIGO","ATUALIZAÇÃO",1 );
                try {
                    p.setCodigo(cod);
                }catch (CodigoException c) {
                    p = c.reparaPoema(p);
                }
                bdLivroPoema.set(i, p);
                
                return bdLivroPoema.get(i);
            }
        }
        return null;
    }//fim do alterarLivroPoema

    public static LivroTecnico deletarLivroTecnico(LivroTecnico t){
        for(int i = 0; i < bdLivroTecnico.size(); i++){
            if(t.getTitulo() == bdLivroTecnico.get(i).getTitulo()){
                bdLivroTecnico.remove(bdLivroTecnico.get(i));
                return null;			
            }
        }
        return t;
    }// fim deletarLivroTecnico
    
    public static LivroRomance deletarLivroRomance(LivroRomance r){
        for(int i = 0; i < bdLivroRomance.size(); i++){
            if(r.getTitulo() == bdLivroRomance.get(i).getTitulo()){
                bdLivroRomance.remove(bdLivroRomance.get(i));
                return null;
            }
        }
        return r;
    }// fim deletarLivroRomance
        
    public static LivroPoema deletarLivroPoema(LivroPoema p){
        for(int i = 0; i < bdLivroPoema.size(); i++){
            if(p.getTitulo() == bdLivroPoema.get(i).getTitulo()){
                bdLivroPoema.remove(bdLivroPoema.get(i));
                return null;	
            }
        }
	return p;
    }// fim deletarLivroPoema
        
     
}//fim da classe
