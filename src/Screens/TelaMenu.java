/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

import Controllers.ControllerAnimal;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author João Lucas Silva Solano
 */
public class TelaMenu extends javax.swing.JFrame {

    //Variáveis que pertencem ao código de movimentação do jFrame
    private final CardLayout card;
    private final  JPanel panelCadastro;
    private  JPanel panelTabel;
    int xx, xy;
    String data;
    String path;
    ArrayList<JPanel> listPanels = new ArrayList<JPanel> ();
    

    ControllerAnimal cAnimal = new ControllerAnimal();
    
    
    public TelaMenu() throws Exception { 
        card = new CardLayout();
        panelCadastro = new TelaDeCadastroDeAnimais();
        panelTabel = new TelaDeCadastroDeAnimais();
        //panelTabel = new TelaTabelaDeAnimais();
        initComponents();
        
        for(LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
            if("Windows".equals(info.getName())){
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        
        startArrayList();
        cleanAll();
        
        

        setLocationRelativeTo(null); //Para o jFrame ser gerado no centro da tela
        resetColor(ListarAnimaisAdotados);
        resetColor(CadastrarAnimal1);
        resetColor(Sobre);
        resetColor(CadastrarAdm);
        
        jlbVoltar.setVisible(false);
        
        jspScreens.setVisible(false);
        jspScreens.getVerticalScrollBar().setUnitIncrement(10);

    }
    
    
    public void startArrayList(){
        listPanels.add(Adm);
        listPanels.add(User);
        listPanels.add(About);
        listPanels.add(Animals);
       
    } 
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("px.png")));
    }


    public static void visiblePanel(JPanel j1) {
        j1.setVisible(true);
    } //Deixar visível a tela a ser exibida

    public void cleanAll() {
        for(int cont = 0; cont<listPanels.size();cont++)
            listPanels.get(cont).setVisible(false); 
    }

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
        jlbVoltar = new javax.swing.JLabel();
        move = new javax.swing.JLabel();
        jpnTabel = new javax.swing.JPanel();
        jpLeftPanel = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        ListarAnimaisAdotados = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        CadastrarAnimal1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CadastrarAdm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Sobre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CadastrarUser1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jpTopPanel = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jpScreen = new javax.swing.JPanel();
        Animals = new javax.swing.JPanel();
        form1 = new javax.swing.JPanel();
        form2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jspScreens = new javax.swing.JScrollPane();
        panelScreens = new javax.swing.JPanel();
        About = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxEmail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pswSenha1 = new javax.swing.JPasswordField();
        pswConfSenha1 = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jpnFinalizar = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Adm = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        pswConfSenha = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jlbVoltar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbVoltar.setForeground(new java.awt.Color(56, 0, 56));
        jlbVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-divisa-circulada-à-esquerda-20.png"))); // NOI18N
        jlbVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbVoltarMouseClicked(evt);
            }
        });
        jpBackground.add(jlbVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

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

        jpnTabel.setOpaque(false);
        jpnTabel.setLayout(new java.awt.CardLayout());

        this.jpnTabel.setLayout(card);
        jpnTabel.add(panelCadastro, "panelTabel");

        jpBackground.add(jpnTabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1000, 580));

        jpLeftPanel.setBackground(new java.awt.Color(102, 0, 102));
        jpLeftPanel.setPreferredSize(new java.awt.Dimension(300, 600));
        jpLeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/IconRecantoDosAnimaisPng (2).png"))); // NOI18N
        jpLeftPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        ListarAnimaisAdotados.setBackground(new java.awt.Color(153, 0, 153));
        ListarAnimaisAdotados.setPreferredSize(new java.awt.Dimension(300, 50));
        ListarAnimaisAdotados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarAnimaisAdotadosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListarAnimaisAdotadosMousePressed(evt);
            }
        });

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconListPetsAdotados.png"))); // NOI18N

        jLabel56.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Tabelas");
        jLabel56.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout ListarAnimaisAdotadosLayout = new javax.swing.GroupLayout(ListarAnimaisAdotados);
        ListarAnimaisAdotados.setLayout(ListarAnimaisAdotadosLayout);
        ListarAnimaisAdotadosLayout.setHorizontalGroup(
            ListarAnimaisAdotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListarAnimaisAdotadosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel55)
                .addGap(5, 5, 5)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        ListarAnimaisAdotadosLayout.setVerticalGroup(
            ListarAnimaisAdotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListarAnimaisAdotadosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ListarAnimaisAdotadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jpLeftPanel.add(ListarAnimaisAdotados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        CadastrarAnimal1.setBackground(new java.awt.Color(186, 46, 186));
        CadastrarAnimal1.setPreferredSize(new java.awt.Dimension(300, 50));
        CadastrarAnimal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarAnimal1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CadastrarAnimal1MousePressed(evt);
            }
        });
        CadastrarAnimal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconRegisterPets.png"))); // NOI18N
        CadastrarAnimal1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Animais");
        jLabel4.setPreferredSize(new java.awt.Dimension(157, 30));
        CadastrarAnimal1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 215, 28));

        jpLeftPanel.add(CadastrarAnimal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        CadastrarAdm.setBackground(new java.awt.Color(153, 0, 153));
        CadastrarAdm.setPreferredSize(new java.awt.Dimension(300, 50));
        CadastrarAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarAdmMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CadastrarAdmMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconRegisterAdm.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastrar Administrador");
        jLabel2.setPreferredSize(new java.awt.Dimension(211, 30));

        javax.swing.GroupLayout CadastrarAdmLayout = new javax.swing.GroupLayout(CadastrarAdm);
        CadastrarAdm.setLayout(CadastrarAdmLayout);
        CadastrarAdmLayout.setHorizontalGroup(
            CadastrarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarAdmLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CadastrarAdmLayout.setVerticalGroup(
            CadastrarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarAdmLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(CadastrarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10))
        );

        jpLeftPanel.add(CadastrarAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        Sobre.setBackground(new java.awt.Color(153, 0, 153));
        Sobre.setPreferredSize(new java.awt.Dimension(300, 50));
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SobreMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconAbout.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sobre");
        jLabel8.setPreferredSize(new java.awt.Dimension(163, 30));

        javax.swing.GroupLayout SobreLayout = new javax.swing.GroupLayout(Sobre);
        Sobre.setLayout(SobreLayout);
        SobreLayout.setHorizontalGroup(
            SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SobreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SobreLayout.setVerticalGroup(
            SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SobreLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jpLeftPanel.add(Sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Open Sans SemiBold", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Recanto dos Animais");
        jLabel9.setPreferredSize(new java.awt.Dimension(203, 30));
        jpLeftPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, -1));

        CadastrarUser1.setBackground(new java.awt.Color(153, 0, 153));
        CadastrarUser1.setPreferredSize(new java.awt.Dimension(300, 50));
        CadastrarUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarUser1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CadastrarUser1MousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconRegisterUser.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cadastrar Usuário");
        jLabel12.setPreferredSize(new java.awt.Dimension(163, 30));

        javax.swing.GroupLayout CadastrarUser1Layout = new javax.swing.GroupLayout(CadastrarUser1);
        CadastrarUser1.setLayout(CadastrarUser1Layout);
        CadastrarUser1Layout.setHorizontalGroup(
            CadastrarUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastrarUser1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CadastrarUser1Layout.setVerticalGroup(
            CadastrarUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastrarUser1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(CadastrarUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jpLeftPanel.add(CadastrarUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        jPanel3.setPreferredSize(new java.awt.Dimension(280, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jpLeftPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel53.setBackground(new java.awt.Color(56, 0, 56));
        jpLeftPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 600));

        jpBackground.add(jpLeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpTopPanel.setBackground(new java.awt.Color(56, 0, 56));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Sem Título-7.png"))); // NOI18N

        javax.swing.GroupLayout jpTopPanelLayout = new javax.swing.GroupLayout(jpTopPanel);
        jpTopPanel.setLayout(jpTopPanelLayout);
        jpTopPanelLayout.setHorizontalGroup(
            jpTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpTopPanelLayout.setVerticalGroup(
            jpTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpBackground.add(jpTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 54, 700, 140));

        jpScreen.setBackground(new java.awt.Color(255, 255, 255));
        jpScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Animals.setBackground(new java.awt.Color(255, 255, 255));
        Animals.setPreferredSize(new java.awt.Dimension(700, 410));
        Animals.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form1.setBackground(new java.awt.Color(56, 0, 56));

        javax.swing.GroupLayout form1Layout = new javax.swing.GroupLayout(form1);
        form1.setLayout(form1Layout);
        form1Layout.setHorizontalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        form1Layout.setVerticalGroup(
            form1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Animals.add(form1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 440, 5));

        form2.setBackground(new java.awt.Color(56, 0, 56));

        javax.swing.GroupLayout form2Layout = new javax.swing.GroupLayout(form2);
        form2.setLayout(form2Layout);
        form2Layout.setHorizontalGroup(
            form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        form2Layout.setVerticalGroup(
            form2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Animals.add(form2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 440, 5));

        jLabel26.setFont(new java.awt.Font("Open Sans SemiBold", 0, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(56, 0, 56));
        jLabel26.setText("Tela de Animais");
        Animals.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 200, 40));
        Animals.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, 40));

        jspScreens.setBorder(null);
        jspScreens.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspScreens.setPreferredSize(new java.awt.Dimension(700, 310));

        panelScreens.setBackground(new java.awt.Color(255, 255, 255));
        panelScreens.setLayout(new java.awt.CardLayout());
        panelScreens.setSize(700, 310);

        this.panelScreens.setLayout(card);
        panelScreens.add(panelCadastro, "panelCadastro");

        jspScreens.setViewportView(panelScreens);

        Animals.add(jspScreens, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jpScreen.add(Animals, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        About.setBackground(new java.awt.Color(255, 255, 255));
        About.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(56, 0, 56));
        About.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 440, 5));

        jLabel34.setFont(new java.awt.Font("Open Sans SemiBold", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(56, 0, 56));
        jLabel34.setText("Sobre");
        About.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 70, 40));

        jLabel35.setBackground(new java.awt.Color(102, 204, 0));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(56, 0, 56));
        About.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 500, 220));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconRecantoDosAnimaisPng.png"))); // NOI18N
        About.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 100));

        jPanel11.setBackground(new java.awt.Color(56, 0, 56));
        About.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 440, 5));

        jLabel41.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(56, 0, 56));
        jLabel41.setText("-Recanto dos Animais");
        About.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));
        About.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, 40));

        jpScreen.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Open Sans SemiBold", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(56, 0, 56));
        jLabel20.setText("Cadastro de Usuários");
        User.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 230, 40));

        jPanel4.setBackground(new java.awt.Color(56, 0, 56));
        User.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 440, 5));

        jLabel21.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(56, 0, 56));
        jLabel21.setText("E-Mail");
        User.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        cxNome.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        cxNome.setForeground(new java.awt.Color(56, 0, 56));
        cxNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        cxNome.setPreferredSize(new java.awt.Dimension(300, 40));
        cxNome.setSelectionColor(new java.awt.Color(149, 113, 149));
        User.add(cxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 30));

        cxEmail.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        cxEmail.setForeground(new java.awt.Color(56, 0, 56));
        cxEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        cxEmail.setPreferredSize(new java.awt.Dimension(300, 40));
        cxEmail.setSelectionColor(new java.awt.Color(149, 113, 149));
        User.add(cxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 30));

        jLabel22.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(56, 0, 56));
        jLabel22.setText("Nome");
        User.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        jLabel23.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(56, 0, 56));
        jLabel23.setText("Senha");
        User.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        pswSenha1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        pswSenha1.setForeground(new java.awt.Color(56, 0, 56));
        pswSenha1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        pswSenha1.setPreferredSize(new java.awt.Dimension(300, 40));
        pswSenha1.setSelectionColor(new java.awt.Color(149, 113, 149));
        User.add(pswSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 30));

        pswConfSenha1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        pswConfSenha1.setForeground(new java.awt.Color(56, 0, 56));
        pswConfSenha1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        pswConfSenha1.setPreferredSize(new java.awt.Dimension(300, 40));
        pswConfSenha1.setSelectionColor(new java.awt.Color(149, 113, 149));
        User.add(pswConfSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 30));

        jLabel24.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(56, 0, 56));
        jLabel24.setText("Confirme sua senha:");
        User.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        jPanel7.setBackground(new java.awt.Color(56, 0, 56));
        User.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 440, 5));

        jpnFinalizar.setBackground(new java.awt.Color(56, 0, 56));
        jpnFinalizar.setPreferredSize(new java.awt.Dimension(80, 40));
        jpnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnFinalizarMousePressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Finalizar");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setPreferredSize(new java.awt.Dimension(58, 16));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpnFinalizarLayout = new javax.swing.GroupLayout(jpnFinalizar);
        jpnFinalizar.setLayout(jpnFinalizarLayout);
        jpnFinalizarLayout.setHorizontalGroup(
            jpnFinalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFinalizarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnFinalizarLayout.setVerticalGroup(
            jpnFinalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFinalizarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        User.add(jpnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 110, -1));
        User.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 40));

        jpScreen.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Adm.setBackground(new java.awt.Color(255, 255, 255));
        Adm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(56, 0, 56));
        jLabel13.setText("Cadastro de Administradores");
        Adm.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 310, 40));

        jPanel5.setBackground(new java.awt.Color(56, 0, 56));
        Adm.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 440, 5));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(56, 0, 56));
        jLabel14.setText("E-Mail");
        Adm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(56, 0, 56));
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        txtEmail.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 300, 30));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(56, 0, 56));
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        txtNome.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 300, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(56, 0, 56));
        jLabel15.setText("Nome");
        Adm.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(56, 0, 56));
        jLabel16.setText("CPF");
        Adm.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(56, 0, 56));
        txtCpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        txtCpf.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 300, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(56, 0, 56));
        jLabel17.setText("Senha");
        Adm.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        pswSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pswSenha.setForeground(new java.awt.Color(56, 0, 56));
        pswSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        pswSenha.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(pswSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 300, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(56, 0, 56));
        jLabel18.setText("Confirme sua senha:");
        Adm.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        pswConfSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pswConfSenha.setForeground(new java.awt.Color(56, 0, 56));
        pswConfSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 106, 131), 1, true));
        pswConfSenha.setSelectionColor(new java.awt.Color(149, 113, 149));
        Adm.add(pswConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 300, 30));

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
        jLabel19.setText("Finalizar");
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

        jpScreen.add(Adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpBackground.add(jpScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

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
    //Botão de exit do programa
    private void jlbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlbExitMouseClicked

    private void CadastrarAnimal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarAnimal1MouseClicked
        cleanAll();
        jspScreens.setVisible(true);
        jspScreens.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        card.show(panelScreens,"panelCadastro");
        visiblePanel(Animals);
    }//GEN-LAST:event_CadastrarAnimal1MouseClicked

    private void CadastrarAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarAdmMouseClicked
        cleanAll();
        visiblePanel(Adm);
    }//GEN-LAST:event_CadastrarAdmMouseClicked

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        cleanAll();
        visiblePanel(About);
    }//GEN-LAST:event_SobreMouseClicked

    private void CadastrarAnimal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarAnimal1MousePressed
        setColor(CadastrarAnimal1);
        resetColor(CadastrarAdm);
        resetColor(Sobre);
        resetColor(ListarAnimaisAdotados);
        resetColor(CadastrarUser1);
    }//GEN-LAST:event_CadastrarAnimal1MousePressed

    private void CadastrarAdmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarAdmMousePressed
        setColor(CadastrarAdm);
        resetColor(CadastrarAnimal1);
        resetColor(ListarAnimaisAdotados);
        resetColor(Sobre);
        resetColor(CadastrarUser1);
    }//GEN-LAST:event_CadastrarAdmMousePressed

    private void SobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMousePressed
        setColor(Sobre);
        resetColor(CadastrarAdm);
        resetColor(CadastrarAnimal1);
        resetColor(ListarAnimaisAdotados);
        resetColor(CadastrarUser1);
    }//GEN-LAST:event_SobreMousePressed

    private void CadastrarUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarUser1MouseClicked
        cleanAll();
        visiblePanel(User);
    }//GEN-LAST:event_CadastrarUser1MouseClicked

    private void CadastrarUser1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarUser1MousePressed
        setColor(CadastrarUser1);
        resetColor(CadastrarAdm);
        resetColor(CadastrarAnimal1);
        resetColor(ListarAnimaisAdotados);
        resetColor(Sobre);
    }//GEN-LAST:event_CadastrarUser1MousePressed

    private void jpnFinalizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnFinalizarMousePressed
       

        /*if(verificarSenha(senha, confSenha)){
            if(verificar(email)){
                emails.add(email);
                lnomes.add(nome);
                lsenha.add(senha);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                cxNome.setText("");
                cxEmail.setText("");
                pswConfSenha.setText("");
                pswSenha.setText("");
            }
        }*/
    }//GEN-LAST:event_jpnFinalizarMousePressed

    private void getDate() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String strDate = dateFormat.format(date);
        data = strDate;
        //System.out.println(strDate);
    }
    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_moveMouseDragged
            
    private void ListarAnimaisAdotadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarAnimaisAdotadosMouseClicked
        try {
            panelTabel = new TelaDeCadastroDeAnimais();
            //panelTabel = new TelaTabelaDeAnimais();
        } catch (Exception ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        jpnTabel.add(panelTabel);
        panelTabel.setVisible(true);
        cleanAll();
        jlbVoltar.setVisible(true);
        resetColor(ListarAnimaisAdotados);
        
        
                
    }//GEN-LAST:event_ListarAnimaisAdotadosMouseClicked

    private void ListarAnimaisAdotadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarAnimaisAdotadosMousePressed
        setColor(ListarAnimaisAdotados);
        resetColor(CadastrarAnimal1);
        resetColor(Sobre);
        resetColor(CadastrarAdm);
        resetColor(CadastrarUser1);
    }//GEN-LAST:event_ListarAnimaisAdotadosMousePressed

    private void jlbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlbMinimizarMouseClicked

    private void jlbVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbVoltarMouseClicked
        jpnTabel.remove(panelTabel);
        jlbVoltar.setVisible(false);
        
    }//GEN-LAST:event_jlbVoltarMouseClicked

    private void btnCadastroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMousePressed
