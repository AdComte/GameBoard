package fr.univ_lyon1.polytech.apo.gameboard;

/**
 *
 * @author YOU
 */
public class Game {

    private static GameBoard gameboard;
    private static Human player_1;
    
    public static void main(String[] args) {
       
        gameboard = new GameBoard(4,5);
        player_1 = new Human (5);
        gameboard.display_gameboard();
        
        System.out.println("\n");
        
        Turn tour;
        Position emplacement;
        emplacement = new Position(0,0);
                System.out.println(" position initialisee \n");
        emplacement.parse("[2,2");
                System.out.println(" parse ok \n");
        tour = new Turn(emplacement,player_1);
                System.out.println(" tour ok\n");
        
        
        gameboard.play(tour);   
                System.out.println("play \n");
        gameboard.display_gameboard();
    }
    
}
