import javax.swing.filechooser.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.*;

public class makeFrame {
  JFrame jframe = new JFrame();
 JPanel leftP = new JPanel();
 JPanel centerP = new JPanel();
 JPanel rightP = new JPanel();
 JPanel button = new JPanel();
 JPanel button2 = new JPanel();

 private JFileChooser filechoose = new JFileChooser();

 private JButton load = new JButton("load");
 private JButton edit = new JButton("edit");
 private JButton save = new JButton("save");
 private JButton load2 = new JButton("load");
 private JButton edit2 = new JButton("edit");
 private JButton save2 = new JButton("save");
 private JButton cmpare = new JButton("compare");
 private JButton mergeRi = new JButton("merge >>");
 private JButton mergeLe = new JButton("merge <<");

 JTextArea jta = new JTextArea();
 JTextArea jta2 = new JTextArea();
 JScrollPane scroll = new JScrollPane(jta);
 JScrollPanel scroll2 = new JScrollPane(jta2);
  
  public makeFrame() {
  button.setLayout(new GridLayout(1, 3));
  button.add(load);
  button.add(edit);
  button.add(save);
  load.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    filechoose.addChoosableFileFilter(new FileNameExtensionFilter("Text file", "txt"));
    filechoose.setAcceptAllFileFilterUsed(false);
    int returnVal = filechoose.showOpenDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
     try {
      File f = filechoose.getSelectedFile();
      fileopen(f, jta);
     } catch (Exception event) {
      return;
     }
    }
   }
  });
    
    edit.addActionListener(new ActionListener() {