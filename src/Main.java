import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class gui   {
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int sizeWidth = 800;
    public static int sizeHeight = 600;
    public static int locationX = (screenSize.width - sizeWidth) / 2;
    public static int locationY = (screenSize.height - sizeHeight) / 2;
    public static void main(String args[]){
       new gui();
    }
    public gui(){
        var frame = new JFrame("TimeManagmentAssistant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setSize(300,200);
     //  frame.add(createTextField());
        //frame.add(createButton());
        frame.getContentPane().add(BorderLayout.NORTH,createPanel());
        frame.getContentPane().add(BorderLayout.CENTER,createPanel2());
        var menuBar = new JMenuBar();
        menuBar.add(createLinksMenu());
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }
    private JButton createButton(){
        var button = new JButton("OK");
        button.setPreferredSize(new Dimension(60,60));
        return button;
    }
    private JTextField createTextField(){
        var textField = new JTextField("",20);
        textField.setBounds(30,30,30,60);
        return  textField;
    }
    private JMenu createLinksMenu(){
        var menu = new JMenu("links");
        var telegram = new JMenuItem("Telegram");
        var gitHub = new JMenuItem("GitHub");
        telegram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Desktop.getDesktop().browse(new URI("https://t.me/Kill1237"));
                }
                catch (IOException | URISyntaxException exception){
                    System.out.println("ERROR");
                }
            }
        });
        gitHub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Desktop.getDesktop().browse(new URI("https://github.com/Doath1337"));
                }
                catch (IOException | URISyntaxException exception){
                    System.out.println("ERROR");
                }
            }
        });


        menu.add(telegram);
        menu.addSeparator();
        menu.add(gitHub);
        return  menu;
    }
    private JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.add(createTextField());

        return panel;
    }
    private  JPanel createPanel2(){
        JPanel panel = new JPanel();
        panel.add(createButton());
        return panel;
    }


}
