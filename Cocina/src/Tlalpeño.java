import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tlalpeño extends JFrame{

    public Tlalpeño (){
        super("Caldo Tlalpeño");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("cald.jpg")));
        prin.add(i);
       i.setBounds(40,0,300,225);
        //imagen
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("inteta.png")));
        prin.add(a);
       a.setBounds(0,250,353,372);
        
   JButton enlace=new JButton("Regresar a Comidas");
      JButton pre=new JButton("Preparación");   
        
           prin.add(enlace);
           prin.add(pre);
                 enlace.setBounds(200,640,180,30);
               pre.setBounds(200,670,180,30);

       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,750);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Comidas o=new Comidas();
            o.setVisible(true);
            dispose();
        }
    });
   
     pre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            pretlal o=new pretlal();
            o.setVisible(true);
            dispose();
        }
    });
          
    }
    public static void main(String args[]){
            new Tlalpeño();
             
            
}
    
}