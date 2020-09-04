/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_tylercruz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tyler C
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_CrearCacion = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JT_Nombre = new javax.swing.JTextField();
        JSpinner_Puntuacion = new javax.swing.JSpinner();
        JT_Artista = new javax.swing.JTextField();
        JT_Album = new javax.swing.JTextField();
        JT_Ano = new javax.swing.JTextField();
        JB_CrearCancion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Canciones = new javax.swing.JTable();
        JB_LimpiarTable = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JB_CrearPlaylist = new javax.swing.JButton();
        JB_Modificar_Song = new javax.swing.JButton();
        JB_GuardarPlayList = new javax.swing.JButton();
        JD_ShowSongs = new javax.swing.JDialog();
        MainPanel_ShowSongs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_ShowSongs = new javax.swing.JTable();
        JD_ModificarCancion = new javax.swing.JDialog();
        MainPanelCanciones = new javax.swing.JPanel();
        Main_MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_CrearCancion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Nombre: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Puntuacion:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Artista:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Album: ");

        JSpinner_Puntuacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        JT_Album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_AlbumActionPerformed(evt);
            }
        });

        JT_Ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_AnoActionPerformed(evt);
            }
        });

        JB_CrearCancion.setText("Crear");
        JB_CrearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearCancionActionPerformed(evt);
            }
        });

        JTable_Canciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuacion", "Año", "Artista", "Album"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable_Canciones);

        JB_LimpiarTable.setText("Limpiar");
        JB_LimpiarTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LimpiarTableActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JB_CrearPlaylist.setText("Crear Playlist");
        JB_CrearPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearPlaylistActionPerformed(evt);
            }
        });

        JB_Modificar_Song.setText("Modificar");
        JB_Modificar_Song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Modificar_SongActionPerformed(evt);
            }
        });

        JB_GuardarPlayList.setText("Guardar Playlist");

        javax.swing.GroupLayout JD_CrearCacionLayout = new javax.swing.GroupLayout(JD_CrearCacion.getContentPane());
        JD_CrearCacion.getContentPane().setLayout(JD_CrearCacionLayout);
        JD_CrearCacionLayout.setHorizontalGroup(
            JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                        .addComponent(JB_GuardarPlayList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_CrearPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_Modificar_Song)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_LimpiarTable))
                    .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT_Artista))
                            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT_Ano))
                            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JSpinner_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JB_CrearCancion)
                                    .addComponent(JT_Album))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        JD_CrearCacionLayout.setVerticalGroup(
            JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CrearCacionLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JSpinner_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JT_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JT_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JT_Album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JB_CrearCancion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_CrearCacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_LimpiarTable)
                    .addComponent(jButton1)
                    .addComponent(JB_CrearPlaylist)
                    .addComponent(JB_Modificar_Song)
                    .addComponent(JB_GuardarPlayList))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        JTable_ShowSongs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuacion", "Año", "Artista", "Album"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTable_ShowSongs);

        javax.swing.GroupLayout MainPanel_ShowSongsLayout = new javax.swing.GroupLayout(MainPanel_ShowSongs);
        MainPanel_ShowSongs.setLayout(MainPanel_ShowSongsLayout);
        MainPanel_ShowSongsLayout.setHorizontalGroup(
            MainPanel_ShowSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel_ShowSongsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        MainPanel_ShowSongsLayout.setVerticalGroup(
            MainPanel_ShowSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel_ShowSongsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_ShowSongsLayout = new javax.swing.GroupLayout(JD_ShowSongs.getContentPane());
        JD_ShowSongs.getContentPane().setLayout(JD_ShowSongsLayout);
        JD_ShowSongsLayout.setHorizontalGroup(
            JD_ShowSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel_ShowSongs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JD_ShowSongsLayout.setVerticalGroup(
            JD_ShowSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel_ShowSongs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_ModificarCancionLayout = new javax.swing.GroupLayout(JD_ModificarCancion.getContentPane());
        JD_ModificarCancion.getContentPane().setLayout(JD_ModificarCancionLayout);
        JD_ModificarCancionLayout.setHorizontalGroup(
            JD_ModificarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_ModificarCancionLayout.setVerticalGroup(
            JD_ModificarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout MainPanelCancionesLayout = new javax.swing.GroupLayout(MainPanelCanciones);
        MainPanelCanciones.setLayout(MainPanelCancionesLayout);
        MainPanelCancionesLayout.setHorizontalGroup(
            MainPanelCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        MainPanelCancionesLayout.setVerticalGroup(
            MainPanelCancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        JMI_CrearCancion.setText("Crear Cancion");
        JMI_CrearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CrearCancionActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CrearCancion);

        jMenuItem2.setText("Abrir Playlist");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Modificar Cancion");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Remover Cancion");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        Main_MenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        Main_MenuBar.add(jMenu2);

        setJMenuBar(Main_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanelCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanelCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_AnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_AnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_AnoActionPerformed

    private void JT_AlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_AlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_AlbumActionPerformed

    private void JB_LimpiarTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LimpiarTableActionPerformed
        // TODO add your handling code here:
        JTable_Canciones.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Puntuacion", "Año", "Artista", "Album"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
    }//GEN-LAST:event_JB_LimpiarTableActionPerformed

    private void JB_CrearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearCancionActionPerformed
        // TODO add your handling code here:
        Cancion x = new Cancion(this.JT_Nombre.getText(), this.JSpinner_Puntuacion.getValue().toString(), this.JT_Ano.getText(),
                this.JT_Artista.getText(), this.JT_Album.getText());
        DefaultTableModel modelo
                = (DefaultTableModel) this.JTable_Canciones.getModel();
        Object[] newrow = {
            x.getNombre(),
            x.getPuntuacion(),
            x.getAno(),
            x.getArtista(),
            x.getAlbum()
        };
        modelo.addRow(newrow);
        this.JTable_Canciones.setModel(modelo);


    }//GEN-LAST:event_JB_CrearCancionActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void JMI_CrearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CrearCancionActionPerformed
        // TODO add your handling code here:
        JD_CrearCacion.setModal(true);
        JD_CrearCacion.pack();
        JD_CrearCacion.setLocationRelativeTo(this);
        JD_CrearCacion.setVisible(true);
    }//GEN-LAST:event_JMI_CrearCancionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            ((DefaultTableModel) JTable_Canciones.getModel()).removeRow(JTable_Canciones.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JB_Modificar_SongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Modificar_SongActionPerformed
        // TODO add your handling code here:
        try {
            Playlist u = new Playlist();
            u.adminCancion(fichero.getPath());
            u.ReadArchivo();
            String aux = "";
            for (Cancion sv : u.getPlaylist()) {
                aux += u.getPlaylist().indexOf(sv) + ">" + sv.getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice a modificar"));
            JOptionPane.showMessageDialog(null, "1. Nombre\n2. Puntuacion\n3. Ano\n4. Artista\n5. Album");
            int mod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el punto a modificar a modificar"));
            switch (mod) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                    u.getPlaylist().get(opc).setNombre(nombre);
                    break;
                case 2:
                    try {
                        String edad = JOptionPane.showInputDialog("Ingrese la nueva edad");
                        u.getPlaylist().get(opc).setPuntuacion(edad);
                        u.getPlaylist();
                    } catch (Exception e) {
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(this, "1. Humano 2. Amanto");
                    int raza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice de la nueva raza"));
                    String newRaza = "";
                    switch (raza) {
                        case 1:
                            newRaza = "Humano";
                            break;
                        case 2:
                            newRaza = "Amanto";
                            break;
                    }
                    u.getPlaylist().get(opc).setAno(newRaza);
                    break;
                case 4:
                    int newPod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo poder del ser"));
                    while (newPod < 1 || newPod > 10) {
                        JOptionPane.showMessageDialog(null, "INGRESE UN VALOR ENTRE 1 Y 10");
                        newPod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo poder del ser"));
                    }
                    String newArtista = Integer.toString(newPod);
                    u.getPlaylist().get(opc).setArtista(newArtista);
                    break;
                case 5:
                    String newPlanet = JOptionPane.showInputDialog("Ingrese el nuevo planeta del ser");
                    u.getPlaylist().get(opc).setAlbum(newPlanet);
                    break;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Cambio realizado exitosamente, cargue el universo nuevamente para revisarlo");
            u.WriteArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JB_Modificar_SongActionPerformed

    private void JB_CrearPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearPlaylistActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo
                = (DefaultTableModel) this.JTable_Canciones.getModel();
        int columnCount = JTable_Canciones.getColumnCount();
        int rowNumber = JTable_Canciones.getRowCount();
        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay seres vivos creados, no se puede crear Universo");
        } else {
            try {
                JFileChooser fc = new JFileChooser();
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de texto", "txt");
                fc.addChoosableFileFilter(filtro);
                int seleccion = fc.showSaveDialog(this);
                FileWriter fw = null;
                BufferedWriter bw = null;
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    try {
                        fichero = null;
                        if (fc.getFileFilter().getDescription().equals("Archivo de texto")) {
                            fichero = new File(fc.getSelectedFile().getPath());
                        } else {
                            fichero = fc.getSelectedFile();
                        }
                        fw = new FileWriter(fichero);//apunta al archivo
                        bw = new BufferedWriter(fw);//apunta al canal
                        for (int i = 0; i < rowNumber; i++) {
                            for (int j = 0; j < columnCount; j++) {
                                if (j == columnCount - 1) {
                                    bw.write(((String) modelo.getValueAt(i, j)));
                                    bw.write("\n");
                                } else {
                                    bw.write(((String) modelo.getValueAt(i, j)) + ";");
                                }
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
            }
    }//GEN-LAST:event_JB_CrearPlaylistActionPerformed
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private ArrayList<Cancion> canciones = new ArrayList();
    File fichero = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_CrearCancion;
    private javax.swing.JButton JB_CrearPlaylist;
    private javax.swing.JButton JB_GuardarPlayList;
    private javax.swing.JButton JB_LimpiarTable;
    private javax.swing.JButton JB_Modificar_Song;
    private javax.swing.JDialog JD_CrearCacion;
    private javax.swing.JDialog JD_ModificarCancion;
    private javax.swing.JDialog JD_ShowSongs;
    private javax.swing.JMenuItem JMI_CrearCancion;
    private javax.swing.JSpinner JSpinner_Puntuacion;
    private javax.swing.JTextField JT_Album;
    private javax.swing.JTextField JT_Ano;
    private javax.swing.JTextField JT_Artista;
    private javax.swing.JTextField JT_Nombre;
    private javax.swing.JTable JTable_Canciones;
    private javax.swing.JTable JTable_ShowSongs;
    private javax.swing.JPanel MainPanelCanciones;
    private javax.swing.JPanel MainPanel_ShowSongs;
    private javax.swing.JMenuBar Main_MenuBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}