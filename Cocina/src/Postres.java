import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Postres extends JFrame{
  
    public Postres (){
        super("Postres");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("fresa.jpg")));
        prin.add(i);
       i.setBounds(180,0,300,150);
        
         JButton enlace=new JButton("Regresar al menú");
            JButton arroz=new JButton("Arroz con leche");
             JButton tarta=new JButton("Tartaleta de fresa");
              JButton trufa=new JButton("Trufas");
                JButton galleta=new JButton("Galletas de mantequilla");
                 JButton pay=new JButton("Pay de limón");
        
           prin.add(enlace);
           prin.add(arroz);
           prin.add(tarta);
           prin.add(trufa);
           prin.add(galleta);
           prin.add(pay);
           
           
                enlace.setBounds(340,280,140,30);//boton ultimo
                 arroz.setBounds(50,150,150,30);//150 derecha 
                   tarta.setBounds(50,200,150,30); //200 derecha
                      trufa.setBounds(250,200,150,30); //izquierda
                           galleta.setBounds(140,240,165,30); //boton enmedio
                               pay.setBounds(250,150,150,30); //izquierda
                               
        
        
       prin.setBackground(Color.red);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(500,350);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
             enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Menu o=new Menu();
            o.setVisible(true);
            dispose();
        }
    });
   
     arroz.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Arroz o=new Arroz();
            o.setVisible(true);
            dispose();
        }
    });
          tarta.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Tarta o=new Tarta();
            o.setVisible(true);
            dispose();
        }
    });
          trufa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Trufas o=new Trufas();
            o.setVisible(true);
            dispose();
        }
    });
          galleta.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Galletas o=new Galletas();
            o.setVisible(true);
            dispose();
        }
    });
               pay.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Pay o=new Pay();
            o.setVisible(true);
            dispose();
        }
    });
    }
    public static void main(String args[]){
            new Postres();
             
            
}
    
}
