package HomePage;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;



public class HomePadding extends JPanel {
    HomeFeed homeFeed_Jlabel = new HomeFeed();
    JLabel a = new JLabel();
    JLabel b = new JLabel();
    String Text1 = "Expand";
    JPanel mainPanel_homePadding;
    JToggleButton isMetric;
    JScrollBar vbar;
    JLabel label = new JLabel();
    JScrollPane scrollPane = new JScrollPane();
    JButton recentTab  = new JButton(Text1) ;
    JButton myWorkSpace = new JButton(Text1) ;
    Boolean panelexpanded = true;
    JPanel panel2 ;
    JPanel panel;
    Boolean panel2expanded = true;
    

   
  
  
    HomePadding(){

    paddingSettings();
    

        
    this.a.setPreferredSize(new Dimension(20,20));
   a.setOpaque(true);
   a.setBackground(Color.YELLOW);
   a.setLayout(new BorderLayout());
    this.b.setPreferredSize(new Dimension(20,20));
    b.setOpaque(true);
    b.setBackground(Color.YELLOW);
    b.setLayout(new BorderLayout(2000,2000));
    ScrollPane();

    
  
    
    
    

    this.add(a,BorderLayout.WEST);
    this.add(b,BorderLayout.EAST);

       
    }


    void paddingSettings(){
        homeFeed_Jlabel.setLayout(new BorderLayout());     
        this.setOpaque(true);
        this.setLayout(new BorderLayout(0,0));
    
        

// Main panel 

         mainPanel_homePadding = new JPanel();
         mainPanel_homePadding.setBackground(Color.GRAY);
         mainPanel_homePadding.setLayout(new BorderLayout(10,10));
            
         recentTab.addActionListener(e->recentAction());
        // Panel 1
                panel = new JPanel();
                panel.setPreferredSize(new Dimension(500,500));
                panel.setBackground(Color.lightGray);
                panel.add(new JLabel("Recent Work"));
                panel.add(recentTab);
                mainPanel_homePadding.add(panel,BorderLayout.NORTH);

                myWorkSpace.addActionListener(e->myWorkAction());
                // Panel 2
                panel2 = new JPanel();
                panel2.setPreferredSize(new Dimension(500,500));
                panel2.setBackground(Color.lightGray);
                panel2.add(new JLabel("My Workspace"));  
                panel2.add(myWorkSpace);
                mainPanel_homePadding.add(panel2,BorderLayout.SOUTH);

        this.add(mainPanel_homePadding);
        
   
    }
    public void ScrollPane(){
 
        scrollPane.setPreferredSize(new Dimension(300,300));
    }




    void myWorkAction(){
            if (panel2expanded){
                    panel2expanded = false;
                    panel2.setPreferredSize(new Dimension(500,100));
                    panel2.revalidate();
                    panel2.repaint();
                    
            }
            else {
                    panel2expanded = true;
                    panel2.setPreferredSize(new Dimension(500,500));
                    panel2.revalidate();
                    panel2.repaint();
                    
            }
    }
    void recentAction(){
            if (panelexpanded){
                    panelexpanded = false;
                    panel.setPreferredSize(new Dimension(500,100));
                    panel.revalidate();
                    panel.repaint();
            }
            else {
                    panelexpanded = true;
                    panel.setPreferredSize(new Dimension(500,500));
                    panel.revalidate();
                    panel.repaint();
            }
    }

}

 
   
    
    

