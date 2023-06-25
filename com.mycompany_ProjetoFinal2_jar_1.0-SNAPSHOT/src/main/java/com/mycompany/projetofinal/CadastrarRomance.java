//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastrarRomance extends javax.swing.JFrame {
    private static CadastrarRomance telaCadastro;
    private LivroRomance r = new LivroRomance();

    public CadastrarRomance() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static CadastrarRomance getCadastrarRomance(){
        if(telaCadastro ==null){
            telaCadastro = new CadastrarRomance();
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
        tabRomance = new javax.swing.JTable();
        rotEnredo = new javax.swing.JLabel();
        cxEnredo = new javax.swing.JTextField();
        rotLimitePalavra = new javax.swing.JLabel();
        cxLimitePalavra = new javax.swing.JTextField();
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
        Titulo.setText("LIVRO DE ROMANCE");

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

        tabRomance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Ano de Publicação", "Código", "Enredo", "Limite de Palavra"
            }
        ));
        Romance.setViewportView(tabRomance);

        rotEnredo.setText("Enredo");

        rotLimitePalavra.setText("Limite de Palavra");

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
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btConsultar)
                            .addGap(19, 19, 19)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btExcluir)))
                    .addComponent(Romance, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(rotTitulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxTitulo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotAutor)
                            .addGap(18, 18, 18)
                            .addComponent(cxAutor))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotAno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxAno))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotCodigo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxCodigo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(rotLimitePalavra)
                            .addGap(18, 18, 18)
                            .addComponent(cxLimitePalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotEnredo)
                        .addGap(18, 18, 18)
                        .addComponent(cxEnredo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
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
                    .addComponent(rotEnredo)
                    .addComponent(cxEnredo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotLimitePalavra)
                    .addComponent(cxLimitePalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        inserirRomance();
        listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestimoActionPerformed
        EmprestimoRomance();
        limpar();
    }//GEN-LAST:event_btEmprestimoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excRomance();
        limpar();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        altRomance();
        listarTab();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consRomance();
        limpar();
    }//GEN-LAST:event_btConsultarActionPerformed

  
    public void inserirRomance() {
        r = new LivroRomance();
        r.setTitulo(cxTitulo.getText());
        r.setAutor(cxAutor.getText());
        try{
            r.setAnoPublicacao(Integer.parseInt(cxAno.getText()));
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
            r.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            r = c.reparaRomance(r);
        }
        r.setEnredo(cxEnredo.getText());
	r.setLimitePalavra(cxLimitePalavra.getText());

        r = Banco.getBanco().cadastrarLivroRomance(r);

        if (r != null) {
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
                    2
            );
        }
        limpar();
    }
        
   public void consRomance(){
        DefaultTableModel tabModel = (DefaultTableModel) tabRomance.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        int a=0;
        
        if(cxCodigo.getText().equals("")){
            listarTab();
        }else{
            for(LivroRomance r : Banco.getBanco().getBdLivroRomance()){
                if(r.getCodigo().equals(cxCodigo.getText())){
                    tabModel.insertRow(posLin, new Object[]{r.getTitulo(), r.getAutor(),r.getAnoPublicacao(), r.getCodigo(), r.getEnredo(), r.getLimitePalavra()});
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
   
   public void altRomance(){
        r = new LivroRomance();
        try {
            r.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            r = c.reparaRomance(r);
        }
        r = Banco.getBanco().alterarLivroRomance(r);
        if(r!=null){
            cxCodigo.setText(r.getCodigo());
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
    
    public void excRomance(){       
        LivroRomance r = new LivroRomance();
        try {
            r.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            r = c.reparaRomance(r);
        }
        int a=0;
        for(int i = 0; i < Banco.getBanco().bdLivroRomance.size(); i++) {
            if(r.getCodigo().equals(Banco.getBanco().getBdLivroRomance().get(i).getCodigo())) {
                Banco.deletarLivroRomance(Banco.getBanco().getBdLivroRomance().get(i));
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
    
    public void EmprestimoRomance(){
        LivroRomance r = new LivroRomance();
        try {
            r.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            r = c.reparaRomance(r);
        }
        int a=0;
        for(int i = 0; i < Banco.getBanco().bdLivroRomance.size(); i++) {
            if(r.getCodigo().equals(Banco.getBanco().getBdLivroRomance().get(i).getCodigo())) {
                r.impMenEmprestimo();
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
        DefaultTableModel tabModel = (DefaultTableModel) tabRomance.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(LivroRomance r : Banco.getBanco().getBdLivroRomance()){
            tabModel.insertRow(posLin, new Object[]{r.getTitulo(), r.getAutor(),r.getAnoPublicacao(), r.getCodigo(), r.getEnredo(), r.getLimitePalavra()});
            posLin++;
        }
    }
    
    public void limpar(){
	cxTitulo.setText("");
	cxAutor.setText("");
	cxAno.setText("");
        cxCodigo.setText("");
        cxEnredo.setText("");
        cxLimitePalavra.setText("");
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
    private javax.swing.JTextField cxEnredo;
    private javax.swing.JTextField cxLimitePalavra;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JLabel rotAno;
    private javax.swing.JLabel rotAutor;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotEnredo;
    private javax.swing.JLabel rotLimitePalavra;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JTable tabRomance;
    // End of variables declaration//GEN-END:variables
}
