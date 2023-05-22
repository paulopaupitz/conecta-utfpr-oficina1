//Luiz Henrique Galhardo Farias
// RA: 2211190


import java.util.List;
import javax.swing.JOptionPane;


public class CadForn extends javax.swing.JFrame {

    
    private Fornecedor forn = new Fornecedor();
    private static CadForn cadFornUnico;
    private final GerForn acessa = new GerForn();
            
    public CadForn () {
        initComponents();
    }
    
    // Inicio Singleton//
    public static CadForn getCadForn(){
        if(cadFornUnico == null){
            cadFornUnico = new CadForn();
        }
        return cadFornUnico;
    }
    // Fim Singleton//
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        lblRazao = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        ctRazao = new javax.swing.JTextField();
        lblCpfCnpj = new javax.swing.JLabel();
        ctCpfCnpj = new javax.swing.JTextField();
        lblFantasia = new javax.swing.JLabel();
        ctFantasia = new javax.swing.JTextField();
        lblRgInsEst = new javax.swing.JLabel();
        ctRgInsEst = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        ctTel = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        ctCel = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        lblEnder = new javax.swing.JLabel();
        ctEnder = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        ctBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        ctCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        ctEstado = new javax.swing.JTextField();
        lblCompl = new javax.swing.JLabel();
        ctCompl = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        ctCep = new javax.swing.JTextField();
        butGrav = new javax.swing.JButton();
        butLimpar = new javax.swing.JButton();
        butSair = new javax.swing.JButton();
        lblCpfCnpjCons = new javax.swing.JLabel();
        butConsultar = new javax.swing.JButton();
        butExcluir = new javax.swing.JButton();
        butAlterar = new javax.swing.JButton();
        ctConsCpfCnpj = new javax.swing.JTextField();
        butSalvarArq = new javax.swing.JButton();
        butAbrirArq = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRazao.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRazao.setText("RAZAO");

        lblTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitulo.setText("CADASTRO FORNECEDOR");

        ctRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctRazaoActionPerformed(evt);
            }
        });

        lblCpfCnpj.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCpfCnpj.setText("CPF/CNPJ ");

        lblFantasia.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblFantasia.setText("FANTASIA");

        ctFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctFantasiaActionPerformed(evt);
            }
        });

        lblRgInsEst.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        lblRgInsEst.setText("RG/INSC. ESTADUAL");

        lblTel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTel.setText("TELEFONE");

        lblCel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCel.setText("CELULAR");

        lblEmail.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEmail.setText("E-MAIL");

        lblEnder.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEnder.setText("ENDEREÇO");

        lblBairro.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblBairro.setText("BAIRRO");

        lblCidade.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCidade.setText("CIDADE");

        lblEstado.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEstado.setText("EST.");

        lblCompl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCompl.setText("COMPLEMENTO");

        lblCep.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCep.setText("CEP");

        butGrav.setText("GRAVAR");
        butGrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGravActionPerformed(evt);
            }
        });

        butLimpar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        butLimpar.setText("LIMPAR");
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        butSair.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        butSair.setText("SAIR");
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        lblCpfCnpjCons.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCpfCnpjCons.setText("CPF/CNPJ");

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

        butAlterar.setText("ALTERAR");
        butAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAlterarActionPerformed(evt);
            }
        });

        butSalvarArq.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        butSalvarArq.setText("SALVAR ARQUIVO");
        butSalvarArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarArqActionPerformed(evt);
            }
        });

        butAbrirArq.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        butAbrirArq.setText("ABRIR ARQUIVO");
        butAbrirArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrirArqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butSalvarArq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butAbrirArq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTitulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butSair))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctRazao))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ctFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ctCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblRgInsEst)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ctRgInsEst))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ctBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ctEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEnder, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctEnder))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEmail))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ctTel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCel)
                                            .addGap(18, 18, 18)
                                            .addComponent(ctCel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ctEmail)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCompl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctCompl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctCep))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(butGrav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(14, 14, 14)
                                    .addComponent(butConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCpfCnpjCons, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctConsCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSair))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFantasia)
                    .addComponent(ctFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCnpj)
                    .addComponent(ctCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRgInsEst)
                    .addComponent(ctRgInsEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(ctTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCel)
                    .addComponent(ctCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder)
                    .addComponent(ctEnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(ctBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(ctEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompl)
                    .addComponent(ctCompl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep)
                    .addComponent(ctCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butLimpar)
                    .addComponent(butAbrirArq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butSalvarArq)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCnpjCons)
                    .addComponent(ctConsCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butGrav, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctRazaoActionPerformed

    private void ctFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctFantasiaActionPerformed

    private void butGravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGravActionPerformed
        insPes();
       
    }//GEN-LAST:event_butGravActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        limpar();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
        sair();
    }//GEN-LAST:event_butSairActionPerformed

    private void butConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultarActionPerformed
        consForn();
        
    }//GEN-LAST:event_butConsultarActionPerformed

    private void butExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirActionPerformed
        excForn();
        

    }//GEN-LAST:event_butExcluirActionPerformed

    private void butAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlterarActionPerformed
        altForn();
        
    }//GEN-LAST:event_butAlterarActionPerformed

    private void butSalvarArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarArqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butSalvarArqActionPerformed

    private void butAbrirArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrirArqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butAbrirArqActionPerformed
 
     
    public void consForn(){
        forn = new Fornecedor();
        forn.setCnpjForn(Integer.parseInt(ctConsCpfCnpj.getText()));
        
        acessa.consPesCodForn(forn);
        
        if(forn != null){
            ctRazao.setText(forn.getNome());
                JOptionPane.showMessageDialog(
                    null,
                                                
                    "DADOS DO FORNECEDOR:"
                            
                     
                     +"\nRAZAO: "+forn.getNome()
                     +"\nFANTASIA:"+forn.getRazaoForn()
                     +"\nCPF:"+forn.getCnpjForn()
                     +"\nRG/INSC.EST:"+forn.getInsEstForn()
                     +"\nCELULAR:"+forn.getTelCel()
                     +"\nTELEFONE FIXO:"+forn.getTelFixo()
                     +"\nE-MAIL:"+forn.getEmail()
                     +"\nRUA:"+forn.getRua()
                     +"\nBAIRRO:"+forn.getBairro()
                     +"\nCIDADE:"+forn.getCidade()
                     +"\nESTADO:"+forn.getEstado()
                     +"\nCOMPLEMENTO:"+forn.getCompl()
                     +"\nCEP:"+forn.getCep(),
             
                    "CONSULTA POR CNPJ",
                     3
            );
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe este CPF!",
                    "ERRO de Consulta de CPF",
                    JOptionPane.ERROR_MESSAGE
            );            
        }
        
    }
    
    // Fim ConsForn//
    
     public void excForn(){
        forn = new Fornecedor();
        forn.setCnpjForn(Integer.parseInt(ctConsCpfCnpj.getText()));
        
        acessa.removePesCodForn(forn);
        
        if(forn == null){
                JOptionPane.showMessageDialog(
                    null,
                    "CPF excluído com sucesso",
                    "Exclusão por CPF",
                    3
            );
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe este CPF!",
                    "ERRO de Exclusão de CPF",
                    JOptionPane.ERROR_MESSAGE
            );            
        }
        
    }
    
    //Fim ExcCliente
     
     public void altForn(){
        forn = new Fornecedor();
        forn.setCnpjForn(Integer.parseInt(ctConsCpfCnpj.getText()));
        
       acessa.atualizaPesCodForn(forn);
        
        if(forn != null){
            ctRazao.setText(forn.getNome());
                JOptionPane.showMessageDialog(
                    null,
                    "Confira os dados!\n CPF:"+forn.getCnpjForn()+"\nNOME: "+forn.getNome(),
                    "Alteração por CPF",
                    3
            );
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe este CPF!",
                    "ERRO de Atualização de CPF",
                    JOptionPane.ERROR_MESSAGE
            );            
        }
        
    }
    
    //Fim AltCliente
     
    public void insPes(){
        
        int cont = 0;
        
        forn = new Fornecedor();
        forn.setNome(ctRazao.getText());
        forn.setRazaoForn(ctFantasia.getText());
        forn.setCnpjForn(Integer.parseInt(ctCpfCnpj.getText()));
        forn.setInsEstForn(Integer.parseInt(ctRgInsEst.getText()));
        forn.setTelCel(ctCel.getText());
        forn.setTelFixo(ctTel.getText());
        forn.setEmail(ctEmail.getText());
        forn.setRua(ctEnder.getText());
        forn.setBairro(ctBairro.getText());
        forn.setCidade(ctCidade.getText());
        forn.setEstado(ctEstado.getText());
        forn.setCompl(ctCompl.getText());
        forn.setCep(ctCep.getText());
        
       acessa.cadForn(forn); 
        
        if(forn != null){
            JOptionPane.showMessageDialog(
                    null,
                    "CADASTRADO COM SUCESSO!",
                    "CONFIRMAÇÃO DE CADASTRO!",
                    3
            );
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "CPF JÁ CADASTRADO",
                    "ERRO DE CADASTRO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    //Fim InsPes//
    
    
    public void limpar(){
        
        ctCpfCnpj.setText("");
        ctRazao.setText("");
        ctFantasia.setText("");
        ctEnder.setText("");
        ctBairro.setText("");
        ctCel.setText("");
        ctTel.setText("");
        ctCep.setText("");
        ctCidade.setText("");
        ctCompl.setText("");
        ctEmail.setText("");
        ctEstado.setText("");
        ctFantasia.setText("");
        ctRgInsEst.setText("");
        ctCel.setText("");
        
        ctRazao.requestFocus(); // retorna o foco para lblRazao
                
    }
    public void sair(){
        int respSair = JOptionPane.showConfirmDialog(
                    null,
                    "DESEJA REALMENTE SAIR?",
                    "SAIR DO CADASTRO",
                    JOptionPane.YES_NO_OPTION
            );
        
        if(respSair == 0){
            dispose();
        }
    }
    
    //========================= FIM SAIR ==============================//
    
    // ======================== SALVAR CLIENTE ==================== //
    
    public void salvarCliente() {

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
            atribuirCampos(acessa.getBdForn());

        }
    }
    // ======================= FIM ABRIR ARQUIVO ============================// 
        
    // ====================== ATRIBUIR CAMPOS ==============================//
        
     public void atribuirCampos(List<Fornecedor> acessa) {

        for (Fornecedor fornes : acessa) {

            ctRazao.setText(fornes.getNome());
            ctFantasia.setText(fornes.getRazaoForn());
            ctCpfCnpj.setText(Integer.toString((fornes.getCnpjForn())));
            ctRgInsEst.setText(Integer.toString((fornes.getInsEstForn())));
            ctCel.setText(fornes.getTelCel());
            ctTel.setText(fornes.getTelFixo());
            ctEmail.setText(fornes.getEmail());
            ctEnder.setText(fornes.getRua());
            ctBairro.setText(fornes.getBairro());
            ctCidade.setText(fornes.getCidade());
            ctEstado.setText(fornes.getEstado());
            ctCompl.setText(fornes.getCompl());
            ctCep.setText(fornes.getCep());
        }
    }
     
     // ===================================== FIM ATRIBUIR CAMPOS ============================================//

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAbrirArq;
    private javax.swing.JButton butAlterar;
    private javax.swing.JButton butConsultar;
    private javax.swing.JButton butExcluir;
    private javax.swing.JButton butGrav;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butSair;
    private javax.swing.JButton butSalvarArq;
    private javax.swing.JTextField ctBairro;
    private javax.swing.JTextField ctCel;
    private javax.swing.JTextField ctCep;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctCompl;
    private javax.swing.JTextField ctConsCpfCnpj;
    private javax.swing.JTextField ctCpfCnpj;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctEnder;
    private javax.swing.JTextField ctEstado;
    private javax.swing.JTextField ctFantasia;
    private javax.swing.JTextField ctRazao;
    private javax.swing.JTextField ctRgInsEst;
    private javax.swing.JTextField ctTel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCompl;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblCpfCnpjCons;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnder;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFantasia;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblRgInsEst;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    private static class comboForn {

        private static void removeAllItems() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addItem(String escolha_uma_Pessoa) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static int getSelectedIndex() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public comboForn() {
        }
    }
} // Fim Classe

