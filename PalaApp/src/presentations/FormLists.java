/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentations;

import data.CourseDao;
import data.CourseTaskDao;
import data.TaskDao;
import entities.Course;
import entities.CourseTask;
import entities.StatusTask;
import entities.Task;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    CourseTaskDao ctD = new CourseTaskDao();
    ArrayList<String> courseNames = new ArrayList<>();

    public FormLists(int id) {
        initComponents();
        userID = id;
        this.fillTable();
        this.fillCbCourses();
        this.fillCbStatus();
        this.fieldTask1.requestFocus();

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
        jLabel1 = new javax.swing.JLabel();
        fieldTask1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbStatus1 = new javax.swing.JComboBox<>();
        cbCourse1 = new javax.swing.JComboBox<>();
        jpanelProgress = new javax.swing.JPanel();
        jpanelNotStarted1 = new javax.swing.JPanel();
        jToolBar4 = new javax.swing.JToolBar();
        buttonEdit4 = new javax.swing.JButton();
        buttonDelete4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fieldTask2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbStatus2 = new javax.swing.JComboBox<>();
        cbCourse2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInProgress = new javax.swing.JTable();
        jPanelCompleted = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCompleted = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        buttonEdit3 = new javax.swing.JButton();
        buttonDelete3 = new javax.swing.JButton();
        jpanelNotStarted2 = new javax.swing.JPanel();
        cbCourse3 = new javax.swing.JComboBox<>();
        cbStatus3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldTask3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jToolBar5 = new javax.swing.JToolBar();
        buttonAdd5 = new javax.swing.JButton();
        buttonEdit5 = new javax.swing.JButton();
        buttonDelete5 = new javax.swing.JButton();

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
        tableNotStarted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNotStartedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNotStarted);

        jToolBar1.setBackground(new java.awt.Color(239, 237, 231));
        jToolBar1.setRollover(true);

        buttonAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/add.png"))); // NOI18N
        buttonAdd1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        buttonEdit1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEdit1.setFocusable(false);
        buttonEdit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEdit1ActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonEdit1);

        buttonDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDelete1.setFocusable(false);
        buttonDelete1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDelete1ActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonDelete1);

        jLabel1.setText("Task:");

        jLabel2.setText("Course");

        jLabel3.setText("Status");

        cbCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCourse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelNotStartedLayout = new javax.swing.GroupLayout(jpanelNotStarted);
        jpanelNotStarted.setLayout(jpanelNotStartedLayout);
        jpanelNotStartedLayout.setHorizontalGroup(
            jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                        .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldTask1)
                            .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                                .addComponent(cbCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelNotStartedLayout.setVerticalGroup(
            jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStartedLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStartedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Not Started", jpanelNotStarted);

        jpanelProgress.setBackground(new java.awt.Color(239, 237, 231));

        jpanelNotStarted1.setBackground(new java.awt.Color(239, 237, 231));

        jToolBar4.setBackground(new java.awt.Color(239, 237, 231));
        jToolBar4.setRollover(true);

        buttonEdit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/edit.png"))); // NOI18N
        buttonEdit4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEdit4.setFocusable(false);
        buttonEdit4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(buttonEdit4);

        buttonDelete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDelete4.setFocusable(false);
        buttonDelete4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(buttonDelete4);

        jLabel4.setText("Task:");

        jLabel5.setText("Course");

        jLabel6.setText("Status");

        cbCourse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCourse2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jpanelNotStarted1Layout = new javax.swing.GroupLayout(jpanelNotStarted1);
        jpanelNotStarted1.setLayout(jpanelNotStarted1Layout);
        jpanelNotStarted1Layout.setHorizontalGroup(
            jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStarted1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelNotStarted1Layout.createSequentialGroup()
                        .addGroup(jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldTask2)
                            .addGroup(jpanelNotStarted1Layout.createSequentialGroup()
                                .addComponent(cbCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpanelNotStarted1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelNotStarted1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jpanelNotStarted1Layout.setVerticalGroup(
            jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStarted1Layout.createSequentialGroup()
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldTask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStarted1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelProgressLayout = new javax.swing.GroupLayout(jpanelProgress);
        jpanelProgress.setLayout(jpanelProgressLayout);
        jpanelProgressLayout.setHorizontalGroup(
            jpanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelNotStarted1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelProgressLayout.setVerticalGroup(
            jpanelProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelProgressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelNotStarted1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        buttonEdit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/edit.png"))); // NOI18N
        buttonEdit3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEdit3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(buttonEdit3);

        buttonDelete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDelete3.setFocusable(false);
        buttonDelete3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(buttonDelete3);

        jpanelNotStarted2.setBackground(new java.awt.Color(239, 237, 231));

        cbCourse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCourse3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Status");

        jLabel8.setText("Course");

        fieldTask3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTask3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Task:");

        jToolBar5.setBackground(new java.awt.Color(239, 237, 231));
        jToolBar5.setRollover(true);

        buttonAdd5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/add.png"))); // NOI18N
        buttonAdd5.setBorder(null);
        buttonAdd5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdd5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdd5ActionPerformed(evt);
            }
        });
        jToolBar5.add(buttonAdd5);

        buttonEdit5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/edit.png"))); // NOI18N
        buttonEdit5.setBorder(null);
        buttonEdit5.setFocusable(false);
        buttonEdit5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(buttonEdit5);

        buttonDelete5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentations/icons/Eliminar.png"))); // NOI18N
        buttonDelete5.setBorder(null);
        buttonDelete5.setFocusable(false);
        buttonDelete5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDelete5ActionPerformed(evt);
            }
        });
        jToolBar5.add(buttonDelete5);

        javax.swing.GroupLayout jpanelNotStarted2Layout = new javax.swing.GroupLayout(jpanelNotStarted2);
        jpanelNotStarted2.setLayout(jpanelNotStarted2Layout);
        jpanelNotStarted2Layout.setHorizontalGroup(
            jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStarted2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelNotStarted2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 404, Short.MAX_VALUE))
                    .addGroup(jpanelNotStarted2Layout.createSequentialGroup()
                        .addGroup(jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldTask3)
                            .addGroup(jpanelNotStarted2Layout.createSequentialGroup()
                                .addComponent(cbCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jpanelNotStarted2Layout.setVerticalGroup(
            jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelNotStarted2Layout.createSequentialGroup()
                .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldTask3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelNotStarted2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCompletedLayout = new javax.swing.GroupLayout(jPanelCompleted);
        jPanelCompleted.setLayout(jPanelCompletedLayout);
        jPanelCompletedLayout.setHorizontalGroup(
            jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompletedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCompletedLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCompletedLayout.createSequentialGroup()
                    .addComponent(jpanelNotStarted2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelCompletedLayout.setVerticalGroup(
            jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompletedLayout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanelCompletedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCompletedLayout.createSequentialGroup()
                    .addComponent(jpanelNotStarted2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Completed", jPanelCompleted);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd1ActionPerformed

        try {
            String taskDesc = fieldTask1.getText();
            StatusTask status = StatusTask.valueOf(cbStatus1.getSelectedItem().toString());
            String course = cbCourse1.getSelectedItem().toString();

            if (taskDesc.equals("")) {
                JOptionPane.showMessageDialog(
                        this,
                        "Please write a task",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                this.fieldTask1.requestFocus();
            } else {

                Task a = new Task(
                        this.userID,
                        taskDesc,
                        status
                );
                if (taskD.saveTask(a)) {
                    JOptionPane.showMessageDialog(this, "Task saved",
                            "task", JOptionPane.INFORMATION_MESSAGE);

                    this.fieldTask1.setText("");
                    this.fieldTask1.requestFocus();
                    savetoCourseTask(a, course);
                    fillTable();
                } else {
                    JOptionPane.showMessageDialog(this, "There was an error",
                            "task", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "There was an error",
                    "task", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAdd1ActionPerformed

    private void cbCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCourse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCourse1ActionPerformed

    private void cbCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCourse2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCourse2ActionPerformed

    private void buttonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDelete1ActionPerformed
        String cName = this.fieldTask1.getText();
        if (cName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select something", ":/", JOptionPane.ERROR_MESSAGE);
        } else {
            taskD.deleteTask(cName);
        }
        this.fillTable();
        this.fieldTask1.setText("");
        this.fieldTask1.requestFocus();
    }//GEN-LAST:event_buttonDelete1ActionPerformed

    private void tableNotStartedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNotStartedMouseClicked
        // TODO add your handling code here:
        this.tableNotStarted.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 1) {
                    getData();
                }
            }
        });
    }//GEN-LAST:event_tableNotStartedMouseClicked

    private void buttonEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEdit1ActionPerformed
        // TODO add your handling code here:
        int row = this.tableNotStarted.getSelectedRow();
        String cName = tableNotStarted.getValueAt(row, 0).toString();
        String taskdesc = this.fieldTask1.getText();
        if (taskdesc.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select something", ":/", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = taskD.getTaskID(cName);
            StatusTask status = StatusTask.valueOf(cbStatus1.getSelectedItem().toString());
            Task tasky = new Task(id, this.userID, taskdesc, status);
            taskD.editTask(tasky);
        }
        this.fillTable();
        this.fieldTask1.setText("");
        this.fieldTask1.requestFocus();
    }//GEN-LAST:event_buttonEdit1ActionPerformed

    private void cbCourse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCourse3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCourse3ActionPerformed

    private void fieldTask3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTask3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTask3ActionPerformed

    private void buttonDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDelete5ActionPerformed
        // TODO add your handling code here:
        String cName = fieldTask1.getText();
        if (cName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please select something", ":/", JOptionPane.ERROR_MESSAGE);
        } else {
            taskD.deleteTask(cName);
        }
        this.fillTable();
    }//GEN-LAST:event_buttonDelete5ActionPerformed

    private void buttonAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdd5ActionPerformed

    }//GEN-LAST:event_buttonAdd5ActionPerformed

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

    private void getData() {
        int row = this.tableNotStarted.getSelectedRow();
        String cName = tableNotStarted.getValueAt(row, 0).toString();
        fieldTask1.setText(cName);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd1;
    private javax.swing.JButton buttonAdd5;
    private javax.swing.JButton buttonDelete1;
    private javax.swing.JButton buttonDelete3;
    private javax.swing.JButton buttonDelete4;
    private javax.swing.JButton buttonDelete5;
    private javax.swing.JButton buttonEdit1;
    private javax.swing.JButton buttonEdit3;
    private javax.swing.JButton buttonEdit4;
    private javax.swing.JButton buttonEdit5;
    private javax.swing.JComboBox<String> cbCourse1;
    private javax.swing.JComboBox<String> cbCourse2;
    private javax.swing.JComboBox<String> cbCourse3;
    private javax.swing.JComboBox<String> cbStatus1;
    private javax.swing.JComboBox<String> cbStatus2;
    private javax.swing.JComboBox<String> cbStatus3;
    private javax.swing.JTextField fieldTask1;
    private javax.swing.JTextField fieldTask2;
    private javax.swing.JTextField fieldTask3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCompleted;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JPanel jpanelNotStarted;
    private javax.swing.JPanel jpanelNotStarted1;
    private javax.swing.JPanel jpanelNotStarted2;
    private javax.swing.JPanel jpanelProgress;
    private javax.swing.JTable tableCompleted;
    private javax.swing.JTable tableInProgress;
    private javax.swing.JTable tableNotStarted;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        String columnNames[] = {"Description", "Course"};
        DefaultTableModel dtmNotStarted = new DefaultTableModel();
        dtmNotStarted.setColumnIdentifiers(columnNames);
        this.tableNotStarted.setModel(dtmNotStarted);

        DefaultTableModel dtmInProgress = new DefaultTableModel();
        dtmInProgress.setColumnIdentifiers(columnNames);
        this.tableInProgress.setModel(dtmInProgress);

        DefaultTableModel dtmCompleted = new DefaultTableModel();
        dtmCompleted.setColumnIdentifiers(columnNames);

        this.tableCompleted.setModel(dtmCompleted);

        ArrayList<Course> courses = courseD.getCourseStdID(userID);
        ArrayList<Task> tasksfromCourse = new ArrayList<>();

        for (Course c : courses) {
            int idCourse = c.getID();
            tasksfromCourse = ctD.getTasksfromCourseID(idCourse, userID);
            for (Task task : tasksfromCourse) {

                switch (task.getStatus()) {
                    case NotStarted:
                        Object[] row1 = new Object[]{
                            task.getDescription(),
                            c.getName()
                        };
                        dtmNotStarted.addRow(row1);
                    case InProgress:
                        Object[] row2 = new Object[]{
                            task.getDescription(),
                            c.getName()
                        };
                        dtmInProgress.addRow(row2);
                    case Completed:
                        Object[] row3 = new Object[]{
                            task.getDescription(),
                            c.getName()
                        };
                        dtmCompleted.addRow(row3);

                }

            }

        }
    }

    private void fillCbCourses() {

        // this.fillcourseNames();
        ArrayList<Course> courses = courseD.getCourseStdID(userID);
        for (Course course : courses) {
            cbCourse1.addItem(course.getName());
            cbCourse2.addItem(course.getName());
            cbCourse3.addItem(course.getName());

        }
    }

    private void fillCbStatus() {
        cbStatus1.addItem("Select Status");
        cbStatus1.addItem("NotStarted");
        cbStatus1.addItem("InProgress");
        cbStatus1.addItem("Completed");
        cbStatus2.addItem("Select Status");
        cbStatus2.addItem("NotStarted");
        cbStatus2.addItem("InProgress");
        cbStatus2.addItem("Completed");
        cbStatus3.addItem("Select Status");
        cbStatus3.addItem("NotStarted");
        cbStatus3.addItem("InProgress");
        cbStatus3.addItem("Completed");
    }

    private void savetoCourseTask(Task a, String c) {
        int courseID = courseD.getCourseID(c);
        int taskID = taskD.getTaskID(a.getDescription());
        if (courseID != 0 && taskID != 0) {
            CourseTask ct = new CourseTask(courseID, taskID);
            ctD.saveCT(ct);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "A mistake happened, try again later",
                    "Oh no...",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
