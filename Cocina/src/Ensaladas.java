import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ensaladas extends JFrame{

    public Ensaladas(){
        super("Ensaladas");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("ensa.jpg")));
        prin.add(i);
       i.setBounds(150,30,150,80);
     
         
        JButton enlace=new JButton("Regresar a Menú");
        JButton atun=new JButton("Ensalada de atún");
        JButton mexicana=new JButton("Ensalada mexicana");
        JButton alcachofa=new JButton("Ensalada de alcachofas");
        JButton rusa=new JButton("Ensalada rusa");
        JButton capre=new JButton("Ensalada caprese");
        
       
           prin.add(enlace);
           prin.add(atun);
           prin.add(mexicana);
           prin.add(alcachofa);
           prin.add(rusa);
           prin.add(capre);
           
      
                enlace.setBounds(300,280,150,30); 
                 atun.setBounds(50,150,150,30);//150 derecha 
                   mexicana.setBounds(50,200,150,30); //200 derecha
                      rusa.setBounds(250,200,150,30); //izquierda
                           alcachofa.setBounds(140,240,165,30); //boton enmedio
                              capre.setBounds(250,150,150,30); //izquierda
  
       
       prin.setBackground(Color.green);
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
            atun.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Atún o=new Atún();
            o.setVisible(true);
            dispose();
        }
    });
             mexicana.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Mexicana o=new Mexicana();
            o.setVisible(true);
            dispose();
        }
    });
              alcachofa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Alcachofa o=new Alcachofa();
            o.setVisible(true);
            dispose();
        }
    });
               rusa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Rusa o=new Rusa();
            o.setVisible(true);
            dispose();
        }
    });
                capre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Caprese o=new Caprese();
            o.setVisible(true);
            dispose();
        }
    });
   
    
    }

    public static void main(String args[]){
            new Ensaladas();
             
            
}
    
}
