import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class BallGame extends Frame implements MouseMotionListener {
    int circleX=200,circleY=200,circleRadius=20;

    BallGame(){
        addMouseMotionListener(this);
        setSize(800,800);
        setTitle("ball game");
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circleX,circleY,2*circleRadius,2*circleRadius);
    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        circleX=x;
        circleY=y;

        //opp direction
//        if(x <circleX+circleRadius){
//            circleX++;
//        }
//        if(x > circleRadius+circleX){
//            circleX--;
//        }
//        if( y < circleY+circleRadius){
//            circleY++;
//        }
//        if(y > circleY+circleRadius){
//            circleY--;
//        }
        repaint();
    }

    public static void main(String[] args) {
        new BallGame();
    }
}
