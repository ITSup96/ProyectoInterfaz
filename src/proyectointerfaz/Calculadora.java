/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaz;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author hg
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtScreen = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSubstraction = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtScreen.setEditable(false);
        txtScreen.setBackground(new java.awt.Color(0, 0, 0));
        txtScreen.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        txtScreen.setForeground(new java.awt.Color(255, 255, 255));
        txtScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtScreen.setToolTipText("");
        txtScreen.setPreferredSize(new java.awt.Dimension(78, 70));
        txtScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScreenActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("AC");
        btnClear.setBorder(null);
        btnClear.setBorderPainted(false);
        btnClear.setOpaque(true);
        btnClear.setPreferredSize(new java.awt.Dimension(70, 70));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSign.setBackground(new java.awt.Color(51, 51, 51));
        btnSign.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setText("+/-");
        btnSign.setBorder(null);
        btnSign.setBorderPainted(false);
        btnSign.setOpaque(true);
        btnSign.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        btnPercentage.setBackground(new java.awt.Color(51, 51, 51));
        btnPercentage.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnPercentage.setForeground(new java.awt.Color(255, 255, 255));
        btnPercentage.setText("%");
        btnPercentage.setBorder(null);
        btnPercentage.setBorderPainted(false);
        btnPercentage.setOpaque(true);
        btnPercentage.setPreferredSize(new java.awt.Dimension(70, 70));
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(255, 153, 51));
        btnDivision.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("÷");
        btnDivision.setBorder(null);
        btnDivision.setBorderPainted(false);
        btnDivision.setOpaque(true);
        btnDivision.setPreferredSize(new java.awt.Dimension(70, 70));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnSeven.setText("7");
        btnSeven.setBorder(null);
        btnSeven.setBorderPainted(false);
        btnSeven.setOpaque(true);
        btnSeven.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnEight.setText("8");
        btnEight.setBorder(null);
        btnEight.setBorderPainted(false);
        btnEight.setOpaque(true);
        btnEight.setPreferredSize(new java.awt.Dimension(70, 70));
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnNine.setText("9");
        btnNine.setBorder(null);
        btnNine.setBorderPainted(false);
        btnNine.setOpaque(true);
        btnNine.setPreferredSize(new java.awt.Dimension(70, 70));
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnMultiplication.setBackground(new java.awt.Color(255, 153, 51));
        btnMultiplication.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplication.setText("×");
        btnMultiplication.setToolTipText("");
        btnMultiplication.setBorder(null);
        btnMultiplication.setBorderPainted(false);
        btnMultiplication.setOpaque(true);
        btnMultiplication.setPreferredSize(new java.awt.Dimension(70, 70));
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnFour.setText("4");
        btnFour.setBorder(null);
        btnFour.setBorderPainted(false);
        btnFour.setOpaque(true);
        btnFour.setPreferredSize(new java.awt.Dimension(70, 70));
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnFive.setText("5");
        btnFive.setBorder(null);
        btnFive.setBorderPainted(false);
        btnFive.setOpaque(true);
        btnFive.setPreferredSize(new java.awt.Dimension(70, 70));
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnSix.setText("6");
        btnSix.setBorder(null);
        btnSix.setBorderPainted(false);
        btnSix.setOpaque(true);
        btnSix.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSubstraction.setBackground(new java.awt.Color(255, 153, 51));
        btnSubstraction.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnSubstraction.setForeground(new java.awt.Color(255, 255, 255));
        btnSubstraction.setText("-");
        btnSubstraction.setBorder(null);
        btnSubstraction.setBorderPainted(false);
        btnSubstraction.setOpaque(true);
        btnSubstraction.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSubstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubstractionActionPerformed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnOne.setText("1");
        btnOne.setBorder(null);
        btnOne.setBorderPainted(false);
        btnOne.setOpaque(true);
        btnOne.setPreferredSize(new java.awt.Dimension(70, 70));
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnTwo.setText("2");
        btnTwo.setBorder(null);
        btnTwo.setBorderPainted(false);
        btnTwo.setOpaque(true);
        btnTwo.setPreferredSize(new java.awt.Dimension(70, 70));
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnThree.setText("3");
        btnThree.setBorder(null);
        btnThree.setBorderPainted(false);
        btnThree.setOpaque(true);
        btnThree.setPreferredSize(new java.awt.Dimension(70, 70));
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnAddition.setBackground(new java.awt.Color(255, 153, 51));
        btnAddition.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnAddition.setForeground(new java.awt.Color(255, 255, 255));
        btnAddition.setText("+");
        btnAddition.setBorder(null);
        btnAddition.setBorderPainted(false);
        btnAddition.setOpaque(true);
        btnAddition.setPreferredSize(new java.awt.Dimension(70, 70));
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnZero.setText("0");
        btnZero.setBorder(null);
        btnZero.setBorderPainted(false);
        btnZero.setOpaque(true);
        btnZero.setPreferredSize(new java.awt.Dimension(70, 70));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnPoint.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnPoint.setText(".");
        btnPoint.setBorder(null);
        btnPoint.setBorderPainted(false);
        btnPoint.setOpaque(true);
        btnPoint.setPreferredSize(new java.awt.Dimension(70, 70));
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btnEquals.setBackground(new java.awt.Color(255, 153, 51));
        btnEquals.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setText("=");
        btnEquals.setBorder(null);
        btnEquals.setBorderPainted(false);
        btnEquals.setOpaque(true);
        btnEquals.setPreferredSize(new java.awt.Dimension(70, 70));
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    //***VARIABLES***
    
        double a; //Utilizado para almacenar el primer numero.
        double b; //Utilizado para almacenar el segundo numero.
        char symbol; //Utilizado para guardar y determinar la operacion a realizar.
        String resultado; //Guarda el resultado final de la operacion en texto.
        boolean writingFirstDigit = true; //Marca si estamos escribiendo el primer digito de un numero;
        boolean firstEqualsClick = true; //Marca si estamos relizando la primera vuelta por el boton igual.
        boolean keysDisabled = false; //Marca si las teclas numericas estan desabilitdas.
   
        
    //***EVENTS***
    
    private void txtScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScreenActionPerformed
        txtScreen.requestFocus();
    }//GEN-LAST:event_txtScreenActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        write("0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        write("1");
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        write("2");
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        write("3");
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        write("4");
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        write("5");
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        write("6");
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        write("7");
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        write("8");
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        write("9");
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearScreen();
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.getContentPane().setBackground(this.getBackground());
        txtScreen.setText("0");
    }//GEN-LAST:event_formWindowOpened

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
        setSymbol('+');
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnSubstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubstractionActionPerformed
        setSymbol('-');
    }//GEN-LAST:event_btnSubstractionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        setSymbol('*');
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        setSymbol('/');
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        
        if(firstEqualsClick)
        {
            setVarB();
            selectOperation();
            firstEqualsClick = false;
        }
        else
        {   
            selectOperation();
        }
        
        double lastResult = Double.parseDouble(resultado);
        txtScreen.setText(resultado);
        adjustSize();
        a = lastResult;    
        writingFirstDigit = true;
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        String text = txtScreen.getText();
        
        if (!text.contains(".")) 
        {
            txtScreen.setText(text + ".");
        }
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        double value = Double.parseDouble(txtScreen.getText());
        txtScreen.setText(Double.toString(value / 100));
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        double value = Double.parseDouble(txtScreen.getText());
        txtScreen.setText(Double.toString(value * -1));
    }//GEN-LAST:event_btnSignActionPerformed

    
    //***METHODS***
    
    public void add() //Method used for addition.
    {
        resultado = Double.toString(a+b);
    }
    
    public  void subtract() //Method used for subtraction.
    {
        resultado = Double.toString(a-b);
    }
    
    public void multiply() //Method used for multiplication.
    {
        resultado = Double.toString(a*b);
    }
    
    public void divide() //Method used for division. ***NOTE: NEEDS RESTRICTION FOR DENOMINATOR =|= 0***
    {   
        if(b==0)
        {
            resultado = "Math Error";
        }
        else
        {
            resultado = Double.toString(a/b);
        }
    }
    
    public void clearScreen() // Clears the calculator screen and sets all values back to default.
    {
        txtScreen.setText("0");
        a=0;
        b=0;
        writingFirstDigit = true;
        firstEqualsClick = true;
        resultado = "0";
        symbol = '\0';
        enableKeys();
    }
    
    public void setVarA() //Saves number in screen into variable A, resets boolean values.
    {
        a = Double.parseDouble(txtScreen.getText());
        writingFirstDigit = true;
        firstEqualsClick = true;
    }
    
    public void setVarB() //Saves number in screen into variable B.
    {
        b = Double.parseDouble(txtScreen.getText());
    }
    
    public void setSymbol(char sign)//Method to reduce repetion of instructions for each operation symbol
    {
        if (keysDisabled)
        {
            enableKeys();
        }
        else
        {
            setVarA();
        }
        symbol = sign;
    }
    
    public void selectOperation() //Sets the operation that will be performed based on the symbol
    {
        if(symbol == '+')
            {
                add();
            }
            if(symbol == '-')
            {
                subtract();
            }
            if(symbol == '*')
            {
                multiply();
            }
            if(symbol == '/')
            {
                divide();
            }
    }
    
    public void write(String value)//Writes the value set in the argument into the screen.
    {
        txtScreen.setFont(new Font("Helvetica Neue", Font.PLAIN, 36));
        String text = txtScreen.getText();
        
        if (writingFirstDigit) 
        {
            txtScreen.setText(value);
            writingFirstDigit = false;
        }
        else
        {
            txtScreen.setText(text + value);
        }
        adjustSize();
    }
    
    public void adjustSize()//Adjusts the font size when typing long numbers;
    {
        int textLength = txtScreen.getText().length();
        int max = 36;
        int min = 12;
        int size = max;
        
        if (textLength > 10)
        {
            size = Math.max(min, max - (textLength - 10));
        }
        
        txtScreen.setFont(new java.awt.Font("Helvetica Neue", Font.PLAIN, size));
        
        if (textLength > 40)
        {
            setVarA();
            txtScreen.setText("0");
            disableKeys();
            keysDisabled = true;
            writingFirstDigit = true;
        }
    }
    
    public void disableKeys() //Disables keys. Used to limit the amount of character input.
    {
        btnZero.setEnabled(false);
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnFour.setEnabled(false);
        btnFive.setEnabled(false);
        btnSix.setEnabled(false);
        btnSeven.setEnabled(false);
        btnEight.setEnabled(false);
        btnNine.setEnabled(false);
    }
    
    public void enableKeys() //Enables keys.
    {
        btnZero.setEnabled(true);
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(false);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSign;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSubstraction;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JTextField txtScreen;
    // End of variables declaration//GEN-END:variables
}
