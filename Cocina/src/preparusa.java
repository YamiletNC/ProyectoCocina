import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class preparusa extends JFrame{
    
    public preparusa(){
        super("Modo de preparación");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("prerusa.png")));
        prin.add(i);
        i.setBounds(10,20,380,281);
       
         JButton enlace=new JButton("Regresar a ingredientes");
         
         prin.add(enlace);
         
         enlace.setBounds(180,320,190,30);
  
       prin.setBackground(Color.white);
       add(prin,BorderLayout.CENTER);
            setVisible(true);
    setResizable(false);
            setSize(415,400);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
              enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Rusa o=new Rusa();
            o.setVisible(true);
            dispose();
        }
    });
            
           
    
    }
    
    
    public static void main(String args[]){
            new preparusa();
            
}
    
}
