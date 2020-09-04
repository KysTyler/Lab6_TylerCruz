package lab6_tylercruz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Playlist {

    public ArrayList<Cancion> playlist = new ArrayList();
    //private String nombre;
    private File archivo = null;

    public Playlist() {
    }

//    public Playlist(String nombre) {
//        this.nombre = nombre;
//    }
    public void adminCancion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cancion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Cancion> playlist) {
        this.playlist = playlist;
    }

//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void WriteArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String aux = "";
        for (Cancion sv : playlist) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                aux += sv.getNombre() + "|" + sv.getNombre() + "|" + sv.getPuntuacion()
                        + "|" + sv.getAno() + "|" + sv.getArtista() + "\n";
                bw.write(aux);
            } catch (Exception e) {
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void ReadArchivo() {
//        try {
//            FileReader fr = new FileReader(archivo);
//            BufferedReader br = new BufferedReader(fr);
//            playlist = new ArrayList();
//            if (archivo.exists()) {
//                String linea = "";
//                try {
//                    while ((linea = br.readLine()) != null) {
//                        try {
//                            String datos[] = linea.split("|");
//                            Cancion sv = new Cancion(datos[0], datos[1], datos[2], datos[3], datos[4]);
//                            playlist.add(sv);
//                        } catch (Exception ex) {
//                        }
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(Playlist.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Playlist.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Scanner sc = null;
        playlist = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    playlist.add(new Cancion(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
