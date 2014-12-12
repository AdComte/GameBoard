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
    public void parse(String string)//la chaine doit être de la forme "[i,j]"
    {
        x=0;
        y=0;
        int i=1;
        int j=0;
        int taille_abs=0;
        int taille_ord=0;
        
        while(string.charAt(i)!=',')//récupération de la taille du nombre en abscisse
        {
            taille_abs++;
            i++;
        }
        System.out.println("i"+i);
        int[] abs = new int[taille_abs];
        
        System.out.println("taille_abs"+taille_abs);
        i=1;
        while(string.charAt(i)!=',')//récupération des caractères abscisse
        {
          abs[j]=string.charAt(i)-'0';
          j++;
          i++;
        }
        
        //reconstruction de l'abscisse;
        i=abs.length;
                System.out.println("i"+i);
        j=0;
        
        while(i!=0 && j<abs.length)
        {
            x= x + (abs[j]*(10^(i-1)));
            i--;
            j++;
        }
                 System.out.println("x vaut actuellement " + x +"\n");
        
        //récupération de l'ordonnée
        i=1+abs.length;
        j=0;
        while(string.charAt(i)!=']')
        {
            taille_ord++;
            i++;
        }
        int[] ord = new int[taille_ord];
        System.out.println("taille_ord"+taille_ord);
        i=1;
        while(string.charAt(i)!=']')
        {
            ord[j]=string.charAt(i);
            j++;
            i++;
        }
        //reconstruction de l'ordonnée
        i=taille_ord;
        j=0;
        while(i!=0)
        {
                        System.out.println("valeur de i "+i);
            y = y + (ord[j]*(10^(i-1)));
            i--;
            j++;

        }
        System.out.println("parse ok");
    }
    
    

    @Override
    public String toString() {
        return "TODO";
    }
    
    
}
