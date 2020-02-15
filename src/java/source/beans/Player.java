package source.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinda
 */
public class Player implements java.io.Serializable{

    private String name;
    private int score;

    public Player() {
        this.score=0;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
    

public void IncreseScore(int score){
this.score+=score;

}
public void DecreaseScore(int score){
    this.score-=score;
}
}
