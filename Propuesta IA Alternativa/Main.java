import java.util.*;

public class Main
{    
    public static void main (String [] args)
    {
        Scanner Teclado = new Scanner (System.in);

        System.out.println ("Escriba el N° del Modo de Juego que desea ejecutar.");
        System.out.println ("1 = Agente vs Usuario | 2 = Agente vs Agente");

        int ModoDeJuegoPorSupuesto = Teclado.nextInt();

        if (ModoDeJuegoPorSupuesto == 1)
        {
            //TEST I & II [Experimental] - CONTRA UN USUARIO HUMANO
            JuegoDelGatoIAvsUsuario Gato = new JuegoDelGatoIAvsUsuario ();
            Gato.JugarGato();
        }
        else if (ModoDeJuegoPorSupuesto == 2)
        {
            //TEST III & IV [Experimental] - IA VS IA
            JuegoDelGatoIAvsIA Gato2 = new JuegoDelGatoIAvsIA ();
            Gato2.JugarGato();
        }
        else
        {
            System.out.print ("No se ha ingresado un Modo de Juego. *Procede a cerrarse*");
        }

        Teclado.close();

        /*Por que cuando es Agente vs Agente debe jugar siempre con la funcion que Maximiza y no Max vs Min? 

            Esto es debido a que solo existe una Instancia de Agente presente en este Programa, por lo que si se hace un Max vs Min
            con una Función Reflejo de "EncontrarElMejorMovimientoClaroQueSi" una optara por tomar los PEORES Movimientos para si
            misma.*/
    }
}