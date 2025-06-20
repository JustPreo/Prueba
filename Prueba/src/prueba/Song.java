/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class Song {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int totalReviews;
    private ImageIcon imagenDisco;

    public Song(int codigo, String nombre, double precio,ImageIcon imagenDisco) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.imagenDisco = imagenDisco;
        this.totalReviews = 0;
        this.sumaEstrellas = 0;
    }
    
    public int getCodigo()
    {
    return this.codigo;
    }
    
    public String getNombre()
    {
    return this.nombre;
    }
    
    public double getPrecio()
    {
    return this.precio;
    }
    
    public ImageIcon getImage()
    {
    return this.imagenDisco;
    }
    
    public boolean addStars(int stars)
    {
    if (stars >=0 && stars <= 5)
    {
    this.sumaEstrellas += stars;
    this.totalReviews ++;
    return true;
    }
        return false;
        
    }
    
    public int songRating()
    {
      if (totalReviews > 0)
      {
      return (sumaEstrellas/totalReviews);
      }
      return 0;
    
    }
    

    

}
