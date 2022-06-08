package GUI;

import DAO.ManipuladorDB;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaMenuInicial extends javax.swing.JFrame {

    // atributos
    private File arquivo = new File("src");
    private String arqF = arquivo.getAbsolutePath(); // pegando o caminho absoluto
    private Path arquivoAnotacao = Paths.get(this.arqF+"\\Banco\\anotacao.txt"); // juntando o caminho absoluto ao relativo
    private ButtonGroup grupoPaineis = new ButtonGroup(); 
    private ManipuladorDB dbm;
    private String[][] colunas = {
        // correspondência 0
        {
            "id_correspondencia",              // 0
            "id_destinatario_correspondencia", // 1
            "tipo_correspondencia",            // 2
            "nome_entregador_correspondencia", // 3
            "cpf_entregador_correspondencia"   // 4
        },
        // prestador 1
        {
            "id_prestador",      // 0
            "cpf_prestador",     // 1
            "nome_prestador",    // 2
            "contato_prestador"  // 3
        },
        // serviço 2
        {
            "id_servico",        // 0
            "id_prestador",      // 1
            "id_contratante",    // 2
            "tipo",              // 3
            "data_agendada",     // 4
            "data_recebida"      // 5
        },
        // agenda 3
        {
            "id_agenda",         // 0
            "compromisso_agenda" // 1
        },
        // residente 4
        {
            "id_residente",      // 0
            "id_casa",           // 1
            "cpf_residente",     // 2
            "nome_residente",    // 3
            "contato_residente"  // 4
        }
    };

    public TelaMenuInicial() {
        
        initComponents();
        dbm = new ManipuladorDB("banco_portaria");
        this.setPaineisInvisiveis();
        this.setSubPaineisInsercaoInvisiveis();
        this.painelInicial.setVisible(true);
        this.painel_inserirCorrespondencia.setVisible(true);
        this.ComboBoxTabelas.setSelectedIndex(0);
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInicial = new javax.swing.JPanel();
        lbl_bemVindo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_anotacao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btn_salvar_anotacao = new javax.swing.JButton();
        btn_historico = new javax.swing.JButton();
        painel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        ScrollPaneTabela = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        TabbedPaneOpcoes = new javax.swing.JTabbedPane();
        subPanelInserir = new javax.swing.JPanel();
        ComboBoxNovaInsercao = new javax.swing.JComboBox<>();
        lbl_novaInsercao = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        painel_inserirCorrespondencia = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_inserir_id_morador_correspondencia = new javax.swing.JTextField();
        CheckBox_inserir_nome_entregador = new javax.swing.JCheckBox();
        txt_inserir_nome_entregador_correspondencia = new javax.swing.JTextField();
        CheckBox_inserir_cpf_entregador = new javax.swing.JCheckBox();
        txt_inserir_cpf_entregador_correspondencia = new javax.swing.JTextField();
        txt_inserir_desc_correspondencia = new javax.swing.JTextField();
        painel_inserirPrestador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_inserir_nome_prestador = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_inserir_cpf_prestador = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_inserir_contato_prestador = new javax.swing.JTextField();
        painel_inserirResidente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_inserir_id_casa_residente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_inserir_nome_residente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_inserir_cpf_residente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_inserir_contato_residente = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_Inserir = new javax.swing.JButton();
        subPanelConsultar = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txt_filtros_consulta = new javax.swing.JTextField();
        ComboBoxTabelas = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btn_pesquise = new javax.swing.JButton();
        Combobox_colunasConsulta = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        ComboBox_tipo_pesquisa = new javax.swing.JComboBox<>();
        painel2 = new javax.swing.JPanel();
        lblCameras = new javax.swing.JLabel();
        lblTelaDeCameras = new javax.swing.JLabel();
        btnAlarme = new javax.swing.JButton();
        btn_outros_botoes_talvez = new javax.swing.JButton();
        btnPrintar = new javax.swing.JButton();
        lblFundin = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menuBarConfig = new javax.swing.JMenu();
        menuBarRadio0 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio1 = new javax.swing.JRadioButtonMenuItem();
        menuBarRadio2 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMaximumSize(new java.awt.Dimension(1399, 729));
        setMinimumSize(new java.awt.Dimension(760, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelInicial.setForeground(new java.awt.Color(255, 255, 255));
        painelInicial.setToolTipText("");
        painelInicial.setMinimumSize(new java.awt.Dimension(740, 550));
        painelInicial.setOpaque(false);
        painelInicial.setPreferredSize(new java.awt.Dimension(740, 550));

        lbl_bemVindo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbl_bemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bemVindo.setText("BEM VINDO DE VOLTA, PORTEIRO(A)!");
        lbl_bemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(246, 222));

        txtArea_anotacao.setColumns(20);
        txtArea_anotacao.setForeground(new java.awt.Color(102, 102, 102));
        txtArea_anotacao.setRows(5);
        txtArea_anotacao.setTabSize(4);
        txtArea_anotacao.setToolTipText("");
        jScrollPane1.setViewportView(txtArea_anotacao);

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SUAS ANOTAÇÕES");

        btn_salvar_anotacao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_salvar_anotacao.setText("SALVAR");
        btn_salvar_anotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_anotacaoActionPerformed(evt);
            }
        });

        btn_historico.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btn_historico.setText("ABRIR NOTAS");
        btn_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_historico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(btn_salvar_anotacao)
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar_anotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lbl_bemVindo))
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicialLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        painelInicial.setVisible(true);

        getContentPane().add(painelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel1.setMaximumSize(new java.awt.Dimension(1399, 729));
        painel1.setMinimumSize(new java.awt.Dimension(740, 550));
        painel1.setOpaque(false);
        painel1.setPreferredSize(new java.awt.Dimension(740, 550));
        painel1.setRequestFocusEnabled(false);
        painel1.setVisible(false);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("TABELA DE REGISTROS");

        tabela1.setOpaque(false);
        tabela1.setRowSelectionAllowed(false);
        ScrollPaneTabela.setViewportView(tabela1);

        subPanelInserir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxNovaInsercao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBoxNovaInsercao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOVA CORRESPONDÊNCIA", "NOVO PRESTADOR DE SERVIÇO", "NOVO RESIDENTE" }));
        ComboBoxNovaInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNovaInsercaoActionPerformed(evt);
            }
        });
        subPanelInserir.add(ComboBoxNovaInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));

        lbl_novaInsercao.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lbl_novaInsercao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_novaInsercao.setText("SELECIONE O TIPO DE INSERÇÃO");
        subPanelInserir.add(lbl_novaInsercao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 218, 28));
        subPanelInserir.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 218, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID MORADOR");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESC. DA CORRESPONDENCIA");

        CheckBox_inserir_nome_entregador.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        CheckBox_inserir_nome_entregador.setText("NOME DO ENTREGADOR");
        CheckBox_inserir_nome_entregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_inserir_nome_entregadorActionPerformed(evt);
            }
        });

        CheckBox_inserir_cpf_entregador.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        CheckBox_inserir_cpf_entregador.setText("CPF ENTREGADOR");

        txt_inserir_desc_correspondencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_desc_correspondenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_inserirCorrespondenciaLayout = new javax.swing.GroupLayout(painel_inserirCorrespondencia);
        painel_inserirCorrespondencia.setLayout(painel_inserirCorrespondenciaLayout);
        painel_inserirCorrespondenciaLayout.setHorizontalGroup(
            painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_inserir_nome_entregador_correspondencia)
                    .addComponent(CheckBox_inserir_nome_entregador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserir_desc_correspondencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                        .addGroup(painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_inserir_cpf_entregador_correspondencia)
                            .addComponent(CheckBox_inserir_cpf_entregador, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_inserir_id_morador_correspondencia)))
                .addContainerGap())
        );
        painel_inserirCorrespondenciaLayout.setVerticalGroup(
            painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirCorrespondenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirCorrespondenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inserir_id_morador_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_inserir_desc_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_inserir_nome_entregador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_inserir_nome_entregador_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox_inserir_cpf_entregador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(txt_inserir_cpf_entregador_correspondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        subPanelInserir.add(painel_inserirCorrespondencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 210));

        painel_inserirPrestador.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOME");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserir_nome_prestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_nome_prestadorActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPF");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserir_cpf_prestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_cpf_prestadorActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CONTATO");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txt_inserir_contato_prestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inserir_contato_prestadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_inserirPrestadorLayout = new javax.swing.GroupLayout(painel_inserirPrestador);
        painel_inserirPrestador.setLayout(painel_inserirPrestadorLayout);
        painel_inserirPrestadorLayout.setHorizontalGroup(
            painel_inserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirPrestadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_inserir_nome_prestador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserir_contato_prestador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_inserir_cpf_prestador))
                .addContainerGap())
        );
        painel_inserirPrestadorLayout.setVerticalGroup(
            painel_inserirPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirPrestadorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserir_nome_prestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserir_cpf_prestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_inserir_contato_prestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        subPanelInserir.add(painel_inserirPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 89, 218, 210));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CASA");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CPF");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTATO");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOME");

        javax.swing.GroupLayout painel_inserirResidenteLayout = new javax.swing.GroupLayout(painel_inserirResidente);
        painel_inserirResidente.setLayout(painel_inserirResidenteLayout);
        painel_inserirResidenteLayout.setHorizontalGroup(
            painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                        .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_inserir_id_casa_residente, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_inserir_cpf_residente, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                    .addComponent(txt_inserir_nome_residente)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_inserir_contato_residente))
                .addContainerGap())
            .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        painel_inserirResidenteLayout.setVerticalGroup(
            painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_inserir_id_casa_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inserir_cpf_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(txt_inserir_nome_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_inserir_contato_residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(painel_inserirResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_inserirResidenteLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );

        subPanelInserir.add(painel_inserirResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 210));
        subPanelInserir.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 10));

        btn_Inserir.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_Inserir.setText("INSERIR");
        btn_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InserirActionPerformed(evt);
            }
        });
        subPanelInserir.add(btn_Inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, -1));

        TabbedPaneOpcoes.addTab("INSERIR", subPanelInserir);

        jLabel21.setBackground(new java.awt.Color(255, 204, 51));
        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FILTROS");

        txt_filtros_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtros_consultaActionPerformed(evt);
            }
        });

        ComboBoxTabelas.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBoxTabelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CORRESPONDÊNCIA", "PRESTADOR", "SERVIÇO", "AGENDA", "RESIDENTE" }));
        ComboBoxTabelas.setToolTipText("");
        ComboBoxTabelas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboBoxTabelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTabelasActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 204, 51));
        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TABELA");

        btn_pesquise.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btn_pesquise.setText("PESQUISE");
        btn_pesquise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquiseActionPerformed(evt);
            }
        });

        ComboBox_tipo_pesquisa.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ComboBox_tipo_pesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSCA EXATA", "BUSCA APROXIMADA", "BUSCA GERAL" }));

        javax.swing.GroupLayout subPanelConsultarLayout = new javax.swing.GroupLayout(subPanelConsultar);
        subPanelConsultar.setLayout(subPanelConsultarLayout);
        subPanelConsultarLayout.setHorizontalGroup(
            subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBox_tipo_pesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(subPanelConsultarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator2))
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxTabelas, 0, 218, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_filtros_consulta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_pesquise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Combobox_colunasConsulta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanelConsultarLayout.setVerticalGroup(
            subPanelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ComboBox_tipo_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Combobox_colunasConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_filtros_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pesquise, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        TabbedPaneOpcoes.addTab("CONSULTAR", subPanelConsultar);

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TabbedPaneOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(138, 138, 138))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TabbedPaneOpcoes)
                    .addComponent(ScrollPaneTabela))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel2.setMinimumSize(new java.awt.Dimension(740, 550));
        painel2.setOpaque(false);
        painel2.setPreferredSize(new java.awt.Dimension(740, 550));

        lblCameras.setBackground(new java.awt.Color(255, 255, 255));
        lblCameras.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCameras.setForeground(new java.awt.Color(255, 255, 255));
        lblCameras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCameras.setText("CÂMERAS");

        lblTelaDeCameras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/conjuntoCameras.png"))); // NOI18N

        btnAlarme.setBackground(new java.awt.Color(200, 0, 0));
        btnAlarme.setText("ALARME");
        btnAlarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmeActionPerformed(evt);
            }
        });

        btn_outros_botoes_talvez.setText("OUTROS BOTÕES, TALVEZ");
        btn_outros_botoes_talvez.setToolTipText("OUTROS BOTÕES, TALVEZ");
        btn_outros_botoes_talvez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outros_botoes_talvezActionPerformed(evt);
            }
        });

        btnPrintar.setText("PRINTAR");
        btnPrintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(lblCameras))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel2Layout.createSequentialGroup()
                                .addComponent(btnAlarme)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrintar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_outros_botoes_talvez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblTelaDeCameras))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblCameras)
                .addGap(18, 18, 18)
                .addComponent(lblTelaDeCameras)
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPrintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlarme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_outros_botoes_talvez, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblFundin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/foto_fundo_vemelho_ondinha1080.png"))); // NOI18N
        lblFundin.setMaximumSize(new java.awt.Dimension(1399, 729));
        lblFundin.setMinimumSize(new java.awt.Dimension(740, 538));
        lblFundin.setPreferredSize(new java.awt.Dimension(745, 538));
        getContentPane().add(lblFundin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -42, 830, 580));

        menuBarConfig.setText("TELAS");

        menuBarRadio0.setSelected(true);
        menuBarRadio0.setText("INÍCIO");
        grupoPaineis.add(menuBarRadio0);
        menuBarRadio0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconePerfil32.png"))); // NOI18N
        menuBarRadio0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio0ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio0);

        menuBarRadio1.setText("CADASTROS");
        menuBarRadio1.setToolTipText("ABRE A ABA DE CADASTRADOS");
        menuBarRadio1.setActionCommand("painel");
        grupoPaineis.add(menuBarRadio1);
        menuBarRadio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconeCadastro32.png"))); // NOI18N
        menuBarRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio1ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio1);

        menuBarRadio2.setSelected(true);
        menuBarRadio2.setText("CÂMERAS");
        menuBarRadio2.setToolTipText("ABRE A ABA DE CÂMERAS");
        menuBarRadio2.setActionCommand("painel");
        menuBarRadio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/iconeCamera32.png"))); // NOI18N
        grupoPaineis.add(menuBarRadio2);
        menuBarRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarRadio2ActionPerformed(evt);
            }
        });
        menuBarConfig.add(menuBarRadio2);

        MenuBar.add(menuBarConfig);

        setJMenuBar(MenuBar);

        setSize(new java.awt.Dimension(756, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // métodos criados
    private void setPaineisInvisiveis(){
        // seta visibilidade como false
        this.painelInicial.setVisible(false);
        this.painel2.setVisible(false);
        this.painel1.setVisible(false);
    }
  
    private void setSubPaineisInsercaoInvisiveis(){
        // seta visibilidade como false
        this.painel_inserirCorrespondencia.setVisible(false);
        this.painel_inserirPrestador.setVisible(false);
        this.painel_inserirResidente.setVisible(false);
    }
    
    private void colocarNaTabela(String tabela,String[] colunas){
        // criando modelo padrão da tabela e outras vars importantes
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando colunas e linhas
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // adicionando as colunas na tabela
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        lista = dbm.consultarDados(tabela);
        
        // colocando as informações no array data
        for(int x=0; x< lista.size();x++){
            for (int z=0; z<data.length;z++){data[z] = lista.get(x)[z];}
            dtm.addRow(data);
        }
    }
    
    private void colocarNaTabelaAdv(String tabela,String[] colunas,String param[],String valor[]){
        // criando vars
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando colunas e linhas
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // add colunas
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        // realizando consulta
        lista = dbm.consultarDadosAdv(tabela, param, valor);
        
        // add info no data
        for(int x=0; x< lista.size();x++){
            for (int z=0; z<data.length;z++){data[z] = lista.get(x)[z];}
            dtm.addRow(data);
        }
    }

    private void colocarNaTabelaAdv(String tabela,String[] colunas,String param[],String valor[], boolean like){
        // criando vars
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        ArrayList<Object[]> lista;
        Object[] data = new Object[colunas.length];
        
        // zerando colunas e linhas
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        
        // add colunas
        for (int x=0; x< colunas.length;x++){
            dtm.addColumn(colunas[x]);
        }

        // realizando consulta avançada
        lista = dbm.consultarDadosAdv(tabela, param, valor, true);
        
        // add info no data
        for(int x=0; x< lista.size();x++){
            for (int z=0; z<data.length;z++){data[z] = lista.get(x)[z];}
            dtm.addRow(data);
        }
    }

    private void limparInfoInsercoes(){
        
        // limpando texto dos txt_fields da aba de inserção
        this.txt_inserir_contato_prestador.setText("");
        this.txt_inserir_contato_residente.setText("");
        this.txt_inserir_cpf_entregador_correspondencia.setText("");
        this.txt_inserir_cpf_prestador.setText("");
        this.txt_inserir_cpf_residente.setText("");
        this.txt_inserir_desc_correspondencia.setText("");
        this.txt_inserir_id_casa_residente.setText("");
        this.txt_inserir_id_morador_correspondencia.setText("");
        this.txt_inserir_nome_entregador_correspondencia.setText("");
        this.txt_inserir_nome_prestador.setText("");
        this.txt_inserir_nome_residente.setText("");
        
    }
 
    // métodos automáticos
    
    private void menuBarRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio1ActionPerformed
        this.setPaineisInvisiveis();    
        painel1.setVisible(true);      
    }//GEN-LAST:event_menuBarRadio1ActionPerformed

    private void menuBarRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio2ActionPerformed
        this.setPaineisInvisiveis();
        painel2.setVisible(true);
    }//GEN-LAST:event_menuBarRadio2ActionPerformed

    // opções de consulta
    private void ComboBoxTabelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTabelasActionPerformed
        /*
        0 = CORRESPONDÊNCIA
        1 = PRESTADOR
        2 = SERVIÇO
        3 = AGENDA
        4 = RESIDENTE
        */
        
        // limpando lista anterior
        this.Combobox_colunasConsulta.removeAllItems();
        
        // adicionando nova lista de parametros
        switch(this.ComboBoxTabelas.getSelectedIndex()){
            case 0: // correspondência
                for (int x=0; x< this.colunas[0].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[0][x].replace("_correspondencia", "").replace("_", " "));}
                break;
            case 1: // prestador de serviços
                for (int x=0; x< this.colunas[1].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[1][x].replace("_prestador", "").replace("_", " "));}
                break;
            case 2: // serviços
                for (int x=0; x< this.colunas[2].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[2][x].replace("_servico", "").replace("_", " "));}
                break;
            case 3: // agenda
                for (int x=0; x< this.colunas[3].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[3][x].replace("_agenda", "").replace("_", " "));}
                break;
            case 4: // residentes
                for (int x=0; x< this.colunas[4].length;x++){
                    this.Combobox_colunasConsulta.addItem(this.colunas[4][x].replace("_residente", "").replace("_", " "));}
                break;
            default:
                this.Combobox_colunasConsulta.addItem(" ");
                break;
        }
    }//GEN-LAST:event_ComboBoxTabelasActionPerformed
    
    // alarme
    private void btnAlarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmeActionPerformed
        JOptionPane.showMessageDialog(null, "UM AVISO DE EMERGÊNCIA FOI ENVIADO\nPARA A POLÍCIA LOCAL!");
    }//GEN-LAST:event_btnAlarmeActionPerformed

    private void menuBarRadio0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarRadio0ActionPerformed
        this.setPaineisInvisiveis();
        painelInicial.setVisible(true);
    }//GEN-LAST:event_menuBarRadio0ActionPerformed

    // consulta
    private void btn_pesquiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquiseActionPerformed
        
        // criando vars
        DefaultTableModel dtm = (DefaultTableModel) this.tabela1.getModel();
        String[][] colunasTb = {
            //colunas correspondencia
            {"ID", "ID DESTINATÁRIO", "TIPO DE CORRESPONDENCIA", "NOME DO ENTREGADOR"},
            // colunas prestador de serviços
            {"ID", "CPF", "NOME", "CONTATO"},
            // colunas serviços
            {"ID SERVIÇO", "ID PRESTADOR", "ID CONTRATANTE",
            "TIPO DE SERVICO", "DATA AGENDADA", "DATA DE REALIZAÇÃO"},
            // colunas agenda
            {"ID", "COMPROMISSO"},
            // colunas residentes
            {"ID", "CASA", "CPF", "PROPRIETÁRIO", "CONTATO"}    
        };
        String tabela = "";
        int tam=0, indexColunasTab=0;
        
        switch((String)ComboBoxTabelas.getSelectedItem()){
            case "CORRESPONDÊNCIA":
                tabela = "tb_correspondencia";
                indexColunasTab=0;
                tam = colunasTb[0].length;
                break; 
            case "PRESTADOR":
                tabela = "tb_prestador";
                indexColunasTab=1;
                tam = colunasTb[1].length;
                break;   
            case "SERVIÇO":
                tabela = "tb_servico";
                indexColunasTab=2;
                tam = colunasTb[2].length;
                break;
            case "AGENDA":
                tabela = "tb_agenda";
                indexColunasTab=3;
                tam = colunasTb[3].length;
                break;  
            case "RESIDENTE":
                tabela = "tb_residente";
                indexColunasTab=4;
                tam = colunasTb[4].length;
                break;
            default:
                break;
        }
        // criando o array de colunas que aparecerão na tabela e add valores nele
        String[] coluna = new String[tam];
        coluna = colunasTb[indexColunasTab];

        switch (this.ComboBox_tipo_pesquisa.getSelectedIndex()){
            case 0: // busca exata
                String[] param = {this.colunas[indexColunasTab][this.Combobox_colunasConsulta.getSelectedIndex()]};
                String[] valor = {this.txt_filtros_consulta.getText().toLowerCase().trim()};
                this.colocarNaTabelaAdv(tabela,coluna, param, valor);
                break;
            case 1: // busca aproximada
                String[] param1 = {this.colunas[indexColunasTab][this.Combobox_colunasConsulta.getSelectedIndex()]};
                String[] valor1 = {this.txt_filtros_consulta.getText().toLowerCase().trim()};
                this.colocarNaTabelaAdv(tabela,coluna, param1, valor1, true);
                break;
            case 2: // busca geral
                this.colocarNaTabela(tabela, coluna);
                break;
            default:
                break;
                    
        }
        
        
        this.tabela1.setEnabled(false);
    }//GEN-LAST:event_btn_pesquiseActionPerformed

    private void txt_inserir_nome_prestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_nome_prestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_nome_prestadorActionPerformed

    private void txt_inserir_cpf_prestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_cpf_prestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_cpf_prestadorActionPerformed

    private void txt_inserir_contato_prestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_contato_prestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_contato_prestadorActionPerformed

    // inserção
    private void btn_InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InserirActionPerformed
        // criando vars
        String tabela="";
        ArrayList<String> parametros = new ArrayList();
        ArrayList<String> valores = new ArrayList();
        
        // analisando qual o index seecionado
        switch (this.ComboBoxNovaInsercao.getSelectedIndex()){
            case 1: // prestador
                
                // add parametros e valores às respectivas ArrayLists
                parametros.add(this.colunas[1][2]); // nome prestador
                parametros.add(this.colunas[1][1]); // cpf prestador
                parametros.add(this.colunas[1][3]); // contato prestador
                
                valores.add(this.txt_inserir_nome_prestador.getText().toLowerCase().trim());
                valores.add(this.txt_inserir_cpf_prestador.getText().trim());
                valores.add(this.txt_inserir_contato_prestador.getText().trim());
                
                tabela = "tb_prestador";
                break;
                
            case 0: // correspondencia
                
                // add parametros e valores às respectivas ArrayLists
                parametros.add(this.colunas[0][1]); // id morador
                parametros.add(this.colunas[0][2]); // descrição da correspondência
                
                valores.add(this.txt_inserir_id_morador_correspondencia.getText().trim());
                valores.add(this.txt_inserir_desc_correspondencia.getText().trim());
                
                if(this.CheckBox_inserir_nome_entregador.isSelected()){
                    parametros.add(this.colunas[0][3]); // nome entregador
                    valores.add(this.txt_inserir_nome_entregador_correspondencia.getText().toLowerCase().trim());
                }
                if(this.CheckBox_inserir_cpf_entregador.isSelected()){
                    parametros.add(this.colunas[0][4]); // cpf entregador
                    valores.add(this.txt_inserir_cpf_entregador_correspondencia.getText().trim());
                }

                tabela = "tb_correspondencia";
                break;
                
            case 2: // residente
                
                // add parametros e valores às respectivas ArrayLists
                parametros.add(this.colunas[4][1]); // casa residente
                parametros.add(this.colunas[4][2]); // cpf residente
                parametros.add(this.colunas[4][3]); // nome residente
                parametros.add(this.colunas[4][4]); // contato residente
                
                valores.add(this.txt_inserir_id_casa_residente.getText());
                valores.add(this.txt_inserir_cpf_residente.getText());
                valores.add(this.txt_inserir_nome_residente.getText().toLowerCase());
                valores.add(this.txt_inserir_contato_residente.getText());
                
                tabela = "tb_residente";
                break;
            
            default:
                break;
        }
        
        // passando valores e params de arraylist
        String[] param = new String[parametros.size()];
        String[] valor = new String[valores.size()];
        for (int x=0; x<parametros.size(); x++){param[x] = parametros.get(x);}
        for (int x=0; x<valores.size(); x++){valor[x] = valores.get(x);}
        
        if (valores.size() == parametros.size() && valores.size() > 2){
            this.dbm.inserirDados(tabela, param, valor);
            JOptionPane.showMessageDialog(null, "CADASTRO REALIZADO COM SUCESSO!");
            this.limparInfoInsercoes();
        }
        else{
            JOptionPane.showMessageDialog(null,
                "INFORMAÇÕES INVÁLIDAS/INCOMPLETAS!"
                + "\nTENHA CERTEZA DE PREENCHER TODOS OS REQUISITOS.");       
        }
        
    }//GEN-LAST:event_btn_InserirActionPerformed

    private void txt_filtros_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtros_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtros_consultaActionPerformed

    // print
    private void btnPrintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintarActionPerformed
        JOptionPane.showMessageDialog(null, "PRINT DE TELA DA CÂMERA DE SEGURANÇA\nTIRADA COM SUCESSO!");
    }//GEN-LAST:event_btnPrintarActionPerformed

    private void CheckBox_inserir_nome_entregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_inserir_nome_entregadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_inserir_nome_entregadorActionPerformed

    // visibilidade dos subPaineis
    private void ComboBoxNovaInsercaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNovaInsercaoActionPerformed
        this.setSubPaineisInsercaoInvisiveis();
        switch (this.ComboBoxNovaInsercao.getSelectedIndex()){
            case 0: // correspondencia
                this.painel_inserirCorrespondencia.setVisible(true);
                break;
            case 1: // prestador de serviço
                this.painel_inserirPrestador.setVisible(true);
                break;
            case 2: // residente
                this.painel_inserirResidente.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_ComboBoxNovaInsercaoActionPerformed

    private void btn_salvar_anotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_anotacaoActionPerformed

        LocalDateTime data_e_hora = LocalDateTime.now();
        String coiso = this.txtArea_anotacao.getText();
        // formatação da string e adição de data e hora formatada para String
        coiso +="\n^"+(String)data_e_hora.format(DateTimeFormatter.ISO_DATE_TIME).replace("T", " ")+"\n\n";
        
        try {
            // escrevendo informações no arquivo.txt no método WRITE (inserção com reescrita total)
            Files.write(this.arquivoAnotacao, coiso.getBytes(), StandardOpenOption.WRITE);
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO!");
        }
        catch (Exception e) {
            System.out.println("erro: "+e);
            JOptionPane.showMessageDialog(null, "UM ERRO OCORREU!\nNÃO FOI POSSÍVEL SALVAR.");
        }
    }//GEN-LAST:event_btn_salvar_anotacaoActionPerformed

    private void btn_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historicoActionPerformed
        try {
            List<String> listinha = Files.readAllLines(this.arquivoAnotacao); // percorrendo linhas do arquivo
            String lista2="";
            for (String e:listinha){
                lista2+=e+"\n";
            }
            this.txtArea_anotacao.setText(lista2);
        } 
        catch (IOException ex) {
            Logger.getLogger(TelaMenuInicial.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "UM ERRO OCORREU!\nNÃO FOI POSSÍVEL RETOMAR\nAS ANOTAÇÕES.");
        }
    }//GEN-LAST:event_btn_historicoActionPerformed

    private void txt_inserir_desc_correspondenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inserir_desc_correspondenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inserir_desc_correspondenciaActionPerformed

    private void btn_outros_botoes_talvezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outros_botoes_talvezActionPerformed
        JOptionPane.showMessageDialog(null, "OUTROS BOTÕES, TALVEZ.");
    }//GEN-LAST:event_btn_outros_botoes_talvezActionPerformed

  
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
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_inserir_cpf_entregador;
    private javax.swing.JCheckBox CheckBox_inserir_nome_entregador;
    private javax.swing.JComboBox<String> ComboBoxNovaInsercao;
    private javax.swing.JComboBox<String> ComboBoxTabelas;
    private javax.swing.JComboBox<String> ComboBox_tipo_pesquisa;
    private javax.swing.JComboBox<String> Combobox_colunasConsulta;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane ScrollPaneTabela;
    private javax.swing.JTabbedPane TabbedPaneOpcoes;
    private javax.swing.JButton btnAlarme;
    private javax.swing.JButton btnPrintar;
    private javax.swing.JButton btn_Inserir;
    private javax.swing.JButton btn_historico;
    private javax.swing.JButton btn_outros_botoes_talvez;
    private javax.swing.JButton btn_pesquise;
    private javax.swing.JButton btn_salvar_anotacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCameras;
    private javax.swing.JLabel lblFundin;
    private javax.swing.JLabel lblTelaDeCameras;
    private javax.swing.JLabel lbl_bemVindo;
    private javax.swing.JLabel lbl_novaInsercao;
    private javax.swing.JMenu menuBarConfig;
    private javax.swing.JRadioButtonMenuItem menuBarRadio0;
    private javax.swing.JRadioButtonMenuItem menuBarRadio1;
    private javax.swing.JRadioButtonMenuItem menuBarRadio2;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painelInicial;
    private javax.swing.JPanel painel_inserirCorrespondencia;
    private javax.swing.JPanel painel_inserirPrestador;
    private javax.swing.JPanel painel_inserirResidente;
    private javax.swing.JPanel subPanelConsultar;
    private javax.swing.JPanel subPanelInserir;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextArea txtArea_anotacao;
    private javax.swing.JTextField txt_filtros_consulta;
    private javax.swing.JTextField txt_inserir_contato_prestador;
    private javax.swing.JTextField txt_inserir_contato_residente;
    private javax.swing.JTextField txt_inserir_cpf_entregador_correspondencia;
    private javax.swing.JTextField txt_inserir_cpf_prestador;
    private javax.swing.JTextField txt_inserir_cpf_residente;
    private javax.swing.JTextField txt_inserir_desc_correspondencia;
    private javax.swing.JTextField txt_inserir_id_casa_residente;
    private javax.swing.JTextField txt_inserir_id_morador_correspondencia;
    private javax.swing.JTextField txt_inserir_nome_entregador_correspondencia;
    private javax.swing.JTextField txt_inserir_nome_prestador;
    private javax.swing.JTextField txt_inserir_nome_residente;
    // End of variables declaration//GEN-END:variables
}
