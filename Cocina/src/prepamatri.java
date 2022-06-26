import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class prepamatri extends JFrame{
    
    public prepamatri (){
        super("Modo de preparación");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("mi.png")));
        prin.add(i);
        i.setBounds(10,20,502,482);
       
         JButton enlace=new JButton("Regresar a ingredientes");
         
         prin.add(enlace);
         
         enlace.setBounds(180,525,190,30);
  
        
        
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(550,650);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
              enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Matriciana o=new Matriciana();
            o.setVisible(true);
            dispose();
        }
    });
            
           
    
    }
    
    
    public static void main(String args[]){
            new prepamatri();
            
}
    
}