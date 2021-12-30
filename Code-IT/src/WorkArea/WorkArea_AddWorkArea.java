package WorkArea;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;

import javax.swing.JPanel;
import javax.swing.JTextField;

final class WorkArea_AddWorkArea extends JFrame{
    final JPanel workArea_MainPanel = new JPanel();
    final JPanel workArea_MainPanel_Centre = new JPanel(new CardLayout());
    final JButton newCard_JButton = new JButton();
    final JPanel makeNewCard_Jpanel = new JPanel();

    WorkArea_AddWorkArea(){
        setBounds(100,100,467,315);
        setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());


        

        this.add(workArea_MainPanel_Centre);
        //to centre
        newCard_JButton.setText("New Card");
        newCard_JButton.addActionListener(e -> setVisibleNewCardPanel());
        workArea_MainPanel.add(newCard_JButton);

        workArea_MainPanel_Centre.add(workArea_MainPanel);
        workArea_MainPanel_Centre.add(makeNewCard_Jpanel);
        

        workArea_MainPanel.setBackground(Color.BLACK);
        makeNewCard_Jpanel.setBackground(Color.blue);

        makeNewCard_Jpanel.setVisible(false);

        makeNewCardPanel();

       

        
        
        WindowListener listener = new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
               Frame frame = (Frame) evt.getSource();
               System.out.println("Closing = "+frame.getTitle());
               newCard_JButton.setVisible(true);
               workArea_MainPanel.setVisible(true);
            }
        };
        addWindowListener(listener);
        
    }
    
    void makeNewCardPanel(){
        //for  makeNewCard_Jpanel
        final JLabel textMakeCard = new JLabel();
        final JLabel textNameCard = new JLabel();
        final JTextField nameCard = new JTextField();

        final JButton makeCardButton_jButton = new JButton();
        final JButton cancelButton = new JButton();

        textMakeCard.setText("Create Card");
        textNameCard.setText("Card Name");
        nameCard.setText("new Card");
        makeCardButton_jButton.setText("Create Card");
        cancelButton.setText("Cancel");
        
        makeNewCard_Jpanel.add(textMakeCard);
        makeNewCard_Jpanel.add(textNameCard);
        makeNewCard_Jpanel.add(nameCard);
        makeNewCard_Jpanel.add(makeCardButton_jButton);
        makeNewCard_Jpanel.add(cancelButton);

    }
    void setVisibleNewCardPanel(){
        newCard_JButton.setVisible(false);
        workArea_MainPanel.setVisible(false);
        makeNewCard_Jpanel.setVisible(true);
    }
}