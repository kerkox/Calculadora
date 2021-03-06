/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Polker
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora operando valores para hacer el split por
     * JAVA PATTERN operadores caracteres de las operaciones + - * /
     */
    /**
     * operando valores para hacer el split por JAVA PATTERN operadores
     * caracteres de las operaciones + - * /
     */
    boolean allowPoint = true;
    boolean allowNumber = true;

    String[] operando = {"\\+", "--", "\\*", "/"};//operando valores para hacer el split por JAVA PATTERN
    String[] operadores = {"+", "--", "*", "/"}; //operadores caracteres de las operaciones + - * /
    String calculo = "";
    double a = 0, b = 0, resultado = 0;

    /**
     *
     * @param index valores de 0 a 3
     * @return operadores caracteres de las operaciones + -- * /
     */
    public String operadores(int index) {
        String[] operadores = {"+", "--", "*", "/"};
        return operadores[index];
    }

    /**
     *
     * @param index valores de 0 a 3
     * @return operando valores para hacer el split por JAVA PATTERN por los
     * caracteres reservados como especiales osea \\+ -- \\* /
     */
    public String operando(int index) {
        String[] operando = {"\\+", "--", "\\*", "/"};//operando valores para hacer el split por JAVA PATTERN
        return operando[index];
    }

    public Calculadora() {
        initComponents();
        ManejadorNumeros mn = new ManejadorNumeros();
        this.boton0.addActionListener(mn);
        this.boton1.addActionListener(mn);
        this.boton2.addActionListener(mn);
        this.boton3.addActionListener(mn);
        this.boton4.addActionListener(mn);
        this.boton5.addActionListener(mn);
        this.boton6.addActionListener(mn);
        this.boton7.addActionListener(mn);
        this.boton8.addActionListener(mn);
        this.boton9.addActionListener(mn);
        //*****************************************

        ManejadorOperadores mo = new ManejadorOperadores();
        this.botonDivi.addActionListener(mo);
        this.botonMulti.addActionListener(mo);
        this.botonResta.addActionListener(mo);
        this.botonSuma.addActionListener(mo);
        //*****************************************
        ManejadorPunto mp = new ManejadorPunto();
        this.botonPunto.addActionListener(mp);
        //*****************************************
        ManejadorResultado mr = new ManejadorResultado();
        this.botonIgual.addActionListener(mr);
        //*****************************************
        ManejadorClear mc = new ManejadorClear();
        this.clear.addActionListener(mc);
        //*****************************************
        ManejadorDelete md = new ManejadorDelete();
        this.Delete.addActionListener(md);
        //*****************************************
        ManejadorSigno ms = new ManejadorSigno();
        this.signo.addActionListener(ms);
    }

    /**
     *
     * @param formula un string donde esta la operacion
     * @return operador en el indice 0 posicion en el indice 1
     */
    public int[] operacion(String formula) {

        int pos = -1, operador = -1;
        //Aqui se busca el operador que hay en la pantalla
        for (int i = 0; i < 4; i++) {
            if (formula.contains(operadores(i))) {
                operador = i;
                break;
            }

        }
        if (operador != -1) {
            pos = formula.indexOf(operadores(operador));
        }
        int[] datos = {operador, pos};
        return datos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonDivi = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonMulti = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        signo = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setEditable(false);
        pantalla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setText("0");

        boton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton7.setText("7");

        boton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton8.setText("8");

        boton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton9.setText("9");

        botonDivi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonDivi.setText("/");

        botonResta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonResta.setText("--");

        boton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton3.setText("3");

        boton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton2.setText("2");

        boton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton1.setText("1");

        boton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton4.setText("4");

        boton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton5.setText("5");

        boton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton6.setText("6");

        botonMulti.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonMulti.setText("*");

        botonSuma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonSuma.setText("+");

        botonPunto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonPunto.setText(".");

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonIgual.setText("=");

        boton0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boton0.setText("0");

        clear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clear.setText("C");

        signo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signo.setText("+/-");

        Delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Delete.setText("Del");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(botonDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton Delete;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonDivi;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMulti;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton clear;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton signo;
    // End of variables declaration//GEN-END:variables
    /**
     * Clase de Manejador de Numeros y el punto
     */
    public class ManejadorNumeros implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton btn = (JButton) e.getSource();
            String screen = pantalla.getText(), operador = "", salida = "";
            int oper, pos;

            if (allowNumber) {

                if (screen.equals("0") || (screen.equals(""))) {

                    salida = btn.getText();

                } else {

                    //cambio por metodo propio de la clase principal
                    //######################################################
                    calculo = btn.getText();
                    int[] data = operacion(screen); 
                    /*
                    int[] data = operacion(screen); 
                    esto devuelve si la pantalla tiene un signo de operacion 
                    si no es asi el valor que devuelve es -1
                    si la pantalla tiene un signo de operacion entonces devuelve:
                    - el tipo de operacion (de  0 3 ): 0= suma(+), 1=resta(-), 2=multiplicacion(*) 3=division(/)
                    - y el indice donde se encuentra el signo de operacion
                    */
                    
                    oper = data[0];
                    pos = data[1];

                    if (pos != -1) {

                        operador = operadores(oper);
                        calculo = screen;

                        if (pos + 1 <= calculo.length()) {
                            calculo = calculo.substring(pos + 1);

                            if (calculo.equals("0")) {

                                calculo = calculo.replace("0", btn.getText());
                            } else {
                                calculo += btn.getText();
                            }
                        } else {
                            calculo = btn.getText();
                        }
                        salida = screen.substring(0, pos + 1) + calculo;

                    }

                }
                if (salida.equals("")) {
                    salida = screen + btn.getText();

                }

            } else {

                //**********************************
                ManejadorClear mc = new ManejadorClear();
                mc.actionPerformed(e);
                //para que limpie todo cuando se escribe de nuevo
                //***********************************
                salida = btn.getText();
                allowNumber = true;//ya que reemplaza al numero que hubiese y permite escribir mas numeros

            }

            pantalla.setText(salida);

        }

    }

    /**
     * Clase de Manejador de los operadores
     */
    public class ManejadorOperadores implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            allowPoint = true;
            allowNumber = true;
            //*********************************
            //calculo anterior
            int pos = 0, oper = 0;
            double tmp = 0;
            String[] datas = {};
            JButton btn = (JButton) e.getSource();
            boolean limpiar = false;
            calculo = pantalla.getText();

            //***********************************
            int[] data = operacion(calculo);
            oper = data[0]; //tipo de operacion 
            pos = data[1]; //indice donde se encuentra el simbolo de la operacion

            if (calculo.equals("")) {
                pantalla.setText("0" + btn.getText());
            } else if (pos != -1) {

//                int[] data = operacion(calculo);
//                oper = data[0]; //tipo de operacion 
//                pos = data[1]; //indice donde se encuentra el simbolo de la operacion
                if (pos != -1) {
                    //si llega aqui es porque se contiene un operador pero se presiono otro
                    //asi se que realiza el cambio de operador
                    if ((pos + 1) == calculo.length()) {

                        a = Double.parseDouble(calculo.replace(operadores(oper), ""));

                        calculo = calculo.replace(operadores(oper), btn.getText());

                    } else {

                        if (oper != -1) {

                            datas = calculo.split(operando(oper));
                            b = Double.parseDouble(datas[1]);

                            switch (oper) {
                                case 0:
                                    a += b;
                                    calculo = a + "";

                                    break;
                                case 1:
                                    a -= b;
                                    calculo = a + "";

                                    break;
                                case 2:
                                    a *= b;
                                    calculo = a + "";

                                    break;
                                case 3:
                                    if (b == 0) {
                                        calculo = "No se puede Divir entre 0 ";
                                        pantalla.setText("No se puede Divir entre 0 ");
                                        limpiar = true;
                                    } else {

                                        a /= b;
                                        calculo = a + "";
                                    }

                                    break;

                            }
                        }
                        calculo += btn.getText();

                    }
                } else {
                    a = Double.parseDouble(calculo);

                    calculo += btn.getText();
                }

                pantalla.setText(calculo);
                if (limpiar) {
                    //se limpiean todas las variables
                    //**********************************
                    ManejadorClear mc = new ManejadorClear();
                    mc.actionPerformed(e);
                    //para que limpie todo cuando se escribe de nuevo
                    //***********************************
                    pantalla.setText("No se puede Divir entre 0 ");
                    allowNumber = false;
                }

            } else {
                a = Double.parseDouble(calculo);

                calculo += btn.getText();
                pantalla.setText(calculo);

            }
        }

    }

    /**
     * Clase manejador del Punto
     */
    public class ManejadorPunto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String oper = "";
            JButton btn = (JButton) e.getSource();
            oper = pantalla.getText();

            if (allowNumber) {
                if (oper.equals("0")) {
                    if (allowPoint) {
                        oper += btn.getText();
                    }
                } else {

                    if (allowPoint) {
                        if (oper.equals("")) {
                            oper = "0" + btn.getText();
                        } else {
                            int[] data = operacion(oper);
                            int pos = data[1];
                            if (oper.length() == (pos + 1)) {
                                oper += "0" + btn.getText();
                            } else {
                                oper += btn.getText();
                            }
                        }

                    }
                }
            } else {
                //**********************************
                ManejadorClear mc = new ManejadorClear();
                mc.actionPerformed(e);
                //para que limpie todo cuando se escribe de nuevo
                //***********************************
                oper = "0" + btn.getText();
                allowNumber = true;//ya que reemplaza al numero que hubiese y permite escribir mas numeros
            }

            pantalla.setText(oper);
            allowPoint = false;

        }
    }

    public class ManejadorResultado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            allowNumber = false; //para que no permita escribir otro numero
            allowPoint = false; // ya que la respuesta trae punto
            calculo = pantalla.getText();
            boolean limpiar = false;

            if (calculo.charAt(calculo.length() - 1) == '.') {
                calculo = calculo.replace(".", "");

            }

            String[] datas;
            int pos, operador;
            int[] oper = operacion(calculo);

            operador = oper[0];
            pos = oper[1];
            //Aqui se busca el operador que hay en la pantalla

            //aqui se evalua si el operador es lo ultimo
            //si es asi entonces solo se deja el valor que esta sin el operador
            //sino se hace la ultima operacion
            if (operador != -1) {

                if (calculo.length() == (pos + 1)) {
                    calculo = calculo.replace(operadores[operador], "");
                } else {

                    datas = calculo.split(operando[operador]);

                    a = Double.parseDouble(datas[0]);
                    b = Double.parseDouble(datas[1]);

                    switch (operador) {
                        case 0:
                            a += b;
                            break;
                        case 1:
                            a -= b;
                            break;
                        case 2:
                            a *= b;
                            break;
                        case 3:
                            if (b == 0) {
                                calculo = "No se puede Divir entre 0 ";
                                pantalla.setText("No se puede Divir entre 0 ");
                                limpiar = true;
                            } else {

                                a /= b;
                                calculo = a + "";
                            }
                            break;
                    }
                    if (!limpiar) {
                        calculo = a + "";
                    }
                }

            }

            if (((calculo.indexOf(".") + 5) < calculo.length()) && (!limpiar)) {
                calculo = calculo.substring(0, calculo.indexOf(".") + 5);
            }
            pantalla.setText(calculo);
            if (limpiar) {
                //se limpiean todas las variables
                //**********************************
                ManejadorClear mc = new ManejadorClear();
                mc.actionPerformed(e);
                //para que limpie todo cuando se escribe de nuevo
                //***********************************
                pantalla.setText("No se puede Divir entre 0 ");
                allowNumber = false;

            }
//            pantalla.setText(calculo);

        }

    }

    public class ManejadorClear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Reinicio de todas las variables
            pantalla.setText("");
            a = 0;
            b = 0;
            resultado = 0;
            calculo = "";
            allowPoint = true;
        }

    }

    public class ManejadorDelete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            calculo = pantalla.getText();

            if (calculo.length() >= 2) {
                calculo = calculo.substring(0, calculo.length() - 1);
            } else {
                calculo = "";
            }
            pantalla.setText(calculo);

        }

    }

    public class ManejadorSigno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            calculo = pantalla.getText();
            if (!calculo.equals("")) {

                int[] datas = operacion(calculo);
                int oper = datas[0];
                int pos = datas[1];

                if (oper != -1) {

                } else {
                    a = Double.parseDouble(calculo);

                    a *= -1;

                    calculo = a + "";

                }

                pantalla.setText(calculo);
            }

        }

    }
}
