import java.util.List;
import javax.swing.JOptionPane;


public class CadProd extends javax.swing.JFrame {
    
    private Produto prod;
    private static CadProd cadProdUnico;
    private final GerProd acessa = new GerProd();

    public CadProd() {
        initComponents();
    }
    
    // Inicio Singleton
    
    public static CadProd getCadProd(){
        if(cadProdUnico == null){
            cadProdUnico = new CadProd();
        }
        return cadProdUnico;
    }

    // Fim Singleton


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        ctDesc = new javax.swing.JTextField();
        lblCusto = new javax.swing.JLabel();
        ctCusto = new javax.swing.JTextField();
        lblCustoReal = new javax.swing.JLabel();
        ctCustoReal = new javax.swing.JTextField();
        ctPrecoVenda = new javax.swing.JTextField();
        lblPrecoAtacado = new javax.swing.JLabel();
        butGravar = new javax.swing.JToggleButton();
        butAlterar = new javax.swing.JToggleButton();
        butConsultar = new javax.swing.JToggleButton();
        butExcluir = new javax.swing.JToggleButton();
        butSair = new javax.swing.JToggleButton();
        butLimpar = new javax.swing.JToggleButton();
        butAbrirArq = new javax.swing.JToggleButton();
        butSalvarArquivo = new javax.swing.JToggleButton();
        lblMed = new javax.swing.JLabel();
        ctMedida = new javax.swing.JTextField();
        lblCodProd = new javax.swing.JLabel();
        ctCodProd = new javax.swing.JTextField();
        lblConsProd = new javax.swing.JLabel();
        ctConsProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitulo.setText("CADASTRO DE PRODUTO");

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDesc.setText("DESCRICAO");

        ctDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDescActionPerformed(evt);
            }
        });

        lblCusto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCusto.setText("CUSTO REAL ");

        lblCustoReal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustoReal.setText("CUSTO");

        lblPrecoAtacado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecoAtacado.setText("PRECO VENDA");

        butGravar.setText("GRAVAR");
        butGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGravarActionPerformed(evt);
            }
        });

        butAlterar.setText("ALTERAR");
        butAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAlterarActionPerformed(evt);
            }
        });

        butConsultar.setText("CONSULTAR");
        butConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butConsultarActionPerformed(evt);
            }
        });

        butExcluir.setText("EXCLUIR");
        butExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExcluirActionPerformed(evt);
            }
        });

        butSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butSair.setText("SAIR");
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        butLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butLimpar.setText("LIMPAR");
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        butAbrirArq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butAbrirArq.setText("ABRIR ARQUIVO");
        butAbrirArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrirArqActionPerformed(evt);
            }
        });

        butSalvarArquivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butSalvarArquivo.setText("SALVAR ARQUIVO");
        butSalvarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarArquivoActionPerformed(evt);
            }
        });

        lblMed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMed.setText("MEDIDA");

        lblCodProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodProd.setText("CÓDIGO");

        lblConsProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConsProd.setText("CÓDIGO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butSalvarArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(butAbrirArq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCustoReal)
                        .addGap(18, 18, 18)
                        .addComponent(ctCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCusto)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ctCustoReal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblConsProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ctConsProd))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(butGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(butConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDesc)
                                            .addComponent(lblMed))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ctDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ctMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(butSair)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPrecoAtacado)
                                    .addGap(29, 29, 29)
                                    .addComponent(ctPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCodProd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodProd)
                            .addComponent(ctCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(ctDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMed)
                    .addComponent(ctMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCusto)
                        .addComponent(ctCustoReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblCustoReal))
                    .addComponent(ctCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoAtacado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAbrirArq, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butSalvarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsProd)
                    .addComponent(ctConsProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDescActionPerformed

    private void butGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGravarActionPerformed
       insProd();
    }//GEN-LAST:event_butGravarActionPerformed

    private void butAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlterarActionPerformed
        altProd();
    }//GEN-LAST:event_butAlterarActionPerformed

    private void butConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultarActionPerformed
        consProd();
    }//GEN-LAST:event_butConsultarActionPerformed

    private void butExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirActionPerformed
        excProd();
    }//GEN-LAST:event_butExcluirActionPerformed

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
       sair();
    }//GEN-LAST:event_butSairActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        limpar();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butAbrirArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrirArqActionPerformed
        abrirArquivo();
    }//GEN-LAST:event_butAbrirArqActionPerformed

    private void butSalvarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarArquivoActionPerformed
        salvarProduto();
    }//GEN-LAST:event_butSalvarArquivoActionPerformed

    
     public void excProd(){
        prod = new Produto();
        prod.setCodProd(ctCodProd.getText());
        
        acessa.removeProd(prod);
        
        if(prod == null){
                JOptionPane.showMessageDialog(
                    null,
                    "PRODUTO EXCLUIDO COM SUCESSO",
                    "EXCLUSÃO POR CD PRODUTO",
                    3
            );
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "PRODUTO NÃO ENCONTRADO",
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
            );            
        }
        
    }
    
    //Fim ExcCliente
    
    
    public void insProd(){
        
        prod = new Produto();
        
        prod.setCodProd(ctCodProd.getText());
        prod.setDescProd(ctDesc.getText());
        prod.setCustoProd(Double.parseDouble(ctCusto.getText()));
        prod.setCustoRealProd(Double.parseDouble(ctCustoReal.getText()));
        prod.setPrecoProd(Double.parseDouble(ctPrecoVenda.getText()));
       
        
        acessa.cadProd(prod);
        
        if(prod != null){
            JOptionPane.showMessageDialog(
                    null,
                    "CADASTRADO COM SUCESSO",
                    "CONFIRMAÇÃO DE CADASTRO",
                    3
            );
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "PRODUTO JA CADASTRADO",
                    "ERRO DE CADASTRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    // Fim insPrpd //
    
    public void limpar(){
        
        ctCodProd.setText("");
        ctDesc.setText("");
        ctMedida.setText("");
        ctCusto.setText("");
        ctCustoReal.setText("");
        ctPrecoVenda.setText("");
        
        ctCodProd.requestFocus(); // retorna o foco para lblRazao
                
    }
    
    public void sair() {
        int respSair = JOptionPane.showConfirmDialog(
                null,
                "DESEJA REALMENTE SAIR ?",
                "SAIR  - CADASTRO",
                JOptionPane.YES_NO_OPTION
        );

        if (respSair == 0) {
            dispose();
        }
    }
    
    public void salvarProduto() {

        acessa.setArquivo("SALVAR");
        if (acessa.getArquivo() != null) {
            acessa.escrever();
        }
        JOptionPane.showMessageDialog(
                    null,
                    "ARQUIVO SALVO COM SUCESSO!",
                    "SALVAR ARQUIVO",
                    3
            );
        limpar();
    }
    
    
    // ========================== FIM SALVAR CLIENTE =======================//
    
    // ========================== ABRIR ARQUIVO ========================== //
    
    public void abrirArquivo() {

       
        acessa.setArquivo("ABRIR");
        if (acessa.getArquivo() != null) {
            acessa.ler();
            atribuirCampos(acessa.getBdProd());

        }
    }
    
     public void atribuirCampos(List<Produto> acessa) { 

        for (Produto prods : acessa) {
     
            ctCodProd.setText(prods.getCodProd());
            ctDesc.setText(prods.getDescProd());
            ctCusto.setText(Double.toString(prods.getCustoProd()));
            ctCustoReal.setText(Double.toString(prods.getCustoRealProd()));
            ctPrecoVenda.setText(Double.toString(prods.getPrecoProd()));
        }
    }
     
     public void consProd() {

        prod.setCodProd(ctConsProd.getText());

        prod = acessa.consProd(prod);

        if (prod != null) {

            JOptionPane.showMessageDialog(
                    null,
                    "DADOS DO CLIENTE:"
                    + "\nCÓDIGO DO PRODUTO: " + prod.getCodProd()
                    + "\nDESCRICAO:" + prod.getDescProd()
                    + "\nCUSTO:" + prod.getCustoProd()
                    + "\nCUSTO REAL:" + prod.getCustoRealProd()
                    + "\nPRECO:" + prod.getPrecoProd(),
                    "CONSULTA POR CÓDIGO DO PRODUTO",
                    3
            );

        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "PRODUTO NÃO ENCONTRADO!",
                    "ERRO DE CONSULTA",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }
     
    public void altProd() {
        
         prod.setCodProd(ctConsProd.getText());

        prod = acessa.atualizaProd(prod);

        if (prod != null) {
            
         carregaCampos(prod);
           
        prod.setCodProd(ctCodProd.getText());
        prod.setDescProd(ctDesc.getText());
        prod.setCustoProd(Double.parseDouble(ctCusto.getText()));
        prod.setCustoRealProd(Double.parseDouble(ctCustoReal.getText()));
        prod.setPrecoProd(Double.parseDouble(ctPrecoVenda.getText()));
       
        
        acessa.cadProd(prod);

            JOptionPane.showMessageDialog(
                    null,
                    "DADOS ALTERADOS COM SUCESSO!",
                    "ALTERAÇÃO POR CPF",
                    3
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "NÃO EXISTE ESSE CPF!",
                    "ERRO DE ATUALIZAÇÃO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void carregaCampos(Produto prods) { 

        
     
            ctCodProd.setText(prods.getCodProd());
            ctDesc.setText(prods.getDescProd());
            ctCusto.setText(Double.toString(prods.getCustoProd()));
            ctCustoReal.setText(Double.toString(prods.getCustoRealProd()));
            ctPrecoVenda.setText(Double.toString(prods.getPrecoProd()));
        
    }


     
    
     
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton butAbrirArq;
    private javax.swing.JToggleButton butAlterar;
    private javax.swing.JToggleButton butConsultar;
    private javax.swing.JToggleButton butExcluir;
    private javax.swing.JToggleButton butGravar;
    private javax.swing.JToggleButton butLimpar;
    private javax.swing.JToggleButton butSair;
    private javax.swing.JToggleButton butSalvarArquivo;
    private javax.swing.JTextField ctCodProd;
    private javax.swing.JTextField ctConsProd;
    private javax.swing.JTextField ctCusto;
    private javax.swing.JTextField ctCustoReal;
    private javax.swing.JTextField ctDesc;
    private javax.swing.JTextField ctMedida;
    private javax.swing.JTextField ctPrecoVenda;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblConsProd;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblCustoReal;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblPrecoAtacado;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
