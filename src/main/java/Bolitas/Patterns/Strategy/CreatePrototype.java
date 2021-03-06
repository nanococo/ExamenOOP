/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolitas.Patterns.Strategy;

import Bolitas.Bolita;

import java.awt.*;
import java.util.ArrayList;

public class CreatePrototype implements Strategy {

    @Override
    public ArrayList<Bolita> create(int n) {

        ArrayList<Bolita> result = new ArrayList<>();
        Bolita genericBolita = new Bolita(Color.BLUE);

        for (int created = 0 ; created < n ; created++){

            result.add(genericBolita.clone());

        }
        return result;

    }
    
}
