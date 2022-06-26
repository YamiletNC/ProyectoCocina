import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Contáctanos extends JFrame{
  
    public Contáctanos(){
        super("Poyecto");
        JDesktopPane prin=new JDesktopPane();
        //primera imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("vale.png")));
        prin.add(i);
       i.setBounds(0,10,211,156);
      
       
         //segunda imagen
        JLabel o=new JLabel();
        o.setIcon(new ImageIcon(getClass().getResource("SISTEMAS.png")));
        prin.add(o);
       o.setBounds(240,40,150,125);
      
   JButton enlace=new JButton("Regresar al menú");
        
        
           prin.add(enlace);
           
                enlace.setBounds(70,210,150,30); 
  
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(400,300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Menu o=new Menu();
            o.setVisible(true);
            dispose();
        }
    });
    }
    
    //metodo main de mi clas principal
    public static void main(String args[]){
            new Contáctanos();
             
            
}
    
}
