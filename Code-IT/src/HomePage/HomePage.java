package HomePage;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

public class HomePage extends JPanel {

    TopSideHome topSideHome_Jpanel = new TopSideHome();
    JLabel welcomeText_topSideHome_JLabel = new JLabel(); //label with
    HomePadding homePadding_Jpanel = new HomePadding();
    
    public HomePage(){ 
        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new BorderLayout(10,10));
        makeHome();
    }
    void makeHome(){
        this.add(topSideHome_Jpanel,BorderLayout.NORTH); 
        this.add(homePadding_Jpanel);
    }
} 