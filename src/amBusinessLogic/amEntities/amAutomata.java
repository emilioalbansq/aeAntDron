package amBusinessLogic.amEntities;

import java.util.Scanner;

public class amAutomata {
    static final Integer amEr = -10;
    static final Integer amOk = 100;
    static final String  amAlfabeto ="a,b,c,d,t, "; 
    static final Integer[][] amMt={//  a    b     c     d     t    esp
                                    {1     ,amEr   ,amEr   ,amEr   ,amEr   ,amEr}, // q0
                                    {amEr  ,2      ,amEr   ,amEr   ,amEr   ,amOk}, // q1 *
                                    {amEr  ,2      ,3      ,amEr   ,amEr   ,amOk}, // q2 *
                                    {amEr  ,amEr   ,amEr   ,4      ,amEr   ,amEr}, // q3
                                    {amEr  ,amEr   ,amEr   ,amEr   ,5      ,amEr}, // q4
                                    {amEr  ,amEr   ,amEr   ,amEr   ,5      ,amOk}  // q5 *
                                };

    @SuppressWarnings("resource")
    private int getIndexAlfabeto(String caracter){
        Scanner scAlfa = new Scanner(amAlfabeto).useDelimiter(",");
        for (int i = 0; scAlfa.hasNext(); i++) 
            if( caracter.equals(scAlfa.next()))
                return i;
        return amEr;
    }

    public boolean checkTipoArsenal(String arsenal) {
        int q = 0;
        //System.out.println("Evaluando: " + arsenal);
        for (int i = 0; i < arsenal.length(); i++) {
            int indexAlfa = getIndexAlfabeto(arsenal.charAt(i) + "");
            if (indexAlfa == amEr || amMt[q][indexAlfa].equals(amEr)) 
                return false;
            q = amMt[q][indexAlfa];
        }
        return (q == amOk);
    }
}