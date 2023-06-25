//Nome:Maria Gabriella Victor Gomes da Silva   RA: 2143364
package com.mycompany.projetofinal;

import javax.swing.table.DefaultTableModel;

public class Disponiveis extends javax.swing.JFrame {
    private static Disponiveis disponiveis;
    public Disponiveis() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static Disponiveis getDisponiveis(){
        if(disponiveis == null){
            disponiveis = new Disponiveis();
        }
        return disponiveis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotDisponiveis = new javax.swing.JLabel();
        Tecnico = new javax.swing.JScrollPane();
        tabTecnico = new javax.swing.JTable();
        rotTecnico = new javax.swing.JLabel();
        Romance = new javax.swing.JScrollPane();
        tabRomance = new javax.swing.JTable();
        rotRomance = new javax.swing.JLabel();
        Poema = new javax.swing.JScrollPane();
        tabPoema = new javax.swing.JTable();
        rotPoema = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotDisponiveis.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rotDisponiveis.setText("LIVROS DISPONíVEIS");

        tabTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Ano de Publicação", "Código", "Area do Conhecimento", "Possui Exercicíos?"
            }
        ));
        Tecnico.setViewportView(tabTecnico);

        rotTecnico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotTecnico.setText("LIVROS TÉCNICOS:");

        tabRomance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Ano de Publicação", "Código", "Enredo", "Limite de Palavra"
            }
        ));
        Romance.setViewportView(tabRomance);

        rotRomance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotRomance.setText("LIVROS DE ROMANCE:");

        tabPoema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Ano de Publicação", "Código", "Métrica", "Possui Rimas?"
            }
        ));
        Poema.setViewportView(tabPoema);

        rotPoema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotPoema.setText("LIVROS DE POEMA:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rotPoema)
                        .addComponent(Poema, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotRomance)
                        .addComponent(Romance, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotTecnico)
                        .addComponent(Tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(rotDisponiveis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(rotDisponiveis)
                .addGap(34, 34, 34)
                .addComponent(rotTecnico)
                .addGap(18, 18, 18)
                .addComponent(Tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(rotRomance)
                .addGap(18, 18, 18)
                .addComponent(Romance, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(rotPoema)
                .addGap(18, 18, 18)
                .addComponent(Poema, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTabTecnico();
        listarTabRomance();
        listarTabPoema();
    }//GEN-LAST:event_formWindowActivated

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    public void listarTabTecnico(){
        DefaultTableModel tabModel = (DefaultTableModel) tabTecnico.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(LivroTecnico t : Banco.getBanco().getBdLivroTecnico()){
            tabModel.insertRow(posLin, new Object[]{t.getTitulo(), t.getAutor(),t.getAnoPublicacao(), t.getCodigo(), t.getAreaConhecimento(), t.getExercicios()});
            posLin++;
        }
    }
    
    public void listarTabRomance(){
        DefaultTableModel tabModel = (DefaultTableModel) tabRomance.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(LivroRomance r : Banco.getBanco().getBdLivroRomance()){
            tabModel.insertRow(posLin, new Object[]{r.getTitulo(), r.getAutor(),r.getAnoPublicacao(), r.getCodigo(), r.getEnredo(), r.getLimitePalavra()});
            posLin++;
        }
    }    
    
    public void listarTabPoema(){
        DefaultTableModel tabModel = (DefaultTableModel) tabPoema.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(LivroPoema p : Banco.getBanco().getBdLivroPoema()){
            tabModel.insertRow(posLin, new Object[]{p.getTitulo(), p.getAutor(),p.getAnoPublicacao(), p.getCodigo(), p.getMetrica(), p.getRima()});
            posLin++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Poema;
    private javax.swing.JScrollPane Romance;
    private javax.swing.JScrollPane Tecnico;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel rotDisponiveis;
    private javax.swing.JLabel rotPoema;
    private javax.swing.JLabel rotRomance;
    private javax.swing.JLabel rotTecnico;
    private javax.swing.JTable tabPoema;
    private javax.swing.JTable tabRomance;
    private javax.swing.JTable tabTecnico;
    // End of variables declaration//GEN-END:variables
}
