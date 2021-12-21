import javax.swing.JLabel;
import javax.swing.ImageIcon;

class StartupVideo extends JLabel{
    ImageIcon video = new ImageIcon("res/test.gif");
    StartupVideo(){
        this.setIcon(video);
    }
}