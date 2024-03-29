/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

public class Skill {
    private String skill1;
    private String skill2;
    private String skill3;
    private String ultimate;

    // Constructor, getter and setter methods
    public Skill(String skill1, String skill2, String skill3, String ultimate) {
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.ultimate = ultimate;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }
}
