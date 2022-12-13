package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {
    public Background(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(76, 153, 252));
        drawTool.drawFilledRectangle(x,y,5000, 5000);
        drawTool.setCurrentColor(new Color(32, 186, 0));
        drawTool.drawFilledRectangle(x, y+500, 2000, 100);
    }
}
