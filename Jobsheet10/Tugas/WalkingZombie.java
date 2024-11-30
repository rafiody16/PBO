package Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += health * 0.20;  
        } else if (level == 2) {
            health += health * 0.30;  
        } else if (level == 3) {
            health += health * 0.40;  
        }
    }
    
    @Override
    public void destroyed() {
        health -= health * 0.02;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String getZombieInfo() {
        return ("Walking Zombie Data = \nHealth = "+health+"\n"+"Level = "+level);
    }

}
