package juegoPalabras;
import java.util.Random;
import java.util.Scanner;
public class palabras 
{
    public static void main(String[] args)
    {
        int indiceCorrecto;
        String palabraCorrecta;
        String palabraElegida;
        int dificultadElegida;
        String mensaje;
       
    
        Scanner lectura= new Scanner (System.in);
        Random aleatorios = new Random();
        
        
        String[] programacion = {"Atributos", "Matrices", "Parametros", "Argumentos"};
        
         indiceCorrecto = aleatorios.nextInt(4);
        
         palabraCorrecta = programacion[indiceCorrecto];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
         palabraElegida = "";
       
        do 
        {
            System.out.println( "************************\nElegir dificultad:\n1.- Facil" +"\n2.- Normal" +"\n3.- Salir" +"\n************************");
            dificultadElegida = lectura.nextInt();
            switch(dificultadElegida)
            {
         case 1:
          mensaje = "Posibles palabras: \n ";
         for(int i=0; i<programacion.length; i++)
         {
             mensaje += programacion[i] +  " \n";
         }
         System.out.println(mensaje);
          System.out.println("Adivina la palabra secreta: ");
          palabraElegida = lectura.next();
         if(palabraElegida.equals(palabraCorrecta))
         {
             System.out.println( "CORRECTO!!!");
         } 
         else
         {
             System.out.println( "Perdiste, la palabra correcta era: "+palabraCorrecta);
         }
         break;
     
      case 2:
         System.out.println("Adivina la palabra secreta: ");
         palabraElegida = lectura.next();
         if(palabraElegida.equals(palabraCorrecta)) 
         {
             System.out.println( "CORRECTO!!!");
         } 
         else 
         {
             System.out.println("Perdiste, la palabra correcta era: "+palabraCorrecta);
         }
         break;
      case 3:
         System.out.println("Usted ha termiando el juego");
         
        
      default:
      System.out.println( "No se ha seleccionado una dificultad correcta");
            }

        } while (dificultadElegida !=3);
            
            
        
    }
}
