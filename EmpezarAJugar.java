
package quienquieresermillonariofinal.GENERAL;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;




public class EmpezarAJugar {
  
    
    //Variable de las preguntas del juego
    public static String txtRespJuego = "", preg = "", resp1 = "", resp2 = "", resp3 = "", resp4 = "", respCaso5050 = "",
                         varPorcB = "",
    preg1 = "Según el refran, ¿quien es ciego?:",
    preg2 = "Tecnica que describe y representa detalladamente la superficie de un terreno:",
    preg3 = "Uno de los libros de J. K. Rowling es Harry Potter y:",
    preg4 = "Cual es el idioma oficial de Israel?",
    preg5 = "En la oración: \"Una viejita vende las manzanas\", la palabra \"vende\" es:",
    preg6 = "Al periódico que se publica en horas de la tarde, se denomina:",
    preg7 = "Las Vegas es una ciudad estadounidense que queda en:",
    preg8 = "Es el paso del agua del estado líquido al estado gaseoso:",
    preg9 = "Que parte del cuerpo se examina en una encefalografía?",
    preg10 = "Que elemento químico es representado por el símbolo \"P\"?",
    preg11 = "Es el nombre de uno de los Tres Reyes Magos:",
    preg12 = "Donde queda el volcán Barú?",
    preg13 = "La contínua y persistente subida general de los precios, se denomina:",
    preg14 = "La palabra \"espanto\" esta relacionada con la idea de:",
    preg15 = "Que clase de palabra es \"según\"?",
   
    resPreg1A = "La esperanza", resPreg1B = "El amor", resPreg1C = "El odio", resPreg1D = "La envidia",
    resPreg2A = "Topografía", resPreg2B = "Serigrafía", resPreg2C = "Epigrafía", resPreg2D = "Holografía",
    resPreg3A = "El arca perdida", resPreg3B = "El prisionero de Azkaban", resPreg3C = "La magia negra", resPreg3D = "Su varita",
    resPreg4A = "Japones", resPreg4B = "Griego", resPreg4C = "Hebreo", resPreg4D = "Chino",
    resPreg5A = "Sustantivo", resPreg5B = "Conjunción", resPreg5C = "Adjetivo", resPreg5D = "Verbo",
    resPreg6A = "Matutino", resPreg6B = "Vespertino", resPreg6C = "Clandestino", resPreg6D = "Pristino",
    resPreg7A = "Oklahoma", resPreg7B = "Nevada", resPreg7C = "Arizona", resPreg7D = "Colorado",
    resPreg8A = "Licuefacción", resPreg8B = "Infiltración", resPreg8C = "Evaporación", resPreg8D = "Sublimación",
    resPreg9A = "Ovarios", resPreg9B = "Cráneo", resPreg9C = "Pulmones", resPreg9D = "Hígado",
    resPreg10A = "Bromo", resPreg10B = "Boro", resPreg10C = "Rubidio", resPreg10D = "Fosforo",
    resPreg11A = "Barrabás", resPreg11B = "Jonás", resPreg11C = "Melchor", resPreg11D = "Judas",
    resPreg12A = "Panamá", resPreg12B = "Guatemala", resPreg12C = "México", resPreg12D = "Colombia",
    resPreg13A = "Deflación", resPreg13B = "Decapitación", resPreg13C = "Inflación", resPreg13D = "Superávit",
    resPreg14A = "Santo", resPreg14B = "Ángel", resPreg14C = "Fantasma", resPreg14D = "Hada",
    resPreg15A = "Verbo", resPreg15B = "Preposición", resPreg15C = "Adjetivo", resPreg15D = "Sustantivo";
    
    
    public static DecimalFormat miformato = new DecimalFormat("###,###,###,###");
    public static int nOp1 = 0, aleatorioJuego = 0, respCorrJuego = 0,
                      nRespJuego = 0, min = 1, max = 10, cantPreg = 15, sIni = 0, sFin = 0, mIni = 0, mFin = 0, resEntrar = 0, confJuego = 0, n = 1,
                      confirm = 0, confResp = 0, ayudapublico = 0, ayuda5050 = 0, nPreg = 0, tGanado = 0, vGanado = 0, tgSeg = 0, resta = 0;
    
