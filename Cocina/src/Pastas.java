import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pastas extends JFrame{

    public Pastas(){
        super("Pastas");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("pasta.jpg")));
        prin.add(i);
       i.setBounds(140,20,200,111);
        
         JButton enlace=new JButton("Regresar al menú");
         JButton pes=new JButton("Pesto");
         JButton bolo =new JButton("Bolognesa");
         JButton da= new JButton("Da Vinci");
         JButton ma =new JButton("Matriciana");
         JButton bos=new JButton("Boscaiola");
         
        
           prin.add(enlace);
           prin.add(pes);
           prin.add(bolo);
           prin.add(da);
           prin.add(ma);
           prin.add(bos);
           
           
           
                 enlace.setBounds(300,280,150,30); 
         pes.setBounds(50,150,150,30);//150 derecha 
                   bolo.setBounds(50,200,150,30); //200 derecha
                     da.setBounds(250,200,150,30); //izquierda
                           ma.setBounds(140,240,165,30); //boton enmedio
                              bos.setBounds(250,150,150,30); //izquierda
  
        
       prin.setBackground(Color.cyan);
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
    pes.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Pesto o=new Pesto();
            o.setVisible(true);
            dispose();
        }
    });
    bolo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Bolognesa o=new Bolognesa();
            o.setVisible(true);
            dispose();
        }
    });
      da.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          Vinci o=new Vinci();
            o.setVisible(true);
            dispose();
        }
    });
       ma.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Matriciana o=new Matriciana();
            o.setVisible(true);
            dispose();
        }
    });
        bos.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Boscaiola o=new Boscaiola();
            o.setVisible(true);
            dispose();
        }
    });
           
    
    }
  
    public static void main(String args[]){
            new Pastas();
             
            
}
    
}
