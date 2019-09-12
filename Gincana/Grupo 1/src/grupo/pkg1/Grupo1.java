
package grupo.pkg1;
import java.util.Scanner;
public class Grupo1 {
    public static void main(String[] args)throws InterruptedException {
        
        Scanner scan= new Scanner(System.in);
        
        String juez="Alicia";
        String equipo;
        String nom1;
        String nom2;
        String pijama;
        String MatrixAzul="EvA3o21s";
        String MatrixAmarillo="Ovep3a2c";
        String Matrix="a";
        String FabricaAmarillo="6485134";
        String FabricaAzul="7541216";
        String Fabrica="0";
        String HogwartsAmarillo="23b58ZsX";
        String HogwartsAzul="23d58ZsX";
        String Hogwarts="";
        String NarniaAmarillo="aBcDxYz23";
        String NarniaAzul="EFgHoPq48";
        String Narnia="";
        String PaisAmarillo="54adBV8";
        String PaisAzul="55fAc5g";
        String Pais="";
        String Adivinanza="";
        String Respuesta="El nombre";
        
        System.out.println("¡¡¡Bienvenidos a GINCANALAND!!!");
        
        //Papeleo
        System.out.println("Vamos a comenzar con los preparativos previos: ");
       
        System.out.println("¿Qué equipo sois? (azul o amarillo)");
        equipo=scan.next();
        if (equipo.equals("Amarillo")){
            equipo="amarillo";
        }
        if (equipo.equals("Azul")){
            equipo="azul";
        }
        
        System.out.println("¿Cual es el nombre del primer participante?");
        nom1=scan.next();
        
        System.out.println("¿Cual es el nombre del segundo participante?");
        nom2=scan.next();
        
        System.out.println("¿Vais en pijama?");
        pijama=scan.next();
        
        if (pijama.compareTo("No")==0 || pijama.compareTo("no") ==0|| pijama.compareTo("NO") ==0 ){
            System.out.println("Pontelo");
            Thread.sleep(10000);
        } 
        
        System.out.println("¡PERFECTO!, ya lo tenemos todo");
        System.out.println("\nA continuación explicaremos LAS REGLAS: ");
        System.out.println("Este juego consiste en una serie de pruebas, seis en total, que teneis que realizar. "
                //+ "\nOs preguntareis, ¿Y cual es el regalo? De eso no os preocupeis, ya hablaremos luego.\n"
                + "\nEn cada prueba encontrareis o se os dará un código. Entonces teneis que venir al ordenador"
                + " que teneis asignado y escribirlo."
                + " \nSi el código es correcto, os daré las indicaciones, el lugar"
                + " de la próxima prueba y una letra para la prueba final.\nGuardad bien "
                + "esa letra, sino tendreis muchas menos posibilidades de ganar."
                + "\n\nEL JUEZ: En todo gincanaland hay un juez que os estará vigilando y os podrá dar pistas si os veis muy apurados.\n"
                + "Para pedir una pista debereis de ir al juez "+juez+" y le tendreis que entregar una de las tres pistas que se os dará.\n"
                + "\nAhora vamos a lo interesante: \n\nEL VENCEDOR Y EL PREMIO.\n"
                + "¿Quién es el vencedor? El vencedor es el equipo que antes termine las pruebas. Así de fácil. Bueno, ahora"
                + " parece fácil, luego... MUAHAHAHAHA \n"
                + "\nAhora EL PREMIO.\nEl equipo vencedor ganará...\n...\n... \nUN PREMIO!! Wiiiii. \nNo, ahora en serio, "
                + "no os lo pienso decir.\n\n Y ahora sin más dilación...\n¡¡¡QUE COMIENCE GINCANALAND!!!        "
                + "NOTA: Encended los cronómetros.");
    
          
           //Thread.sleep(40000);
         

        
//Primera prueba || Pistas, Qr
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t##PRIMERA PRUEBA##");
        System.out.println("LUGAR DE REALIZACIÓN: MATRIX\n"
                + "INDICACIONES:En esta prueba debeis de seguir una serie de pistas"
                + " que os llevarán hasta vuestro código.\n"
                + "PRIMERA PISTA: ");
                if (equipo.equals("amarillo")){
                    System.out.println("Entre las ropas me encuentro, entre las ropas estoy.\n"
                    + "Si miro hacia arriba el sol veo. Si miro hacia abajo en la noche estoy.");
                }
                else System.out.println("Encerrado toda mi vida, entre plastificadas vigas.\n"
                        + "Solitario estoy durante el día, pero al oscurecer una sonrisa me ilumina\n"
                        + "ya que dos pares de zapatillas oscuras me hacen una visita.\n");    
                
                Thread.sleep(10000);
                
//Código primera prueba
                
                System.out.println("Introduce el código:");
                
                if(equipo.equals("amarillo")){
                   Matrix=scan.next();
                   while(Matrix.compareTo(MatrixAmarillo) != 0) {
                       
                       
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Matrix=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");    
                }
                else {
                    Matrix=scan.next();
                    while(Matrix.compareTo(MatrixAzul) != 0) {
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Matrix=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO.");
                     }
                Thread.sleep(1500);
                System.out.println("Tengo una letrita, ¿Qué letrita es?, la letrita que tengo es la B");
                Thread.sleep(4000);
                
                
                
                
                
                
                
//Segunda prueba || Golosinas
                System.out.println("\n\n\t\t\t\t\t\t\t##SEGUNDA PRUEBA##");
                System.out.println("LUGAR DE REALIZACIÓN: LA FÁBRICA DE CHOCOLATE\n"
                + "INDICACIONES:En esta prueba debeis ir al lugar indicado y coger 10 de las 20 cosas que hay en la mesa.\n"
                        + ""+nom1+" deberá colocarse en la linea número 1 de su correspondiente color."
                        + "; "+nom2+" deberá de colocarse en la número 2."
                        + "\n"+nom1+" deberá lanzarle a "+nom2+" los objetos que habeis cogido previamente y"
                        + " "+nom2+ " deberá coger 5 con la boca.\nEl equipo que antes lo consiga gana."
                        + "\nAl terminar la juez "+juez+" os dará un código que debereis introducir."
                        + "\n¡OJO! No podeis sobrepasar la línea.\n ¡A MERENDAR!\n");
                Thread.sleep(6000);
                
//Código segunda prueba
                
                System.out.println("Introduce el código:");
                
                if(equipo.equals("amarillo")){
                   Fabrica=scan.next();
                   while(Fabrica.compareTo(FabricaAmarillo) != 0) {
                       
                       
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Fabrica=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");    
                }
                else {
                    Fabrica=scan.next();
                    while(Fabrica.compareTo(FabricaAzul) != 0) {
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Fabrica=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");
                     }
                 Thread.sleep(1500);
                System.out.println("Tengo una letrita, ¿Qué letrita es?, la letrita que tengo es la E");
                Thread.sleep(2000);
                
                
                
                
                
                
                
//Tercera prueba || Llaves y cofres
                
                System.out.println("\n\n\t\t\t\t\t\t\t##TERCERA PRUEBA##");
                System.out.println("LUGAR DE REALIZACIÓN: HOGWARTS\n"
                + "INDICACIONES: Hogwarts ha perdido algunas llaves. UNA de ellas es IMPORTANTE, el resto son meras trampas.\n"
                        + "Vuestro deber es encontrar la llave importante, la llave que os resolvera EL GRAN MISTERIO.\n"
                        + "¿Estais preparados para esta mágica aventura?");
                Thread.sleep(6000);
                
                
                
                
//Código tercera prueba
                
                System.out.println("Introduce el código: ");
                if(equipo.equals("amarillo")){
                   
                    Hogwarts=scan.next();
                   while(Hogwarts.compareTo(HogwartsAmarillo)!=0&&Hogwarts.compareTo(HogwartsAzul)!=0){
                      
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Hogwarts=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");    
                }
                else {
                    Hogwarts=scan.next();
                    while(Hogwarts.compareTo(HogwartsAmarillo)!=0&&Hogwarts.compareTo(HogwartsAzul)!=0) {
                    
                       
                        
                        System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                        Hogwarts=scan.next();
                       
                    }
                    System.out.println("EL CÓDIGO ES CORRECTO");
                    
                }
                 Thread.sleep(1500);
                System.out.println("Tengo una letrita, ¿Qué letrita es?, la letrita que tengo es la E");
                Thread.sleep(2000);
                
                
                
                
                
                
                
                
                
//Cuarta prueba || Coche amarillo
                System.out.println("\n\n\t\t\t\t\t\t\t##CUARTA PRUEBA##");
                System.out.println("LUGAR DE REALIZACIÓN: NARNIA\n"
                + "INDICACIONES:En esta prueba ambos equipos debereis salir a la calle y ensuciaros las manos.\n"
                        + "Teneis que ir en busca de 'algo' y cuando lo encontreis ambos compañeros debereis de haceros una foto con ese 'algo'.\n"
                        + "El equipo que antes llegue al juez y le enseñe las fotos ¡¡¡Obtendrá un regalo!!!\n"
                        + "NOTA: El juez os dirá las características de ese algo y os dará la marca de salida. " );
                Thread.sleep(6000);
                
//Código cuarta prueba
                
                System.out.println("Introduce el código:");
                
                if(equipo.equals("amarillo")){
                   Narnia=scan.next();
                   while(Narnia.compareTo(NarniaAmarillo) != 0) {
                       
                       
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Narnia=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");    
                }
                else {
                    Narnia=scan.next();
                    while(Narnia.compareTo(NarniaAzul) != 0) {
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Narnia=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");
                     }
                 Thread.sleep(1500);
                System.out.println("Tengo una letrita, ¿Qué letrita es?, la letrita que tengo es la O");
                Thread.sleep(2000);
                
                
                
                
                
                
                
//Quinta prueba || Globos
                System.out.println("\n\n\t\t\t\t\t\t\t##QUINTA PRUEBA##");
                System.out.println("LUGAR DE REALIZACIÓN:EL PAIS DE LAS MARAVILLAS\n"
                        + "INDICACIONES: En esta prueba se ha escondido vuestro código dentro de los globos de vuestro color.\n"
                        + "Vuestra misión es explotarlos para encontrarlo. \n"
                        + "Pero esto no es tan simple como parece: Para explotarlos debereis utilizar unicamente vuestro cuerpo."
                        + " No se admiten ningún tipo de objetos.\n Y para aumentar la dificultad hay algunos códigos... UN TANTO INCORRECTOS"
                        + "\nBuena suerte pequeños granujillas. MUAHAHAHAHAHAHAHA" );
                Thread.sleep(6000);
                
//Código cuarta prueba
                
                System.out.println("Introduce el código:");
                
                if(equipo.equals("amarillo")){
                   Pais=scan.next();
                   while(Pais.compareTo(PaisAmarillo) != 0) {
                       
                       
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Pais=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");    
                }
                else {
                    Pais=scan.next();
                    while(Pais.compareTo(PaisAzul) != 0) {
                       System.out.println("EL CÓDIGO ES INCORRECTO. Inténtelo de nuevo.");
                       Pais=scan.next();
                       
                    }
                   
                     System.out.println("EL CÓDIGO ES CORRECTO");
                     }
                 Thread.sleep(1500);
                System.out.println("Tengo una letrita, ¿Qué letrita es?, la letrita que tengo es la N");
                
                Thread.sleep(2000);
                
                
//Prueba final || Adivinanza
               System.out.println("\n\n\t\t\t\t\t\t\t##PRUEBA FINAL##");
                System.out.println("LUGAR DE REALIZACIÓN: La cornucopia\n"
                        + "INDICACIONES: Adivina adivinanza, ¿Quien puso el huevo en la paja?.\n"
                        + "Para esta última prueba debeis de utilizar las palabras que os he dado anteriormente.\n"
                        + "¡¡Daos prisa!! El adivinador que antes lo adivine, buen ganador será." );
                Thread.sleep(6000);
                
//Código prueba final
                
                System.out.println("Introduce la respuesta de la adivinanza:");
                
                Adivinanza=scan.nextLine();
                
                while(Adivinanza.compareToIgnoreCase(Respuesta)!=0){
                    System.out.println("La respuesta es incorrecta. Inténtelo de nuevo.");
                    Adivinanza=scan.nextLine();
                }
                
                System.out.println("Apaga el cronometro.¡La respuesta es correcta! ");
                
                 Thread.sleep(1500);
    }
    
}
