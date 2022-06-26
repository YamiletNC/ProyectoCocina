import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pay extends JFrame{
    
    public Pay (){
        super("Pay de limón");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("li.jpg")));
        prin.add(i);
        i.setBounds(50,0,300,258);
        //imagen 2
         JLabel p=new JLabel();
        p.setIcon(new ImageIcon(getClass().getResource("ingrepay.png")));
        prin.add(p);
        p.setBounds(20,260,330,270);
        
         
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
           // setLocationRelativeTo(null);
            setSize(415,650);//tamañño
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
              enlace.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Postres o=new Postres();
            o.setVisible(true);
            dispose();
        }
    });
          pre.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            prepapay o=new prepapay();
            o.setVisible(true);
            dispose();
        }
    });
          
    }
    
    
    public static void main(String args[]){
            new Pay();
             
            
}
    
}
