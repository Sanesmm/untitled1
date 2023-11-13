package temp1;

import java.util.Scanner;

public class Main  {

    static Logic logic = new Logic();  //här skapar jag objekt av klassen Logic
    static Main r = new Main();  //här skapar jag objekt av klassen Main

    Scanner scan = new Scanner(System.in);  //för att läsa in från terminalen
    String input = "";  //deklarera variabel string

    public void programIsRunning(String userInput){

        while(!"stop".equalsIgnoreCase(input)) {   //här använder jag while loop som körs tills användaren skriver ordet stop

            input = scan.nextLine();   //
            if (!input.equalsIgnoreCase("stop")){
                logic.antalTecken(userInput);
                logic.antalRader();                  // här returner hur många rader finns i användarens input
            }else{
                System.out.println("Ordet stop är skriven!");
                break;
            }

        }
    }

    public static void main(String[] args) {

        System.out.println("Var god och skriv in en text: ");
        System.out.println("Skriv stop för att avsluta! ");
        System.out.println("--------------------------------");

        r.input = r.scan.next(); //scan.next här läser ut antal tecken utan space
        r.programIsRunning(r.input);


        System.out.println("--------------------------------------");
        System.out.println("Antal rader: " + logic.getAntalOrd());
        System.out.println("Antal tecken: " + logic.getAntalTecken());  //skriver ut information
        System.out.println("Antal ord: " + logic.getAntalRader());



    }
}