//        DAOAdministrador DA=new DAOAdministrador();
//        try{
//            DA.inserir(txtEmail.getText(),txtNome.getText(),txtCpf.getText(),pswSenha.getText(),pswConfSenha.getText());
//        } catch (Exception ex) {
//            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "e-mail já existente!");
//        }
    }//GEN-LAST:event_btnCadastroMousePressed

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
//       DAOUsuario DU=new DAOUsuario();
//        try{
//            DU.inserir(cxEmail.getText(),cxNome.getText(),pswSenha1.getText(),pswConfSenha1.getText());
//        } catch (Exception ex) {
//            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "e-mail já existente!");
//        }
    }//GEN-LAST:event_jLabel25MousePressed
    
    
    
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaMenu().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JPanel Adm;
    private javax.swing.JPanel Animals;
    private javax.swing.JPanel CadastrarAdm;
    private javax.swing.JPanel CadastrarAnimal1;
    private javax.swing.JPanel CadastrarUser1;
    private javax.swing.JPanel ListarAnimaisAdotados;
    private javax.swing.JPanel Sobre;
    private javax.swing.JPanel User;
    private javax.swing.ButtonGroup bgAcidentado;
    private javax.swing.ButtonGroup bgCastrado;
    private javax.swing.ButtonGroup bgComunitario;
    private javax.swing.ButtonGroup bgDoente;
    private javax.swing.ButtonGroup bgPrenha;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.ButtonGroup bgVacinado;
    private javax.swing.JPanel btnCadastro;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxNome;
    private javax.swing.JPanel form1;
    private javax.swing.JPanel form2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jlbExit;
    private javax.swing.JLabel jlbMinimizar;
    private javax.swing.JLabel jlbVoltar;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpLeftPanel;
    private javax.swing.JPanel jpScreen;
    private javax.swing.JPanel jpTopPanel;
    private javax.swing.JPanel jpnFinalizar;
    private javax.swing.JPanel jpnTabel;
    private javax.swing.JScrollPane jspScreens;
    private javax.swing.JLabel move;
    private javax.swing.JPanel panelScreens;
    private javax.swing.JPasswordField pswConfSenha;
    private javax.swing.JPasswordField pswConfSenha1;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JPasswordField pswSenha1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
