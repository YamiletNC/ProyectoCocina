import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Atún extends JFrame{

    public Atún(){
        super("Ensalada de Atún");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("atun.jpg")));
        prin.add(i);
       i.setBounds(0,0,300,178);
        //imagen
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("ingreatun.png")));
        prin.add(a);
       a.setBounds(0,200,349,421);
        
         
   JButton enlace=new JButton("Regresar a Ensaladas");
      JButton pre=new JButton("Preparación");   
        
           prin.add(enlace);
           prin.add(pre);
                 enlace.setBounds(200,640,180,30);
               pre.setBounds(200,670,180,30);
        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,750);
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
            prepaatun o=new prepaatun();
            o.setVisible(true);
            dispose();
        }
    });
         
    }
    
    //metodo main de mi clas principal
    public static void main(String args[]){
            new Atún();
             
            
}
    
}