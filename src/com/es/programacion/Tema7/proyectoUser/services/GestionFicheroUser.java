package com.es.programacion.Tema7.proyectoUser.services;

import com.es.programacion.Tema7.proyectoUser.model.User;

import java.io.*;
import java.util.ArrayList;

/*
public class GestionFicheroUser {

    public ArrayList<User> leerFicheroUsers(String ruta) {

        // Creamos un ArrayList de usuariosTemporal
        ArrayList<User> arrUserTemporal = new ArrayList<>();

        try {
            // Primero abrimos el File
            File fichero = new File(ruta);

            // Comprobar que el fichero existe
            if (fichero.exists()) {
                // Abrimos los flujos
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                // Operamos con el fichero
                String linea = br.readLine();
                while (linea != null){
                    String id_user = "";
                    String name_user = "";
                    String pass_user = "";
                    String is_admin_user = "";

                    String[] valores = linea.split(":");

                    id_user = valores[0];
                    name_user = valores[1];
                    pass_user = valores[2];
                    is_admin_user = valores[3];

                    boolean isAadmin = Boolean.parseBoolean(is_admin_user);

                    User u = new User(id_user, name_user, pass_user, isAadmin);
                    arrUserTemporal.add(u);

                    linea = br.readLine();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrUserTemporal;
    }

    public void modificarFicheroUsers(ArrayList<User> users, String ruta) {

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura
                fw = new FileWriter(fichero, false);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                // a) Recorremos el arrayList que queremos escribir en el fichero
                for (User u : users) {
                    // b) escribrimos en el fichero
                    bw.write(u.getId()+":"+u.getName()+":"+u.getPass()+":");
                    bw.write(u.isAdmin()+"");
                    bw.write("\n");
                }

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void anadirFicheroUsers(User u, String ruta) {
        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                bw.write(u.getId()+":"+u.getName()+":"+u.getPass()+":");
                bw.write(u.isAdmin()+"");
                bw.write("\n");


                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

*/