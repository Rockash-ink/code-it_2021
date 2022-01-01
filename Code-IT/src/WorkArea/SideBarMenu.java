package WorkArea;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Dimension;
import java.awt.Color;

public final class SideBarMenu extends JPanel {
    JLabel workAreaTitleText_JLabel = new JLabel();
    final SideBarMenuFunctions sideBarMenuFunctions_Jpanel;
    
    

    public SideBarMenu() {
        
        sideBarMenuFunctions_Jpanel = new SideBarMenuFunctions();
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(200,150));
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        
        makeSideBarMenu();
    }
    void makeSideBarMenu(){
        workAreaTitleText_JLabel.setText("Work Area");

        

        this.add(workAreaTitleText_JLabel);
        this.add(sideBarMenuFunctions_Jpanel);
        
        
    }
}
