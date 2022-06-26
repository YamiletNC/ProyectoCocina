import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pechugas extends JFrame{

    public Pechugas (){
        super("Pechugas rellenas");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("pe.jpg")));
        prin.add(i);
       i.setBounds(40,0,300,168);
        //imagen
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("ingrepe.png")));
        prin.add(a);
       a.setBounds(0,250,334,318);
        
         
   JButton enlace=new JButton("Regresar a Comidas");
      JButton pre=new JButton("Preparación");   
        
           prin.add(enlace);
           prin.add(pre);
                 enlace.setBounds(200,585,180,30);
               pre.setBounds(200,620,180,30);

        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,700);//tamañño
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
            prepachu o=new prepachu();
            o.setVisible(true);
            dispose();
        }
    });
    }
    public static void main(String args[]){
            new Pechugas();
             
            
}
    
}