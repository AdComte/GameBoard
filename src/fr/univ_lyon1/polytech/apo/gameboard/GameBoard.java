package fr.univ_lyon1.polytech.apo.gameboard;


import java.util.List;

/**
 *
 * @author YOU
 */
public class GameBoard {
    public final int width;
    public final int length;
    private int[][] board;
    private List<Turn> history;

    public GameBoard(int width, int length) {
        this.width = width;
        this.length = length;
        board = new int[width][length];
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<length;j++)
            {
                board[i][j]=0;
            }
        }
    }

    public GameBoard(int width, int length, List<Turn> history) {
        this.width = width;
        this.length = length;
        int error = (new int[1])[1]; //TODO: things with history
    }

    public int[][] board() {
        return board;
    }
    
    public void play(Turn turn)
    {
        board[turn.position.x][turn.position.y] = turn.player.number;
    }
    
    public void cancel()
    {
        
    }
    
    public Turn lastTurn()
    {
        return null;
    }
    
    public Player win()
    {
        return null;
    }

    @Override
    public String toString() {
        return "TODO";
    }
    
    public void display_gameboard() {
        for(int i = 0; i<width;i++)
        {
            for(int j=0;j<length;j++)
            {
                System.out.print(board[i][j] + "|");
                if(j==length-1)
                {
                    System.out.print("\n");
                }
            }
        }
    }
    
}
