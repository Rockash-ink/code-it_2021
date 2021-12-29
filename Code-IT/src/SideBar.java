import java.awt.Dimension;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class SideBar extends JPanel{
    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    ImageIcon button_image = new ImageIcon("res/home.png");
    


    SideBar(){      
        button = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        
        
        button.setPreferredSize(new Dimension(55,55));
        button.setIcon(button_image);
        button2.setPreferredSize(new Dimension(55,55));
        button3.setPreferredSize(new Dimension(55,55));
        button4.setPreferredSize(new Dimension(55,55));
        button5.setPreferredSize(new Dimension(55,55));

       

        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension(100,0));
        this.setVisible(false);


        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);

        
    }
}
