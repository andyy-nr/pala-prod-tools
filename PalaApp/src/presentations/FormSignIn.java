package presentations;

/**
 *
 * @author Maria del Carmen
 */
import data.CourseDao;
import data.StudentDao;
import entities.Student;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormSignIn extends javax.swing.JFrame {

    StudentDao studentD = new StudentDao();
    CourseDao courseD = new CourseDao();

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
        buttonSignin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 237, 231)));
        buttonSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSigninActionPerformed(evt);
            }
        });

        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Retroceder.png"))); // NOI18N
        buttonBack.setBorder(null);
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
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(panelSigninLayout.createSequentialGroup()
                .addComponent(buttonBack)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        this.allCompleted();
        try{
            String user = this.txtUser.getText();
            String pw = String.valueOf(this.txtPassword.getPassword());

            if (isValid(user, pw)) {
                String name = this.txtFName.getText();
                String lastName = this.txtLName.getText();
                String mail = this.txtEmail.getText();
                clean();
                int status = 1;
                Student student = new Student(status, name,
                        lastName, mail, user,
                        pw);

                studentD.addStudent(student);
                studentD.saveStudent(student);
                // courseD.saveCourse(); 
                
            }
        }catch(HeadlessException ex){
            System.out.println("Error al intentar guardar: " + ex.getMessage());
        }

    }//GEN-LAST:event_buttonSigninActionPerformed

    private void txtFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtFNameKeyTyped
    private void clean() {
        txtUser.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        txtFName.requestFocus();

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

    private boolean isValid(String user, String pw) {

        if (isSure(pw) && userSure(user)) {
            System.out.println("Dentro del if de isValid");

            return true;
        }
        return false;

    }

    private boolean userSure(String userName) {
        ArrayList<Student> stdList = studentD.getData();

        for (Student std : stdList) {
            System.out.println(userName);
            if (userName.equals(std.getUserName())) {

                this.txtUser.setText("");
                this.txtUser.requestFocus();
                JOptionPane.showMessageDialog(this, "Username alredy in use");
                return false;
            }
        }
        return true;
    }

    private boolean allCompleted() {

        if (this.txtLName.getText().equals("") || this.txtFName.getText().equals("")
                || this.txtEmail.getText().equals("")
                || String.valueOf(this.txtPassword.getPassword()).equals("")
                || this.txtUser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");

            return false;
        } else {
            return true;

        }

    }

    public boolean isSure(String password) {
        boolean mayuscula = false;
        boolean numero = false;
        char c;

        if (password.length() >= 8) {

            for (int i = 0; i < password.length(); i++) {
                c = password.charAt(i);
                if (Character.isDigit(c)) {

                    numero = true;
                }
                if (Character.isUpperCase(c)) {

                    mayuscula = true;
                }

            }
            if (numero && mayuscula) {

                return true;
            } else {
                JOptionPane.showMessageDialog(this, "The password "
                        + "must have numbers and capital letters");
                this.txtPassword.setText("");
                this.txtPassword.requestFocus();
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "The password"
                    + "must have 8 letters or more");
            this.txtPassword.setText("");
            this.txtPassword.requestFocus();
            return false;

        }
    }
    
}
