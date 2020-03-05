import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame
{
    private JLabel searchLabel;
    private JTextField textField1;
    private JButton addButton;
    private JPanel mainPanel;

    public MainGui(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFrame addFrame = new addGui("Add");

            }
        });
    }

}
