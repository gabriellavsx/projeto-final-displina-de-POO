//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;
import javax.swing.JOptionPane;

public class CodigoException extends Exception {
	public CodigoException() {
		System.out.println("");
	}
	
	public LivroTecnico reparaTecnico(LivroTecnico t) {
            try {
                 String cod = (JOptionPane.showInputDialog(
                        null,
                        "NOVO CÓDIGO (É NECESSÁRIO TER PELO MENOS UM LETRA E UM NÚMERO:)",
                        "CÓDIGO DO LIVRO INCORRETO",
                        1
                        
                ));
                t.setCodigo(cod);	
            }catch(CodigoException c) {
                t = c.reparaTecnico(t);
            }
            return t;
	}
	
	public LivroPoema reparaPoema(LivroPoema p) {
		try {
                 String cod = (JOptionPane.showInputDialog(
                        null,
                        "NOVO CÓDIGO (É NECESSÁRIO TER PELO MENOS UM LETRA E UM NÚMERO:)",
                        "CÓDIGO DO LIVRO INCORRETO",
                        1
                        
                ));
                p.setCodigo(cod);		
		}catch(CodigoException c) {
			p = c.reparaPoema(p);
		}
		return p;
	}
	
	public LivroRomance reparaRomance(LivroRomance r) {
		try {
                 String cod = (JOptionPane.showInputDialog(
                        null,
                        "NOVO CÓDIGO (É NECESSÁRIO TER PELO MENOS UM LETRA E UM NÚMERO:)",
                        "CÓDIGO DO LIVRO INCORRETO",
                        1              
                ));
                r.setCodigo(cod);		
		}catch(CodigoException c) {
			r = c.reparaRomance(r);
		}
		return r;
	}
}