    public static void iniciarJuego()
    {
        ayudapublico = 0;
        ayuda5050 = 0;        //Se inicializan las variables de apoyo.
        n = 1;
        min = 1;
        
        
        do  // Haga mientras, Primero hace y luego evalua, mientras "confirm" sea igual a "0".
        {
            confResp = 0;
            aleatorioJuego = (int)(Math.random()*(cantPreg))+min; /*Busca un numero aleatorio entre 1 a 15
                                                                    puesto que la variable "min" es igual a "1" y "cantPreg" es igual a "15". */
            
            do // Haga mientras, hace y evalua si confResp es igual "1" para volverse a ejecutar.
            {
                switch (aleatorioJuego) /*Entra a cualquiera de los casos entre "1" y "15" gracias
                                         gracias a la libreria random.*/
                {
                    case 1:
                        preg = preg1;
                        resp1 = "\n\n 1. " + resPreg1A;
                        resp2 = "\n 2. " + resPreg1B;
                        resp3 = "\n 3. " + resPreg1C;
                        resp4 = "\n 4. " + resPreg1D;
                        respCorrJuego = 2;
                        respCaso5050 = resp2 + resp4;
                    break;
                    
                    case 2:             /*Si entra al caso "2" selecciona la pregunta #2 y
                                          sus posibles respuestas.*/
                        preg = preg2;
                        resp1 = "\n\n 1. " + resPreg2A;
                        resp2 = "\n 2. " + resPreg2B;
                        resp3 = "\n 3. " + resPreg2C;
                        resp4 = "\n 4. " + resPreg2D;
                        respCorrJuego = 1;  //Guarda en la variable el numero de respuesta correcta, en este caso 3 seria la "C".
                        respCaso5050 = resp1 + resp4; /*Guarda en esta variable dos respuestas que seran las posibles
                                                 correctas y que se mostraran en caso de elegir la ayuda "50/50". */
                    break;
                    
                    case 3:
                        preg = preg3;
                        resp1 = "\n\n 1. " + resPreg3A;
                        resp2 = "\n 2. " + resPreg3B;
                        resp3 = "\n 3. " + resPreg3C;
                        resp4 = "\n 4. " + resPreg3D;
                        respCorrJuego = 2;
                        respCaso5050 = resp2 + resp3;
                    break;
                    
                    case 4:
                        preg = preg4;
                        resp1 = "\n\n 1. " + resPreg4A;
                        resp2 = "\n 2. " + resPreg4B;
                        resp3 = "\n 3. " + resPreg4C;
                        resp4 = "\n 4. " + resPreg4D;
                        respCorrJuego = 3;
                        respCaso5050 = resp3 + resp1;
                    break;
                    
                    case 5:
                        preg = preg5;
                        resp1 = "\n\n 1. " + resPreg5A;
                        resp2 = "\n 2. " + resPreg5B;
                        resp3 = "\n 3. " + resPreg5C;
                        resp4 = "\n 4. " + resPreg5D;
                        respCorrJuego = 4;
                        respCaso5050 = resp4 + resp3;
                    break;
                    
                    case 6:
                        preg = preg6;
                        resp1 = "\n\n 1. " + resPreg6A;
                        resp2 = "\n 2. " + resPreg6B;
                        resp3 = "\n 3. " + resPreg6C;
                        resp4 = "\n 4. " + resPreg6D;
                        respCorrJuego = 2;
                        respCaso5050 = resp2 + resp1;
                    break;
                    
                    case 7:
                        preg = preg7;
                        resp1 = "\n\n 1. " + resPreg7A;
                        resp2 = "\n 2. " + resPreg7B;
                        resp3 = "\n 3. " + resPreg7C;
                        resp4 = "\n 4. " + resPreg7D;
                        respCorrJuego = 2;
                        respCaso5050 = resp2 + resp3;
                    break;
                    
                    case 8:
                        preg = preg8;
                        resp1 = "\n\n 1. " + resPreg8A;
                        resp2 = "\n 2. " + resPreg8B;
                        resp3 = "\n 3. " + resPreg8C;
                        resp4 = "\n 4. " + resPreg8D;
                        respCorrJuego = 3;
                        respCaso5050 = resp3 + resp2;
                    break;
                    
                    case 9:
                        preg = preg9;
                        resp1 = "\n\n 1. " + resPreg9A;
                        resp2 = "\n 2. " + resPreg9B;
                        resp3 = "\n 3. " + resPreg9C;
                        resp4 = "\n 4. " + resPreg9D;
                        respCorrJuego = 2;
                        respCaso5050= resp2 + resp4;
                    break;
                    
                    case 10:
                        preg = preg10;
                        resp1 = "\n\n 1. " + resPreg10A;
                        resp2 = "\n 2. " + resPreg10B;
                        resp3 = "\n 3. " + resPreg10C;
                        resp4 = "\n 4. " + resPreg10D;
                        respCorrJuego = 4;
                        respCaso5050 = resp4 + resp2;
                    break;
                    
                    case 11:
                        preg = preg11;
                        resp1 = "\n\n 1. " + resPreg11A;
                        resp2 = "\n 2. " + resPreg11B;
                        resp3 = "\n 3. " + resPreg11C;
                        resp4 = "\n 4. " + resPreg11D;
                        respCorrJuego = 3;
                        respCaso5050 = resp3 + resp1;
                    break;
                    
                    case 12:
                        preg = preg12;
                        resp1 = "\n\n 1. " + resPreg12A;
                        resp2 = "\n 2. " + resPreg12B;
                        resp3 = "\n 3. " + resPreg12C;
                        resp4 = "\n 4. " + resPreg12D;
                        respCorrJuego = 1;
                        respCaso5050 = resp1 + resp4;
                    break;
                    
                    case 13:
                        preg = preg13;
                        resp1 = "\n\n 1. " + resPreg13A;
                        resp2 = "\n 2. " + resPreg13B;
                        resp3 = "\n 3. " + resPreg13C;
                        resp4 = "\n 4. " + resPreg13D;
                        respCorrJuego = 3;
                        respCaso5050= resp3 + resp2;
                    break;
                    
                    case 14:
                        preg = preg14;
                        resp1 = "\n\n 1. " + resPreg14A;
                        resp2 = "\n 2. " + resPreg14B;
                        resp3 = "\n 3. " + resPreg14C;
                        resp4 = "\n 4. " + resPreg14D;
                        respCorrJuego = 3;
                        respCaso5050 = resp3 + resp4;
                    break;
                    
                    case 15:
                        preg = preg15;
                        resp1 = "\n\n 1. " + resPreg15A;
                        resp2 = "\n 2. " + resPreg15B;
                        resp3 = "\n 3. " + resPreg15C;
                        resp4 = "\n 4. " + resPreg15D;
                        respCorrJuego = 2;
                        respCaso5050 = resp2 + resp4;
                    break;

                }
//--------------------------------------------------------------------------------------------------------------- 
                if (nPreg == 0)
                {
                    if (ayudapublico == 0  && ayuda5050 == 0) //Si las dos ayudas estan en "0" significa que estarán disponibles.
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + //En esta variable guarda lo que se mostrará en el mensaje emergente.
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +                                         /*Por medio de estas lineas de código se mostrará la ventana o mensaje emergente
                                                                                  que mostrará las preguntas y posibles respuestas, ademas
                                                                                  de las ayudas que aún no haya utilizado.*/  
                                "\n\n5. Ayuda del publico" +
                                "\n6. Ayuda 50/50" +
                                "\n Llamada a un amigo"+
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                    }
                    if (ayudapublico == 0  && ayuda5050 == 1) //Si ayuda 50/50 es igual a "1", NO estará disponible.
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +                             
                                "\n\n5. Ayuda del publico" +
                                "\n Llamada a un amigo"+
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                    }
                    if (ayudapublico == 1  && ayuda5050 == 0) //Si ayuda del publico es igual a "1", NO estará disponible.
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n\n6. Ayuda 50/50" +
                                "\n Llamada a un amigo"+
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                    }
                    if (ayudapublico == 1  && ayuda5050 == 1) //Como las 2 ayudas estan en "1" significa que el concursante ya las utilizó.
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg + 
                                resp1 +
                                resp2 + 
                                resp3 + 
                                resp4 +
                                "\n Llamada a un amigo"+
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                    }
 
//---------------------------------------------------------------------------------------------------------------
                    
