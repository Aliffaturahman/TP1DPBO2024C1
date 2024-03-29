/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

import java.util.List;

public class Character {
    private int id;
    private String name;
    private String gender;
    private String weapon;
    private String role;
    private int hp;
    private int atk;
    private List<Inventory> inventory;
    private List<Skill> skills;
    private List<NPC> npcs;

    // Constructor, getter and setter methods
    public Character(int id, String name, String gender, String weapon, String role,
                     int hp, int atk, List<Inventory> inventory, List<Skill> skills, List<NPC> npcs) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.weapon = weapon;
        this.role = role;
        this.hp = hp;
        this.atk = atk;
        this.inventory = inventory;
        this.skills = skills;
        this.npcs = npcs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<NPC> getNpcs() {
        return npcs;
    }

    public void setNpcs(List<NPC> npcs) {
        this.npcs = npcs;
    }
    
}
