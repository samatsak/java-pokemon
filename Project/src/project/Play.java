/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author KMT
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author int105
 */
public class Play extends Map implements Hero, Monster {

    Scanner sc = new Scanner(System.in);
    int count = 0;
    int hero[] = new int[9];
    int mon[][] = new int[12][4];

    public void play() {    //play
        if (count == 0) {
            System.out.print("New Games(1) Load Games(2): ");
            try {
                move = sc.nextInt();
                if (move > 2 || move < 1) {
                    play();
                } else if (move == 1) {
                    createHero(hero);
                    createMon(mon);
                    ++count;
                } else if (move == 2) {
                    showSave();
                    createMon(mon);
                    loadGame(hero);
                }
            } catch (Exception o) {
                System.out.println("Invalid");
                sc.next();
                play();
            }
        }
        if (count > 0) {
            showMap(hero);
            while (true) {
                while (true) {
                    System.out.println("Function:Up(8) Down(2) Left(4) Right(6) ShowHero(5) UseHpPotion(7) Save(9) Exit(0)");
                    System.out.print("You choose: ");
                    try {
                        super.move = sc.nextInt();
                    } catch (Exception i) {
                        System.out.println("Invalid");
                        continue;
                    }
                    if (super.move == 4 || super.move == 6 || super.move == 8 || super.move == 2 || move == 5 || move == 0 || move == 7 || move == 9) {
                        break;
                    } else {
                        System.out.println("Please choose one");
                    }
                }
                if (move == 9) {
                    showSave();
                    saveGame(hero);
                } else if (move == 0) {
                    System.exit(0);
                } else if (move == 7) {
                    usePotion(hero);
                    System.out.println(showHero(hero));
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                    continue;
                } else if (move == 5) {
                    System.out.println(showHero(hero));
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                    continue;
                } else if (move == 4 || move == 2 || move == 6 || move == 8) {
                    setMap(hero);
                    showMap(hero);
                    getPotion(hero);
                    int ran = (int) (Math.random() * 2);
                    if (ran == 1) {
                        battle(hero, mon);
                    } else if ((hero[7] == 6 && hero[8] == 5) || (hero[7] == 9 && hero[8] == 9)) {
                        battle(hero, mon);
                    }
                } 
            }
        }
    }

