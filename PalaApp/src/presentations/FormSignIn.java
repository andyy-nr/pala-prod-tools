package presentations;

/**
 *
 * @author Maria del Carmen
 */
import datos.StudentDao;
import entities.Student;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FormSignIn extends javax.swing.JFrame {

    public static boolean isSure(String password) {
        if (password.length() > 8) {
            boolean mayuscula = false;
            boolean numero = false;
            char c;

            for (int i = 0; i < password.length(); i++) {
                c = password.charAt(i);
                if (Character.isDigit(c))
                    numero = true;
                if (Character.isUpperCase(c))
                    mayuscula = true;
            }
            if (numero && mayuscula)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
    

    public FormSignIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSignin = new javax.swing.JPanel();
        labelFirstName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        buttonSignin = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSignin.setBackground(new java.awt.Color(239, 237, 231));

        labelFirstName.setText("First name");

        txtFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNameKeyTyped(evt);
            }
        });

        labelLastName.setText("Last name");

        labelUsername.setText("Username");

        labelPassword.setText("Password");

        labelEmail.setText("Email");

        buttonSignin.setText("Sign in");
        buttonSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSigninActionPerformed(evt);
            }
        });

        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSigninLayout = new javax.swing.GroupLayout(panelSignin);
        panelSignin.setLayout(panelSigninLayout);
        panelSigninLayout.setHorizontalGroup(
            panelSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSigninLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLName)
                    .addComponent(txtFName)
                    .addComponent(txtPassword)
                    .addGroup(panelSigninLayout.createSequentialGroup()
                        .addGroup(panelSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtUser))
                .addContainerGap())
            .addGroup(panelSigninLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(buttonSignin)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(panelSigninLayout.createSequentialGroup()
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelSigninLayout.setVerticalGroup(
            panelSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSigninLayout.createSequentialGroup()
                .addComponent(buttonBack)
                .addGap(4, 4, 4)
                .addComponent(labelFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSignin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        new FormStart().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSigninActionPerformed
        // TODO add your handling code here:
        StudentDao studentD = new StudentDao();
        Student student = new Student();
        Scanner lector = new Scanner(System.in);
        String password = "";
        password = lector.next();
        txtPassword.setText(password);
        if (txtFName.getText().equals("") || (txtLName.getText().equals("")) || (txtPassword.getText().equals("")) || (txtUser.getText().equals(""))
           || (txtEmail.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtFName.requestFocus();
        }
        if (isSure(password)) {
            
            student.setUserName(txtUser.getText());
            student.setPassword(txtPassword.getText());
            student.setName(txtFName.getText());
            student.setLastNames(txtLName.getText());
            student.setEmail(txtEmail.getText());
            student.setId(1);
            if (studentD.sigIn(student)){
                JOptionPane.showMessageDialog(null, "Registro guardado");
            } else{
                JOptionPane.showMessageDialog(null, "Error, no se pudo registrar");
            }    
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no es segura");
        }
        


    }//GEN-LAST:event_buttonSigninActionPerformed

    private void txtFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c<'A' || c >'Z')&& (c<' ' || c >' '))evt.consume();
        
    }//GEN-LAST:event_txtFNameKeyTyped
    private void clean(){
        txtUser.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        
        

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
            java.util.logging.Logger.getLogger(FormSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonSignin;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelSignin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
