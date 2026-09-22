package pokemonui;

public class PokemonManager {

    String[] pokemon = new String[5];
    int[] damage = new int[5];

    public void populatePokemon() {
        pokemon[0] = "Pikachu";
        pokemon[1] = "Charizard";
        pokemon[2] = "Mewtwo";
        pokemon[3] = "Gengar";
        pokemon[4] = "Rayquaza";
    }

    public void populateDamage() {
        damage[0] = 55;
        damage[1] = 84;
        damage[2] = 110;
        damage[3] = 65;
        damage[4] = 150;
    }

    public String display() {
        String out = "";
        for (int i = 0; i < pokemon.length; i++) {
            out = out + pokemon[i] + " " + damage[i] + "\n";
        }
        return out;
        
        
    }
}
