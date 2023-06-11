/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8P2_LourdesA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lourdes
 */
public class SIMULATOR extends javax.swing.JFrame {

    private DefaultTableModel CANCIONES_SOLISTASModel;
    private DefaultTableModel CANCIONES_BANDASModel;
    private DefaultComboBoxModel<String> comboBoxEventoModel;
    private List<Eventos> listaEventos;
    private List<String[]> data;
    private DefaultTableModel tablaCancionesModel;
    private DefaultTableModel Model;

    private List<Artista> listaArtistas = new ArrayList<>();
    private Bitacora bitacora; // Declarar la variable de instancia

    /**
     * Creates new form Simulador
     */
    public SIMULATOR() {
        initComponents();
        ab = new administrarBarra2(pg_3);
        bitacora = new Bitacora(); // Inicializar la variable de instancia

        CANCIONES_SOLISTASModel = new DefaultTableModel();
        CANCIONES_SOLISTASModel = new DefaultTableModel();
        CANCIONES_SOLISTASModel.addColumn("NOMBRE");
        CANCIONES_SOLISTASModel.addColumn("DURACION EN SEGUNDOS");

        // Crear la lista de datos y agregar algunos datos de ejemplo
        data = new ArrayList<>();

        // Agregar los datos al modelo de la tabla
        for (String[] row : data) {
            CANCIONES_SOLISTASModel.addRow(row);
        }
        CANCIONES_BANDASModel = new DefaultTableModel();
        CANCIONES_BANDASModel = new DefaultTableModel();
        CANCIONES_BANDASModel.addColumn("NOMBRE");
        CANCIONES_BANDASModel.addColumn("DURACION EN SEGUNDOS");

        // Crear la lista de datos y agregar algunos datos de ejemplo
        data = new ArrayList<>();

        // Agregar los datos al modelo de la tabla
        for (String[] row : data) {
            CANCIONES_BANDASModel.addRow(row);
        }
        LISTA_CANCIONES_SOLISTA.setModel(CANCIONES_SOLISTASModel);
        LISTA_CANCIONES_BANDA.setModel(CANCIONES_BANDASModel);
        listaEventos = new ArrayList<>();
        // Inicializar modelos de tablas y ComboBox
//        tablaCancionesModel = new DefaultTableModel(new Object[]{"Canción", "Duración en Segundos", "Artista"}, 0);
        comboBoxEventoModel = new DefaultComboBoxModel<>();

        tablaCancionesModel = new DefaultTableModel();

        tablaCancionesModel.addColumn("Canción");
        tablaCancionesModel.addColumn("Duración");
        tablaCancionesModel.addColumn("Artista");

        data = new ArrayList<>();

        // Agregar los datos al modelo de la tabla
        for (String[] row : data) {
            tablaCancionesModel.addRow(row);
        }
        Model = new DefaultTableModel();
        Model.addColumn("Artista");
        Model.addColumn("Canción");
        data = new ArrayList<>();

        // Agregar los datos al modelo de la tabla
        for (String[] row : data) {
            Model.addRow(row);
        }
        // Asignar modelos a las tablas y al ComboBox
        LISTA_ARTISTAS.setModel(Model);
        tablaCanciones.setModel(tablaCancionesModel);
        comboBoxEventos.setModel(comboBoxEventoModel);

        // Agregar eventos de ejemplo
        Eventos evento1 = new Eventos("Concierto 1", "Ciudad 1", "Lugar 1", 1000, "Morat");
        evento1.addCancion(new Canciones("Canción 1", 180));
        evento1.addCancion(new Canciones("Canción 2", 240));
        evento1.addCancion(new Canciones("Canción 3", 200));

        Eventos evento2 = new Eventos("Concierto 2", "Ciudad 2", "Lugar 2", 2000, "Adele");
        evento2.addCancion(new Canciones("Canción 4", 210));
        evento2.addCancion(new Canciones("Canción 5", 190));
        evento2.addCancion(new Canciones("Canción 6", 220));

        // Agregar los eventos a la lista y al ComboBox
        listaEventos = new ArrayList<>();
        listaEventos.add(evento1);
        listaEventos.add(evento2);

        // Agregar los eventos al ComboBox
        for (Eventos eve : listaEventos) {
            comboBoxEventoModel.addElement(eve.toString());
        }

    }

    // Clase interna para representar una canción
    private class Cancion {

        private String nombre;
        private int duracionSegundos;

        public Cancion(String nombre, int duracionSegundos) {
            this.nombre = nombre;
            this.duracionSegundos = duracionSegundos;
        }

        public String getNombre() {
            return nombre;
        }

