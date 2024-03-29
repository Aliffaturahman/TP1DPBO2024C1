/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

public class NPC {
    private String name;
    private String gender;
    private String weapon;
    private String role;
    private int hp;
    private int atk;
    private String characteristic;

    // Constructor
    public NPC(String name, String gender, String weapon, String role, int hp, int atk, String characteristic) {
        this.name = name;
        this.gender = gender;
        this.weapon = weapon;
        this.role = role;
        this.hp = hp;
        this.atk = atk;
        this.characteristic = characteristic;
    }

    // Getter and setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getHP() {
        return hp;
    }

    public void setATK(int atk) {
        this.atk = atk;
    }

    public int getATK() {
        return atk;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }
}
