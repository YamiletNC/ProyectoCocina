import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Galletas extends JFrame{
    
    public Galletas (){
        super("Galletas de mantequilla");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("ga.jpg")));
        prin.add(i);
        i.setBounds(50,0,300,168);
        //imagen 2 
         JLabel u=new JLabel();
        u.setIcon(new ImageIcon(getClass().getResource("ingrega.png")));
        prin.add(u);
        u.setBounds(40,200,349,329);
         
         JButton enlace=new JButton("Regresar a Postres");
          JButton pre=new JButton("Preparación");
         prin.add(enlace);
            prin.add(pre);
         enlace.setBounds(200,550,150,30);
         pre.setBounds(200,580,150,30);

        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,650);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
              enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Postres o=new Postres();
            o.setVisible(true);
            dispose();
        }
    });
       pre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            prepaga o=new prepaga();
            o.setVisible(true);
            dispose();
        }
    });    
  
    }
    
    
    public static void main(String args[]){
            new Galletas();
             
            
}
    
}
