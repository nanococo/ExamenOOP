/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolitas.Patterns.Strategy;

import Bolitas.Bolita;
import Bolitas.Patterns.FlyWeight.FlyWeight;
import Bolitas.Patterns.FlyWeight.FlyWeightFactory;

import java.awt.*;
import java.util.ArrayList;


public class CreateFlyWeight implements Strategy {



    @Override
    public ArrayList<Bolita> create(int n) {

        ArrayList<Bolita> result = new ArrayList<>();
        FlyWeight flyWeight = FlyWeightFactory.getFlyWeight(Color.GREEN);

        for (int created = 0 ; created < n ; created++){

            result.add(new Bolita(flyWeight.color));

        }
        return result;

    }
    
}
