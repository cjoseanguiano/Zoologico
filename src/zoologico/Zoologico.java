/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author carlosjoseanguiano
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aniamal aniamal = new Aniamal("A", 0, "B");
        
        aniamal.setNombre("1 Animal");
        aniamal.setEdad(2);
        aniamal.setTipo("Felino");
        
        System.out.println(aniamal.getEdad());
        System.out.println(aniamal.getNombre());
        System.out.println(aniamal.getTipo());
        
    }
    
}
