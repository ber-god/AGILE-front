import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * This program demonstrates how to draw lines using Graphics2D object.
 * @author www.codejava.net
 *
 */
public class LinesDrawingExample extends JFrame {

    public LinesDrawingExample() {
        super("Lines Drawing Demo");

        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    void readLines (List<Line> l, Graphics g) {
        Graphics2D g3d = (Graphics2D) g;
        for (Line line : l) {

            g3d.draw(new Line2D.Float(line.getOrigine().getLatitude(), line.getOrigine().getLongitude(), line.getDestination().getLatitude(), line.getDestination().getLongitude()));
        }

    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Point p1 = new Point(123, 45.75f, 105.26f);
        Point p2 = new Point(124, 409.75f, 105.56f);

        Float latitude1 = p1.getLatitude();
        Float latitude2 = p2.getLatitude();
        Float longitude1 = p1.getLongitude();
        Float longitude2 = p2.getLongitude();

        g2d.draw(new Line2D.Float(latitude1,longitude1, latitude2, longitude2));

        System.out.printf("%.2f", latitude2);
        System.out.printf("%.2f", longitude2);
        System.out.printf("%.2f", 45.75f);
        //g2d.drawLine(120, 50, 360, 50);

        //g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));

        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
        //g2d.draw(new Line2D.Float(45.75f, 105.26f, 409.75f, 105.26f));


    }

    public void paint(Graphics g) {
        super.paint(g);
        //drawLines(g);
        Point p1 = new Point(123, 55.75f, 105.26f);
        Point p2 = new Point(124, 49.75f, 105.56f);
        Point p3 = new Point(125, 41.85f, 106.26f);
        Point p4 = new Point(126, 43.15f, 103.26f);
        Point p5 = new Point(127, 46.75f, 153.26f);
        Point p6 = new Point(128, 45.25f, 158.26f);
        Line l1 = new Line(p1, p2, 155.0f, "lala");
        Line l2 = new Line(p3, p2, 155.0f, "a");
        Line l3 = new Line(p5, p6, 155.0f, "lala");
        Line l4 = new Line(p4, p5, 155.0f, "lala");
        Line l5 = new Line(p1, p6, 155.0f, "lala");
        List<Line> list=new ArrayList<Line>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        list.add(l5);
        readLines (list, g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LinesDrawingExample().setVisible(true);
            }
        });
    }
}
