package views;

import models.Item;
import models.SessionManager;
import controllers.ItemController;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class EdicaoItem extends javax.swing.JFrame {

    private static EdicaoItem gerItemUnico;

    public static EdicaoItem getEdicaoItem() {
        if (gerItemUnico == null) {
            gerItemUnico = new EdicaoItem();
        }
        return gerItemUnico;
    }

    public EdicaoItem() {
        initComponents();
        setTitle("Conecta UTFPR - Edição de Item");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblObj = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        scrollDesc = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btSair = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtSituacao = new javax.swing.JLabel();
        situacaoSelect = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        jLabel1.setText("Objeto:");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblObj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblObj.setText("Nome");

        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeMouseEntered(evt);
            }
        });
        txtNome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }

            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNomeInputMethodTextChanged(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("Data de Encontro");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lblLocal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLocal.setText("Local Encontrado");

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDesc.setText("Descrição");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        scrollDesc.setViewportView(txtDescricao);

        btSair.setText("Cancelar");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitulo.setText("Edição");

        txtSituacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSituacao.setText("Situação");

        situacaoSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encontrado", "Devolvido" }));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setText("Id");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome)
                                        .addComponent(txtLocal)
                                        .addComponent(txtData)
                                        .addComponent(scrollDesc)
                                        .addComponent(jSeparator1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTitulo)
                                                        .addComponent(lblLocal)
                                                        .addComponent(lblObj, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblDesc)
                                                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtSituacao)
                                                        .addComponent(situacaoSelect,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 255,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 266,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTitulo)
                                        .addComponent(btSair))
                                .addGap(20, 20, 20)
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblObj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(situacaoSelect, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29,
                                        Short.MAX_VALUE)
                                .addComponent(botaoSalvar)
                                .addGap(21, 21, 21)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        String id = txtId.getText();

        try {
            Item item = ItemController.buscarItemPorId(id);

            txtNome.setText(item.getNome());
            txtLocal.setText(item.getLocal());
            txtData.setText(item.getDataEncontro());
            situacaoSelect.setSelectedItem(item.getSituacao());
            txtDescricao.setText(item.getDescricao());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de edição", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtIdActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = txtNome.getText();
        String local = txtLocal.getText();
        String data = txtData.getText();
        String situacao = (String) situacaoSelect.getSelectedItem();
        String descricao = txtDescricao.getText();
        if (nome.length() == 0 || local.length() == 0 || data.length() == 0 || situacao.length() == 0
                || descricao.length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro de edição",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Item item = buildItem();

        try {
            Boolean itemEdited = ItemController.handleEdicao(item);
            if (itemEdited) {
                txtId.setText("");
                clearTextFields();
                dispose();
                JOptionPane.showMessageDialog(new JFrame(), "Item editado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de edição", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_botaoSalvarActionPerformed

    private void txtNomeMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtNomeMouseEntered
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeMouseEntered

    private void txtNomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_txtNomeInputMethodTextChanged
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeInputMethodTextChanged

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtLocalActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSairActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Você tem certeza que deseja sair?",
                "Cancelar operação",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }// GEN-LAST:event_btSairActionPerformed

    public Item buildItem() {
        Item item = new Item();
        item.setId(Integer.valueOf(txtId.getText()));
        item.setNome(txtNome.getText());
        item.setLocal(txtLocal.getText());
        item.setDataEncontro(txtData.getText());
        item.setDescricao(txtDescricao.getText());
        item.setSituacao((String) situacaoSelect.getSelectedItem());
        item.setAlteradoPor(SessionManager.getUsuarioLogado());

        return item;
    }

    public void clearTextFields() {
        txtNome.setText("");
        txtLocal.setText("");
        txtData.setText("");
        txtDescricao.setText("");
    }

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDataActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblObj;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scrollDesc;
    private javax.swing.JComboBox<String> situacaoSelect;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtSituacao;
    // End of variables declaration//GEN-END:variables
}
