import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
    //Member variables
    Model model;

    //View constructor
    View(Controller c, Model m)
    {
        model = m;
        /*try
        {
            this.turtle_image = ImageIO.read(new File("turtle.png"));
        }
        catch(Exception e)
        {
            e.printStackTrace(System.err);
            System.exit(1);
        }*/

    }

    //Sets color of program, and and draws bricks
    public void paintComponent(Graphics g)
    {
        g.setColor(new Color(128, 255, 255));
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(new Color(0, 0, 0));
        for(int i = 0; i < model.bricks.size(); i++)
        {
	        Brick b = model.bricks.get(i);
	        g.drawRect(b.x - model.scrollPos, b.y, b.w, b.h); 
        }

    }

}
