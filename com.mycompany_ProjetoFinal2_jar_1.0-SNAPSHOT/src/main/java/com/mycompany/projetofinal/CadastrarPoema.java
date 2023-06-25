//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastrarPoema extends javax.swing.JFrame {
    private static CadastrarPoema telaCadastro;
    private LivroPoema p = new LivroPoema();

    public CadastrarPoema() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static CadastrarPoema getCadastrarPoema(){
        if(telaCadastro ==null){
            telaCadastro = new CadastrarPoema();
        }
        return telaCadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        rotTitulo = new javax.swing.JLabel();
        rotAutor = new javax.swing.JLabel();
        rotAno = new javax.swing.JLabel();
        rotCodigo = new javax.swing.JLabel();
        cxTitulo = new javax.swing.JTextField();
        cxAutor = new javax.swing.JTextField();
        cxAno = new javax.swing.JTextField();
        cxCodigo = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        Romance = new javax.swing.JScrollPane();
        tabPoema = new javax.swing.JTable();
        rotMetrica = new javax.swing.JLabel();
        cxMetrica = new javax.swing.JTextField();
        rotRimas = new javax.swing.JLabel();
        cxRimas = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEmprestimo = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Titulo.setText("LIVRO DE POEMA");

        rotTitulo.setText("Título");

        rotAutor.setText("Autor");

        rotAno.setText("Ano de Publicação");

        rotCodigo.setText("Código");

        cxTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTituloActionPerformed(evt);
            }
        });

        cxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxAnoActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tabPoema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Ano de Publicação", "Código", "Métrica", "Possui Rimas?"
            }
        ));
        Romance.setViewportView(tabPoema);

        rotMetrica.setText("Métrica");

        rotRimas.setText("Possui Rimas?");

        btConsultar.setText("Consultar pelo Código");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar pelo Código");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir pelo Código");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEmprestimo.setText("Empréstimo");
        btEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmprestimoActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxTitulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotAutor)
                                .addGap(18, 18, 18)
                                .addComponent(cxAutor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxAno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rotCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxCodigo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotRimas)
                                .addGap(18, 18, 18)
                                .addComponent(cxRimas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotMetrica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxMetrica)))))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Romance, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTitulo)
                    .addComponent(cxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAutor)
                    .addComponent(cxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAno)
                    .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCodigo)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotMetrica)
                    .addComponent(cxMetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotRimas)
                    .addComponent(cxRimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Romance, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTituloActionPerformed

    private void cxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxAnoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consPoema();
        limpar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altPoema();
        listarTab();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excPoema();
        limpar();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        inserirPoema();
        listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestimoActionPerformed
        EmprestimoPoema();
        limpar();
    }//GEN-LAST:event_btEmprestimoActionPerformed

  
    public void inserirPoema() {
        p = new LivroPoema();
        p.setTitulo(cxTitulo.getText());
        p.setAutor(cxAutor.getText());
        try{
            p.setAnoPublicacao(Integer.parseInt(cxAno.getText()));
        }catch(NumberFormatException a){
            JOptionPane.showMessageDialog(
                null,
                "O ano tem que ser um número inteiro!",
                "ERRO",
                2
            );
            cxAno.setText("");
            return;
        }
        try {
            p.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            p = c.reparaPoema(p);
        }
        p.setMetrica(cxMetrica.getText());
        p.setRima(cxRimas.getText());

        p = Banco.getBanco().cadastrarLivroPoema(p);

        if (p != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Livro cadastrada com sucesso!",
                    "Cadastro de Livro Técnico",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Livro Duplicado!",
                    "Cadastro de Livro",
                    1
            );
        }
        limpar();
    }
        
   public void consPoema(){
        DefaultTableModel tabModel = (DefaultTableModel) tabPoema.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        int a=0;
        
        if(cxCodigo.getText().equals("")){
            listarTab();
        }else{
            for(LivroPoema p : Banco.getBanco().getBdLivroPoema()){
                if(p.getCodigo().equals(cxCodigo.getText())){
                    tabModel.insertRow(posLin, new Object[]{p.getTitulo(), p.getAutor(),p.getAnoPublicacao(), p.getCodigo(), p.getMetrica(), p.getRima()});
                    posLin++;
                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique os dados do Livro!",
                        "Consulta de Livro",
                        1
                    );     
                    a=1;
                }
            }
            if(a!=1){
                JOptionPane.showMessageDialog(
                        null,
                        "Livro não Existe",
                        "Consulta de Livro",
                        1
                );
            }  
        }
    }
   
   public void altPoema(){
        p = new LivroPoema();
        try {
            p.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            p = c.reparaPoema(p);
        }
        p = Banco.getBanco().alterarLivroPoema(p);
        if(p!=null){
            cxCodigo.setText(p.getCodigo());
                JOptionPane.showMessageDialog(
                null,
                "Verifique os dados ALTERADOS do LIVRO!",
                "Alteração de LIVRO",
                1
                );
                limpar();
        }else{
            JOptionPane.showMessageDialog(
                null,
                "Código inexistente",
                "Alteração de LIVRO",
                1
            );
            limpar();
        }      
    }
    
    public void excPoema(){       
        LivroPoema p = new LivroPoema();
        try {
            p.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            p = c.reparaPoema(p);
        }
        int a=0;
        for(int i = 0; i < Banco.getBanco().bdLivroPoema.size(); i++) {
            if(p.getCodigo().equals(Banco.getBanco().getBdLivroPoema().get(i).getCodigo())) {
                Banco.deletarLivroPoema(Banco.getBanco().getBdLivroPoema().get(i));
                JOptionPane.showMessageDialog(
                null,
                "EXCLUSAO efetiuada com sucesso!",
                "Exclusão de Livro",
                1
                );
                a=1;
            }
        }
        if(a!=1){
           JOptionPane.showMessageDialog(
                null,
                "Código inexistente",
                "Exclusão de Livro",
                1
            );
        }
        
    }
    
    public void EmprestimoPoema(){
        LivroPoema p = new LivroPoema();
        try {
            p.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            p = c.reparaPoema(p);
        }
        int a=0;
        for(int i = 0; i < Banco.getBanco().bdLivroPoema.size(); i++) {
            if(p.getCodigo().equals(Banco.getBanco().getBdLivroPoema().get(i).getCodigo())) {
                p.impMenEmprestimo();
                a=1;
            }
        }
        if(a!=1){
           JOptionPane.showMessageDialog(
                null,
                "Livro inexistente",
                "Empréstimo",
                1
            );
        }
    }
   
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tabPoema.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(LivroPoema p : Banco.getBanco().getBdLivroPoema()){
            tabModel.insertRow(posLin, new Object[]{p.getTitulo(), p.getAutor(),p.getAnoPublicacao(), p.getCodigo(), p.getMetrica(), p.getRima()});
            posLin++;
        }
    }
    
    public void limpar(){
	cxTitulo.setText("");
	cxAutor.setText("");
	cxAno.setText("");
        cxCodigo.setText("");
        cxMetrica.setText("");
        cxRimas.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Romance;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEmprestimo;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxAutor;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxMetrica;
    private javax.swing.JTextField cxRimas;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JLabel rotAno;
    private javax.swing.JLabel rotAutor;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotMetrica;
    private javax.swing.JLabel rotRimas;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JTable tabPoema;
    // End of variables declaration//GEN-END:variables
}
