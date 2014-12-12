/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.univ_lyon1.polytech.apo.gameboard;

import java.util.List;

/**
 *
 * @author p1206512
 */
public class ConnectFour extends GameBoard {
    
    private enum Cell {
        BASDROITE("5,0"),
        BASGAUCHE("5,0"),
        BASMILIEU("5,0"),
        MILIEUDROITE("5,0"),
        MILIEUGAUCHE("5,0"),
        MILIEUMILIEU("5,0"),
        HAUTDROITE("5,0"),
        HAUTGAUCHE("5,0"),
        HAUTMILIEU("5,0");
        
        public content;
        public static void spoon() { System.out.println("spoon"); }
        private Cell(String content) { this.content = content ; }
    }
    
    public ConnectFour(int width, int length){
        super(width, length);
    }
    
    public ConnectFour(int width, int length, List<Turn> history){
        super(width, length, history);
    }
    
}