    @Override
    public void showMap(int hero[]) {
        map[hero[7]][hero[8]] = '1';
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void setMap(int hero[]) {
        while (true) {
            switch (move) {
                case 4:
                    if (map[hero[7]][hero[8] - 1] == '#') {
                        System.out.println("Can't move");
                    } else {
                        map[hero[7]][hero[8]] = ' ';
                        hero[8]--;
                        map[hero[7]][hero[8]] = '1';
                    }
                    break;
                case 6:
                    if (map[hero[7]][hero[8] + 1] == '#') {
                        System.out.println("Can't move");
                    } else {
                        map[hero[7]][hero[8]] = ' ';
                        hero[8]++;
                        map[hero[7]][hero[8]] = '1';
                    }
                    break;
                case 8:
                    if (map[hero[7] - 1][hero[8]] == '#') {
                        System.out.println("Can't move");
                    } else {
                        map[hero[7]][hero[8]] = ' ';
                        hero[7]--;
                        map[hero[7]][hero[8]] = '1';
                    }
                    break;
                case 2:
                    if (map[hero[7] + 1][hero[8]] == '#') {
                        System.out.println("Can't move");
                    } else {
                        map[hero[7]][hero[8]] = ' ';
                        hero[7]++;
                        map[hero[7]][hero[8]] = '1';
                    }
                    break;
            }
            break;
        }
    }

    @Override
    public void createHero(int[] hero) {
        hero[0] = 1;      //lv
        hero[1] = 100;    //hp
        hero[2] = 5;      //armor
        hero[3] = 0;      //exp
        hero[4] = 30;     //atk
        hero[5] = 0;      //status
        hero[6] = 5;      //item
        hero[7] = 1;      //x
        hero[8] = 1;      //y
    }

    @Override
    public void lvUpHero(int[] hero) {
        switch (hero[0]) {
            case 2:
                hero[1] = 200;
                hero[2] = 10;
                hero[3] = 0;
                hero[4] = 40;
                break;
            case 3:
                hero[1] = 300;
                hero[2] = 15;
                hero[3] = 0;
                hero[4] = 50;
                break;
            case 4:
                hero[1] = 400;
                hero[2] = 20;
                hero[3] = 0;
                hero[4] = 60;
                break;
            case 5:
                hero[1] = 500;
                hero[2] = 25;
                hero[3] = 0;
                hero[4] = 70;
                break;
            case 6:
                hero[1] = 600;
                hero[2] = 30;
                hero[3] = 0;
                hero[4] = 80;
                break;
            case 7:
                hero[1] = 700;
                hero[2] = 35;
                hero[3] = 0;
                hero[4] = 90;
                break;
            case 8:
                hero[1] = 800;
                hero[2] = 40;
                hero[3] = 0;
                hero[4] = 100;
                break;
            case 9:
                hero[1] = 900;
                hero[2] = 45;
                hero[3] = 0;
                hero[4] = 110;
                break;
            case 10:
                hero[1] = 1000;
                hero[2] = 50;
                hero[3] = 0;
                hero[4] = 120;
                break;
        }
    }

    @Override
    public void createMon(int[][] mon) {
        try {
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from monster");
            int i = 0, j = 0;
            while (rs.next()) {
                mon[i][j] = rs.getInt("mon_hp");
                mon[i][j + 1] = rs.getInt("mon_atk");
                mon[i][j + 2] = rs.getInt("mon_exp");
                mon[i][j + 3] = rs.getInt("mon_lv");
                i++;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String showHero(int hero[]) {
        return "[Hero]LV: " + hero[0] + " HP: " + hero[1] + " ARMOR: " + hero[2] + " ATK: " + hero[4] + " EXP: " + hero[3] + " ITEM: " + hero[6];
    }

    @Override
    public String showMon(int mon[][], int i) {
        return "[Mon]HP: " + mon[i][0];
    }

    public void getPotion(int hero[]) {
        if ((hero[7] == 1 && hero[8] == 3) || (hero[7] == 1 && hero[8] == 9) || (hero[7] == 6 && hero[8] == 9) || (hero[7] == 5 && hero[8] == 1)) {
            hero[6]++;
        } else if (hero[7] == 9 && hero[8] == 1) {
            hero[4] = 40001;
        } else if (hero[7] == 6 && hero[8] == 5) {
            hero[5] = 1;
        }
    }

    public void usePotion(int hero[]) {
        if (hero[6] > 0) {
            switch (hero[0]) {
                case 1:
                    hero[1] = 100;
                    break;
                case 2:
                    hero[1] = 200;
                    break;
                case 3:
                    hero[1] = 300;
                    break;
                case 4:
                    hero[1] = 400;
                    break;
                case 5:
                    hero[1] = 500;
                    break;
                case 6:
                    hero[1] = 600;
                    break;
                case 7:
                    hero[1] = 700;
                    break;
                case 8:
                    hero[1] = 800;
                    break;
                case 9:
                    hero[1] = 900;
                    break;
                case 10:
                    hero[1] = 1000;
                    break;
            }
            hero[6]--;
        } else {
            System.out.println("Out of Stock");
        }
    }

    public void setExp(int hero[], int mon[][], int ran) {
        if (hero[5] == 1) {
            hero[3] = hero[3] + (mon[ran][2] * 2);
        } else {
            hero[3] = hero[3] + mon[ran][2];
        }
        if (hero[0] == 10) {
            hero[3] = 0;
        } else if (hero[3] >= 100) {
            hero[0]++;
            lvUpHero(hero);
            setNewMap(hero);
        }
    }

    public void battle(int hero[], int mon[][]) {
        int ran = 0;
        if (hero[7] == 6 && hero[8] == 5) {
            ran = 10;
        } else if (hero[7] == 9 & hero[8] == 9) {
            ran = 11;
        } else if (hero[7] <= 5 && hero[8] <= 5) {
            ran = (int) (Math.random() * 3);
        } else if (hero[7] <= 6) {
            ran = (int) (Math.random() * 6);
        } else {
            ran = (int) (Math.random() * 10);
        }
        int ai = mon[ran][0];
        System.out.println("Let's Battle");
        while (true) {
            System.out.println(showHero(hero));
            System.out.println("HP(Mon): " + ai);
            System.out.println("Function:Attack(1),UseHpPotion(2),Scan Monster(3)");
            System.out.print("You choose: ");
            try {
                super.move = sc.nextByte();
            } catch (Exception i) {
                System.out.println("Error");
            }
            if (move == 1) {
                int x = (int) (Math.random() * 3);
                if (x == 2) {
                    ai = ai - (hero[4] * 2);
                    System.out.println("Your Damage(Critical Damage):" + hero[4] * 2);
                    if (ai <= 0) {
                        System.out.println("You Win");
                        setExp(hero, mon, ran);
                        if (ai <= 0 && ran == 11) {
                            System.out.println("Victory");
                            System.exit(0);
                        }
                        showMap(hero);
                        break;
                    } else if (hero[2] > mon[ran][1]) {
                        hero[1] = hero[1];
                    } else {
                        hero[1] = hero[1] - (mon[ran][1] - hero[2]);
                    }
                } else {
                    ai = ai - hero[4];
                    System.out.println("Your Damage:" + hero[4]);
                    if (ai <= 0) {
                        System.out.println("You Win");
                        setExp(hero, mon, ran);
                        if (ai <= 0 && ran == 11) {
                            System.out.println("Victory");
                            System.exit(0);
                        }
                        showMap(hero);
                        break;
                    } else if (hero[2] > mon[ran][1]) {
                        hero[1] = hero[1];
                    } else {
                        hero[1] = hero[1] - (mon[ran][1] - hero[2]);
                    }
                }
                if (hero[1] <= 0) {
                    System.out.println("Game Over");
                    System.exit(0);
                }
            } else if (move == 2) {
                usePotion(hero);
            } else if (move == 3) {
                System.out.println(scanMon(mon, ran));
                hero[1] = hero[1] - (mon[ran][1] - hero[2]);
            } else {
                System.out.println("Invalid");
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public void setNewMap(int hero[]) {
        if (hero[0] == 10) {
            super.map[8][2] = ' ';
        }
    }

    public String scanMon(int mon[][], int i) {
        return "[Monster]LV." + mon[i][3] + " HP: " + mon[i][0] + " ATK: " + mon[i][1] + " EXP: " + mon[i][2];
    }

    protected Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/ProjectDB", "qwer", "qwer");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public void showSave() {
        try {
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from hero");
            while (rs.next()) {
                System.out.print("NO." + rs.getInt("hero_id") + " ");
                System.out.print("LV: " + rs.getInt("hero_lv") + " ");
                System.out.print("HP: " + rs.getInt("hero_hp") + " ");
                System.out.print("ARMOR: " + rs.getInt("hero_armor") + " ");
                System.out.print("EXP: " + rs.getInt("hero_exp") + " ");
                System.out.print("ATK: " + rs.getInt("hero_atk") + " ");
                System.out.print("STATUS: " + rs.getInt("hero_status") + " ");
                System.out.println("Potion: " + rs.getInt("hero_item"));
                System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveGame(int hero[]) {
        while (true) {
            System.out.print("Save(1),(2),(3): ");
            try {
                int save = sc.nextInt();
                if (save <= 3 && save >= 0) {
                    Connection con = getConnection();
                    PreparedStatement pm = con.prepareStatement("update hero set hero_lv = ? , hero_hp = ? , hero_armor = ? , hero_exp = ? , hero_atk = ? , hero_status = ? , hero_item = ? , hero_x = ? , hero_y = ? where hero_id = ?");
                    pm.setInt(1, hero[0]);
                    pm.setInt(2, hero[1]);
                    pm.setInt(3, hero[2]);
                    pm.setInt(4, hero[3]);
                    pm.setInt(5, hero[4]);
                    pm.setInt(6, hero[5]);
                    pm.setInt(7, hero[6]);
                    pm.setInt(8, hero[7]);
                    pm.setInt(9, hero[8]);
                    pm.setInt(10, save);
                    pm.executeUpdate();
                    showSave();
                    con.close();
                    play();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception o) {
                System.out.println("Error");
            }
        }
    }

    public void loadGame(int hero[]) {
        try {
            System.out.print("Load(1),(2),(3) GoBack(5): ");
            int save = sc.nextInt();
            Connection con = getConnection();
            Statement stm = con.createStatement();
            if (save <= 3 && save >= 0) {
                ResultSet rs = stm.executeQuery("select * from hero where hero_id = " + save);
                while (rs.next()) {
                    if (rs.getInt("hero_lv") == 0 || save == 5) {
                        play();
                    } else {
                        hero[0] = rs.getInt("hero_lv");
                        hero[1] = rs.getInt("hero_hp");
                        hero[2] = rs.getInt("hero_armor");
                        hero[3] = rs.getInt("hero_exp");
                        hero[4] = rs.getInt("hero_atk");
                        hero[5] = rs.getInt("hero_status");
                        hero[6] = rs.getInt("hero_item");
                        hero[7] = rs.getInt("hero_x");
                        hero[8] = rs.getInt("hero_y");
                        con.close();
                        ++count;
                        play();
                    }

                }
            } else {
                play();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception o) {
            System.out.println("Invalid");
        }
    }
}
