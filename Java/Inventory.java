/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

public class Inventory {
    private int coin;
    private int key;
    private String rareItem;

    // Constructor, getter and setter methods
    public Inventory(int coin, int key, String rareItem) {
        this.coin = coin;
        this.key = key;
        this.rareItem = rareItem;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getRareItem() {
        return rareItem;
    }

    public void setRareItem(String rareItem) {
        this.rareItem = rareItem;
    }
}