                    nRespJuego = Integer.parseInt(txtRespJuego); //Guarda en la variable "nRespJuego" el número de opción seleccionada.
                 
                    if (nRespJuego == 6 && ayudapublico == 0 && ayuda5050 == 0) // Si la cantidad de opciones a mostrar en el mensaje es de 6, y si tiene las 2 ayudas disponibles.
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg +
                                respCaso5050 +
                                "\n\n5. Ayuda del publico" +
                                "\n Llamada a un amigo"+                        //Carga y muestra el mensaje emergente con la pregunta y posibles respuestas
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                        nRespJuego = Integer.parseInt(txtRespJuego); //Guarda en la variable "nRespJuego" el número de opción seleccionada.
                        ayuda5050 = 1;
                        nPreg = 1;
                    }
                    if (nRespJuego == 6 && ayudapublico == 1  && ayuda5050 == 0) //En caso de que se haya utilizado la ayuda al publico y la 50/50 esté disponible.
                    {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg +
                                respCaso5050 +
                                "\n Llamada a un amigo"+                        /*Carga y muestra el mensaje emergente con la pregunta y las dos posibles respuestas correctas 
                                                                                  que se mostrarán después de usar la ayuda al publico y la ayuda 50/50.*/ 
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                        nRespJuego = Integer.parseInt(txtRespJuego); //Guarda en la variable "nRespJuego" el número de opción seleccionada.
                        ayuda5050 = 1;
                        nPreg = 0;
                    }
                }
                if (nPreg == 1 && ayudapublico == 1) //En caso de se haya utilizado la ayuda al publico, sin impotar si utilizó o no la 50/50
                {
                        txtRespJuego = JOptionPane.showInputDialog(null, preg +
                                respCaso5050 +
                                "\n Llamada a un amigo"+                        /*Carga y muestra el mensaje emergente con la pregunta y las dos posibles respuestas correctas 
                                                                                  que se mostrarán después de usar la ayuda al publico y la ayuda 50/50.*/
                                "\n\n7. Salir",
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                        nRespJuego = Integer.parseInt(txtRespJuego); //Guarda en la variable "nRespJuego" el número de opción seleccionada.
                        ayuda5050= 1;
                }
 //---------------------------------------------------------------------------------------------------------------                    
                if (nRespJuego == 1 || nRespJuego == 2 || nRespJuego == 3 || nRespJuego == 4) //Si el numero de opción seleccionada fué uno valido; A, B, C ó D
                {
                    if (respCorrJuego == nRespJuego) /*y si la respuesta correcta del juego es igual a la que seleccionó el participante,
                                                       osea, en caso de que seleccionó la respuesta correcta.*/
                    {
                        if (n <= 15 ) // y si no se ha pasado del numero total de preguntas.
                        {
 
                            if(n == 1) //Si el contador "n" está en "1", osea si va en la primer pregunta.
                            {
                                vGanado = 100000; //Habrá ganado 100,000.
                                tgSeg = 0; //Si "tgSeg = 1" estará en seguro, si "tgSeg = 0" no estará en seguro.
                            }              //Hay que tener en cuenta que los seguros solo son en las preguntas 5, 10 y 15.
                            if(n == 2)
                            {
                                vGanado = 200000;
                                tgSeg = 0;
                            }
                            if(n == 3)
                            {
                                vGanado = 500000;
                                tgSeg = 0;
                            }
                            if(n == 4)
                            {
                                vGanado = 1000000;
                                tgSeg = 0;
                                
                            }
                            if(n == 5)
                            {
                                vGanado = 2000000;
                                tgSeg = 1; //En la preguntá 5 estará en "seguro" y no perderá el dinero
                            }
                            if(n == 6)
                            {
                                vGanado = 5000000;
                                tgSeg = 0;
                                
                            }
                            if(n == 7)
                            {
                                vGanado = 10000000;
                                tgSeg = 0;
                            }
                            if(n == 8 )
                            {
                                vGanado = 15000000;
                                tgSeg = 0;
                            }
                            if(n == 9 )
                            {
                                vGanado = 20000000;
                                tgSeg = 0;
                            }
                            if(n == 10 )
                            {
                                vGanado = 30000000;
                                tgSeg = 1; //En la preguntá 10 estará en "seguro" y no perderá el dinero       
                            }
                            if(n == 11 )
                            {
                                vGanado = 100000000;
                                tgSeg = 0;
                            }
                            if(n == 12 )
                            {
                                vGanado = 150000000;
                                tgSeg = 0;
                            }
                            if(n == 13 )
                            {
                                vGanado = 200000000;
                                tgSeg = 0;
                            }
                            if(n == 14 )
                            {
                                vGanado = 250000000;
                                tgSeg = 0;
                            }
                            
                            if(n == 15 ) //Cuando haya respondido las 15 preguntas correctamente habrá ganado el premio mayor.
                            {
                                vGanado = 500000000;
                                JOptionPane.showMessageDialog(null, "¡¡¡Ha ganado el premio mayor!!!\n" +
                                        "Total ganado : $" + miformato.format(vGanado),                      //Ganó el Premio mayor, 500'000,000.
                                        "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                               TerminarDeJugar.casoSalirJuego();
                            }
                             
                            if (tgSeg == 1)
                            {
                                tGanado = vGanado;  //Cada vez que llegue a un seguro irá sumando lo que va ganando.
                            }
                                 
                            confJuego = JOptionPane.showConfirmDialog(null, "Respuesta Correcta \n" +
                                    "Hasta el momento ha ganado:  $" + miformato.format(tGanado) +
                                    "\n¿Desea continuar jugando?",                                      /*Despues de responder la pregunta correcta le preguntará si desea continuar jugando
                                                                                                          y continuar respondiendo a las preguntas o retirarse del juego con lo que actualmente ganó*/
                                    "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE);
                             
                            if (confJuego == JOptionPane.YES_OPTION)    //En caso de que desee continuar jugando.
                            {
                                confirm = 0;  //Para entrar de nuevo al primer "do" y continuar jugando.
                                confResp = 0; //Para no entrar al segundo "do".
                                nPreg = 0; //Para habilitar de nuevo las ayudas.                                     
                            }
                            if (confJuego == JOptionPane.NO_OPTION) //En caso de que desee retirarse del juego.
                            {
                                JOptionPane.showMessageDialog(null, "Total ganado : $" + miformato.format(vGanado),
                                        "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
                                confirm = 1;  //Para no entrar al "do" y no seguir jugando.
                                confResp = 0; //Para no entrar al segundo "do".
                                nPreg = 0; //Para habilitar de nuevo las ayudas. 
                            }
                             
                        }
                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Respuesta Incorrecta \n" +  //En caso de que haya respondiendo incorrectamente perderá y se llevará el total que ganó.
                                "Total ganado : $" + miformato.format(tGanado),
                                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
                        confirm = 1; //Para no entrar al "do" y no seguir jugando.
                    }
                     
                }
//--------------------------------------------------------------------------------------------------------------- 
                if (nRespJuego == 5 && ayudapublico == 0) //Si seleccionó la ayuda al publico y está disponible.
                {
                     
                    if (respCorrJuego == 1) //Si la respuesta correcta es la opción A, mostrará unos porcentajes a cada respuesta, pero el mayor lo tendrá la respuesta A para indicar que es la correcta.
                    {
                        varPorcB = resp1 + " = 40%" + "\n" + resp2 + " = 24%" + "\n" + resp3 + " = 16%" + "\n" + resp4 + " = 20%";
                    }
                    if (respCorrJuego == 2) //Si la respuesta correcta es la opción B, mostrará unos porcentajes a cada respuesta, pero el mayor lo tendrá la respuesta B para indicar que es la correcta.
                    {
                        varPorcB = resp1 + " = 30%" + "\n" + resp2 + " = 35%" + "\n" + resp3 + " = 20%" + "\n" + resp4 + " = 15%";
                    }
                    if (respCorrJuego == 3) //Si la respuesta correcta es la opción C, mostrará unos porcentajes a cada respuesta, pero el mayor lo tendrá la respuesta C para indicar que es la correcta.
                    {
                        varPorcB = resp1 + " = 20%" + "\n" + resp2 + " = 15%" + "\n" + resp3 + " = 50%" + "\n" + resp4 + " = 15%";
                    }
                    if (respCorrJuego == 4) //Si la respuesta correcta es la opción D, mostrará unos porcentajes a cada respuesta, pero el mayor lo tendrá la respuesta D para indicar que es la correcta.
                    {
                        varPorcB = resp1 + " = 15%" + "\n" + resp2 + " = 8%" + "\n" + resp3 + " = 17%" + "\n" + resp4 + " = 60%";
                    }
                    JOptionPane.showMessageDialog(null, "Votaciones del publico:" +
                            "\n" + varPorcB,
                            "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.INFORMATION_MESSAGE); //Muestrá los porcentajes anteriores según la respuesta correcta.
                    confResp = 1; //Para entrar de nuevo al segundo "do".
                    ayudapublico = 1; //Para indicar que ya utilizó la ayuda al publico.
                }
//---------------------------------------------------------------------------------------------------------------                 
                if (nRespJuego == 7) //Si selecciona la opción salir.
                {
                    TerminarDeJugar.casoSalirJuego();
                }
                if (nRespJuego >= 8 ) //Si selecciona una opción que no sea valida.
                {
                    confResp = 1; //Entonces vuelve y entra al segundo "do".
                }
                if (nRespJuego == 5 && ayudapublico == 1) //Si seleccionó la ayuda al publico y NO está disponible.
                { 
                    confResp = 1; //Entonces vuelve y entra al segundo "do".
                }
                if (nRespJuego == 6 && ayuda5050 == 1) //Si seleccionó la ayuda 50/50 y NO está disponible.
                {
                    confResp = 1; //Entonces vuelve y entra al segundo "do".
                }
 
            }while(confResp == 1); /*Despues de ejecutar el "do" viene y evalua si "confResp"
                                     sigue siendo "1" para en caso de serlo ejecutar el "do"
                                     nuevamente y a la variable acomuladora "n" sumarle "1" o salirse*/
            
            n += 1; //Aumenta el contador que indica en que numero de pregunta va.
            
        }while(confirm == 0); /*luego de hacer el primer "do" evalua si "confirm" sigue siendo "0"
                                para volver a ejecutar el "do" o salirse en caso de ser "1"*/ 
         
    }

    
    
}
