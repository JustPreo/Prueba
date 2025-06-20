/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import javax.swing.ImageIcon;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class JTunes {
    private Song canciones[];
    
    public JTunes(){
        canciones= new Song[10];
    }
    
    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco){
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        //Busqueda de cancion con codigo
        int code=codigo;
        String name= nombre;
        double price= precio;
        ImageIcon portada = imagenDisco;
        
        //Chequeo de existencia de canciones
        /*if(canciones.length<1){
            canciones[0]= new Song(code, name, price, portada);
            System.out.println("Se ha guardado agregado la cancion exitosamente");
            return true;
        }*/
            int i = 0;
         System.out.println("Paso 1"); 
        for(Song cancionBusq: canciones){
            if (cancionBusq == null){
                
            //if(code==cancionBusq.getCodigo()){
                canciones[i]= new Song(code, name, price, portada);
               
                return true;
            //}
            
            }
            
            i++;
           }
        
        
        
  
        
  
        return false;
        
    }
    
    public Song searchSong(int codigo){
        for(Song cancionBusq: canciones){
            if (cancionBusq != null){
           if(codigo==cancionBusq.getCodigo()){
               return cancionBusq;
           }
            }
        }
        return null;
    }
    
    public void rateSong(int codigo, int stars){
        Song cancionEncontrada = searchSong(codigo);
        cancionEncontrada.addStars(stars);
    }
    
    public Song[] getAllSong(){
    
        return canciones;
    }
    
    
    
    
    
}
