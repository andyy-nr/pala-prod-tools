/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentations;

import data.CourseDao;
import entities.Course;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Nunez
 */
public class FormCourses extends javax.swing.JFrame {

    private ArrayList<Course> listCourses = new ArrayList<>();
    private CourseDao courseD = new CourseDao();

    public FormCourses() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCourses = new javax.swing.JTable();
        labelCourse = new javax.swing.JLabel();
        fieldCourse = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 237, 231));

        jToolBar1.setBackground(new java.awt.Color(193, 171, 173));
        jToolBar1.setRollover(true);

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/add.png"))); // NOI18N
        buttonAdd.setFocusable(false);
        buttonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonAdd);

        buttonDelete.setBackground(new java.awt.Color(239, 237, 231));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete.setFocusable(false);
        buttonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonDelete);

        tableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableCourses);

        labelCourse.setText("Course");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(labelCourse)
                    .addComponent(fieldCourse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        this.isNotEmpty();
        try {
            Course course = new Course(fieldCourse.getText());
            if (courseD.saveCourse(course)) {
                JOptionPane.showMessageDialog(
                        this,
                        "Course saved.",
                        ":)",
                        JOptionPane.INFORMATION_MESSAGE);
                fillTable();
            } else {
                JOptionPane.showMessageDialog(
                        this, 
                        "Error",
                        "Error saving, try again", 
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException ex) {
            System.out.println("An error happened: " + ex.getMessage());
        }    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FormCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCourses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JTextField fieldCourse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelCourse;
    private javax.swing.JTable tableCourses;
    // End of variables declaration//GEN-END:variables

    private void isNotEmpty() {
        if (fieldCourse.getText().equals("")){
            JOptionPane.showMessageDialog(this, 
                    "Please write the name of your course",
                    "Must be filled",
                    JOptionPane.WARNING_MESSAGE);
            fieldCourse.requestFocus();
        }
    }

    private void fillArray() {
        if (!listCourses.isEmpty()) {
            listCourses.clear();
        }
        listCourses = courseD.getData();
    }

    private void fillTable() {
        fillArray();
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titles[] = {"Courses"};
        dtm.setColumnIdentifiers(titles);
        for (Course course : listCourses) {
            Object[] fila = new Object[]{
                course.getName()};

            dtm.addRow(fila);
        }
        this.tableCourses.setModel(dtm);
        tableCourses.getColumnModel().getColumn(0).setMaxWidth(0);
        tableCourses.getColumnModel().getColumn(0).setMinWidth(0);
        tableCourses.getColumnModel().getColumn(0).setPreferredWidth(0);
        tableCourses.getColumnModel().getColumn(0).setResizable(false);
    }

}
