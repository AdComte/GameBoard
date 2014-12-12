/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.univ_lyon1.polytech.apo.gameboard;

import java.util.Random;

/**
 *
 * @author p1206512
 */
public class Random_player extends Player {
        
    public Random_player(int i)
    {
        super(i);
    }
    public Turn play()
    {
        Turn tour;
        Random abs = new Random(10);
        Random ord = new Random(10);
        Position position;
        
        position = new Position(abs.nextInt(),ord.nextInt());
        tour = new Turn(position,this);
        return tour;
    }
}
