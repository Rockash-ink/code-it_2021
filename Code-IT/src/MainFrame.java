import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.*;

class MainFrame extends JFrame {
    StartupVideo intro = new StartupVideo(); //startup video component reference
    /**
     * MainFrame Constructor. it it will be the main winwow where all the components will be attached to it.
     */
    MainFrame(){
        this.setVisible(true);  //make the frame visible when inizialized
        this.setTitle("Code-it"); //set the window name
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH); //maximize the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this is necessary when closing the window to avoid to kill it with task manager
        //
        this.add(intro); //add the intro compotent 
        startupVideo(); // call the startup method
      
        
    }
    /*
    startup method:
    it will instantiate a ActionListener to be used as parameter for a timer of 5000ms
    the timer will run the action of the actionlistener after 5000ms.
    what this essentialy do. is adding an initial video when open the program then remove the intro component after 50000 second.
    */
    void startupVideo(){
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //...Perform a task...
                stopVideo();
                System.out.println("hehe");
                
            }
        };
        Timer timer = new Timer(5000,taskPerformer);
        timer.setRepeats(false);
        timer.start();
    }
    //there's the necessity of an extra method to be called to the action listener
    void stopVideo(){
        this.remove(intro); //remove intro componet
        this.repaint(); //refresh the window
    }

}
