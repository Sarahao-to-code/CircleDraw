import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;

    public void paint(Graphics g){};

    public Drawing(){
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
        setBackground(Color.WHITE);
        setSize(400,400);


    }
}
