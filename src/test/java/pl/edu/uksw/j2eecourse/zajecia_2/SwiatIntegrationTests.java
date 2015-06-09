package pl.edu.uksw.j2eecourse.zajecia_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SwiatIntegrationTests {

    @Autowired
    private Swiat swiat;

    @Test
    public void powinienPrzedstawicSieSwiatRazemZPlaneta() {
        //mając:
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        assertEquals("", myOut.toString());

        //kiedy:
        swiat.start();

        //wtedy:
        assertEquals("Witaj Świecie\nPowitanie z Ziemi\n", myOut.toString());
    }

}
