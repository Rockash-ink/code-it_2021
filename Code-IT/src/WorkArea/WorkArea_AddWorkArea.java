package WorkArea;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;

import filesReadWrite.CreateFile;

final class WorkArea_AddWorkArea extends JFrame{
    final JPanel workArea_MainPanel = new JPanel();
    final JPanel workArea_MainPanel_Centre = new JPanel(new CardLayout());
    final JButton newBoard_JButton = new JButton();
    final JPanel makeNewBoard_Jpanel = new JPanel();

    WorkArea_AddWorkArea(){
        setBounds(400,200,467,315);
        setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);


        

        this.add(workArea_MainPanel_Centre);
        //to centre
        newBoard_JButton.setText("New Board");
        newBoard_JButton.addActionListener(e -> setVisibleNewBoardPanel());
        workArea_MainPanel.add(newBoard_JButton);

        workArea_MainPanel_Centre.add(workArea_MainPanel);
        workArea_MainPanel_Centre.add(makeNewBoard_Jpanel);
        

        workArea_MainPanel.setBackground(Color.BLACK);
        makeNewBoard_Jpanel.setBackground(Color.blue);

        makeNewBoard_Jpanel.setVisible(false);

        makeNewBoardPanel();

       

        
        
        WindowListener listener = new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
               Frame frame = (Frame) evt.getSource();
               System.out.println("Closing = "+frame.getTitle());
               newBoard_JButton.setVisible(true);
               workArea_MainPanel.setVisible(true);
            }
        };
        addWindowListener(listener);
        
    }
    
    void makeNewBoardPanel(){
        //for  makeNewBoard_Jpanel
        final JLabel textMakeBoard = new JLabel();
        final JLabel textNameBoard = new JLabel();
        final JTextField nameBoard = new JTextField();

        final JButton makeBoardButton_jButton = new JButton();
        final JButton cancelButton = new JButton();

        textMakeBoard.setText("Create Board");
       
        nameBoard.setText("new Board");
        textNameBoard.setText("Board Name");
        makeBoardButton_jButton.setText("Create Board");
        cancelButton.setText("Cancel");

        cancelButton.addActionListener(e -> this.dispose());
        makeBoardButton_jButton.addActionListener(e -> createBoard(nameBoard.getText()));
        
        makeNewBoard_Jpanel.add(textMakeBoard);
        makeNewBoard_Jpanel.add(textNameBoard);
        makeNewBoard_Jpanel.add(nameBoard);
        makeNewBoard_Jpanel.add(makeBoardButton_jButton);
        makeNewBoard_Jpanel.add(cancelButton);

    }
    void setVisibleNewBoardPanel(){
        newBoard_JButton.setVisible(false);
        workArea_MainPanel.setVisible(false);
        makeNewBoard_Jpanel.setVisible(true);
    }
    void createBoard(String text){
        //this will create boards.
        CreateFile.createFile(text);
        CreateFile.writeFile(text,"Board");
        
        SideBarMenuFunctions.addItemsToSecondSide(text);
        SideBarMenuFunctions.repaintThis();
        this.dispose();
    }

}