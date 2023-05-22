//Luiz Henrique Galhardo Farias
// RA: 2211190


import java.util.List;
import javax.swing.JOptionPane;

public class CadCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private static CadCliente cadClienteUnico;
    private final GerCliente acessa = new GerCliente();
    

    public CadCliente() {
        initComponents();
    }
    
    // Inicio Singleton//
    public static CadCliente getCadCliente(){
        if(cadClienteUnico == null){
            cadClienteUnico = new CadCliente();
        }
        return cadClienteUnico;
    }
    // Fim Singleton//
    

    // ==================== INICIO BOTOES =======================//
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
        butLimpar = new javax.swing.JButton();
        butSair = new javax.swing.JButton();
        ctConsCpfCnpj = new javax.swing.JTextField();
        lblCpfCnpjCons = new javax.swing.JLabel();
        butConsultar = new javax.swing.JButton();
        butExcluir = new javax.swing.JButton();
        butAlterar = new javax.swing.JButton();
        butGrav1 = new javax.swing.JButton();
        butAbrir = new javax.swing.JButton();
        butAbrir1 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRazao.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblRazao.setText("RAZAO");

        lblTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTitulo.setText("CADASTRO CLIENTE");

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

        ctEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEstadoActionPerformed(evt);
            }
        });

        lblCompl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCompl.setText("COMPLEMENTO");

        lblCep.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCep.setText("CEP");

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
        butConsultar.setToolTipText("");
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

        butGrav1.setText("GRAVAR");
        butGrav1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGrav1ActionPerformed(evt);
            }
        });

        butAbrir.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        butAbrir.setText("ABRIR ARQUIVO");
        butAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrirActionPerformed(evt);
            }
        });

        butAbrir1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        butAbrir1.setText("SALVAR ARQUIVO");
        butAbrir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrir1ActionPerformed(evt);
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
                        .addComponent(lblRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctRazao))
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
                        .addComponent(lblCpfCnpjCons, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctConsCpfCnpj))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ctBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCompl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctCompl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(ctCep, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ctEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butGrav1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(ctRgInsEst)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butAbrir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSair))
                .addGap(43, 43, 43)
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
                    .addComponent(ctCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butLimpar)
                    .addComponent(butAbrir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butAbrir1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCnpjCons)
                    .addComponent(ctConsCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butGrav1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        limpar();
    }//GEN-LAST:event_butLimparActionPerformed

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
        sair();
    }//GEN-LAST:event_butSairActionPerformed

    private void butConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butConsultarActionPerformed
        consCliente();
    }//GEN-LAST:event_butConsultarActionPerformed

    private void butExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExcluirActionPerformed
        excCliente();


    }//GEN-LAST:event_butExcluirActionPerformed

    private void butAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAlterarActionPerformed
        altCliente();

    }//GEN-LAST:event_butAlterarActionPerformed

    private void butGrav1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGrav1ActionPerformed
        insPes();
    }//GEN-LAST:event_butGrav1ActionPerformed

    private void butAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrirActionPerformed
        abrirArquivo();
    }//GEN-LAST:event_butAbrirActionPerformed

    private void ctEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEstadoActionPerformed

    private void butAbrir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrir1ActionPerformed
       salvarCliente();
    }//GEN-LAST:event_butAbrir1ActionPerformed

    // ================== FIM BOTOES ==================//
    // =========== LIMPAR ==============//
    public void limpar() {
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

    } // ================ FIM LIMPAR ===================//

    // =============== SAIR ================//
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

    // ============= FIM SAIR ==============//
    
    
    // =========== CONSULTA CLIENTE =================//
    
    public void consCliente() {

        
        cliente.setCpfCnpjCliente(Integer.parseInt(ctConsCpfCnpj.getText()));

        cliente = acessa.consPesCodCliente(cliente);

        if (cliente != null) {
            
            ctRazao.setText(cliente.getNome());
                JOptionPane.showMessageDialog(
                    null,
                    "DADOS DO CLIENTE:"
                           
                     +"\nRAZAO: "+cliente.getNome()
                     +"\nFANTASIA:"+cliente.getRazaoCliente()
                     +"\nCPF:"+cliente.getCpfCnpjCliente()
                     +"\nRG/INSC.EST:"+cliente.getRgInsEstCliente()
                     +"\nCELULAR:"+cliente.getTelCel()
                     +"\nTELEFONE FIXO:"+cliente.getTelFixo()
                     +"\nE-MAIL:"+cliente.getEmail()
                     +"\nRUA:"+cliente.getRua()
                     +"\nBAIRRO:"+cliente.getBairro()
                     +"\nCIDADE:"+cliente.getCidade()
                     +"\nESTADO:"+cliente.getEstado()
                     +"\nCOMPLEMENTO:"+cliente.getCompl()
                     +"\nCEP:"+cliente.getCep(),
             
                    "CONSULTA POR CPF/CNPJ",
                    3
            );
         
            
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "CPF NÃO EXISTE!",
                    "ERRO DE CONSULTA POR CPF",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

    // ==================== Fim ConsCliente ======================//
    // =================== EXCLUI CLIENTE =====================//
    
    public void excCliente() {
        
        cliente = new Cliente();
        
        cliente.setCpfCnpjCliente(Integer.parseInt(ctConsCpfCnpj.getText()));

        cliente = acessa.removePesCodCliente(cliente);

        if (cliente == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "CPF excluído com sucesso",
                    "Exclusão por CPF",
                    3
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe este CPF!",
                    "ERRO de Exclusão de CPF",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

    // ==================== Fim ExcCliente ========================//
    
    // ================ ALTERAR CLIENTE =========================//
    public void altCliente() {
        
        cliente.setCpfCnpjCliente(Integer.parseInt(ctConsCpfCnpj.getText()));

        cliente = acessa.atualizaPesCodCliente(cliente);

        if (cliente != null) {
           
            carregaCampos(cliente);
           
            cliente.setNome(ctRazao.getText());
            cliente.setRazaoCliente(ctFantasia.getText());
            cliente.setCpfCnpjCliente(Integer.parseInt(ctCpfCnpj.getText()));
            cliente.setRgInsEstCliente(Integer.parseInt(ctRgInsEst.getText()));
            cliente.setTelCel(ctCel.getText());
            cliente.setTelFixo(ctTel.getText());
            cliente.setEmail(ctEmail.getText());
            cliente.setRua(ctEnder.getText());
            cliente.setBairro(ctBairro.getText());
            cliente.setCidade(ctCidade.getText());
            cliente.setEstado(ctEstado.getText());
            cliente.setCompl(ctCompl.getText());
            cliente.setCep(ctCep.getText());

            excCliente();
            cliente = acessa.cadCliente(cliente);

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

    // ================= Fim AltCliente =====================//
    // ================= INSERIR CLIENTE ====================//
    public void insPes() {

       
        cliente = new Cliente();
        

        cliente.setNome(ctRazao.getText());
        cliente.setRazaoCliente(ctFantasia.getText());
        cliente.setCpfCnpjCliente(Integer.parseInt(ctCpfCnpj.getText()));
        cliente.setRgInsEstCliente(Integer.parseInt(ctRgInsEst.getText()));
        cliente.setTelCel(ctCel.getText());
        cliente.setTelFixo(ctTel.getText());
        cliente.setEmail(ctEmail.getText());
        cliente.setRua(ctEnder.getText());
        cliente.setBairro(ctBairro.getText());
        cliente.setCidade(ctCidade.getText());
        cliente.setEstado(ctEstado.getText());
        cliente.setCompl(ctCompl.getText());
        cliente.setCep(ctCep.getText());

        
        cliente = acessa.cadCliente(cliente);
        
        if (cliente != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "CADASTRADO COM SUCESSO!",
                    "CONFIRMAÇÃO DE CADASTRO",
                    3
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "CPF JÁ CADASTRADO!",
                    "ERRO DE CADASTRO",
                    JOptionPane.ERROR_MESSAGE
            );
            
        }
    
    }

    // ========================= Fim insPes ========================  //
    
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
            atribuirCampos(acessa.getBdCliente());

        }
    }
    // ======================= FIM ABRIR ARQUIVO ============================// 
        
    // ====================== ATRIBUIR CAMPOS ==============================//
        
     public void atribuirCampos(List<Cliente> acessa) { // carrega os dados com a lista zerada

        for (Cliente clientes : acessa) {

            ctRazao.setText(clientes.getNome());
            ctFantasia.setText(clientes.getRazaoCliente());
            ctCpfCnpj.setText(Integer.toString((clientes.getCpfCnpjCliente())));
            ctRgInsEst.setText(Integer.toString((clientes.getRgInsEstCliente())));
            ctCel.setText(clientes.getTelCel());
            ctTel.setText(clientes.getTelFixo());
            ctEmail.setText(clientes.getEmail());
            ctEnder.setText(clientes.getRua());
            ctBairro.setText(clientes.getBairro());
            ctCidade.setText(clientes.getCidade());
            ctEstado.setText(clientes.getEstado());
            ctCompl.setText(clientes.getCompl());
            ctCep.setText(clientes.getCep());
        }
    }

    public void carregaCampos(Cliente clientes) {

        ctRazao.setText(clientes.getNome());
        ctFantasia.setText(clientes.getRazaoCliente());
        ctCpfCnpj.setText(Integer.toString((clientes.getCpfCnpjCliente())));
        ctRgInsEst.setText(Integer.toString((clientes.getRgInsEstCliente())));
        ctCel.setText(clientes.getTelCel());
        ctTel.setText(clientes.getTelFixo());
        ctEmail.setText(clientes.getEmail());
        ctEnder.setText(clientes.getRua());
        ctBairro.setText(clientes.getBairro());
        ctCidade.setText(clientes.getCidade());
        ctEstado.setText(clientes.getEstado());
        ctCompl.setText(clientes.getCompl());
        ctCep.setText(clientes.getCep());

    }

    
        
        
    // ===================== FIM ATRIBUIR CAMPOS =========================//
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAbrir;
    private javax.swing.JButton butAbrir1;
    private javax.swing.JButton butAlterar;
    private javax.swing.JButton butConsultar;
    private javax.swing.JButton butExcluir;
    private javax.swing.JButton butGrav1;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butSair;
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

    private static class comboCliente {

        private static void removeAllItems() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addItem(String escolha_uma_Pessoa) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static int getSelectedIndex() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static Object getSelectedItem() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public comboCliente() {
        }
    }

    static class comboForn {

        static void addItem(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static Object getSelectedItem() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public comboForn() {
        }
    }

    static class comboTerc {

        static void addItem(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static int getSelectedIndex() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static Object getSelectedItem() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public comboTerc() {
        }
    }

} // Fim Classe

