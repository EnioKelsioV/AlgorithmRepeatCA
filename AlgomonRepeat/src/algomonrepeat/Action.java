/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package algomonrepeat;

/**
 *
 * @author eniomagalhaes
 */

//Action interface for different characteractions
public interface Action {
    void execute(Player player, Player opponent);

    public void execute(Player currentPlayer, Player opponent);
}

// Attack action implementation
public class AttackAction implements Action {
    @Override
    public void execute(Player player, Player opponent) {
        player.getActiveCharacter().attack(opponent.getActiveCharacter());
    }
}

// Defend action implementation
public class DefendAction implements Action {
    @Override
    public void execute(Player player, Player opponent) {
        player.getActiveCharacter().defend();
    }
}

// Inhibit action implementation
public class InhibitAction implements Action {
    @Override
    public void execute(Player player, Player opponent) {
        player.getActiveCharacter().inhibit(opponent.getActiveCharacter());
    }
}

// Swap action implementation
public class SwapAction implements Action {
    private int index;

    // Constructor to specify which character to swap to
    public SwapAction(int index) {
        this.index = index;
    }

    @Override
    public void execute(Player player, Player opponent) {
        player.swapActiveCharacter(index);
    }
    
}
