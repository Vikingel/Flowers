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

    ImageView[] massiv;

    int count=0;

    public void initialize(){
        massiv =new ImageView[] {Geran, Krokus, Fialka};
    }

    public void masha() {
        ImageView temp = massiv[2];
        massiv[2] = massiv[1];
        massiv[1] = temp;
        double xtemp = massiv[2].getLayoutX();
        massiv[2].setLayoutX(massiv[1].getLayoutX());
        massiv[1].setLayoutX(xtemp);
    }


    public void tanya() {
        ImageView temp = massiv[0];
        massiv[0] = massiv[1];
        massiv[1] = temp;
        double xtemp = massiv[0].getLayoutX();
        massiv[0].setLayoutX(massiv[1].getLayoutX());
        massiv[1].setLayoutX(xtemp);
    }

    public void dayPassed() {
        masha();
        tanya();
        count++;
        counter.setText(String.valueOf(count));
    }
}