        public int getDuracionSegundos() {
            return duracionSegundos;
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

        jd_AgregarEvento = new javax.swing.JDialog();
        LUGAR_EVENTO = new javax.swing.JTextField();
        CIUDAD_EVENTO = new javax.swing.JTextField();
        BOTON_AGREGAR_EVENTO = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FECHA_EVENTO = new com.toedter.calendar.JDateChooser();
        CANT_PERSONAS_EVENTO = new javax.swing.JSpinner();
        jd_AgregarUsuario = new javax.swing.JDialog();
        CONTRASEÑA_USUARIO = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BOTON_AGREGAR_USUARIO = new javax.swing.JButton();
        USUARIO_USUARIO = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        NOMBRE_USUARIO = new javax.swing.JTextField();
        EDAD_USUARIO = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        LISTA_ARTISTAS = new javax.swing.JTable();
        CARGAR_LISTA_ARTISTAS = new javax.swing.JButton();
        jd_TipoArtista = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        REGISTRAR_SOLISTA = new javax.swing.JButton();
        REGISTRAR_BANDA = new javax.swing.JButton();
        jd_AgregarSolista = new javax.swing.JDialog();
        BOTON_AGREGAR_SOLISTA = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        USUARIO_SOLISTA = new javax.swing.JTextField();
        GENERO_SOLISTA = new javax.swing.JTextField();
        NOMBRE_SOLISTA = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CONTRASEÑA_SOLISTA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LISTA_CANCIONES_SOLISTA = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CANCION_SOLISTA = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        EDAD_SOLISTA = new javax.swing.JSpinner();
        DURACION_SOLISTA = new javax.swing.JSpinner();
        jd_AgregarBanda = new javax.swing.JDialog();
        BOTON_AGREGAR_BANDA = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        USUARIO_BANDA = new javax.swing.JTextField();
        NOMBRE_BANDA = new javax.swing.JTextField();
        GENERO_BANDA = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CONTRASEÑA_BANDA = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LISTA_CANCIONES_BANDA = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        CANCION_BANDA = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        NUM_INTEGRANTES_BANDA = new javax.swing.JSpinner();
        DURACION_BANDA = new javax.swing.JSpinner();
        CARGAR_LISTA_BANDA = new javax.swing.JButton();
        jd_LoginAdministrador = new javax.swing.JDialog();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        USUARIO_ADMI = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        BOTON_INGRESAR_ADMI = new javax.swing.JButton();
        CONTRASEÑA_ADMI = new javax.swing.JPasswordField();
        VENTANA_CARGANDO_5 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        pg_1 = new javax.swing.JProgressBar();
        BITACORA = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaBitacora = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        SIMULACION = new javax.swing.JDialog();
        comboBoxEventos = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        botonSeleccionarEvento = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCanciones = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        pg_3 = new javax.swing.JProgressBar();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        REGISTRAR_ARTISTA = new javax.swing.JButton();
        REGISTRAR_EVENTO = new javax.swing.JButton();
        REGISTRAR_USUARIO = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        ADMINISTRADOR = new javax.swing.JButton();
        ENTRAR_SIMULACION = new javax.swing.JButton();

        BOTON_AGREGAR_EVENTO.setText("Agregar");
        BOTON_AGREGAR_EVENTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTON_AGREGAR_EVENTOMouseClicked(evt);
            }
        });

        jLabel7.setText("Fecha:");

        jLabel8.setText("Lugar:");

        jLabel9.setText("Ciudad:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setText("Agregar Evento");

        jLabel11.setText("Cant. Personas:");

        javax.swing.GroupLayout jd_AgregarEventoLayout = new javax.swing.GroupLayout(jd_AgregarEvento.getContentPane());
        jd_AgregarEvento.getContentPane().setLayout(jd_AgregarEventoLayout);
        jd_AgregarEventoLayout.setHorizontalGroup(
            jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarEventoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_AgregarEventoLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(FECHA_EVENTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_AgregarEventoLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(CANT_PERSONAS_EVENTO))
                        .addGroup(jd_AgregarEventoLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(LUGAR_EVENTO))
                        .addGroup(jd_AgregarEventoLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(CIUDAD_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarEventoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOTON_AGREGAR_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jd_AgregarEventoLayout.setVerticalGroup(
            jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(42, 42, 42)
                .addGroup(jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(FECHA_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(LUGAR_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CIUDAD_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jd_AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CANT_PERSONAS_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(BOTON_AGREGAR_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setText("Agregar Usuario");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Usuario:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Contraseña:");

        BOTON_AGREGAR_USUARIO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BOTON_AGREGAR_USUARIO.setText("Agregar");
        BOTON_AGREGAR_USUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTON_AGREGAR_USUARIOMouseClicked(evt);
                PROGRESO_GUARDADO(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Nombre:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Edad:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("SEGUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ARTISTAS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SELECCIONE & AGREGUE");

        LISTA_ARTISTAS.setBackground(new java.awt.Color(0, 102, 102));
        LISTA_ARTISTAS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LISTA_ARTISTAS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LISTA_ARTISTAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Canciones"
            }
        ));
        jScrollPane7.setViewportView(LISTA_ARTISTAS);

        CARGAR_LISTA_ARTISTAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CARGAR_LISTA_ARTISTAS.setText("CARGAR");
        CARGAR_LISTA_ARTISTAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CARGAR_LISTA_ARTISTASMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_AgregarUsuarioLayout = new javax.swing.GroupLayout(jd_AgregarUsuario.getContentPane());
        jd_AgregarUsuario.getContentPane().setLayout(jd_AgregarUsuarioLayout);
        jd_AgregarUsuarioLayout.setHorizontalGroup(
            jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(NOMBRE_USUARIO))
                            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(EDAD_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(CONTRASEÑA_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(USUARIO_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(BOTON_AGREGAR_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(CARGAR_LISTA_ARTISTAS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(66, 66, 66))
            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addGap(98, 98, 98)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(168, 168, 168))
        );
        jd_AgregarUsuarioLayout.setVerticalGroup(
            jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(USUARIO_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(CONTRASEÑA_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(NOMBRE_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(EDAD_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(BOTON_AGREGAR_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_AgregarUsuarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jd_AgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(CARGAR_LISTA_ARTISTAS))))
                .addGap(57, 68, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("SELECCIONE");

        REGISTRAR_SOLISTA.setBackground(new java.awt.Color(153, 0, 0));
        REGISTRAR_SOLISTA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        REGISTRAR_SOLISTA.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR_SOLISTA.setText("Registrar Solista");
        REGISTRAR_SOLISTA.setBorderPainted(false);
        REGISTRAR_SOLISTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRAR_SOLISTAMouseClicked(evt);
            }
        });
        REGISTRAR_SOLISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_SOLISTAActionPerformed(evt);
            }
        });

        REGISTRAR_BANDA.setBackground(new java.awt.Color(153, 0, 0));
        REGISTRAR_BANDA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        REGISTRAR_BANDA.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR_BANDA.setText("Registrar Banda");
        REGISTRAR_BANDA.setBorderPainted(false);
        REGISTRAR_BANDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRAR_BANDAMouseClicked(evt);
            }
        });
        REGISTRAR_BANDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_BANDAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_TipoArtistaLayout = new javax.swing.GroupLayout(jd_TipoArtista.getContentPane());
        jd_TipoArtista.getContentPane().setLayout(jd_TipoArtistaLayout);
        jd_TipoArtistaLayout.setHorizontalGroup(
            jd_TipoArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TipoArtistaLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jd_TipoArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(REGISTRAR_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REGISTRAR_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jd_TipoArtistaLayout.setVerticalGroup(
            jd_TipoArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TipoArtistaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(REGISTRAR_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(REGISTRAR_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        BOTON_AGREGAR_SOLISTA.setText("Agregar");
        BOTON_AGREGAR_SOLISTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTON_AGREGAR_SOLISTAMouseClicked(evt);
            }
        });
        BOTON_AGREGAR_SOLISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_AGREGAR_SOLISTAActionPerformed(evt);
            }
        });

        jLabel15.setText("Usuario:");

        jLabel16.setText("Contraseña:");

        jLabel17.setText("Edad:");

        jLabel18.setText("Genero Musical:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel19.setText("Agregar Solista");

        jLabel20.setText("Nombre:");

        LISTA_CANCIONES_SOLISTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Cancion", "Duracion"
            }
        ));
        jScrollPane1.setViewportView(LISTA_CANCIONES_SOLISTA);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Lista de Canciones");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Agregue una Cancion");

        jLabel23.setText("Nombre:");

        jLabel24.setText("Duracion:");

        javax.swing.GroupLayout jd_AgregarSolistaLayout = new javax.swing.GroupLayout(jd_AgregarSolista.getContentPane());
        jd_AgregarSolista.getContentPane().setLayout(jd_AgregarSolistaLayout);
        jd_AgregarSolistaLayout.setHorizontalGroup(
            jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarSolistaLayout.createSequentialGroup()
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(DURACION_SOLISTA))
                            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(CANCION_SOLISTA)))
                        .addGap(108, 108, 108)
                        .addComponent(BOTON_AGREGAR_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(USUARIO_SOLISTA))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(CONTRASEÑA_SOLISTA))
                            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GENERO_SOLISTA, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NOMBRE_SOLISTA)
                                    .addComponent(EDAD_SOLISTA))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarSolistaLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(116, 116, 116))))))
            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel22))
                    .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jd_AgregarSolistaLayout.setVerticalGroup(
            jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(USUARIO_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)))
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarSolistaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CONTRASEÑA_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(EDAD_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(NOMBRE_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarSolistaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GENERO_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(CANCION_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTON_AGREGAR_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_AgregarSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(DURACION_SOLISTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        BOTON_AGREGAR_BANDA.setText("Agregar");
        BOTON_AGREGAR_BANDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTON_AGREGAR_BANDAMouseClicked(evt);
            }
        });
        BOTON_AGREGAR_BANDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_AGREGAR_BANDAActionPerformed(evt);
            }
        });

        jLabel25.setText("Usuario:");

        jLabel26.setText("Contraseña:");

        jLabel27.setText("Nº  Integrantes:");

        jLabel28.setText("Genero Musical:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel29.setText("Agregar Banda");

        jLabel30.setText("Nombre:");

        LISTA_CANCIONES_BANDA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Cancion", "Duracion"
            }
        ));
        jScrollPane2.setViewportView(LISTA_CANCIONES_BANDA);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Lista de Canciones");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Agregue una Cancion");

        jLabel33.setText("Nombre:");

        jLabel34.setText("Duracion:");

        CARGAR_LISTA_BANDA.setText("CARGAR");
        CARGAR_LISTA_BANDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CARGAR_LISTA_BANDAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_AgregarBandaLayout = new javax.swing.GroupLayout(jd_AgregarBanda.getContentPane());
        jd_AgregarBanda.getContentPane().setLayout(jd_AgregarBandaLayout);
        jd_AgregarBandaLayout.setHorizontalGroup(
            jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_AgregarBandaLayout.createSequentialGroup()
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(USUARIO_BANDA))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(CONTRASEÑA_BANDA))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(NOMBRE_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(NUM_INTEGRANTES_BANDA))
                            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(GENERO_BANDA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarBandaLayout.createSequentialGroup()
                                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CARGAR_LISTA_BANDA)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_AgregarBandaLayout.createSequentialGroup()
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(DURACION_BANDA))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_AgregarBandaLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(CANCION_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addComponent(BOTON_AGREGAR_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarBandaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jd_AgregarBandaLayout.setVerticalGroup(
            jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(USUARIO_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)))
                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(CONTRASEÑA_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NOMBRE_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addGap(31, 31, 31)
                                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(NUM_INTEGRANTES_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(GENERO_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel32))
                    .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CARGAR_LISTA_BANDA)))
                .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_AgregarBandaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(CANCION_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_AgregarBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(DURACION_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AgregarBandaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(BOTON_AGREGAR_BANDA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        jd_LoginAdministrador.setTitle("ADMINISTRADOR");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Usuario:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Contraseña:");

        USUARIO_ADMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USUARIO_ADMIMouseClicked(evt);
            }
        });
        USUARIO_ADMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIO_ADMIActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 102));
        jLabel39.setText("LOGIN");

        BOTON_INGRESAR_ADMI.setBackground(new java.awt.Color(0, 102, 0));
        BOTON_INGRESAR_ADMI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BOTON_INGRESAR_ADMI.setForeground(new java.awt.Color(255, 255, 255));
        BOTON_INGRESAR_ADMI.setText("INGRESAR");
        BOTON_INGRESAR_ADMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOTON_INGRESAR_ADMIMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_LoginAdministradorLayout = new javax.swing.GroupLayout(jd_LoginAdministrador.getContentPane());
        jd_LoginAdministrador.getContentPane().setLayout(jd_LoginAdministradorLayout);
        jd_LoginAdministradorLayout.setHorizontalGroup(
            jd_LoginAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginAdministradorLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jd_LoginAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BOTON_INGRESAR_ADMI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_LoginAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_LoginAdministradorLayout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addGap(18, 18, 18)
                            .addComponent(USUARIO_ADMI, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_LoginAdministradorLayout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addGap(18, 18, 18)
                            .addComponent(CONTRASEÑA_ADMI))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_LoginAdministradorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(156, 156, 156))
        );
        jd_LoginAdministradorLayout.setVerticalGroup(
            jd_LoginAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginAdministradorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel39)
                .addGap(42, 42, 42)
                .addGroup(jd_LoginAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(USUARIO_ADMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_LoginAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(CONTRASEÑA_ADMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(BOTON_INGRESAR_ADMI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel2.setText("CARGANDO......");

        pg_1.setMaximum(100000000);

        javax.swing.GroupLayout VENTANA_CARGANDO_5Layout = new javax.swing.GroupLayout(VENTANA_CARGANDO_5.getContentPane());
        VENTANA_CARGANDO_5.getContentPane().setLayout(VENTANA_CARGANDO_5Layout);
        VENTANA_CARGANDO_5Layout.setHorizontalGroup(
            VENTANA_CARGANDO_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VENTANA_CARGANDO_5Layout.createSequentialGroup()
                .addGroup(VENTANA_CARGANDO_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VENTANA_CARGANDO_5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel2))
                    .addGroup(VENTANA_CARGANDO_5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pg_1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        VENTANA_CARGANDO_5Layout.setVerticalGroup(
            VENTANA_CARGANDO_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VENTANA_CARGANDO_5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(pg_1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tablaBitacora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Accion", "Tiempo", "Persona"
            }
        ));
        jScrollPane8.setViewportView(tablaBitacora);

        jLabel41.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 153, 51));
        jLabel41.setText("BITACORA");

        jButton4.setText("ELIMINAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel41)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BITACORALayout = new javax.swing.GroupLayout(BITACORA.getContentPane());
        BITACORA.getContentPane().setLayout(BITACORALayout);
        BITACORALayout.setHorizontalGroup(
            BITACORALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BITACORALayout.setVerticalGroup(
            BITACORALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        comboBoxEventos.setBackground(new java.awt.Color(102, 255, 153));
        comboBoxEventos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel40.setText("EVENTOS");

        botonSeleccionarEvento.setText("SELECCIONAR");
        botonSeleccionarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeleccionarEventoMouseClicked(evt);
            }
        });

        tablaCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANCION", "DURACION", "ARTISTA"
            }
        ));
        jScrollPane4.setViewportView(tablaCanciones);

        jLabel42.setText("SETLIST");

        jLabel44.setText("Barra de avance");

        pg_3.setMaximum(100000000);

        jButton7.setText("EJECUTAR");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton3.setText("Detener");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton8.setText("Continuar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SIMULACIONLayout = new javax.swing.GroupLayout(SIMULACION.getContentPane());
        SIMULACION.getContentPane().setLayout(SIMULACIONLayout);
        SIMULACIONLayout.setHorizontalGroup(
            SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SIMULACIONLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(197, 197, 197))
            .addGroup(SIMULACIONLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SIMULACIONLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel40))
                    .addGroup(SIMULACIONLayout.createSequentialGroup()
                        .addComponent(comboBoxEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSeleccionarEvento))
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SIMULACIONLayout.createSequentialGroup()
                            .addComponent(jButton7)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8))
                        .addComponent(pg_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        SIMULACIONLayout.setVerticalGroup(
            SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIMULACIONLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addGroup(SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SIMULACIONLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addGroup(SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSeleccionarEvento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addGap(47, 47, 47)
                        .addComponent(pg_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(SIMULACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton3)
                            .addComponent(jButton8)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("SHOW DE TALENTOS");

        REGISTRAR_ARTISTA.setBackground(new java.awt.Color(0, 0, 102));
        REGISTRAR_ARTISTA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        REGISTRAR_ARTISTA.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR_ARTISTA.setText("Registrar Artista");
        REGISTRAR_ARTISTA.setBorderPainted(false);
        REGISTRAR_ARTISTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRAR_ARTISTAMouseClicked(evt);
            }
        });
        REGISTRAR_ARTISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_ARTISTAActionPerformed(evt);
            }
        });

        REGISTRAR_EVENTO.setBackground(new java.awt.Color(0, 0, 102));
        REGISTRAR_EVENTO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        REGISTRAR_EVENTO.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR_EVENTO.setText("Registrar Evento");
        REGISTRAR_EVENTO.setBorderPainted(false);
        REGISTRAR_EVENTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRAR_EVENTOMouseClicked(evt);
            }
        });
        REGISTRAR_EVENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_EVENTOActionPerformed(evt);
            }
        });

        REGISTRAR_USUARIO.setBackground(new java.awt.Color(0, 0, 102));
        REGISTRAR_USUARIO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        REGISTRAR_USUARIO.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRAR_USUARIO.setText("Registrar Usuario");
        REGISTRAR_USUARIO.setBorderPainted(false);
        REGISTRAR_USUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRAR_USUARIOMouseClicked(evt);
            }
        });
        REGISTRAR_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_USUARIOActionPerformed(evt);
            }
        });

        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);

        ADMINISTRADOR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ADMINISTRADOR.setText("ADMINISTRADOR");
        ADMINISTRADOR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADMINISTRADOR.setBorderPainted(false);
        ADMINISTRADOR.setFocusable(false);
        ADMINISTRADOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ADMINISTRADOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ADMINISTRADOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINISTRADORMouseClicked(evt);
            }
        });
        jToolBar1.add(ADMINISTRADOR);

        ENTRAR_SIMULACION.setBackground(new java.awt.Color(0, 102, 102));
        ENTRAR_SIMULACION.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ENTRAR_SIMULACION.setForeground(new java.awt.Color(255, 255, 255));
        ENTRAR_SIMULACION.setText("ENTRAR A SIMULACION");
        ENTRAR_SIMULACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTRAR_SIMULACIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(REGISTRAR_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REGISTRAR_ARTISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REGISTRAR_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(ENTRAR_SIMULACION)
                        .addGap(31, 31, 31))))
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(REGISTRAR_ARTISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(REGISTRAR_EVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(REGISTRAR_USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ENTRAR_SIMULACION, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRAR_ARTISTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRAR_ARTISTAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_REGISTRAR_ARTISTAMouseClicked

    private void REGISTRAR_ARTISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_ARTISTAActionPerformed
// Agregar un tiempo de espera de 5 segundos antes de mostrar el JDialog
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jd_TipoArtista.pack();
                jd_TipoArtista.setLocationRelativeTo(SIMULATOR.this);
                jd_TipoArtista.setModal(true);
                jd_TipoArtista.setVisible(true);
            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        timer.start();

    }//GEN-LAST:event_REGISTRAR_ARTISTAActionPerformed

    private void REGISTRAR_EVENTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRAR_EVENTOMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTRAR_EVENTOMouseClicked

    private void REGISTRAR_EVENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_EVENTOActionPerformed
        // TODO add your handling code here:
        jd_AgregarEvento.pack();
        jd_AgregarEvento.setLocationRelativeTo(this);
        jd_AgregarEvento.setModal(true);
        jd_AgregarEvento.setVisible(true);

    }//GEN-LAST:event_REGISTRAR_EVENTOActionPerformed

    private void REGISTRAR_USUARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRAR_USUARIOMouseClicked
        // TODO add your handling code here:
        jd_AgregarUsuario.pack();
        jd_AgregarUsuario.setLocationRelativeTo(this);
        jd_AgregarUsuario.setModal(true);
        jd_AgregarUsuario.setVisible(true);

    }//GEN-LAST:event_REGISTRAR_USUARIOMouseClicked

    private void REGISTRAR_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_USUARIOActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_REGISTRAR_USUARIOActionPerformed

    private void BOTON_AGREGAR_EVENTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_EVENTOMouseClicked
        // Obtener la fecha seleccionada del DateChooser
        Date fechaSeleccionada = FECHA_EVENTO.getDate();
        // Obtener los demás datos ingresados por el usuario
        String lugar = LUGAR_EVENTO.getText();
        String ciudad = CIUDAD_EVENTO.getText();
        int cantidadPersonas = (int) CANT_PERSONAS_EVENTO.getValue();

        // Crear una instancia de la clase EventoPersonalizado con los datos ingresados
        EventoPersonalizado event = new EventoPersonalizado(fechaSeleccionada, lugar, ciudad, cantidadPersonas);

        // Agregar un tiempo de espera de 5 segundos antes de mostrar un mensaje de confirmación
        Timer timer = new Timer(8000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje de confirmación
                guardarEvento(event);
                JOptionPane.showMessageDialog(null, "El evento se ha creado exitosamente");
            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        timer.start();
    }//GEN-LAST:event_BOTON_AGREGAR_EVENTOMouseClicked

    public void guardarEvento(EventoPersonalizado event) {
        try {
            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("Eventos.txt", true);

            // Crear un objeto PrintWriter para escribir en el archivo de manera formateada
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(event.getFecha());
            printWriter.println(event.getLugar());
            printWriter.println(event.getCiudad());
            printWriter.println(event.getCapacidadPersonas());

            // Cerrar los flujos de escritura
            printWriter.close();
            fileWriter.close();
            // Agregar la acción a la bitácora
            bitacora.agregarAccion("Se ha guardado un nuevo evento: " + event.getLugar());

        } catch (IOException e) {
            System.out.println("Error al guardar el evento en el archivo");
            e.printStackTrace();
        }
    }

    private void BOTON_AGREGAR_USUARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_USUARIOMouseClicked

        String usuario = USUARIO_USUARIO.getText();
        String contraseña = CONTRASEÑA_USUARIO.getText();
        String nombre = NOMBRE_USUARIO.getText();
        int edad = (int) EDAD_USUARIO.getValue();

        Usuario us = new Usuario(usuario, contraseña, nombre, edad);
        // Agregar un tiempo de espera de 5 segundos antes de guardar
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Guardar el usuario en la base de datos, archivo, etc.
                guardarUsuario(us);

                // Mostrar un mensaje de confirmación
                //JOptionPane.showMessageDialog(null, "El Usuario se ha creado exitosamente");
                // Restablecer los campos de entrada
                USUARIO_USUARIO.setText("");
                CONTRASEÑA_USUARIO.setText("");
                NOMBRE_USUARIO.setText("");
                EDAD_USUARIO.setValue(0);
            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        timer.start();

    }//GEN-LAST:event_BOTON_AGREGAR_USUARIOMouseClicked

    public void guardarUsuario(Usuario us) {
        try {
            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("Usuarios.txt", true);

            // Crear un objeto PrintWriter para escribir en el archivo de manera formateada
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escribir los datos del solista en el archivo
            printWriter.println(us.getUsuario());
            printWriter.println(us.getContraseña());
            printWriter.println(us.getNombre());
            printWriter.println(us.getEdad());

            // Cerrar los flujos de escritura
            printWriter.close();
            fileWriter.close();
            // Agregar la acción a la bitácora
            bitacora.agregarAccion("Se ha guardado un nuevo usuario: " + us.getNombre());

        } catch (IOException e) {
            System.out.println("Error al guardar el usuario en el archivo");
            e.printStackTrace();
        }
    }
    private void REGISTRAR_SOLISTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRAR_SOLISTAMouseClicked
        // TODO add your handling code here:
        jd_AgregarSolista.pack();
        jd_AgregarSolista.setLocationRelativeTo(this);
        jd_AgregarSolista.setModal(true);
        jd_AgregarSolista.setVisible(true);
    }//GEN-LAST:event_REGISTRAR_SOLISTAMouseClicked

    private void REGISTRAR_SOLISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_SOLISTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTRAR_SOLISTAActionPerformed

    private void REGISTRAR_BANDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRAR_BANDAMouseClicked
        // TODO add your handling code here:
        jd_AgregarBanda.pack();
        jd_AgregarBanda.setLocationRelativeTo(this);
        jd_AgregarBanda.setModal(true);
        jd_AgregarBanda.setVisible(true);
    }//GEN-LAST:event_REGISTRAR_BANDAMouseClicked

    private void REGISTRAR_BANDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_BANDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTRAR_BANDAActionPerformed

    private void BOTON_AGREGAR_SOLISTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_SOLISTAMouseClicked
        // Obtener los datos ingresados por el usuario
        String usuario = USUARIO_SOLISTA.getText();
        String contraseña = CONTRASEÑA_SOLISTA.getText();
        String nombre = NOMBRE_SOLISTA.getText();
        String generoMusical = GENERO_SOLISTA.getText();
        int edad = (int) EDAD_SOLISTA.getValue();

        // Crear una instancia del solista
        Solista solista = new Solista(usuario, contraseña, nombre, generoMusical, edad);

        // Obtener la canción y su duración
        String cancion = CANCION_SOLISTA.getText();
        int duracionSegundos = (int) DURACION_SOLISTA.getValue();

        listaArtistas.add(solista);
        // Agregar un tiempo de espera de 5 segundos antes de guardar
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Guardar el solista en la base de datos, archivo, etc.
                guardarSolista(solista);

                // Mostrar un mensaje de confirmación
                JOptionPane.showMessageDialog(null, "El solista se ha creado exitosamente");

                // Agregar los datos a la tabla
                String[] rowData = {cancion, String.valueOf(duracionSegundos)};
                CANCIONES_SOLISTASModel.addRow(rowData);
                // Restablecer los campos de entrada
                USUARIO_SOLISTA.setText("");
                CONTRASEÑA_SOLISTA.setText("");
                NOMBRE_SOLISTA.setText("");
                GENERO_SOLISTA.setText("");
                EDAD_SOLISTA.setValue(0);
                CANCION_SOLISTA.setText("");
                DURACION_SOLISTA.setValue(0);
            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        timer.start();


    }//GEN-LAST:event_BOTON_AGREGAR_SOLISTAMouseClicked

    public void guardarSolista(Solista solista) {
        try {
            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("Solistas.txt", true);

            // Crear un objeto PrintWriter para escribir en el archivo de manera formateada
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escribir los datos del solista en el archivo
            printWriter.println(solista.getUsuario());
            printWriter.println(solista.getContraseña());
            printWriter.println(solista.getNombre());
            printWriter.println(solista.getGeneroMusical());
            printWriter.println(solista.getEdad());

            // Cerrar los flujos de escritura
            printWriter.close();
            fileWriter.close();

            // Agregar la acción a la bitácora
            bitacora.agregarAccion("Se ha guardado un nuevo solista: " + solista.getNombre());
        } catch (IOException e) {
            System.out.println("Error al guardar el solista en el archivo");
            e.printStackTrace();
        }
    }


    private void BOTON_AGREGAR_SOLISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_SOLISTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTON_AGREGAR_SOLISTAActionPerformed

    private void BOTON_AGREGAR_BANDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_BANDAMouseClicked
