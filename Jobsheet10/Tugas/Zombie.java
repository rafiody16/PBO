package Tugas;

public class Zombie implements Destroyable{

    protected int health;
    protected int level;

    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return ("health = "+health+"\n"+"level = "+level);
    }
    
}
