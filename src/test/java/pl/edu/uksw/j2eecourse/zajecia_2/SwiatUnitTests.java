package pl.edu.uksw.j2eecourse.zajecia_2;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static junit.framework.Assert.assertEquals;

public class SwiatUnitTests {

    @Test
    public void powinienRazWywolywacPrzywitaniePlanety() {
        //mając:
        Swiat swiat = new Swiat();
        MockPlaneta mockPlaneta = new MockPlaneta();
        ReflectionTestUtils.setField(swiat, "planeta", mockPlaneta);

        //kiedy:
        swiat.start();

        //wtedy:
        assertEquals(1, mockPlaneta.getLiczbaWywolanPrzedstawSie());
    }

    private class MockPlaneta implements Planeta {

        private int liczbaWywolanPrzedstawSie = 0;

        @Override
        public void przedstawSie() {
            liczbaWywolanPrzedstawSie++;
        }

        public int getLiczbaWywolanPrzedstawSie() {
            return liczbaWywolanPrzedstawSie;
        }

    }

}
