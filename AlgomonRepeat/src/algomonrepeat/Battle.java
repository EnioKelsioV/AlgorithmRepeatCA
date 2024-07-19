/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomonrepeat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author eniomagalhaes
 */
class Battle {
    private final Player player1;
    private final Player player2;

    // Constructor to initialize a battle with two players
    public Battle(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // Start the battle
    public void start() {
        // Continue the battle until one player has no active characters
        while (player1.hasActiveCharacter() && player2.hasActiveCharacter()) {
            // Calculate turn order based on speed
            List<Character> turnOrder = calculateTurnOrder();
            for (Character character : turnOrder) {
                if (!player1.hasActiveCharacter() || !player2.hasActiveCharacter()) break;

                if (player1.getActiveCharacter() == character) {
                    takeTurn(player1, player2);
                } else {
                    takeTurn(player2, player1);
                }
            }

            // Remove defeated characters from both players
            player1.removeDefeatedCharacter();
            player2.removeDefeatedCharacter();
        }

        // Determine and print the winner
        if (player1.hasActiveCharacter()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    // Calculate the order of turns based on character speeds
    private List<Character> calculateTurnOrder() {
        List<Character> characters = new ArrayList<>();
        if (player1.hasActiveCharacter()) characters.add(player1.getActiveCharacter());
        if (player2.hasActiveCharacter()) characters.add(player2.getActiveCharacter());
        characters.sort(Comparator.comparingInt(Character::getSpeed).reversed());
        return characters;
    }

    // Take a turn for the current player against the opponent
    private void takeTurn(Player currentPlayer, Player opponent) {
        // For simplicity, always choose attack in this example
        Action action = new AttackAction();
        action.execute(currentPlayer, opponent);
    }
    
}
