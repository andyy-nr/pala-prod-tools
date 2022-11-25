/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentations;

import data.CourseDao;
import data.TaskDao;
import entities.Course;
import entities.Task;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Nunez
 */
public class FormLists extends javax.swing.JFrame {

    private DefaultTableModel dtbNotStarted;
    private DefaultTableModel dtbInProgress;
    private DefaultTableModel dtbCompleted;
    private int userID = 0;
    TaskDao taskD = new TaskDao();
    CourseDao courseD = new CourseDao();
    ArrayList<String> courseNames = new ArrayList<>();

    public FormLists(int id) {
        initComponents();
        userID = id;
        this.fillTable();
        this.fillCbCourses();
        this.fillCbStatus();

    }

    public FormLists() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpanelNotStarted = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotStarted = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        buttonAdd1 = new javax.swing.JButton();
        buttonEdit1 = new javax.swing.JButton();
        buttonDelete1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jpanelProgress = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInProgress = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        buttonAdd2 = new javax.swing.JButton();
        buttonEdit2 = new javax.swing.JButton();
        buttonDelete2 = new javax.swing.JButton();
        jPanelCompleted = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCompleted = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        buttonAdd3 = new javax.swing.JButton();
        buttonEdit3 = new javax.swing.JButton();
        buttonDelete3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(193, 171, 173));

        jpanelNotStarted.setBackground(new java.awt.Color(239, 237, 231));

        tableNotStarted.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableNotStarted);

        jToolBar1.setBackground(new java.awt.Color(239, 237, 231));
        jToolBar1.setRollover(true);

        buttonAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/add.png"))); // NOI18N
        buttonAdd1.setBorder(null);
        buttonAdd1.setFocusable(false);
        buttonAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdd1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd1ActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonAdd1);

        buttonEdit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/edit.png"))); // NOI18N
        buttonEdit1.setBorder(null);
        buttonEdit1.setFocusable(false);
        buttonEdit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(buttonEdit1);

        buttonDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete1.setBorder(null);
        buttonDelete1.setFocusable(false);
        buttonDelete1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(buttonDelete1);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jLabel1.setText("Task:");

        jLabel2.setText("Course");

        jLabel3.setText("Status");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelNotStartedLayout = new javax.swing.GroupLayout(jpanelNotStarted);
        jpanelNotStarted.setLayout(jpanelNotStartedLayout);
        jpanelNotStartedLayout.setHorizontalGroup(
            jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                        .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jpanelNotStartedLayout.setVerticalGroup(
            jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Not Started", jpanelNotStarted);

        jpanelProgress.setBackground(new java.awt.Color(239, 237, 231));

        tableInProgress.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableInProgress);

        jToolBar2.setBackground(new java.awt.Color(239, 237, 231));
        jToolBar2.setRollover(true);

        buttonAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/add.png"))); // NOI18N
        buttonAdd2.setFocusable(false);
        buttonAdd2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdd2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(buttonAdd2);

        buttonEdit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/edit.png"))); // NOI18N
        buttonEdit2.setFocusable(false);
        buttonEdit2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(buttonEdit2);

        buttonDelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete2.setFocusable(false);
        buttonDelete2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(buttonDelete2);

        javax.swing.GroupLayout jpanelProgressLayout = new javax.swing.GroupLayout(jpanelProgress);
        jpanelProgress.setLayout(jpanelProgressLayout);
        jpanelProgressLayout.setHorizontalGroup(
            jpanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProgressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jpanelProgressLayout.setVerticalGroup(
            jpanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProgressLayout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("In Progress", jpanelProgress);

        jPanelCompleted.setBackground(new java.awt.Color(239, 237, 231));

        tableCompleted.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableCompleted);

        jToolBar3.setBackground(new java.awt.Color(239, 237, 231));
        jToolBar3.setRollover(true);

        buttonAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/add.png"))); // NOI18N
        buttonAdd3.setFocusable(false);
        buttonAdd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdd3.setIconTextGap(0);
        buttonAdd3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd3ActionPerformed(evt);
            }
        });
        jToolBar3.add(buttonAdd3);

        buttonEdit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/edit.png"))); // NOI18N
        buttonEdit3.setFocusable(false);
        buttonEdit3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(buttonEdit3);

        buttonDelete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete3.setFocusable(false);
        buttonDelete3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(buttonDelete3);

        javax.swing.GroupLayout jPanelCompletedLayout = new javax.swing.GroupLayout(jPanelCompleted);
        jPanelCompleted.setLayout(jPanelCompletedLayout);
        jPanelCompletedLayout.setHorizontalGroup(
            jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompletedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanelCompletedLayout.setVerticalGroup(
            jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompletedLayout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Completed", jPanelCompleted);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdd3ActionPerformed

    private void buttonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd1ActionPerformed

    }//GEN-LAST:event_buttonAdd1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd1;
    private javax.swing.JButton buttonAdd2;
    private javax.swing.JButton buttonAdd3;
    private javax.swing.JButton buttonDelete1;
    private javax.swing.JButton buttonDelete2;
    private javax.swing.JButton buttonDelete3;
    private javax.swing.JButton buttonEdit1;
    private javax.swing.JButton buttonEdit2;
    private javax.swing.JButton buttonEdit3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelCompleted;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JPanel jpanelNotStarted;
    private javax.swing.JPanel jpanelProgress;
    private javax.swing.JTable tableCompleted;
    private javax.swing.JTable tableInProgress;
    private javax.swing.JTable tableNotStarted;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        String columnNames[] = {"Description", "Course", "Due Date", "Time left"};
        DefaultTableModel dtmNotStarted = new DefaultTableModel();
        dtmNotStarted.setColumnIdentifiers(columnNames);
        this.tableNotStarted.setModel(dtmNotStarted);
        
        DefaultTableModel dtmInProgress = new DefaultTableModel();
        dtmNotStarted.setColumnIdentifiers(columnNames);
        this.tableInProgress.setModel(dtmInProgress);
        
        DefaultTableModel dtmCompleted = new DefaultTableModel();
        dtmNotStarted.setColumnIdentifiers(columnNames);
        this.tableCompleted.setModel(dtmCompleted);
        

        ArrayList<Task> studentTasks = taskD.getDatafromID(this.userID);

        for (Task task : studentTasks) {
            switch (task.getStatus()) {
                case NotStarted:
                    Object[] row1 = new Object[]{
                        task.getDescription(),
                        task.getClass(),
                        task.getDueDate(),
                        task.getTimeLeft()
                    };
                    dtmNotStarted.addRow(row1);
                case InProgress:
                    Object[] row2 = new Object[]{
                        task.getDescription(),
                        task.getClass(),
                        task.getDueDate(),
                        task.getTimeLeft()
                    };
                    dtmInProgress.addRow(row2);
                case Completed:
                    Object[] row3 = new Object[]{
                        task.getDescription(),
                        task.getClass(),
                        task.getDueDate(),
                        task.getTimeLeft()
                    };
                    dtmInProgress.addRow(row3);
            }
        }

    }

    private void fillCbCourses() {
        // this.fillcourseNames();
        ArrayList<Course> courses = courseD.getData();
        for (Course course : courses) {
            jComboBox2.addItem(course.getName());
        }
    }

    private void fillCbStatus() {
        jComboBox1.addItem("NotCompleted");
        jComboBox1.addItem("InProgress");
    }
   
    public void fillcourseNames() {
        courseNames.add("asignatura 1");
        courseNames.add("asignatura 2");
        courseNames.add("asignatura 3");
        courseNames.add("asignatura 4");
        courseNames.add("asignatura 5");
        courseNames.add("asignatura 6");
        for (String cName : courseNames) {
            courseD.saveCourse(cName);
        }
    }
}
