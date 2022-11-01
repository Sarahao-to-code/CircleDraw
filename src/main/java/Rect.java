import java.awt.*;

public class Rect {
    protected Point pos;
    protected int width;
    private int height;

    protected Color col;

    public Rect(Point position, Color c, int w, int h){
        pos = position;
        col = c;
        width = w;
        height = h;
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
