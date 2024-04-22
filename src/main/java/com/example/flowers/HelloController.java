package com.example.flowers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    Label counter;

    @FXML
    ImageView Geran;

    @FXML
    ImageView Krokus;

    @FXML
    ImageView Fialka;

    public void masha() {
        double right = 400;
        double center = 250;
        double left = 10;
        if (Fialka.getLayoutX() == right) {
            Fialka.setLayoutX(center);
            if (Krokus.getLayoutX() == center){Krokus.setLayoutX(right);}
            if (Geran.getLayoutX() == center){Krokus.setLayoutX(right);}

                    } else if (Krokus.getLayoutX() == right) {
            Fialka.setLayoutX(center);
        } else Geran.setLayoutX(center);
    }


        public void tanya() {
        double right = Fialka.getLayoutX();
        double center = Krokus.getLayoutX();
        double left = Geran.getLayoutX();
        if (Fialka.getLayoutX() == left) {
            Fialka.setLayoutX(center);
            if (Krokus.getLayoutX() == center) {
                Krokus.setLayoutX(left);
            } else {
                Geran.setLayoutX(left);
            }
        } else if (Krokus.getLayoutX() == left) {
            Krokus.setLayoutX(center);
            if (Fialka.getLayoutX() == center) {
                Fialka.setLayoutX(left);
            } else {
                Geran.setLayoutX(left);
            }
        } else if (Geran.getLayoutX() == left) {
            Geran.setLayoutX(center);
            if (Krokus.getLayoutX() == center) {
                Krokus.setLayoutX(left);
            } else {
                Fialka.setLayoutX(left);
            }
        }
    }

    public void dayPassed() {
        masha();
        tanya();
    }
}
