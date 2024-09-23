package Tugas;

public class EncapDemo {
    
    private String name;
    private int age;

    public String getNama() {
        return name;
    }

    public void setNama(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else if (newAge < 18) {
            age = 18;
        } else {
            age = newAge;
        }
    }

}
