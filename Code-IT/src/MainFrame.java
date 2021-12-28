import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import HomePage.HomePage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

class MainFrame extends JFrame{
    StartupVideo intro_Jlabel = new StartupVideo(); // startup video component reference
    SideBar leftSideBar = new SideBar();
    HomePage homePage = new HomePage();
    JPanel sideBar_JPanel;

    Boolean useStartupVideo = false;

    /**
     * MainFrame Constructor. it it will be the main winwow where all the components
     * will be attached to it.
     */

    MainFrame() {
        this.setVisible(true); // make the frame visible when inizialized
        this.setTitle("Code-it"); // set the window name
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH); // maximize the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this is necessary when closing the window to avoid to
                                                             // kill it with task manager
        this.setMinimumSize(new Dimension(1280, 720));
        this.add(intro_Jlabel); // add the intro compotent


        if (useStartupVideo) {
            startupVideo();
        } else {
            main();
        }
        // call the startup method
    }

    /*
     * startup method:
     * it will instantiate a ActionListener to be used as parameter for a timer of
     * 5000ms
     * the timer will run the action of the actionlistener after 5000ms.
     * what this essentialy do. is adding an initial video when open the program
     * then remove the intro component after 50000 second.
     */
    void startupVideo() {

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // ...Perform a task...
                stopStartupVideo();
            }
        };
        Timer timer = new Timer(5000, taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }

    // this method is called when the startupvideo is finish and will call a main
    // method
    void stopStartupVideo() {
        this.remove(intro_Jlabel); // remove intro componet
        main();

    }

    void main() {
        this.repaint(); // refresh the window
        this.setLayout(new BorderLayout());
        this.add(leftSideBar, BorderLayout.WEST);
        this.add(homePage, BorderLayout.CENTER);
        this.add(homePage, BorderLayout.CENTER);
        sideBarButtonsListeners();
        leftSideBar.makeVisible();
    }


    
    void sideBarButtonsListeners(){
        this.leftSideBar.button.addActionListener(e -> makeHomePageVisible());
        this.leftSideBar.button2.addActionListener(e -> makeHomePageInvisible());
        this.leftSideBar.button3.addActionListener(e -> System.out.println("This is button3"));
        this.leftSideBar.button4.addActionListener(e -> System.out.println("This is button4"));
        this.leftSideBar.button5.addActionListener(e -> System.out.println("This is button5"));
    }



    void makeHomePageInvisible(){
        this.homePage.setVisible(false);
    }
    void makeHomePageVisible(){
        this.homePage.setVisible(true);
    }
}
