import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    //private Circle Cir;

    private Square Rectt;
    private Frame f;
    private Point p;
    private Color c;

    public void paint(Graphics g){

        //Cir.draw(g);
        Rectt.draw(g);
    };

    public Drawing(){
        p = new Point(200,300);
        c = new Color(00000);
        //Cir = new Circle(p,c,30);
        Rectt = new Square(p,c,30);
        setupFrame();
        setupCanvas();

    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400,400);
    }

    private void setupFrame() {
        f = new Frame("my window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }
};
