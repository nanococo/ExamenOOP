package McDonalds.GUI;

import McDonalds.Combos.*;
import McDonalds.Order;
import McDonalds.Screen;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author jguty
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        order = new Order(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new Screen();
        order.attach(jTextArea1);
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new Screen();
        order.attach(jTextArea2);
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new Screen();
        order.attach(jTextArea3);
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new Screen();
        order.attach(jTextArea4);
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new Screen();
        order.attach(jTextArea5);
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new Screen();
        order.attach(jTextArea6);
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new Screen();
        order.attach(jTextArea7);
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new Screen();
        order.attach(jTextArea8);
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new Screen();
        order.attach(jTextArea9);
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new Screen();
        order.attach(jTextArea10);
        jPanel1 = new javax.swing.JPanel();
        checkCombo2 = new javax.swing.JCheckBox();
        checkCombo1 = new javax.swing.JCheckBox();
        checkCombo3 = new javax.swing.JCheckBox();
        checkCombo4 = new javax.swing.JCheckBox();
        checkCombo5 = new javax.swing.JCheckBox();
        checkCombo6 = new javax.swing.JCheckBox();
        checkCombo8 = new javax.swing.JCheckBox();
        checkCombo7 = new javax.swing.JCheckBox();
        comboLabel = new javax.swing.JLabel();
        checkBebidaMediana = new javax.swing.JCheckBox();
        checkSalsaTomate = new javax.swing.JCheckBox();
        checkHamburguesa = new javax.swing.JCheckBox();
        checkQueso = new javax.swing.JCheckBox();
        checkPanAjo = new javax.swing.JCheckBox();
        checkBebidaGrande = new javax.swing.JCheckBox();
        checkTocino = new javax.swing.JCheckBox();
        checkPapas = new javax.swing.JCheckBox();
        checkHelado = new javax.swing.JCheckBox();
        checkSalsaBBQ = new javax.swing.JCheckBox();
        extrasLabel = new javax.swing.JLabel();
        btnEnviarPedido = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnEnter.setVisible(false);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane7.setViewportView(jTextArea7);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane8.setViewportView(jTextArea8);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane9.setViewportView(jTextArea9);

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jScrollPane10.setViewportView(jTextArea10);

        checkCombo2.setText("Combo 2");
        checkCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo2ActionPerformed(evt);
            }
        });

        checkCombo1.setText("Combo 1");
        checkCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo1ActionPerformed(evt);
            }
        });

        checkCombo3.setText("Combo 3");
        checkCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo3ActionPerformed(evt);
            }
        });

        checkCombo4.setText("Combo 4");
        checkCombo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo4ActionPerformed(evt);
            }
        });

        checkCombo5.setText("Combo 5");
        checkCombo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo5ActionPerformed(evt);
            }
        });

        checkCombo6.setText("Combo 6");
        checkCombo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo6ActionPerformed(evt);
            }
        });

        checkCombo8.setText("Combo 8");
        checkCombo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo8ActionPerformed(evt);
            }
        });

        checkCombo7.setText("Combo 7");
        checkCombo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCombo7ActionPerformed(evt);
            }
        });

        comboLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboLabel.setText("Seleccione un combo:");

        checkBebidaMediana.setText("+bebida mediana");


        checkSalsaTomate.setText("+salsa de tomate");


        checkHamburguesa.setText("+hamburguesa");


        checkQueso.setText("+queso");


        checkPanAjo.setText("+pan de ajo");

        checkBebidaGrande.setText("+bebida grande");

        checkTocino.setText("+tocino");


        checkPapas.setText("+papas");


        checkHelado.setText("+helado");


        checkSalsaBBQ.setText("+salsa bbq");
      
        extrasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        extrasLabel.setText("Seleccione los extras:");

        btnEnviarPedido.setText("Enviar Pedido");
        btnEnviarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPedidoActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
  

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(checkCombo2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkCombo6))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(checkCombo3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkCombo7))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(checkCombo4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkCombo8))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(btnEnter)))
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(checkSalsaBBQ)
                                                                        .addComponent(checkTocino)
                                                                        .addComponent(checkQueso)
                                                                        .addComponent(checkBebidaGrande))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(checkPanAjo)
                                                                        .addComponent(checkHelado)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(checkHamburguesa)
                                                                                        .addComponent(checkSalsaTomate))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnEnviarPedido)))
                                                                .addContainerGap(75, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(extrasLabel)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(checkBebidaMediana)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(checkPapas)))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(checkCombo1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkCombo5))
                                                        .addComponent(comboLabel))
                                                .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboLabel)
                                        .addComponent(extrasLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkCombo1)
                                        .addComponent(checkCombo5)
                                        .addComponent(checkBebidaMediana)
                                        .addComponent(checkPapas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(checkCombo2)
                                                        .addComponent(checkCombo6)
                                                        .addComponent(checkSalsaTomate)
                                                        .addComponent(checkBebidaGrande))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(checkCombo3)
                                                        .addComponent(checkCombo7)
                                                        .addComponent(checkHamburguesa)
                                                        .addComponent(checkSalsaBBQ)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnEnviarPedido)
                                                .addGap(9, 9, 9)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(checkCombo4)
                                                        .addComponent(checkCombo8)
                                                        .addComponent(checkTocino))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnEnter))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(checkHelado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(checkPanAjo)
                                                        .addComponent(checkQueso))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane7)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 5, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane8))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane10)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane2)
                                                .addComponent(jScrollPane1)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6)
                                        .addComponent(jScrollPane7)
                                        .addComponent(jScrollPane8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane10))
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>                        

    private void checkCombo7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo7.setSelected(true);
        combo = new Combo7();
    }

    private void checkCombo8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo8.setSelected(true);
        combo = new Combo8();
    }

    private void checkCombo6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo6.setSelected(true);
        combo = new Combo6();
    }

    private void checkCombo5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo5.setSelected(true);
        combo = new Combo5();
    }

    private void checkCombo4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo4.setSelected(true);
        combo = new Combo4();
    }

    private void checkCombo3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo3.setSelected(true);
        combo = new Combo3();
    }

    private void checkCombo1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo1.setSelected(true);
        combo = new Combo1();
    }

    private void checkCombo2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        resetComboSelections();
        checkCombo2.setSelected(true);
        combo = new Combo2();
    }

    private void checkBebidaMedianaActionPerformed( ) {
        // TODO add your handling code here:
        combo = new BebidaMediana(combo);
    }

    private void checkSalsaBBQActionPerformed( ) {
        // TODO add your handling code here:
        combo = new SalsaBBQ(combo);
    }

    private void checkBebidaGrandeActionPerformed( ) {
        // TODO add your handling code here:
        combo = new BebidaGrande(combo);
    }

    private void checkTocinoActionPerformed( ) {
        // TODO add your handling code here:
        combo = new Tocino(combo);
    }

    private void checkQuesoActionPerformed() {
        // TODO add your handling code here:
        combo = new Queso(combo);
    }

    private void checkPapasActionPerformed() {
        // TODO add your handling code here:
        combo = new Papas(combo);
    }

    private void checkSalsaTomateActionPerformed() {
        // TODO add your handling code here:
        combo = new SalsaTomate(combo);
    }

    private void checkHamburguesaActionPerformed() {
        // TODO add your handling code here:
        combo = new Hamburguesa(combo);
    }

    private void checkHeladoActionPerformed() {
        // TODO add your handling code here:
        combo = new Helado(combo);
    }

    private void checkPanAjoActionPerformed() {
        // TODO add your handling code here:
        combo = new PanDeAjo(combo);
    }

    private void btnEnviarPedidoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (checkBebidaGrande.isSelected()) checkBebidaGrandeActionPerformed();
        if ( checkBebidaMediana.isSelected())  checkBebidaMedianaActionPerformed();
        if ( checkSalsaBBQ.isSelected())  checkSalsaBBQActionPerformed();
        if (checkTocino.isSelected()) checkTocinoActionPerformed();
        if (checkQueso.isSelected()) checkQuesoActionPerformed();
        if (checkPanAjo.isSelected()) checkPanAjoActionPerformed();
        if (checkPapas.isSelected()) checkPapasActionPerformed();
        if (checkSalsaTomate.isSelected()) checkSalsaTomateActionPerformed();
        if (checkHamburguesa.isSelected()) checkHamburguesaActionPerformed();
        if (checkHelado.isSelected()) checkHeladoActionPerformed();

        order.setCombo(combo);
        resetExtras();
        resetComboSelections();

        order.notifyObservers();

    }

    private void resetComboSelections(){
        checkCombo1.setSelected(false);
        checkCombo2.setSelected(false);
        checkCombo3.setSelected(false);
        checkCombo4.setSelected(false);
        checkCombo5.setSelected(false);
        checkCombo6.setSelected(false);
        checkCombo7.setSelected(false);
        checkCombo8.setSelected(false);
    }
    private void resetExtras(){
        checkPanAjo.setSelected(false);
        checkBebidaGrande.setSelected(false);
        checkBebidaMediana.setSelected(false);
        checkHamburguesa.setSelected(false);
        checkHelado.setSelected(false);
        checkPapas.setSelected(false);
        checkQueso.setSelected(false);
        checkTocino.setSelected(false);
        checkSalsaBBQ.setSelected(false);
        checkSalsaTomate.setSelected(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnEnviarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBebidaGrande;
    private javax.swing.JCheckBox checkBebidaMediana;
    private javax.swing.JCheckBox checkCombo1;
    private javax.swing.JCheckBox checkCombo2;
    private javax.swing.JCheckBox checkCombo3;
    private javax.swing.JCheckBox checkCombo4;
    private javax.swing.JCheckBox checkCombo5;
    private javax.swing.JCheckBox checkCombo6;
    private javax.swing.JCheckBox checkCombo7;
    private javax.swing.JCheckBox checkCombo8;
    private javax.swing.JCheckBox checkHamburguesa;
    private javax.swing.JCheckBox checkHelado;
    private javax.swing.JCheckBox checkPanAjo;
    private javax.swing.JCheckBox checkPapas;
    private javax.swing.JCheckBox checkQueso;
    private javax.swing.JCheckBox checkSalsaBBQ;
    private javax.swing.JCheckBox checkSalsaTomate;
    private javax.swing.JCheckBox checkTocino;
    private javax.swing.JLabel comboLabel;
    private javax.swing.JLabel extrasLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private Screen jTextArea1;
    private Screen jTextArea10;
    private Screen jTextArea2;
    private Screen jTextArea3;
    private Screen jTextArea4;
    private Screen jTextArea5;
    private Screen jTextArea6;
    private Screen jTextArea7;
    private Screen jTextArea8;
    private Screen jTextArea9;
    private Combo combo;
    private Order order;
    // End of variables declaration                   

    public Combo getCombo(){
        return combo;
    }

// End of variables declaration
}

