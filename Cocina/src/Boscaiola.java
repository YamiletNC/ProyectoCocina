import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Boscaiola extends JFrame{
    
    public Boscaiola(){
        super("Pasta a la Boscaiola");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("qa.jpg")));
        prin.add(i);
       i.setBounds(40,0,275,183);
        //imagen
        JLabel a=new JLabel();
        a.setIcon(new ImageIcon(getClass().getResource("ingrediente.png")));
        prin.add(a);
       a.setBounds(0,200,370,425);
        
         
   JButton enlace=new JButton("Regresar a Pastas");
      JButton pre=new JButton("Preparación");   
        
           prin.add(enlace);
           prin.add(pre);
                 enlace.setBounds(200,640,180,30);
               pre.setBounds(200,670,180,30);

       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,750);//tamañño
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
            prepabos o=new prepabos();
            o.setVisible(true);
            dispose();
        }
    });

    }
 
    public static void main(String args[]){
            new Boscaiola();
             
            
}
    
}