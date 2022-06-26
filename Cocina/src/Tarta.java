import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tarta extends JFrame{
   
    public Tarta (){
        super("Tartaleta de fresa");
        JDesktopPane prin=new JDesktopPane();
        //imagen
         JLabel o=new JLabel();
        o.setIcon(new ImageIcon(getClass().getResource("tar.png")));
        prin.add(o);
          o.setBounds(80,0,250,204);
        
        //imagen 2
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("ingretar.png")));
        prin.add(i);
        i.setBounds(40,250,355,266);
        
         
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
            prepatar o=new prepatar();
            o.setVisible(true);
            dispose();
        }
    });     
    }
    public static void main(String args[]){
            new Tarta();
             
            
}
    
}
