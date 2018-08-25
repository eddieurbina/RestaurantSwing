/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoswing2;

/**
 *
 * @author Aula E1
 */
public class ComidaCaloria {
    public ComidaCaloria()
    {
    }
    
    public int CalculaCalorias(String Comida)
    {
        int cal = 0;
        
        switch(Comida)
        {
            case "Tamal":
                cal = 500;
            break;
            case "Gordita":
                cal = 600;
            break;
            case "Pollo":
                cal = 1500;
            break;
            case "Res":
                cal =7000;
            break;
            case "Ensalada":
                cal = 1000;
            break;
            case "Pastel":
                cal = 3000;
            break;
            case "Gelatina":
                cal = 1500;
            break;
            case "Helado":
                cal = 2000;
            break;
        }
    
        return cal;
    }
    
}
