package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {
    public Tree(double y, double x){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(76, 29, 0));
        drawTool.drawFilledRectangle(x, y, 25, 80);
        drawTool.setCurrentColor(new Color(3, 83, 0));
        drawTool.drawFilledRectangle(x-25, y-40, 75, 75);
    }
}