// Obtener los datos ingresados por el usuario
        String usuario = USUARIO_BANDA.getText();
        String contraseña = CONTRASEÑA_BANDA.getText();
        String nombre = NOMBRE_BANDA.getText();
        int numeroIntegrantes = (int) NUM_INTEGRANTES_BANDA.getValue();
        String generoMusical = GENERO_BANDA.getText();

        // Crear una instancia de la banda
        Banda banda = new Banda(usuario, contraseña, nombre, generoMusical, numeroIntegrantes);

        String cancion = CANCION_BANDA.getText();
        int duracionSegundos = (int) DURACION_BANDA.getValue();
        // Agregar los datos a la tabla
        String[] rowData = {cancion, String.valueOf(duracionSegundos)};
        CANCIONES_BANDASModel.addRow(rowData);
        // Agregar el solista a la lista de artistas
        listaArtistas.add(banda);

        // Agregar un tiempo de espera de 5 segundos antes de guardar
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Guardar la banda en la base de datos, archivo, etc.
                guardarBanda(banda);

                // Mostrar un mensaje de confirmación
                JOptionPane.showMessageDialog(null, "La banda se ha creado exitosamente");

                // Restablecer los campos de entrada
                USUARIO_BANDA.setText("");
                CONTRASEÑA_BANDA.setText("");
                NOMBRE_BANDA.setText("");
                NUM_INTEGRANTES_BANDA.setValue(0);
                GENERO_BANDA.setText("");
                CANCION_BANDA.setText("");
                DURACION_BANDA.setValue(0);
            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        timer.start();
    }//GEN-LAST:event_BOTON_AGREGAR_BANDAMouseClicked

    public void guardarBanda(Banda banda) {
        try {
            // Crear un objeto FileWriter para escribir en el archivo
            FileWriter fileWriter = new FileWriter("Bandas.txt", true);

            // Crear un objeto PrintWriter para escribir en el archivo de manera formateada
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escribir los datos de la banda en el archivo
            printWriter.println(banda.getUsuario());
            printWriter.println(banda.getContraseña());
            printWriter.println(banda.getNombre());
            printWriter.println(banda.getNumeroIntegrantes());
            printWriter.println(banda.getGeneroMusical());

            // Cerrar los flujos de escritura
            printWriter.close();
            fileWriter.close();

            // Agregar la acción a la bitácora
            bitacora.agregarAccion("Se ha guardado una nueva banda: " + banda.getNombre());
        } catch (IOException e) {
            System.out.println("Error al guardar la banda en el archivo");
            e.printStackTrace();
        }
    }
    private void BOTON_AGREGAR_BANDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_AGREGAR_BANDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTON_AGREGAR_BANDAActionPerformed

    private void USUARIO_ADMIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USUARIO_ADMIMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_USUARIO_ADMIMouseClicked

    private void USUARIO_ADMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIO_ADMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USUARIO_ADMIActionPerformed

    private void ADMINISTRADORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINISTRADORMouseClicked
        // TODO add your handling code here:

        jd_LoginAdministrador.pack();
        jd_LoginAdministrador.setLocationRelativeTo(this);
        jd_LoginAdministrador.setModal(true);
        jd_LoginAdministrador.setVisible(true);
    }//GEN-LAST:event_ADMINISTRADORMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CARGAR_LISTA_BANDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CARGAR_LISTA_BANDAMouseClicked
        // Obtener la canción y su duración

        // Agregar un tiempo de espera de 5 segundos antes de guardar
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar un mensaje de confirmación
                LISTA_CANCIONES_BANDA.setModel(CANCIONES_BANDASModel);
                JOptionPane.showMessageDialog(null, "LISTADO exitosamente");

            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        timer.start();
    }//GEN-LAST:event_CARGAR_LISTA_BANDAMouseClicked

    private void PROGRESO_GUARDADO(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROGRESO_GUARDADO
        // TODO add your handling code here:
        VENTANA_CARGANDO_5.pack();
        VENTANA_CARGANDO_5.setLocationRelativeTo(this);
        VENTANA_CARGANDO_5.setModal(true);
        VENTANA_CARGANDO_5.setVisible(true);
        ab.start();
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                VENTANA_CARGANDO_5.setVisible(false);
            }
        });
        timer.setRepeats(false); // Solo se ejecutará una vez

        //VENTANA_CARGANDO_5.setVisible(false);
        timer.start();
    }//GEN-LAST:event_PROGRESO_GUARDADO

    private void BOTON_INGRESAR_ADMIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOTON_INGRESAR_ADMIMouseClicked
        BITACORA.pack();
        BITACORA.setLocationRelativeTo(this);
        BITACORA.setModal(true);
        BITACORA.setVisible(true);
    }//GEN-LAST:event_BOTON_INGRESAR_ADMIMouseClicked

    private void ENTRAR_SIMULACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTRAR_SIMULACIONActionPerformed
        // TODO add your handling code here:
        SIMULACION.pack();
        SIMULACION.setLocationRelativeTo(this);
        SIMULACION.setModal(true);
        SIMULACION.setVisible(true);
    }//GEN-LAST:event_ENTRAR_SIMULACIONActionPerformed

    private void botonEjecutarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarSimulacionActionPerformed

    }//GEN-LAST:event_botonEjecutarSimulacionActionPerformed


    private void botonSeleccionarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeleccionarEventoMouseClicked
        // Obtener la cadena seleccionada del JComboBox
        String eventoSeleccionado = (String) comboBoxEventos.getSelectedItem();

        // Buscar el objeto Eventos correspondiente en la lista de eventos
        for (Eventos evento : listaEventos) {
            if (evento.toString().equals(eventoSeleccionado)) {
                JOptionPane.showMessageDialog(null, "SELECCIONADO EXITOSAMENTE");
                break;
            }
        }

        jButton7.setEnabled(true);
    }//GEN-LAST:event_botonSeleccionarEventoMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        ab.start();

        for (Eventos evento : listaEventos) {
            for (Canciones cancion : evento.getSetlist()) {
                Object[] rowData = {cancion.getNombre(), cancion.getDuracionSegundos(), evento.getArtista()};
                tablaCancionesModel.addRow(rowData);
                JOptionPane.showMessageDialog(null, "Agregando Cancion...");
                try {
                    Thread.sleep(1000); // Espera de 1 segundo entre cada canción
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        tablaCanciones.setModel(tablaCancionesModel);


    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        ab.setAvanzar(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        ab.setAvanzar(true);
    }//GEN-LAST:event_jButton8MouseClicked

    private void CARGAR_LISTA_ARTISTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CARGAR_LISTA_ARTISTASMouseClicked
        // TODO add your handling code here:

        for (Artista artista : listaArtistas) {
            for (Canciones cancion : artista.getListaCanciones()) {
                Object[] rowData = {artista.getNombre(), cancion.getNombre()};
                Model.addRow(rowData);
            }
        }

        LISTA_ARTISTAS.setModel(Model);
    }//GEN-LAST:event_CARGAR_LISTA_ARTISTASMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tablaBitacoraModel = (DefaultTableModel) tablaBitacora.getModel();
        try {
            // Leer el archivo de bitácora y agregar los datos a la tabla
            FileReader fileReader = new FileReader("./bitacora.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(" ");
                Object[] rowData = {data[0], data[1], data[2]};
                tablaBitacoraModel.addRow(rowData);
            }
            bufferedReader.close();
            fileReader.close();

            // Actualizar la vista de la tabla
            tablaBitacora.revalidate();
            tablaBitacora.repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */// Crear la instancia de Bitacora
        // Crear la instancia de Bitacora
        SIMULATOR simulator = new SIMULATOR(); // Crear una instancia de SIMULATOR para acceder a la variable de instancia bitacora

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SIMULATOR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIMULATOR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIMULATOR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIMULATOR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SIMULATOR().setVisible(true);
            }
        }
        );
        // Al finalizar, guardar la bitácora
        simulator.bitacora.guardarBitacora();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMINISTRADOR;
    private javax.swing.JDialog BITACORA;
    private javax.swing.JButton BOTON_AGREGAR_BANDA;
    private javax.swing.JButton BOTON_AGREGAR_EVENTO;
    private javax.swing.JButton BOTON_AGREGAR_SOLISTA;
    private javax.swing.JButton BOTON_AGREGAR_USUARIO;
    private javax.swing.JButton BOTON_INGRESAR_ADMI;
    private javax.swing.JTextField CANCION_BANDA;
    private javax.swing.JTextField CANCION_SOLISTA;
    private javax.swing.JSpinner CANT_PERSONAS_EVENTO;
    private javax.swing.JButton CARGAR_LISTA_ARTISTAS;
    private javax.swing.JButton CARGAR_LISTA_BANDA;
    private javax.swing.JTextField CIUDAD_EVENTO;
    private javax.swing.JPasswordField CONTRASEÑA_ADMI;
    private javax.swing.JTextField CONTRASEÑA_BANDA;
    private javax.swing.JTextField CONTRASEÑA_SOLISTA;
    private javax.swing.JTextField CONTRASEÑA_USUARIO;
    private javax.swing.JSpinner DURACION_BANDA;
    private javax.swing.JSpinner DURACION_SOLISTA;
    private javax.swing.JSpinner EDAD_SOLISTA;
    private javax.swing.JSpinner EDAD_USUARIO;
    private javax.swing.JButton ENTRAR_SIMULACION;
    private com.toedter.calendar.JDateChooser FECHA_EVENTO;
    private javax.swing.JTextField GENERO_BANDA;
    private javax.swing.JTextField GENERO_SOLISTA;
    private javax.swing.JTable LISTA_ARTISTAS;
    private javax.swing.JTable LISTA_CANCIONES_BANDA;
    private javax.swing.JTable LISTA_CANCIONES_SOLISTA;
    private javax.swing.JTextField LUGAR_EVENTO;
    private javax.swing.JTextField NOMBRE_BANDA;
    private javax.swing.JTextField NOMBRE_SOLISTA;
    private javax.swing.JTextField NOMBRE_USUARIO;
    private javax.swing.JSpinner NUM_INTEGRANTES_BANDA;
    private javax.swing.JButton REGISTRAR_ARTISTA;
    private javax.swing.JButton REGISTRAR_BANDA;
    private javax.swing.JButton REGISTRAR_EVENTO;
    private javax.swing.JButton REGISTRAR_SOLISTA;
    private javax.swing.JButton REGISTRAR_USUARIO;
    private javax.swing.JDialog SIMULACION;
    private javax.swing.JTextField USUARIO_ADMI;
    private javax.swing.JTextField USUARIO_BANDA;
    private javax.swing.JTextField USUARIO_SOLISTA;
    private javax.swing.JTextField USUARIO_USUARIO;
    private javax.swing.JDialog VENTANA_CARGANDO_5;
    private javax.swing.JButton botonSeleccionarEvento;
    private javax.swing.JComboBox<String> comboBoxEventos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_AgregarBanda;
    private javax.swing.JDialog jd_AgregarEvento;
    private javax.swing.JDialog jd_AgregarSolista;
    private javax.swing.JDialog jd_AgregarUsuario;
    private javax.swing.JDialog jd_LoginAdministrador;
    private javax.swing.JDialog jd_TipoArtista;
    private javax.swing.JProgressBar pg_1;
    private javax.swing.JProgressBar pg_3;
    private javax.swing.JTable tablaBitacora;
    private javax.swing.JTable tablaCanciones;
    // End of variables declaration//GEN-END:variables
administrarBarra2 ab;
}
