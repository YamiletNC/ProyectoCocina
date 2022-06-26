import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class prepal extends JFrame{
    
    public prepal(){
        super("Modo de preparación");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("preal.png")));
        prin.add(i);
        i.setBounds(10,20,383,399);
       
         JButton enlace=new JButton("Regresar a ingredientes");
         
         prin.add(enlace);
         
         enlace.setBounds(180,450,190,30);

       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(415,550);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
              enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Alcachofa o=new Alcachofa();
            o.setVisible(true);
            dispose();
        }
    });
    }
    public static void main(String args[]){
            new prepal();
            
}
    
}
