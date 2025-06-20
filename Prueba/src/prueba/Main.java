/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        JTunes newJTune= new JTunes();
    Menu menu = new Menu(newJTune);
        menu.setResizable(false);
        menu.setVisible(true);
    }
    
    
    
}
