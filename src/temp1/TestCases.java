package temp1;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

    public class TestCases {


        @Test
        public void getAntalTecken(){
            //Arrange
            Logic logic = new Logic(); //information som behövs för att utföra testfallet
            int expected = 0; //förväntade resultat(hämtar ifrån vår kod).
            //Act
            //vi hämtar den faktiskt info ifrån vår kod och sparar den i actual
            int actual = logic.getAntalTecken();
            //Assert

            assertEquals(expected, actual);

        }
        @Test
        public void getAntalRader()
        {
            Logic logic = new Logic();
            String input = " ";        //här så kollar jag längden på antal rader
            int expected = 0;
            int actual = logic.getAntalRader(input.length());


            assertEquals(expected, actual);
        }

        @Test
        public void thirdTest(){

            Logic logic = new Logic();
            int actual = logic.add();   //här så jämför jag om antaOrd och antalTecken är lika med 0
            int expected = 0;
            assertEquals(expected, actual);

        }



    }


