/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolitas.Patterns.Strategy;

import Bolitas.Bolita;
import Bolitas.IConstants;

import java.util.ArrayList;

public interface Strategy extends IConstants {

    ArrayList<Bolita> create(int quantity);
    
}
