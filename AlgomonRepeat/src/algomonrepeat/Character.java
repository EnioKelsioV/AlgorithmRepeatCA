/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algomonrepeat;

/**
 *
 * @author eniomagalhaes
 */
public class Character {
     private final String name;
    private final int attack;
    private final int defense;
    private int speed;
    private int health;
    private boolean defending;
    
    public Character(String name, int attack, int defense, int speed, int health) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.health = health;
        this.defending = false;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    public boolean isDefending() {
        return defending;
    }

    public void attack(Character opponent) {
        int damage = attack - opponent.getDefense() / 2;
        damage = Math.max(damage, 0);  // Ensure damage is not negative
        opponent.setHealth(opponent.getHealth() - damage);
        System.out.println(name + " attacks " + opponent.getName() + " for " + damage + " damage.");
    }

    public void defend() {
        defending = true;
        System.out.println(name + " is defending.");
    }

    public void inhibit(Character opponent) {
        int newSpeed = (int) (opponent.getSpeed() * 0.9);
        opponent.setSpeed(newSpeed);
        System.out.println(name + " inhibits " + opponent.getName() + ", reducing their speed to " + newSpeed + ".");
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
