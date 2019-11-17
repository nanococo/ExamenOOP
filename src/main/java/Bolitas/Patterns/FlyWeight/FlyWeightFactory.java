package Bolitas.Patterns.FlyWeight;

import sun.applet.resources.MsgAppletViewer;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    static Map<Color, FlyWeight> flyWeights = new HashMap<>();

    public static FlyWeight getFlyWeight(Color color){
        FlyWeight result = flyWeights.get(color);
        if (result == null){
            result = new FlyWeight(color);
            flyWeights.put(color, result);
        }
        return result;
    }


}
