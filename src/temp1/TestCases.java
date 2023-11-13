package temp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class TestCases {

        @Test
        public void firstTestCase(){
            //vi vill kontrollera att längden på input fungerar som den ska
            String input = " ";
            int actual = input.length();
            int expected = 1;
            assertEquals(expected, actual);

        }
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

            int expected = 0;
            int actual = logic.getAntalRader();


            assertEquals(expected, actual);
        }



    }


