package WorkArea;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.*;

public class SideBarMenuFunctions extends JPanel implements ActionListener{

// need to read file
    
    public String[] workSpacesList = {"First","Second"};
    JComboBox comboBox_JComboBox = new JComboBox(workSpacesList);
    JButton workAreaAdd_JButton = new JButton();
    


    SideBarMenuFunctions(){
        this.setBackground(Color.MAGENTA);
    
        this.add(comboBox_JComboBox);
        comboBox_JComboBox.addActionListener(this);

        this.add(workAreaAdd_JButton);
        workAreaAdd_JButton.setText("+ Add");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox_JComboBox){
        // TODO Auto-generated method stub
        System.out.println(comboBox_JComboBox.getSelectedItem());

        }
    }
    
}
