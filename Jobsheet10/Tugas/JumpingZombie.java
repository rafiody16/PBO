package Tugas;

public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += health * 0.30;  
        } else if (level == 2) {
            health += health * 0.40;  
        } else if (level == 3) {
            health += health * 0.50;  
        }
    }
    
    @Override
    public void destroyed() {
        health -= health * 0.01;
        if (health < 0) {
            health = 0; 
        }
    }

    @Override
    public String getZombieInfo() {
        return ("Jumping Zombie Data = \nHealth = "+health+"\n"+"Level = "+level);
    }
    
}
