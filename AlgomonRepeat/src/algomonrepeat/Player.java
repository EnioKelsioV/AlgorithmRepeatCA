/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomonrepeat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eniomagalhaes
 */
class Player {
     private String name;
    private List<Character> characters;
    private Character activeCharacter;

    // Constructor to initialize a player with a name
    public Player(String name) {
        this.name = name;
        this.characters = new ArrayList<>();
    }

    // Add a character to the player's team (up to 6 characters)
    public void addCharacter(Character character) {
        if (characters.size() < 6) {
            characters.add(character);
            // Automatically set the first character as active
            if (characters.size() == 1) {
                activeCharacter = character;
            }
        } else {
            System.out.println("Cannot add more than 6 characters.");
        }
    }

    // Get the currently active character
    public Character getActiveCharacter() {
        return activeCharacter;
    }

    // Swap the active character with another character in the team
    public void swapActiveCharacter(int index) {
        if (index >= 0 && index < characters.size()) {
            activeCharacter = characters.get(index);
            System.out.println(name + " swaps to " + activeCharacter.getName() + ".");
        } else {
            System.out.println("Invalid character index.");
        }
    }

    // Check if the player has an active character that is not defeated
    public boolean hasActiveCharacter() {
        return activeCharacter != null && activeCharacter.getHealth() > 0;
    }

    // Remove defeated characters from the team and set a new active character if needed
    public void removeDefeatedCharacter() {
        characters.removeIf(character -> character.getHealth() <= 0);
        if (!hasActiveCharacter() && !characters.isEmpty()) {
            activeCharacter = characters.get(0); // Swap to first available character
            System.out.println(name + " swaps to " + activeCharacter.getName() + " due to defeat.");
        }
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
