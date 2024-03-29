/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

public class Player {
    private String playerName;
    private int playerAge;
    private String playerGender;

    public Player(String playerName, int playerAge, String playerGender) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerGender = playerGender;
    }

    // Getter and setter methods
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public String getPlayerGender() {
        return playerGender;
    }

    public void setPlayerGender(String playerGender) {
        this.playerGender = playerGender;
    }
}
