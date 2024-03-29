/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

public class Friend extends NPC {
    private String quest;
    private String rewardItem;

    public Friend(String name, String gender, String weapon, String role, int hp, int atk, String characteristic,
                  String quest, String rewardItem) {
        super(name, gender, weapon, role, hp, atk, characteristic);
        this.quest = quest;
        this.rewardItem = rewardItem;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getRewardItem() {
        return rewardItem;
    }

    public void setRewardItem(String rewardItem) {
        this.rewardItem = rewardItem;
    }

    public void Menyapa() {
        System.out.println("\nFriend: Halo orang hebat, bahagia selalu ya senang bertemu dengan anda!");
    }

    public void MemintaQuest(String item) {
        System.out.println("\nFriend: Untuk mendapatkan sebuah quest dari saya, Carikan saya sebuah item bernama " + item + " terlebih dahulu. Setelah anda mendapatkan item tersebut, anda dapat mengerjakan quest yang nantinya dapat meningkatkan HP dan ATK anda sendiri");
        System.out.println("\n~ Anda memberikan apa yang diminta berupa 1 buah " + item + " ~");
    }

    public void GiveQuest() {
        System.out.println("\nFriend: Terima kasih, dan sekarang quest untukmu adalah '" + quest + "'");
    }

    public void MenanyakanInformasi(String nama, String role, String weapon) {
        System.out.println("\nFriend: Perkenalkan saya " + nama + ". Saya adalah seorang " + role + " yang tinggal di dalam kerajaan yang makmur ini, setiap hari saya membawa " + weapon + " karena ini sudah menjadi tugas saya dan sayapun senang menjalani pekerjaan ini. Saya akan melakukan apapun untuk membahagiakan keluarga saya dan berkontribusi untuk kerajaan");
    }

}
