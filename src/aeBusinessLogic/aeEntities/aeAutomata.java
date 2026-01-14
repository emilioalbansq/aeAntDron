package aeBusinessLogic.aeEntities;

import java.util.Scanner;

public class aeAutomata {
    static final Integer aeEr = -10;
    static final Integer aeOk = 100;
    static final String  aeAlfabeto ="a,b,c,d,t, "; 
    static final Integer[][] aeMt={//  a    b     c     d     t    esp
                                    {1     ,aeEr   ,aeEr   ,aeEr   ,aeEr   ,aeEr}, // q0
                                    {aeEr  ,2      ,aeEr   ,aeEr   ,aeEr   ,aeOk}, // q1 *
                                    {aeEr  ,2      ,3      ,aeEr   ,aeEr   ,aeOk}, // q2 *
                                    {aeEr  ,aeEr   ,aeEr   ,4      ,aeEr   ,aeEr}, // q3
                                    {aeEr  ,aeEr   ,aeEr   ,aeEr   ,5      ,aeEr}, // q4
                                    {aeEr  ,aeEr   ,aeEr   ,aeEr   ,5      ,aeOk}  // q5 *
                                };

    @SuppressWarnings("resource")
    private int getIndexAlfabeto(String caracter){
        Scanner scAlfa = new Scanner(aeAlfabeto).useDelimiter(",");
        for (int i = 0; scAlfa.hasNext(); i++) 
            if( caracter.equals(scAlfa.next()))
                return i;
        return aeEr;
    }

    public boolean checkTipoArsenal(String arsenal) {
        int q = 0;
        //System.out.println("Evaluando: " + arsenal);
        for (int i = 0; i < arsenal.length(); i++) {
            int indexAlfa = getIndexAlfabeto(arsenal.charAt(i) + "");
            if (indexAlfa == aeEr || aeMt[q][indexAlfa].equals(aeEr)) 
                return false;
            q = aeMt[q][indexAlfa];
        }
        return (q == aeOk);
    }
}