/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author baDcoder
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public static studentInfo studentPage=null;
    public static teacherInfo teacherPage=null;
    public static contact_info contactPage=null;
    public static examInfo examPage=null;
    public static staff_info staffPage=null;
    
    public homePage() {
        initComponents();
        currentDate();
    }
    
    public void currentDate()
    {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        date.setText("Today:: "+day+"/"+(month+1)+"/"+year);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        date = new javax.swing.JMenu();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 625));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Student Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 60, 201, 48);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Teacher Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 130, 208, 48);

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Exam Page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(250, 200, 216, 49);

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton9.setText("Contact Info Page");
        jButton9.setPreferredSize(new java.awt.Dimension(157, 37));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(480, 350, 270, 50);

        staff.setBackground(new java.awt.Color(51, 0, 51));
        staff.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        staff.setForeground(new java.awt.Color(153, 153, 0));
        staff.setText("Stuff Page");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        getContentPane().add(staff);
        staff.setBounds(360, 280, 201, 49);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mis/resource/mis1 (1).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 970, 630);

        jMenu1.setText("logout");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        date.setText("date");
        jMenuBar1.add(date);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (studentPage==null)
        {
            studentPage=new studentInfo(connectDb.ConnectDb());
            studentPage.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null,"Page already opened!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if (teacherPage==null)
        {
            teacherPage=new teacherInfo(connectDb.ConnectDb());
            teacherPage.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null,"Page already opened!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (examPage==null)
        {
            examPage=new examInfo(connectDb.ConnectDb());
            examPage.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null,"Page already opened!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (contactPage==null)
        {
            contactPage=new contact_info(connectDb.ConnectDb());
            contactPage.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null,"Page already opened!");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
       if (staffPage==null)
        {
            staffPage=new staff_info(connectDb.ConnectDb());
            staffPage.setVisible(true);
        }
        else JOptionPane.showMessageDialog(null,"Page already opened!");
    }//GEN-LAST:event_staffActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        new login().setVisible(true);
        if (studentPage!=null) studentPage.dispose();
        if (teacherPage!=null) teacherPage.dispose();
        if (contactPage!=null) contactPage.dispose();
        if (staffPage!=null) staffPage.dispose();
        if (examPage!=null) examPage.dispose();
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseEntered
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton staff;
    // End of variables declaration//GEN-END:variables
}
