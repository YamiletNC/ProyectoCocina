import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Arroz extends JFrame{
   
    public Arroz (){
        super("Arroz con leche");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("arroz.jpg")));
        prin.add(i);
        i.setBounds(50,0,300,199);
        //imagen 2
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("ingrearroz.png")));
        prin.add(a);
        a.setBounds(0,250,349,282);
         
         JButton enlace=new JButton("Regresar a Postres");
          JButton pre=new JButton("Preparación");
         prin.add(enlace);
         prin.add(pre);
         enlace.setBounds(200,540,150,30);
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
            ingrearroz o=new ingrearroz();
            o.setVisible(true);
            dispose();
        }
    });
           
    
    }
    
    
    public static void main(String args[]){
            new Arroz();
             
            
}
    
}
