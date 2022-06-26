import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Alcachofa extends JFrame{
    
    public Alcachofa(){
        super("Ensalada de alcachofas");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("alca.jpg")));
        prin.add(i);
       i.setBounds(50,0,300,165);
          //imagen 2
          JLabel e=new JLabel();
        e.setIcon(new ImageIcon(getClass().getResource("ingreal.png")));
        prin.add(e);
       e.setBounds(2,200,379,302);
         
         
   JButton enlace=new JButton("Regresar a Ensaladas");
        JButton pre=new JButton("Preparación");
        
           prin.add(enlace);
           prin.add(pre);
            enlace.setBounds(200,505,180,30);
           pre.setBounds(200,535,180,30);
    
        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,650);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Ensaladas o=new Ensaladas();
            o.setVisible(true);
            dispose();
        }
    });
     pre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            prepal o=new prepal();
            o.setVisible(true);
            dispose();
        }
    });
    
           
    
    }

    public static void main(String args[]){
            new Alcachofa();
             
            
}
    
}