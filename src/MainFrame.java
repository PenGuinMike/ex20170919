import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame{
    private JButton btexit = new JButton("Exit");
    private JButton btadd = new JButton("Add");
    private JButton btmin = new JButton("Min");
    private JLabel lb = new JLabel("0");
    private int n=0;
    public MainFrame (){
        init();
    }
    private void init(){
        this.setBounds(800,200,720,720);
        this.setLayout(null);
        btexit.setBounds(350,100,100,35);
        btadd.setBounds(350,150,100,35);
        btmin.setBounds(350,190,100,35);

        lb.setBounds(350,220,100,35);
        lb.setBackground(new Color(255,255,255));
        this.add(btexit);
        this.add(btadd);
        this.add(btmin);
        this.add(lb);

        btexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lb.setText(Integer.toString(n));
            }
        });
        btmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                lb.setText(Integer.toString(n));
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

}
