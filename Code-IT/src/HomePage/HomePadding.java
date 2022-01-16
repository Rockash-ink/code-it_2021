package HomePage;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;




public class HomePadding extends JPanel {
    final private HomeFeed homeFeed_Jlabel = new HomeFeed();
    final private JLabel leftsidepadding = new JLabel();
    final private JLabel rightsidepadding = new JLabel();
    final private String Text1 = "Expand";
    private JPanel mainPanel_homePadding;

    
    final private JButton recentTab  = new JButton(Text1) ;
    final private JButton myWorkSpace = new JButton(Text1) ;
    private Boolean panelexpanded = true;
    private JPanel myWorkSpacePanel ;
    private JPanel recentTabPanel;
    private Boolean panel2expanded = true;
    


 protected HomePadding(){
   paddingSettings();      
   leftsidepadding.setPreferredSize(new Dimension(20,20));
   leftsidepadding.setOpaque(true);
   leftsidepadding.setBackground(Color.YELLOW);
   leftsidepadding.setLayout(new BorderLayout());
    rightsidepadding.setPreferredSize(new Dimension(20,20));
    rightsidepadding.setOpaque(true);
    rightsidepadding.setBackground(Color.YELLOW);
    rightsidepadding.setLayout(new BorderLayout(2000,2000));
    add(leftsidepadding,BorderLayout.WEST);
    add(rightsidepadding,BorderLayout.EAST);
    }


void paddingSettings(){
        homeFeed_Jlabel.setLayout(new BorderLayout());     
        setOpaque(true);
        setLayout(new BorderLayout(0,0));
    
        

// Main recentTabPanel 
         mainPanel_homePadding = new JPanel();
         mainPanel_homePadding.setBackground(Color.GRAY);
         mainPanel_homePadding.setLayout(new BorderLayout(10,10));
            
                 // Panel 1
                recentTab.addActionListener(e->recentAction());
                recentTabPanel = new JPanel();
                recentTabPanel.setPreferredSize(new Dimension(500,500));
                recentTabPanel.setBackground(Color.lightGray);
                recentTabPanel.add(new JLabel("Recent Work"));
                recentTabPanel.add(recentTab);
                mainPanel_homePadding.add(recentTabPanel,BorderLayout.NORTH);

                
                // Panel 2
                myWorkSpace.addActionListener(e->myWorkAction());
                myWorkSpacePanel = new JPanel();
                myWorkSpacePanel.setPreferredSize(new Dimension(500,500));
                myWorkSpacePanel.setBackground(Color.lightGray);
                myWorkSpacePanel.add(new JLabel("My Workspace"));  
                myWorkSpacePanel.add(myWorkSpace);
                mainPanel_homePadding.add(myWorkSpacePanel,BorderLayout.SOUTH);
                add(mainPanel_homePadding);
    }

// expaded action for recentTabPanel 2
    void myWorkAction(){
            if (panel2expanded){
                    panel2expanded = false;
                    myWorkSpacePanel.setPreferredSize(new Dimension(500,100));
                    myWorkSpacePanel.revalidate();
                    myWorkSpacePanel.repaint();
                    
            }
            else {
                    panel2expanded = true;
                    myWorkSpacePanel.setPreferredSize(new Dimension(500,500));
                    myWorkSpacePanel.revalidate();
                    myWorkSpacePanel.repaint();
                    
            }
    }
    // extended action recentTabPanel 
    void recentAction(){
            if (panelexpanded){
                    panelexpanded = false;
                    recentTabPanel.setPreferredSize(new Dimension(500,100));
                    recentTabPanel.revalidate();
                    recentTabPanel.repaint();
            }
            else {
                    panelexpanded = true;
                    recentTabPanel.setPreferredSize(new Dimension(500,500));
                    recentTabPanel.revalidate();
                    recentTabPanel.repaint();
            }
    }

}

 
   
    
    

