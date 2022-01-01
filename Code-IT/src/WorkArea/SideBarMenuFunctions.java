package WorkArea;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;

import filesReadWrite.*;
import java.util.HashSet;

public final class SideBarMenuFunctions extends JPanel implements ActionListener{

// need to read file
    
    public String[] workSpacesList = {"First","Second"};

    JPanel firstHalfSideJPanel = new JPanel();
    JPanel secondHalfSidPanel = new JPanel();
    //on first
    JComboBox comboBox_JComboBox = new JComboBox(workSpacesList);
    JButton workAreaAdd_JButton = new JButton();

    //on second
    JLabel items = new JLabel(); // this just an example
    WorkArea_AddWorkArea addWorkArea;
    


    SideBarMenuFunctions(){
        
        setBackground(Color.MAGENTA);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(firstHalfSideJPanel);
        add(secondHalfSidPanel);
    
        firstHalfSideJPanel.add(comboBox_JComboBox);
        comboBox_JComboBox.setPreferredSize(new Dimension(200,20));
        comboBox_JComboBox.addActionListener(this);

        firstHalfSideJPanel.add(workAreaAdd_JButton);
        workAreaAdd_JButton.setText("+ Add");
        workAreaAdd_JButton.addActionListener(e -> addNewAreaSettings());

        //this.add();

        //here will effectvly add all the items that will rappresent the files in json.
        //this just an example
        items.setSize(new Dimension(50,50));
        items.setText("Here the new items will appear");
        secondHalfSidPanel.add(items);
        addItemsToSecondSide("giancarlo");
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox_JComboBox){
        // TODO Auto-generated method stub
        System.out.println(comboBox_JComboBox.getSelectedItem());

        }
    }
    void addNewAreaSettings(){ 
        if(addWorkArea == null){
            addWorkArea = new WorkArea_AddWorkArea();
        }
        addWorkArea.setVisible(true);
        addWorkArea.workArea_MainPanel.setVisible(true);
        addWorkArea.makeNewBoard_Jpanel.setVisible(false);
        addWorkArea.newBoard_JButton.setVisible(true);
    }
    void addItemsToSecondSide(String filename){
        File folder = new File("files");   
        HashSet<String> files = ReadFile.readAllFiles(folder);
        for (final String file : files){
            JLabel files_JLabel = new JLabel();
            files_JLabel.setPreferredSize(new Dimension(200,20));
            files_JLabel.setText(file);
            files_JLabel.setHorizontalTextPosition(JLabel.CENTER);
            secondHalfSidPanel.add(files_JLabel);

        }
    }
}
