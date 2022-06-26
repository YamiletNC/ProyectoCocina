import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Rusa extends JFrame{
   
    public Rusa(){
        super("Ensalada rusa");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("rusa.jpg")));
        prin.add(i);
       i.setBounds(40,0,300,168);
         //imagen 2
          JLabel e=new JLabel();
        e.setIcon(new ImageIcon(getClass().getResource("ingreru.png")));
        prin.add(e);
       e.setBounds(10,200,376,288);
         
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
            setSize(415,650);//tamañño
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
            preparusa o=new preparusa();
            o.setVisible(true);
            dispose();
        }
    });
    
    }

    public static void main(String args[]){
            new Rusa();
             
            
}
    
}