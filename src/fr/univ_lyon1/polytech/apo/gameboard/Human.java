/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.univ_lyon1.polytech.apo.gameboard;

/**
 *
 * @author p1206617
 */
public class Human extends Player {
    
    public Human(int i)
    {
       super(i);
    }
        
    @Override
    public Turn play()
    {
        Turn tour;
        Position position;
        position = new Position(0,0);
        tour = new Turn(position,this);
        return tour;
    }
}
