import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Mexicana extends JFrame{
   
    public Mexicana(){
        super("Ensalada mexicana");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("mex.jpg")));
        prin.add(i);
       i.setBounds(0,0,300,199);
        //imagen 2
          JLabel e=new JLabel();
        e.setIcon(new ImageIcon(getClass().getResource("ingreme.png")));
        prin.add(e);
       e.setBounds(10,200,376,290);
         
   JButton enlace=new JButton("Regresar a Ensaladas");
         JButton pre=new JButton("Preparación");
        
           prin.add(enlace);
           prin.add(pre);
           
                 enlace.setBounds(200,490,180,30);
               pre.setBounds(200,520,180,30);
        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,590);//tamañño
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
            prepame o=new prepame();
            o.setVisible(true);
            dispose();
        }
    });
   
    }
 
    public static void main(String args[]){
            new Mexicana();
             
            
}
    
}