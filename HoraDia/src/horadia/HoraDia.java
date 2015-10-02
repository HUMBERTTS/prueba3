/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author humberto
 */
public class HoraDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
          BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
        
        int h, m;
        
        System.out.println("BIENVENIDO");
        
        System.out.println("Inserta la hora");
      h=Integer.parseInt(br.readLine());
        
        System.out.println("Inserta los minutos");
        m=Integer.parseInt(br.readLine());
        
        
         if(h==12 && m==00)
            {
            System.out.println("media noche");
            }
                else
        if(h==00 && m==00)
            {
            System.out.println("medio dia");
            }
         else
        
        if(h>=0 && h<7 )
        {
            System.out.println("Es de madrugada, son las " + h + ":" + m);
        }
        else
            if(h>7 && h<=12)
        {
        
            System.out.println("Buenos dias");
        }
        else
                if(h>12 && h<=18 )
                {
                    System.out.println("Buenas tardes");
                }
        else
                    if(h>18 && h<=23)
                    {
                        System.out.println("Buenas noches");
                    }

                       
    }
    
}
