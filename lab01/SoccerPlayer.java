/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author HP
 */
public class SoccerPlayer {
    private String name;
    private int number;
    private String x;
    private String y;
    
    public SoccerPlayer() {
        name = "A1";
        number = 1;
        x = "AB";
        y = "CD";
    }
    
    public SoccerPlayer(String name){
    this.name = name;
    }
    public SoccerPlayer(String name , int number) {
        this.name = name;
        this.number = number;
    }
    public SoccerPlayer(String x,String y){
        this.x = x;
        this.y = y;
    }
    
    public SoccerPlayer(String name , int number ,String x,String y ){
        this.name = name;
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public String run(){
    return name;
    }
    
    public int jump(){
    return number;
    }
    
    public String kickBall(){
    return x;
    }
    

    @Override
    public String toString() {
        return "SoccerPlayer{" + "name=" + name + ", number=" + number + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
