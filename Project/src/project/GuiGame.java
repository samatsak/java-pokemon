/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KMT
 */
public class GuiGame extends javax.swing.JFrame {

    /**
     * Creates new form GuiGame
     */
    public static int ran;
    public static boolean item[] = new boolean[5];
    public static boolean boss[] = new boolean[2];

    public GuiGame() {
        initComponents();
        jTextField1.setText(GuiBattle.hero[0] + "");
        jTextField2.setText(GuiBattle.hero[1] + "");
        jTextField3.setText(GuiBattle.hero[4] + "");
        jTextField4.setText(GuiBattle.hero[3] + "");
        jTextField5.setText(GuiBattle.hero[2] + "");
        jTextField6.setText(GuiBattle.hero[6] + "");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(GuiBattle.hero[7], GuiBattle.hero[8], 30, 40);
        
        if (GuiBattle.hero[0] < 10) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg.jpg"))); // NOI18N
            getContentPane().add(jLabel1);
            jLabel1.setBounds(0, 0, 500, 400);

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg2.png"))); // NOI18N
            getContentPane().add(jLabel3);
            jLabel3.setBounds(80, 270, 60, 50);
        }else if (GuiBattle.hero[0] == 10) {
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg2.png"))); // NOI18N
            getContentPane().add(jLabel3);
            jLabel3.setBounds(80, 270, 60, 50);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg.jpg"))); // NOI18N
            getContentPane().add(jLabel1);
            jLabel1.setBounds(0, 0, 500, 400);
        }
        
