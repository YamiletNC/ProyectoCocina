import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class prepamo extends JFrame{
    
    public prepamo(){
        super("Modo de preparación");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("premo.png")));
        prin.add(i);
        i.setBounds(10,20,303,321);
       
         JButton enlace=new JButton("Regresar a ingredientes");
         
         prin.add(enlace);
         
         enlace.setBounds(180,420,190,30);
        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
              enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Molletes o=new Molletes();
            o.setVisible(true);
            dispose();
        }
    });
    }
    public static void main(String args[]){
            new prepamo();
            
}
    
}
