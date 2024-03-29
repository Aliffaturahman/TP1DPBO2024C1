/* 
    Saya Alif Faturahman Firdaus (2107377) mengerjakan Praktikum 1 dalam mata 
    kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti 
    yang telah dispesifikasikan. Aamiin.
*/

// ----- Praktikum Java ----- //

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Player
        Player Player1 = new Player("Fauzan", 20, "Male");
        Player Player2 = new Player("Mia", 20, "Female");
        Player Player3 = new Player("Loly", 21, "Female");
        Player Player4 = new Player("Moly", 21, "Female");

        // Create Inventory
        Inventory Inventory1 = new Inventory(100, 3, "Blood Wings");
        List<Inventory> inventories1 = new ArrayList<>();
        inventories1.add(Inventory1);
        
        Inventory Inventory2 = new Inventory(50, 4, "Blade of Despair");
        List<Inventory> inventories2 = new ArrayList<>();
        inventories2.add(Inventory2);
        
        Inventory Inventory3 = new Inventory(75, 1, "Immortal");
        List<Inventory> inventories3 = new ArrayList<>();
        inventories3.add(Inventory3);
        
        Inventory Inventory4 = new Inventory(30, 0, "Malefic Roar");
        List<Inventory> inventories4 = new ArrayList<>();
        inventories4.add(Inventory4);

        // Create Skill
        Skill Skill1 = new Skill("Moon Arrow", "Arrow of Eclipse", "Thousand Pounder", "Hidden Moonlight");
        List<Skill> skills1 = new ArrayList<>();
        skills1.add(Skill1);
        
        Skill Skill2 = new Skill("Blizzard", "Heal", "Bloody Hunt", "Meteor Shower");
        List<Skill> skills2 = new ArrayList<>();
        skills2.add(Skill2);
        
        Skill Skill3 = new Skill("Groundsplitter", "Whirling Smash", "Orbiting Swords", "Fission Wave");
        List<Skill> skills3 = new ArrayList<>();
        skills3.add(Skill3);
        
        Skill Skill4 = new Skill("Attack Wave", "Sacred Hammer", "Blender", "Implosion");
        List<Skill> skills4 = new ArrayList<>();
        skills4.add(Skill4);

        // Create NPC
        NPC NPC1 = new NPC("Adrian", "Male", "Sword", "Guardian", 100, 20, "Good Character");
        List<NPC> npcs1 = new ArrayList<>();
        npcs1.add(NPC1);

        NPC NPC2 = new NPC("Lyra", "Female", "Hoe", "Pedestrian", 60, 5, "Good Character");
        List<NPC> npcs2 = new ArrayList<>();
        npcs2.add(NPC2);

        NPC NPC3 = new NPC("Thor", "Male", "Hammer", "Monster", 300, 45, "Evil Character");
        List<NPC> npcs3 = new ArrayList<>();
        npcs3.add(NPC3);

        NPC NPC4 = new NPC("Gun Devil", "Male", "Gun", "Devil", 700, 300, "Evil Character");
        List<NPC> npcs4 = new ArrayList<>();
        npcs4.add(NPC4);

        NPC NPC5 = new NPC("Chainsaw Devil", "Male", "Chainsaw", "Devil", 1000, 450, "Evil Character");
        List<NPC> npcs5 = new ArrayList<>();
        npcs5.add(NPC5);

        // Create Friend
        Friend friend = new Friend("Olaf", "Male", "Staff", "Healer", 80, 15, "Good Character",
                "Menangkap Kelinci Ninja Putih!", "Healing Potion");

        // Create Enemy
        Enemy enemy = new Enemy("Mahito", "Male", "Sword", "Dark Knight", 120, 25, "Evil Character",
                "Dark Slash", "Holy Crystal", 30);

        
        // Create Character
        Character Character1 = new Character(1, "Nova", "Male", "Panah", "Marksman", 100, 15, inventories1, skills1, npcs1);
        Character Character2 = new Character(2, "Jane", "Female", "Tongkat Sihir", "Healer", 200, 5, inventories2, skills2, npcs1);
        Character Character3 = new Character(3, "Sora", "Male", "Pedang", "Fighter", 190, 20, inventories3, skills3, npcs1);
        Character Character4 = new Character(4, "Aloy", "Female", "Perisai", "Tank", 350, 10, inventories4, skills4, npcs1);

        Scanner scanner = new Scanner(System.in);
        int choice = 3;

        while (choice != 0) {
            System.out.println("\n+----------------------------------------+");
            System.out.println("|                MAIN MENU               |");
            System.out.println("+----------------------------------------+");
            System.out.println("|1. Melihat Informasi Player             |");
            System.out.println("|2. Menyelesaikan Quest                  |");
            System.out.println("|3. Bertarung                            |");
            System.out.println("|                                        |");
            System.out.println("|[0]. Keluar Program                     |");
            System.out.println("+----------------------------------------+");
            System.out.print("\nPilihan Anda: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewPlayerInformation(Player1);
                    viewPlayerInformation(Player2);
                    viewPlayerInformation(Player3);
                    viewPlayerInformation(Player4);
                    
                    System.out.println("\n+--------------------------+");
                    System.out.println("|  Pilih Player Tersedia:  |");
                    System.out.println("+--------------------------+");
                    System.out.println("|1. Fauzan                 |");
                    System.out.println("|2. Mia                    |");
                    System.out.println("|3. Loly                   |");
                    System.out.println("|4. Poly                   |");
                    System.out.println("|                          |");
                    System.out.println("|[0]. Kembali              |");
                    System.out.println("+--------------------------+");
                    System.out.print("\nPilihan Anda: ");
                    
                    int playerChoice;
                    playerChoice = scanner.nextInt();
                    
                    switch(playerChoice){
                        case 1:
                            viewPlayerInformation(Player1);
                            
                            // Submenu for Player Information
                            int submenuChoice = 4;
                            while (submenuChoice != 0) {
                                System.out.println("\n+--------------------------------+");
                                System.out.println("|  Sub Menu Player Information:  |");
                                System.out.println("+--------------------------------+");
                                System.out.println("|1. Lihat Informasi Character    |");
                                System.out.println("|2. Lihat Inventori Character    |");
                                System.out.println("|3. Lihat Skill Character        |");
                                System.out.println("|                                |");
                                System.out.println("|[0]. Kembali ke Menu Utama      |");
                                System.out.println("+--------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                submenuChoice = scanner.nextInt();
                                
                                switch (submenuChoice) {
                                    case 1:
                                        viewPlayerCharacters(Character1);
                                        break;
                                    case 2:
                                        viewPlayerInventory(inventories1);
                                        break;
                                    case 3:
                                        viewPlayerSkills(skills1);
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 2:
                            viewPlayerInformation(Player2);
                            
                            // Submenu for Player Information
                            submenuChoice = 4;
                            while (submenuChoice != 0) {
                                System.out.println("\n+--------------------------------+");
                                System.out.println("|  Sub Menu Player Information:  |");
                                System.out.println("+--------------------------------+");
                                System.out.println("|1. Lihat Informasi Character    |");
                                System.out.println("|2. Lihat Inventori Character    |");
                                System.out.println("|3. Lihat Skill Character        |");
                                System.out.println("|                                |");
                                System.out.println("|[0]. Kembali ke Menu Utama      |");
                                System.out.println("+--------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                submenuChoice = scanner.nextInt();
                                
                                switch (submenuChoice) {
                                    case 1:
                                        viewPlayerCharacters(Character2);
                                        break;
                                    case 2:
                                        viewPlayerInventory(inventories2);
                                        break;
                                    case 3:
                                        viewPlayerSkills(skills2);
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 3:
                            viewPlayerInformation(Player3);
                            
                            // Submenu for Player Information
                            submenuChoice = 4;
                            while (submenuChoice != 0) {
                                System.out.println("\n+--------------------------------+");
                                System.out.println("|  Sub Menu Player Information:  |");
                                System.out.println("+--------------------------------+");
                                System.out.println("|1. Lihat Informasi Character    |");
                                System.out.println("|2. Lihat Inventori Character    |");
                                System.out.println("|3. Lihat Skill Character        |");
                                System.out.println("|                                |");
                                System.out.println("|[0]. Kembali ke Menu Utama      |");
                                System.out.println("+--------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                submenuChoice = scanner.nextInt();
                                
                                switch (submenuChoice) {
                                    case 1:
                                        viewPlayerCharacters(Character3);
                                        break;
                                    case 2:
                                        viewPlayerInventory(inventories3);
                                        break;
                                    case 3:
                                        viewPlayerSkills(skills3);
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }   
                            break;
                        case 4:
                            viewPlayerInformation(Player4);
                            
                            // Submenu for Player Information
                            submenuChoice = 4;
                            while (submenuChoice != 0) {
                                System.out.println("\n+--------------------------------+");
                                System.out.println("|  Sub Menu Player Information:  |");
                                System.out.println("+--------------------------------+");
                                System.out.println("|1. Lihat Informasi Character    |");
                                System.out.println("|2. Lihat Inventori Character    |");
                                System.out.println("|3. Lihat Skill Character        |");
                                System.out.println("|                                |");
                                System.out.println("|[0]. Kembali ke Menu Utama      |");
                                System.out.println("+--------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                submenuChoice = scanner.nextInt();
                                
                                switch (submenuChoice) {
                                    case 1:
                                        viewPlayerCharacters(Character4);
                                        break;
                                    case 2:
                                        viewPlayerInventory(inventories4);
                                        break;
                                    case 3:
                                        viewPlayerSkills(skills4);
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan aaaaa tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 2:
                    viewNPCInformation(NPC1);
                    viewNPCInformation(NPC2);
                    
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|  Ingin Mengobrol Dengan Siapa:  |");
                    System.out.println("+---------------------------------+");
                    System.out.println("|1. Adrian (Guardian)             |");
                    System.out.println("|2. Lyra (Pedestrian)             |");
                    System.out.println("|                                 |");
                    System.out.println("|[0]. Kembali                     |");
                    System.out.println("+---------------------------------+");
                    System.out.print("\nPilihan Anda: ");
                    
                    int npcChoice;
                    npcChoice = scanner.nextInt();
                    
                    switch(npcChoice){
                        case 1:
                        // Submenu for Player Information
                            int subNpcChoice = 4;
                            while (subNpcChoice != 0) {
                                System.out.println("\n+----------------------------------+");
                                System.out.println("|       Sub Menu NPC Option :      |");
                                System.out.println("+----------------------------------+");
                                System.out.println("|1. Menyapa                        |");
                                System.out.println("|2. Meminta Quest                  |");
                                System.out.println("|3. Menanyakan Informasi           |");
                                System.out.println("|                                  |");
                                System.out.println("|[0]. Kembali ke Menu Utama        |");
                                System.out.println("+----------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                subNpcChoice = scanner.nextInt();
                                
                                switch (subNpcChoice) {
                                    case 1:
                                        friend.Menyapa();
                                        break;
                                    case 2:
                                        friend.MemintaQuest("Blood Wings");
                                        friend.GiveQuest();
                                        break;
                                    case 3:
                                        friend.MenanyakanInformasi("Adrian", "Guardian", "Sword");
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 2:
                            // Submenu for Player Information
                            subNpcChoice = 4;
                            while (subNpcChoice != 0) {
                                System.out.println("\n+----------------------------------+");
                                System.out.println("|       Sub Menu NPC Option :      |");
                                System.out.println("+----------------------------------+");
                                System.out.println("|1. Menyapa                        |");
                                System.out.println("|2. Meminta Quest                  |");
                                System.out.println("|3. Menanyakan Informasi           |");
                                System.out.println("|                                  |");
                                System.out.println("|[0]. Kembali ke Menu Utama        |");
                                System.out.println("+----------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                subNpcChoice = scanner.nextInt();
                                
                                switch (subNpcChoice) {
                                    case 1:
                                        friend.Menyapa();
                                        break;
                                    case 2:
                                        friend.MemintaQuest("Blade of Despair");
                                        friend.GiveQuest();
                                        break;
                                    case 3:
                                        friend.MenanyakanInformasi("Lyra", "Pedestrian", "Hoe");
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 3:
                    viewNPCInformation(NPC3);
                    viewNPCInformation(NPC4);
                    viewNPCInformation(NPC5);

                    System.out.println("\n+---------------------------------+");
                    System.out.println("|                ?                |");
                    System.out.println("+---------------------------------+");
                    System.out.println("|1. Thor (Monster)                |");
                    System.out.println("|2. Gun Devil (Devil)             |");
                    System.out.println("|3. Chainsaw Devil (Devil)        |");
                    System.out.println("|                                 |");
                    System.out.println("|[0]. Kembali                     |");
                    System.out.println("+---------------------------------+");
                    System.out.print("\nPilihan Anda: ");
                    
                    int evilChoice;
                    evilChoice = scanner.nextInt();
                    
                    switch(evilChoice){
                        case 1:
                            // Submenu for Player Information
                            int subNpcChoice = 4;
                            while (subNpcChoice != 0) {
                                System.out.println("\n+-----------------------------------+");
                                System.out.println("|    Apa yang Ingin Anda Lakukan?   |");
                                System.out.println("+-----------------------------------+");
                                System.out.println("|1. Mengobrol                       |");
                                System.out.println("|2. Bertarung                       |");
                                System.out.println("|                                   |");
                                System.out.println("|[0]. Kembali ke Menu Utama         |");
                                System.out.println("+-----------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                subNpcChoice = scanner.nextInt();
                                
                                switch (subNpcChoice) {
                                    case 1:
                                        enemy.Ucapan();
                                        break;
                                    case 2:
                                        enemy.AttackPlayer();
                                        enemy.RewardPlayer();
                                        enemy.UpgradePower();
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 2:
                            // Submenu for Player Information
                            subNpcChoice = 4;
                            while (subNpcChoice != 0) {
                                System.out.println("\n+-----------------------------------+");
                                System.out.println("|    Apa yang Ingin Anda Lakukan?   |");
                                System.out.println("+-----------------------------------+");
                                System.out.println("|1. Mengobrol                       |");
                                System.out.println("|2. Bertarung                       |");
                                System.out.println("|                                   |");
                                System.out.println("|[0]. Kembali ke Menu Utama         |");
                                System.out.println("+-----------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                subNpcChoice = scanner.nextInt();
                                
                                switch (subNpcChoice) {
                                    case 1:
                                        enemy.Ucapan();
                                        break;
                                    case 2:
                                        enemy.AttackPlayer();
                                        enemy.RewardPlayer();
                                        enemy.UpgradePower();
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 3:
                            // Submenu for Player Information
                            subNpcChoice = 4;
                            while (subNpcChoice != 0) {
                                System.out.println("\n+----------------------------------+");
                                System.out.println("|       Sub Menu NPC Option :      |");
                                System.out.println("+----------------------------------+");
                                System.out.println("|1. Mengobrol                      |");
                                System.out.println("|2. Bertarung                      |");
                                System.out.println("|                                  |");
                                System.out.println("|[0]. Kembali ke Menu Utama        |");
                                System.out.println("+----------------------------------+");
                                System.out.print("\nPilihan Anda: ");
                                
                                subNpcChoice = scanner.nextInt();
                                
                                switch (subNpcChoice) {
                                    case 1:
                                        enemy.Ucapan();
                                        break;
                                    case 2:
                                        enemy.AttackPlayer();
                                        enemy.RewardPlayer();
                                        enemy.UpgradePower();
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                }
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 0:
                    System.out.println("\n+------------------------------------------------------+");
                    System.out.println("|            Thanks for Playing Our Games!             |");
                    System.out.println("+------------------------------------------------------+");
                    System.out.println("|                                                      |");
                    System.out.println("|   Don't Forget To Rate Us in Playstore or Appstore   |");
                    System.out.println("|        Give us your 5 stars if you like it! <3       |");
                    System.out.println("|                                                      |");
                    System.out.println("+------------------------------------------------------+\n");

                    System.exit(0);
                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void viewPlayerInformation(Player player) {
        System.out.println("\nInformasi Player:");
        System.out.println("-----------------");
        System.out.println("Name   : " + player.getPlayerName());
        System.out.println("Age    : " + player.getPlayerAge());
        System.out.println("Gender : " + player.getPlayerGender());
    }

    private static void viewPlayerCharacters(Character gameCharacter) {
        System.out.println("\nCharacter yang dimiliki player:");
        System.out.println("-------------------------------");
        System.out.println("ID      : " + gameCharacter.getId());
        System.out.println("Name    : " + gameCharacter.getName());
        System.out.println("Gender  : " + gameCharacter.getGender());
        System.out.println("Weapon  : " + gameCharacter.getWeapon());
        System.out.println("Role    : " + gameCharacter.getRole());
        System.out.println("HP      : " + gameCharacter.getHp());
        System.out.println("Attack  : " + gameCharacter.getAtk());
    }

    private static void viewPlayerInventory(List<Inventory> inventories) {
        System.out.println("\nInventory yang dimiliki player:");
        System.out.println("-------------------------------");
        for (Inventory inventory : inventories) {
            System.out.println("Coins      : " + inventory.getCoin());
            System.out.println("Key        : " + inventory.getKey());
            System.out.println("Rare Item  : " + inventory.getRareItem());
        }
    }

    private static void viewPlayerSkills(List<Skill> skills) {
        System.out.println("\nSkill yang dimiliki player:");
        System.out.println("---------------------------");
        for (Skill skill : skills) {
            System.out.println("Skill 1   : " + skill.getSkill1());
            System.out.println("Skill 2   : " + skill.getSkill2());
            System.out.println("Skill 3   : " + skill.getSkill3());
            System.out.println("Ultimate  : " + skill.getUltimate());
        }
    }

    private static void viewNPCInformation(NPC npc) {
        System.out.println("\nInformasi NPC :");
        System.out.println("---------------");
        System.out.println("Name            : " + npc.getName());
        System.out.println("Gender          : " + npc.getGender());
        System.out.println("Weapon          : " + npc.getWeapon());
        System.out.println("Role            : " + npc.getRole());
        System.out.println("HP              : " + npc.getHP());
        System.out.println("ATK             : " + npc.getATK());
        System.out.println("Characteristic  : " + npc.getCharacteristic());
    }
    
}
