package WorkArea;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class SideBarMenuFunctions extends JPanel implements ActionListener{

// need to read file
    
    public String[] workSpacesList = {"First","Second"};
    JComboBox comboBox_JComboBox = new JComboBox(workSpacesList);
    JButton workAreaAdd_JButton = new JButton();
    WorkArea_AddWorkArea addWorkArea;
    


    SideBarMenuFunctions(){
        this.setBackground(Color.MAGENTA);
    
        this.add(comboBox_JComboBox);
        comboBox_JComboBox.setPreferredSize(new Dimension(200,20));
        comboBox_JComboBox.addActionListener(this);

        this.add(workAreaAdd_JButton);
        workAreaAdd_JButton.setText("+ Add");
        workAreaAdd_JButton.addActionListener(e -> AddNewAreaSettings());

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox_JComboBox){
        // TODO Auto-generated method stub
        System.out.println(comboBox_JComboBox.getSelectedItem());

        }
    }
    void AddNewAreaSettings(){ 
        if(addWorkArea == null){
            addWorkArea = new WorkArea_AddWorkArea();
        }
        addWorkArea.setVisible(true);
        addWorkArea.workArea_MainPanel.setVisible(true);
        addWorkArea.makeNewCard_Jpanel.setVisible(false);
        addWorkArea.newCard_JButton.setVisible(true);
    }
    
}