        if (!item[0]) {
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
            getContentPane().add(jLabel12);
            jLabel12.setBounds(40, 170, 26, 26);
        }
        if (!item[1]) {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
            getContentPane().add(jLabel13);
            jLabel13.setBounds(150, 50, 26, 26);
        }
        if (!item[2]) {
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
            getContentPane().add(jLabel14);
            jLabel14.setBounds(420, 30, 26, 26);
        }
        if (!item[3]) {
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
            getContentPane().add(jLabel15);
            jLabel15.setBounds(430, 210, 26, 26);
        }
        if (!item[4]) {
            jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/sword.png"))); // NOI18N
            getContentPane().add(jLabel16);
            jLabel16.setBounds(40, 320, 40, 50);
        }
        if (!boss[0]) {
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/miniboss.png"))); // NOI18N
            getContentPane().add(jLabel10);
            jLabel10.setBounds(240, 230, 26, 26);
        }
        if (!boss[1]) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/boss.png"))); // NOI18N
            getContentPane().add(jLabel11);
            jLabel11.setBounds(420, 340, 26, 26);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Start");
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 57, 23);

        jLabel4.setText("LV");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 414, 34, 20);

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(60, 410, 60, 30);

        jLabel5.setText("HP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 414, 40, 20);

        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 410, 60, 30);

        jLabel6.setText("ATK");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 414, 30, 20);

        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 410, 60, 30);

        jLabel7.setText("EXP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 414, 30, 20);

        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(400, 410, 60, 30);

        jLabel8.setText("ARMOR");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 454, 50, 20);

        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(60, 460, 60, 30);

        jLabel9.setText("HpPotion");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 460, 60, 20);

        jTextField6.setEnabled(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(200, 460, 60, 30);

        jButton2.setText("SaveGame");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 460, 100, 23);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 0, 60, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 180, 30, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 270, 60, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/miniboss.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 230, 26, 26);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/boss.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(420, 340, 26, 26);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 170, 26, 26);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(150, 50, 26, 26);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(420, 30, 26, 26);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(430, 210, 26, 26);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/sword.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 320, 40, 50);

        setSize(new java.awt.Dimension(516, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

        if (evt.getKeyCode() == evt.VK_W) {
            ran = (int) (Math.random() * 21);
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha4.png"))); // NOI18N
            GuiBattle.hero[8] -= 10;
        }
        if (evt.getKeyCode() == evt.VK_S) {
            ran = (int) (Math.random() * 21);
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha1.png"))); // NOI18N
            GuiBattle.hero[8] += 10;
        }
        if (evt.getKeyCode() == evt.VK_A) {
            ran = (int) (Math.random() * 21);
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha2.png"))); // NOI18N
            GuiBattle.hero[7] -= 10;
        }
        if (evt.getKeyCode() == evt.VK_D) {
            ran = (int) (Math.random() * 21);
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha3.png"))); // NOI18N
            GuiBattle.hero[7] += 10;
        }

        if (ran == 10) {
            ran = 0;
            if (jLabel2.getBounds().x >= 30 && jLabel2.getBounds().x <= 240 && jLabel2.getBounds().y <= 180) {
                ran = (int) (Math.random() * 3);
            } else if (jLabel2.getBounds().x >= 250 && jLabel2.getBounds().x <= 440 && jLabel2.getBounds().y <= 180) {
                ran = (int) (Math.random() * 6);
            } else if (jLabel2.getBounds().x >= 30 && jLabel2.getBounds().y >= 190) {
                ran = (int) (Math.random() * 10);
            }
            GuiBattle bt = new GuiBattle();
            bt.setVisible(true);
            this.setVisible(false);
        }

        if ((jLabel2.getBounds().y <= 10)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().y >= 340)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x <= 20)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 450)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 70) && (jLabel2.getBounds().x <= 80) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 10)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 70) && (jLabel2.getBounds().x <= 130) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 80)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 120) && (jLabel2.getBounds().x <= 130) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 10)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 170) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 10)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 220) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 80)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 210) && (jLabel2.getBounds().x <= 220) && (jLabel2.getBounds().y <= 80) && (jLabel2.getBounds().y >= 60)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 230) && (jLabel2.getBounds().x <= 300) && (jLabel2.getBounds().y <= 60) && (jLabel2.getBounds().y >= 50)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 300) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 60) && (jLabel2.getBounds().y >= 10)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 440) && (jLabel2.getBounds().y <= 50) && (jLabel2.getBounds().y >= 40)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 350) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 50)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 440) && (jLabel2.getBounds().y <= 90) && (jLabel2.getBounds().y >= 80)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 20) && (jLabel2.getBounds().x <= 60) && (jLabel2.getBounds().y <= 190) && (jLabel2.getBounds().y >= 180)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 70) && (jLabel2.getBounds().y <= 190) && (jLabel2.getBounds().y >= 150)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 130) && (jLabel2.getBounds().y <= 160) && (jLabel2.getBounds().y >= 150)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 110) && (jLabel2.getBounds().x <= 120) && (jLabel2.getBounds().y <= 230) && (jLabel2.getBounds().y >= 160)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 120) && (jLabel2.getBounds().y >= 110)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 170) && (jLabel2.getBounds().y <= 200) && (jLabel2.getBounds().y >= 120)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 300) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 240) && (jLabel2.getBounds().y >= 120)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 350) && (jLabel2.getBounds().y <= 200) && (jLabel2.getBounds().y >= 120)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 400) && (jLabel2.getBounds().y <= 120) && (jLabel2.getBounds().y >= 110)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 390) && (jLabel2.getBounds().x <= 400) && (jLabel2.getBounds().y <= 200) && (jLabel2.getBounds().y >= 120)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 400) && (jLabel2.getBounds().y <= 200) && (jLabel2.getBounds().y >= 190)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 250) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 240) && (jLabel2.getBounds().y >= 230)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 260) && (jLabel2.getBounds().x <= 270) && (jLabel2.getBounds().y <= 240) && (jLabel2.getBounds().y >= 200)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 270) && (jLabel2.getBounds().y <= 200) && (jLabel2.getBounds().y >= 190)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 220) && (jLabel2.getBounds().y <= 230) && (jLabel2.getBounds().y >= 220)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 210) && (jLabel2.getBounds().x <= 220) && (jLabel2.getBounds().y <= 270) && (jLabel2.getBounds().y >= 230)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 210) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 270) && (jLabel2.getBounds().y >= 260)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 300) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 300) && (jLabel2.getBounds().y >= 270)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 310) && (jLabel2.getBounds().y <= 310) && (jLabel2.getBounds().y >= 300)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 160) && (jLabel2.getBounds().x <= 170) && (jLabel2.getBounds().y <= 310) && (jLabel2.getBounds().y >= 240)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 440) && (jLabel2.getBounds().y <= 230) && (jLabel2.getBounds().y >= 220)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
            GuiBattle.hero[8] -= 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 350) && (jLabel2.getBounds().y <= 310) && (jLabel2.getBounds().y >= 240)) {
            jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] -= 10;
        } else if ((jLabel2.getBounds().x >= 340) && (jLabel2.getBounds().x <= 440) && (jLabel2.getBounds().y <= 310) && (jLabel2.getBounds().y >= 300)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 120) && (jLabel2.getBounds().y <= 240) && (jLabel2.getBounds().y >= 230)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        } else if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 70) && (jLabel2.getBounds().y <= 270) && (jLabel2.getBounds().y >= 230)) {
            jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
            GuiBattle.hero[7] += 10;
        } else if ((jLabel2.getBounds().x >= 30) && (jLabel2.getBounds().x <= 70) && (jLabel2.getBounds().y <= 270) && (jLabel2.getBounds().y >= 260)) {
            jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y + 10, 30, 40);
            GuiBattle.hero[8] += 10;
        }
        
        if (GuiBattle.hero[0] < 10) {
            if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 120) && (jLabel2.getBounds().y <= 270) && (jLabel2.getBounds().y >= 260)) {
                jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
                GuiBattle.hero[8] -= 10;
            } else if ((jLabel2.getBounds().x >= 110) && (jLabel2.getBounds().x <= 120) && (jLabel2.getBounds().y <= 340) && (jLabel2.getBounds().y >= 270)) {
                jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
                GuiBattle.hero[7] += 10;
            } else if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 70) && (jLabel2.getBounds().y <= 340) && (jLabel2.getBounds().y >= 270)) {
                jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
                GuiBattle.hero[7] -= 10;
            }
        }else if (GuiBattle.hero[0] == 10) {
            if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 120) && (jLabel2.getBounds().y <= 300) && (jLabel2.getBounds().y >= 290)) {
                jLabel2.setBounds(jLabel2.getBounds().x, jLabel2.getBounds().y - 10, 30, 40);
                GuiBattle.hero[8] -= 10;
            } else if ((jLabel2.getBounds().x >= 110) && (jLabel2.getBounds().x <= 120) && (jLabel2.getBounds().y <= 330) && (jLabel2.getBounds().y >= 300)) {
                jLabel2.setBounds(jLabel2.getBounds().x + 10, jLabel2.getBounds().y, 30, 40);
                GuiBattle.hero[7] += 10;
            } else if ((jLabel2.getBounds().x >= 60) && (jLabel2.getBounds().x <= 70) && (jLabel2.getBounds().y <= 330) && (jLabel2.getBounds().y >= 300)) {
                jLabel2.setBounds(jLabel2.getBounds().x - 10, jLabel2.getBounds().y, 30, 40);
                GuiBattle.hero[7] -= 10;
            }
        }
        if ((jLabel2.getBounds().x == 40 && jLabel2.getBounds().y == 170) || (jLabel2.getBounds().x == 150 && jLabel2.getBounds().y == 50)
                || (jLabel2.getBounds().x == 420 && jLabel2.getBounds().y == 30) || (jLabel2.getBounds().x == 430 && jLabel2.getBounds().y == 210)
                || (jLabel2.getBounds().x == 40 && jLabel2.getBounds().y == 320) || (jLabel2.getBounds().x == 230 && jLabel2.getBounds().y == 230)
                || (jLabel2.getBounds().x == 430 && jLabel2.getBounds().y == 330)) {
            if (jLabel2.getBounds().x == 40 && jLabel2.getBounds().y == 170 && item[0]) {
                item[0] = false;
                GuiBattle.hero[6]++;
                JOptionPane.showMessageDialog(this, "You get a Potion");
            } else if (jLabel2.getBounds().x == 150 && jLabel2.getBounds().y == 50 && item[1]) {
                item[1] = false;
                JOptionPane.showMessageDialog(this, "You get a Potion");
                GuiBattle.hero[6]++;
            } else if (jLabel2.getBounds().x == 420 && jLabel2.getBounds().y == 30 && item[2]) {
                item[2] = false;
                JOptionPane.showMessageDialog(this, "You get a Potion");
                GuiBattle.hero[6]++;
            } else if (jLabel2.getBounds().x == 430 && jLabel2.getBounds().y == 210 && item[3]) {
                item[3] = false;
                JOptionPane.showMessageDialog(this, "You get a Potion");
                GuiBattle.hero[6]++;
            } else if (jLabel2.getBounds().x == 40 && jLabel2.getBounds().y == 320 && item[4]) {
                item[4] = false;
                GuiBattle.hero[4] = 40001;
                JOptionPane.showMessageDialog(this, "Your get THE LAST SWORD");
            } else if (jLabel2.getBounds().x == 230 && jLabel2.getBounds().y == 230 && boss[0]) {
                boss[0] = false;
                JOptionPane.showMessageDialog(this, "You found Metagross");
                ran = 10;
                GuiBattle bt = new GuiBattle();
                bt.setVisible(true);
                this.setVisible(false);
            } else if (jLabel2.getBounds().x == 430 && jLabel2.getBounds().y == 330 && boss[1]) {
                boss[1] = false;
                JOptionPane.showMessageDialog(this, "You found King Demon");
                ran = 11;
                GuiBattle bt = new GuiBattle();
                bt.setVisible(true);
                this.setVisible(false);
            }
            
            Play p = new Play();
            jTextField1.setText(GuiBattle.hero[0] + "");
            jTextField2.setText(GuiBattle.hero[1] + "");
            jTextField3.setText(GuiBattle.hero[4] + "");
            jTextField4.setText(GuiBattle.hero[3] + "");
            jTextField5.setText(GuiBattle.hero[2] + "");
            jTextField6.setText(GuiBattle.hero[6] + "");

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/Cha1.png"))); // NOI18N
            getContentPane().add(jLabel2);
            jLabel2.setBounds(GuiBattle.hero[7], GuiBattle.hero[8], 30, 40);
            
            if (GuiBattle.hero[0] < 10) {
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg.jpg"))); // NOI18N
                getContentPane().add(jLabel1);
                jLabel1.setBounds(0, 0, 500, 400);

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg2.png"))); // NOI18N
                getContentPane().add(jLabel3);
                jLabel3.setBounds(80, 270, 60, 50);
            } else if (GuiBattle.hero[0] == 10) {
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg2.png"))); // NOI18N
                getContentPane().add(jLabel3);
                jLabel3.setBounds(80, 270, 60, 50);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/bg.jpg"))); // NOI18N
                getContentPane().add(jLabel1);
                jLabel1.setBounds(0, 0, 500, 400);
            }
            
            if (!item[0]) {
                jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
                getContentPane().add(jLabel12);
                jLabel12.setBounds(40, 170, 26, 26);
            }
            if (!item[1]) {
                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
                getContentPane().add(jLabel13);
                jLabel13.setBounds(150, 50, 26, 26);
            }
            if (!item[2]) {
                jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
                getContentPane().add(jLabel14);
                jLabel14.setBounds(420, 30, 26, 26);
            }
            if (!item[3]) {
                jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/potion.png"))); // NOI18N
                getContentPane().add(jLabel15);
                jLabel15.setBounds(430, 210, 26, 26);
            }
            if (!item[4]) {
                jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/sword.png"))); // NOI18N
                getContentPane().add(jLabel16);
                jLabel16.setBounds(40, 320, 40, 50);
            }
            if (!boss[0]) {
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/miniboss.png"))); // NOI18N
                getContentPane().add(jLabel10);
                jLabel10.setBounds(240, 230, 26, 26);
            }
            if (!boss[1]) {
                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageJava2DGame/boss.png"))); // NOI18N
                getContentPane().add(jLabel11);
                jLabel11.setBounds(420, 340, 26, 26);
            }
            
        }

    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        Play p = new Play();

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GuiSaveGame gui = new GuiSaveGame();
        gui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}