package pl.edu.uksw.j2eecourse.zajecia_2;

import org.springframework.beans.factory.annotation.Autowired;

public class Swiat {

    @Autowired
    private Ziemia ziemia;

    public void start() {
        System.out.println("Witaj Świecie");

        this.ziemia.przedstawSie();
    }

}
