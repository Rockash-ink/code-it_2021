import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

class HomePage extends JPanel {

    JPanel topSideHome_jPanel = new JPanel(); //topsidebar 
    JLabel welcomeText_topSideHome_JLabel = new JLabel(); //label with

    HomePage(){ 

        this.setBackground(Color.RED);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new BorderLayout(10,10));
        makeHome();


    }
    void makeHome(){
        topSideHome_jPanel.setBackground(Color.GREEN);
        topSideHome_jPanel.setPreferredSize(new Dimension(100,100));
        topSideHome_jPanel.setLayout(new BorderLayout(5,5));


        welcomeText_topSideHome_JLabel.setPreferredSize(new Dimension(100,10));
        welcomeText_topSideHome_JLabel.setText("<html>Welcome back!<br/>Im Happy to see you!</html>");
        welcomeText_topSideHome_JLabel.setOpaque(true);
        welcomeText_topSideHome_JLabel.setBackground(Color.yellow); //
        



        topSideHome_jPanel.add(welcomeText_topSideHome_JLabel,BorderLayout.WEST);
        this.add(topSideHome_jPanel,BorderLayout.NORTH);
    }
} 