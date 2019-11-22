package Bolitas;

import Bolitas.Otros.IConstants;
import Bolitas.Otros.RandomGenerator;

import javax.swing.*;
import java.awt.*;

public class Bolita extends JLabel implements IConstants {

    private int positionX, angleX;
    private int positionY, angleY;
    private Color color;
    private int diameter;
    private int speed;

    public  Bolita(Color color) {


        this.positionX = RandomGenerator.generateInt(SCREEN_WIDTH);
        this.positionY = RandomGenerator.generateInt(SCREEN_HEIGHT);
        this.speed = RandomGenerator.generateInt(MAX_SPEED);
        this.color = color;
        this.diameter = BALL_DIAMETER;
        this.angleX = 1;
        this.angleY = 1;



        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setVisible(true);


    }

    public void move(){

        if(positionX + angleX == 0)
            angleX = speed;
        else if(positionX + angleX >= SCREEN_WIDTH - diameter)
            angleX = -speed;
        else if(positionY + angleY == 0)
            angleY = speed;
        else if(positionY + angleY >= SCREEN_HEIGHT - diameter)
            angleY = -speed;
        
        if (positionX + angleX < 0) angleX = 1;
        if (positionX + angleX > SCREEN_WIDTH) angleX = -1;
        if (positionY + angleY < 0) angleY = 1;
        if (positionY + angleY > SCREEN_WIDTH) angleY = -1;

        this.positionX += angleX;
        this.positionY += angleY;
    }


    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.setColor(color);
        graphics.fillOval(positionX, positionY, diameter, diameter);
    }

    @Override
    public Bolita clone(){
        Color cloneColor = this.color;
        return new Bolita(cloneColor);
    }

}

