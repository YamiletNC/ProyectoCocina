import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Caprese extends JFrame{
 
    public Caprese(){
        super("Ensalada caprese");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("capre.jpg")));
        prin.add(i);
       i.setBounds(0,0,300,200);
       //imagen 2
        JLabel b=new JLabel();
        b.setIcon(new ImageIcon(getClass().getResource("ingreca.png")));
        prin.add(b);
       b.setBounds(0,210,355,273);
        
        
   JButton enlace=new JButton("Regresar a Ensaladas");
        JButton pre=new JButton("Preparación");  
        
           prin.add(enlace);
             prin.add(pre);
                enlace.setBounds(200,480,180,30);
               pre.setBounds(200,510,180,30);

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
            prepaca o=new prepaca();
            o.setVisible(true);
            dispose();
        }
    });
   
    }
    
    //metodo main de mi clas principal
    public static void main(String args[]){
            new Caprese();
             
}
    
}