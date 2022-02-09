/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

import Controllers.ControllerUser;
import Objects.User;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author João Lucas Silva Solano
 */
public class TelaLogin extends javax.swing.JFrame {

    //Variáveis que pertencem ao código de movimentação do jFrame
    String data;
    String path;

    public TelaLogin() throws Exception {
        initComponents();

        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        setLocationRelativeTo(null); //Para o jFrame ser gerado no centro da tela

    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("px.png")));
    }

    public static void visiblePanel(JPanel j1) {
        j1.setVisible(true);
    } //Deixar visível a tela a ser exibida

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        bgPrenha = new javax.swing.ButtonGroup();
        bgVacinado = new javax.swing.ButtonGroup();
        bgCastrado = new javax.swing.ButtonGroup();
        bgDoente = new javax.swing.ButtonGroup();
        bgAcidentado = new javax.swing.ButtonGroup();
        bgComunitario = new javax.swing.ButtonGroup();
        jpBackground = new javax.swing.JPanel();
        jlbMinimizar = new javax.swing.JLabel();
        jlbExit = new javax.swing.JLabel();
        move = new javax.swing.JLabel();
        jpScreen = new javax.swing.JPanel();
        Adm = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Images/patinhaMetal128.png")).getImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(50, 50));

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));
        jpBackground.setName(""); // NOI18N
        jpBackground.setPreferredSize(new java.awt.Dimension(1000, 600));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbMinimizar.setForeground(new java.awt.Color(56, 0, 56));
        jlbMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconMinimizar.png"))); // NOI18N
        jlbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbMinimizarMouseClicked(evt);
            }
        });
        jpBackground.add(jlbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 20, 20));

        jlbExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbExit.setForeground(new java.awt.Color(56, 0, 56));
        jlbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconExit (6).png"))); // NOI18N
        jlbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbExitMouseClicked(evt);
            }
        });
        jpBackground.add(jlbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, 20));

        move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/barMove.png"))); // NOI18N
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveMousePressed(evt);
            }
        });
        jpBackground.add(move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 20));

        jpScreen.setBackground(new java.awt.Color(255, 255, 255));
        jpScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adm.setBackground(new java.awt.Color(255, 255, 255));
        Adm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(56, 0, 56));
        Adm.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 440, 5));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(56, 0, 56));
        jLabel14.setText("E-Mail");
        Adm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, 60));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(56, 0, 56));
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        txtEmail.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 360, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(56, 0, 56));
        jLabel17.setText("Senha");
        Adm.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, 60));

        pswSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pswSenha.setForeground(new java.awt.Color(56, 0, 56));
        pswSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        pswSenha.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(pswSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 360, 60));

        jPanel6.setBackground(new java.awt.Color(56, 0, 56));
        Adm.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 440, 5));

        btnCadastro.setBackground(new java.awt.Color(56, 0, 56));
        btnCadastro.setPreferredSize(new java.awt.Dimension(80, 40));
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastroMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Entrar");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setPreferredSize(new java.awt.Dimension(58, 16));

        javax.swing.GroupLayout btnCadastroLayout = new javax.swing.GroupLayout(btnCadastro);
        btnCadastro.setLayout(btnCadastroLayout);
        btnCadastroLayout.setHorizontalGroup(
            btnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCadastroLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        btnCadastroLayout.setVerticalGroup(
            btnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCadastroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        Adm.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));
        Adm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(56, 0, 56));
        jLabel20.setText("LOGIN");
        Adm.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, 70));

        jpScreen.add(Adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 730, 400));

        jpBackground.add(jpScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(56, 0, 56));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconRecantoDosAnimaisPng.png"))); // NOI18N
        jpBackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed

    }//GEN-LAST:event_moveMousePressed

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged

    }//GEN-LAST:event_moveMouseDragged

    //Botão de exit do programa
    private void jlbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlbExitMouseClicked

    private void jlbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlbMinimizarMouseClicked
    User u = new User();
    private void btnCadastroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMousePressed
        ControllerUser cUser = new ControllerUser();

        String email = txtEmail.getText();
        String senha = pswSenha.getText();
        u.setEmail(email);
        u.setSenha(senha);
        try {
            boolean b = cUser.checkLogin(u);

            TelaMenu menu = new TelaMenu();

            if (b) {
                menu.setVisible(true);
                this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Login Falhou");
            }

        } catch (Exception ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastroMousePressed

    private void getDate() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = dateFormat.format(date);
        data = strDate;
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(186, 46, 186));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(153, 0, 153));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaLogin().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adm;
    private javax.swing.ButtonGroup bgAcidentado;
    private javax.swing.ButtonGroup bgCastrado;
    private javax.swing.ButtonGroup bgComunitario;
    private javax.swing.ButtonGroup bgDoente;
    private javax.swing.ButtonGroup bgPrenha;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.ButtonGroup bgVacinado;
    private javax.swing.JPanel btnCadastro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbExit;
    private javax.swing.JLabel jlbMinimizar;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpScreen;
    private javax.swing.JLabel move;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

}
