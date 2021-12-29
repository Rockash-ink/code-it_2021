package WorkArea;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Dimension;
import java.awt.Color;

public class SideBarMenu extends JPanel {
    JLabel workAreaTitleText_JLabel = new JLabel();
    SideBarMenuFunctions box_ComboBox = new SideBarMenuFunctions();
    
    

    public SideBarMenu() {
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(200,150));
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        
        makeSideBarMenu();
    }
    void makeSideBarMenu(){
        workAreaTitleText_JLabel.setText("Work Area");

        

        this.add(workAreaTitleText_JLabel);
        this.add(box_ComboBox);
        
        
    }
}
