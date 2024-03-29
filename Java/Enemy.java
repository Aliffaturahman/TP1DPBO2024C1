/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

public class Enemy extends NPC {
    private String attack;
    private String getReward;
    private int upgradePower;

    public Enemy(String name, String gender, String weapon, String role, int hp, int atk, String characteristic,
                 String attack, String getReward, int upgradePower) {
        super(name, gender, weapon, role, hp, atk, characteristic);
        this.attack = attack;
        this.getReward = getReward;
        this.upgradePower = upgradePower;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getGetReward() {
        return getReward;
    }

    public void setGetReward(String getReward) {
        this.getReward = getReward;
    }

    public int getUpgradePower() {
        return upgradePower;
    }

    public void setUpgradePower(int upgradePower) {
        this.upgradePower = upgradePower;
    }

    public void Ucapan() {
        System.out.println("\nEnemy: Hahahah! orang sepertimu terlihat sangat lemah, haruskah aku mengasihanimu?");
    }

    public void AttackPlayer() {
        System.out.println("\nEnemy: " + attack);
    }

    public void RewardPlayer() {
        System.out.println("\nEnemy: Arrgh kau berhasil mengalahkanku!");
        System.out.println("\n~ Selamat anda berhasil mengalahkan musuh, anda mendapatkan 1 buah : " + getReward + " ~");
    }

    public void UpgradePower() {
        System.out.println("\nEnemy: Tidak! kekuatanku hilang dan beralih kedalam dirimu!");
        System.out.println("\n~ Selamat kekuatan anda meningkat sebanyak " + upgradePower + "!");
    }
}
