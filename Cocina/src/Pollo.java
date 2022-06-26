import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pollo extends JFrame{

    public Pollo (){
        super("Caldo de Pollo");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("pol.jpg")));
        prin.add(i);
       i.setBounds(40,0,300,170);
        //imagen
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("ingrepollo.png")));
        prin.add(a);
       a.setBounds(0,200,330,342);
        
         
   JButton enlace=new JButton("Regresar a Comidas");
      JButton pre=new JButton("Preparación");   
        
           prin.add(enlace);
           prin.add(pre);
                 enlace.setBounds(200,580,180,30);
               pre.setBounds(200,615,180,30);

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
            prepapollo o=new prepapollo();
            o.setVisible(true);
            dispose();
        }
    });
    }
    public static void main(String args[]){
            new Pollo();
             
            
}
    
}