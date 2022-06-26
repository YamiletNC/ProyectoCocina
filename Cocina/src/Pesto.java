import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pesto extends JFrame{
    public Pesto (){
        super("Pasta al pesto");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("pes.jpg")));
        prin.add(i);
       i.setBounds(40,0,294,172);
        //imagen
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("ingrepes.png")));
        prin.add(a);
       a.setBounds(0,250,310,309);
        
         
   JButton enlace=new JButton("Regresar a Pastas");
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
            Pastas o=new Pastas();
            o.setVisible(true);
            dispose();
        }
    });
   
     pre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            prepesto o=new prepesto();
            o.setVisible(true);
            dispose();
        }
    });
     
    }
 
    public static void main(String args[]){
            new Pesto();
             
            
}
    
}