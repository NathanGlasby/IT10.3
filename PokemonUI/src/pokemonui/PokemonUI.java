/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemonui;

/**
 *
 * @author admin
 */
public class PokemonUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonManager pm = new PokemonManager();
        pm.populatePokemon();
        pm.populateDamage();
        System.out.println(pm.display());
        
    }
    
}
