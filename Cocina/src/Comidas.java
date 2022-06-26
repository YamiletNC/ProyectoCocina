import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Comidas extends JFrame{

    public Comidas(){
        super("Comidas");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("comida.jpg")));
        prin.add(i);
       i.setBounds(140,20,200,111);
        
  
         JButton enlace=new JButton("Regresar al menú");
         JButton mole=new JButton("Mole de panza");
         JButton pollo=new JButton("Caldo de pollo");
         JButton pechuga=new JButton("Pechugas rellenas");
         JButton camaron =new JButton("Camarones a la diabla");
         JButton caldo=new JButton("Caldo tlalpeño");
         
  
           prin.add(enlace);
           prin.add(mole);
           prin.add(pollo);
           prin.add(pechuga);
           prin.add(camaron);
           prin.add(caldo);
           
        
           enlace.setBounds(300,280,150,30); 
         mole.setBounds(50,150,150,30);//150 derecha 
                   pollo.setBounds(50,200,150,30); //200 derecha
                      pechuga.setBounds(250,200,150,30); //izquierda
                           camaron.setBounds(140,240,165,30); //boton enmedio
                              caldo.setBounds(250,150,150,30); //izquierda
  
        
        
        
       prin.setBackground(Color.pink);
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
    mole.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            mole o=new mole();
            o.setVisible(true);
            dispose();
        }
    });
    pollo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Pollo o=new Pollo();
            o.setVisible(true);
            dispose();
        }
    });
      pechuga.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          Pechugas o=new Pechugas();
            o.setVisible(true);
            dispose();
        }
    });
       camaron.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Camarones o=new Camarones();
            o.setVisible(true);
            dispose();
        }
    });
        caldo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Tlalpeño o=new Tlalpeño();
            o.setVisible(true);
            dispose();
        }
    });
           
    
    }
    
    public static void main(String args[]){
            new Comidas();
             
            
}
    
}
