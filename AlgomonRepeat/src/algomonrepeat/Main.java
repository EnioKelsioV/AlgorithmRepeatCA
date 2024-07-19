/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algomonrepeat;

/**
 *
 * @author eniomagalhaes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Add characters to players
        player1.addCharacter(new Character("Char1", 10, 5, 7, 30));
        player1.addCharacter(new Character("Char2", 12, 6, 8, 35));

        player2.addCharacter(new Character("CharA", 11, 4, 6, 33));
        player2.addCharacter(new Character("CharB", 9, 7, 9, 28));

        // Create a battle and start it
        Battle battle = new Battle(player1, player2);
        battle.start();
    }
    
}
