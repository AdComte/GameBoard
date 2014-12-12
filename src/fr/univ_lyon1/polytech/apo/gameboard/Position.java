package fr.univ_lyon1.polytech.apo.gameboard;

/**
 *
 * @author YOU
 */
public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void parse(String seizure)//la chaine doit être de la forme "i,j"
    {
        String[] clean = seizure.split(",");
        
        int j = 0;
        for (int n = clean[0].length();  n > 0; n --)
        {
            x = x + (clean[0].charAt(j) - '0') * (int) Math.pow(10,(n-1));
            j++;
        }
        
        j = 0;
        for (int n = clean[1].length();  n > 0; n --)
        {
            y = y + (clean[1].charAt(j) - '0')* (int) Math.pow(10,(n-1));
            j++;
        }
    }

    @Override
    public String toString() {
        return "TODO";
    }
    
    
}
