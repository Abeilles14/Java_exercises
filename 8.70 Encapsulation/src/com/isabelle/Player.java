/*
 * unrestricted access, public vars, no need getter
 */

package com.isabelle;

public class Player {
    public String name;                         //dont make public fields
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player KO");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
