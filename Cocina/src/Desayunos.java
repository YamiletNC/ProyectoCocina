import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Desayunos extends JFrame{
   
    public Desayunos(){
        super("Desayunos");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("cuer.jpg")));
        prin.add(i);
       i.setBounds(155,20,125,80);
        
  
         JButton enlace=new JButton("Regresar al menú");
         JButton tostada=new JButton("Tostada francesa");
         JButton omelette=new JButton("Omelette");
         JButton waffles=new JButton("Waffles");
         JButton molletes=new JButton("Molletes");
         JButton huevo=new JButton("Huevos a la mexicana");
         
           prin.add(enlace);
           prin.add(tostada);
           prin.add(omelette);
           prin.add(waffles);
           prin.add(molletes);
           prin.add(huevo);
           
           
           
                          enlace.setBounds(300,280,150,30);
           tostada.setBounds(50,150,150,30);//150 derecha 
                   omelette.setBounds(50,200,150,30); //200 derecha
                      waffles.setBounds(250,200,150,30); //izquierda
                           molletes.setBounds(140,240,165,30); //boton enmedio
                              huevo.setBounds(250,150,150,30); //izquierda
  
        
       prin.setBackground(Color.MAGENTA);
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
    tostada.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Tostada o=new Tostada();
            o.setVisible(true);
            dispose();
        }
    });
     omelette.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Omelette o=new Omelette();
            o.setVisible(true);
            dispose();
        }
    });
      waffles.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          Wafles o=new Wafles();
            o.setVisible(true);
            dispose();
        }
    });
       molletes.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Molletes o=new Molletes();
            o.setVisible(true);
            dispose();
        }
    });
        huevo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Huevos o=new Huevos();
            o.setVisible(true);
            dispose();
        }
    });
           
    
    }

    public static void main(String args[]){
            new Desayunos();
             
            
}
    
}
