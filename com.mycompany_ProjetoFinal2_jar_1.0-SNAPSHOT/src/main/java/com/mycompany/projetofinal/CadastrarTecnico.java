//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarTecnico extends javax.swing.JFrame  {
    private static CadastrarTecnico telaCadastro;
    private LivroTecnico t = new LivroTecnico();
    
    public CadastrarTecnico() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public static CadastrarTecnico getCadastrarTecnico(){
        if(telaCadastro ==null){
            telaCadastro = new CadastrarTecnico();
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
        rotAreaConhecimento = new javax.swing.JLabel();
        cxAreaConhecimento = new javax.swing.JTextField();
        rotExercicios = new javax.swing.JLabel();
        cxExercicios = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        Tecnico = new javax.swing.JScrollPane();
        tabTecnico = new javax.swing.JTable();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Titulo.setText("LIVRO TÉCNICO");

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

        rotAreaConhecimento.setText("Área de Conhecimento");

        rotExercicios.setText("Possui Exercícios ?");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tabTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Ano de Publicação", "Código", "Area do Conhecimento", "Possui Exercicíos?"
            }
        ));
        Tecnico.setViewportView(tabTecnico);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addComponent(rotAreaConhecimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxAreaConhecimento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotExercicios)
                                .addGap(18, 18, 18)
                                .addComponent(cxExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rotTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxTitulo)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btExcluir))
                        .addComponent(Tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAreaConhecimento)
                    .addComponent(cxAreaConhecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotExercicios)
                    .addComponent(cxExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        inserirTecnico();
        listarTab();       
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consTecnico();
        limpar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
       altTecnico();
       listarTab();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excTecnico();
        limpar();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestimoActionPerformed
        EmprestimoTecnico();
        limpar();
    }//GEN-LAST:event_btEmprestimoActionPerformed

  
    public void inserirTecnico() {
        t = new LivroTecnico();
        t.setTitulo(cxTitulo.getText());
        t.setAutor(cxAutor.getText());
        try{
            t.setAnoPublicacao(Integer.parseInt(cxAno.getText()));
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
            t.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            t = c.reparaTecnico(t);
        }
        t.setAreaConhecimento(cxAreaConhecimento.getText());
	t.setExercicios(cxExercicios.getText());

        t = Banco.getBanco().cadastrarLivroTecnico(t);

        if (t != null) {
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
        
   public void consTecnico(){
        DefaultTableModel tabModel = (DefaultTableModel) tabTecnico.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        int a=0;
        
        if(cxCodigo.getText().equals("")){
            listarTab();
        }else{
            for(LivroTecnico t : Banco.getBanco().getBdLivroTecnico()){
                if(t.getCodigo().equals(cxCodigo.getText())){
                    tabModel.insertRow(posLin, new Object[]{t.getTitulo(), t.getAutor(),t.getAnoPublicacao(), t.getCodigo(), t.getAreaConhecimento(), t.getExercicios()});
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
   
   public void altTecnico(){
        t = new LivroTecnico();
        try {
            t.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            t = c.reparaTecnico(t);
        }
        t = Banco.getBanco().alterarLivroTecnico(t);
        if(t!=null){
            cxCodigo.setText(t.getCodigo());
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
    
    public void excTecnico(){       
        LivroTecnico t = new LivroTecnico();
        try {
            t.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            t = c.reparaTecnico(t);
        }
        int a =0;
        for(int i = 0; i < Banco.getBanco().bdLivroTecnico.size(); i++) {
            if(t.getCodigo().equals(Banco.getBanco().getBdLivroTecnico().get(i).getCodigo())) {
                Banco.deletarLivroTecnico(Banco.getBanco().getBdLivroTecnico().get(i));
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
    public void EmprestimoTecnico(){
        LivroTecnico t = new LivroTecnico();
        try {
            t.setCodigo(cxCodigo.getText());
        } catch (CodigoException c) {
            t = c.reparaTecnico(t);
        }
        int a=0;
        for(int i = 0; i < Banco.getBanco().bdLivroTecnico.size(); i++) {
            if(t.getCodigo().equals(Banco.getBanco().getBdLivroTecnico().get(i).getCodigo())) {
                t.impMenEmprestimo();
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
        DefaultTableModel tabModel = (DefaultTableModel) tabTecnico.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(LivroTecnico t : Banco.getBanco().getBdLivroTecnico()){
            tabModel.insertRow(posLin, new Object[]{t.getTitulo(), t.getAutor(),t.getAnoPublicacao(), t.getCodigo(), t.getAreaConhecimento(), t.getExercicios()});
            posLin++;
        }
    }
    
    public void limpar(){
	cxTitulo.setText("");
	cxAutor.setText("");
	cxAno.setText("");
        cxCodigo.setText("");
        cxAreaConhecimento.setText("");
        cxExercicios.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tecnico;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEmprestimo;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxAreaConhecimento;
    private javax.swing.JTextField cxAutor;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxExercicios;
    private javax.swing.JTextField cxTitulo;
    private javax.swing.JLabel rotAno;
    private javax.swing.JLabel rotAreaConhecimento;
    private javax.swing.JLabel rotAutor;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotExercicios;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JTable tabTecnico;
    // End of variables declaration//GEN-END:variables
}
