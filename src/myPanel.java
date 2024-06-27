import javax.swing.JPanel;

public class myPanel extends JPanel {
    myPanel(){
      this.setLayout(null);//imp to set it to null otherwise panel doesnt get displayed
      this.setSize(2000,2000);
      this.setBounds(0, 0, 2000,2000);
    }
}
