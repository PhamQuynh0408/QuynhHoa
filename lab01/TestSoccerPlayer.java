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
public class TestSoccerPlayer {
    public static void main (String[] args){
    SoccerPlayer SoccerPlayer1 = new SoccerPlayer();
    String name1 = SoccerPlayer1.run();
    int number1 = SoccerPlayer1.jump();
    String x1 = SoccerPlayer1.kickBall();
    String y1 = SoccerPlayer1.kickBall();
    System.out.println("name1" + "number1" + "x1" + "y1");
    
    SoccerPlayer s2 = new SoccerPlayer("FDD");
    System.out.println(s2.toString());
    
    SoccerPlayer s3 = new SoccerPlayer("JHD",3);
    System.out.println(s3.toString());
    
    SoccerPlayer s4 = new SoccerPlayer("FTJ",2,"SH","UU");
    System.out.println(s4.toString());
    }
}
