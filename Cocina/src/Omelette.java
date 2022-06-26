import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Omelette extends JFrame{
   
    public Omelette(){
        super("Omelette de jamón con queso");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("omelet.jpg")));
        prin.add(i);
       i.setBounds(0,0,300,199);
         //imagen 2
          JLabel e=new JLabel();
        e.setIcon(new ImageIcon(getClass().getResource("ingreo.png")));
        prin.add(e);
       e.setBounds(2,200,310,297);
         
         
        JButton enlace=new JButton("Regresar a Desayunos ");
         JButton pre=new JButton("Preparación ");
        
           prin.add(enlace);
           prin.add(pre);
           
           
                   enlace.setBounds(200,525,180,30);
               pre.setBounds(200,555,180,30);
    
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,650);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Desayunos o=new Desayunos();
            o.setVisible(true);
            dispose();
        }
    });
    pre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            prepao o=new prepao();
            o.setVisible(true);
            dispose();
        }
    });
           
    }

    public static void main(String args[]){
            new Omelette();
             
            
}
    
}
