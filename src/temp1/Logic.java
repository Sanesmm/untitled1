
package temp1;
public class Logic {

    private int antalOrd;   //skapar tre attribut som inte innehåller några värden
    private int antalTecken;
    private int antalRader;


    public Logic() {  //här skapar jag en kontruktorn som utförs kod som vi skriver in
        //när vi skapar ett objekt av klassen Logic

        this.antalOrd = 0;
        this.antalTecken = 0;
        antalRader = 0;     //tilldelar ett värde till int variabler

    }
    public int add(){
        return antalOrd = antalTecken;
    }

    public int getAntalOrd() {
        return antalOrd;   //vi skickar tillbaka innehållet i antalOrd

    }
    public int getAntalTecken(){ //skickar tillbaka innehållet i antalTecken

        return antalTecken;
    }

    public int getAntalRader(int length){   //skickar tillbaka innehållet i antalRader

        return antalRader;
    }

    public void antalTecken(String input) {  //här så deklarerar jag string variabel som heter antalTecken


        antalTecken = antalTecken + input.length(); //sätter in värdet på antalTecken
        // till summan av input.length


        antalOrd++;   //här deklarerar jag antalOrd variabel och ökar variabelns värde med ett

    }
    public void antalRader () {

        antalRader++;   //deklaration av antalOrd
    }


}





