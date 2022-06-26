import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Contraseña extends JFrame{
    
    public Contraseña(){
        super("ACCEDER AL RECETARIO");
        JDesktopPane prin=new JDesktopPane();
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("amor.jpg")));
       prin.add(i);
        i.setBounds(45,0,200,200);
        
         JButton pin=new JButton("Ingresa la contraseña");
          prin.add(pin);
        pin.setBounds(65,160,170,30);
        
       
       prin.setBackground(Color.white); //COLOR DE MI INTERFAZ
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(300,250); //TAMAÑO
            setDefaultCloseOperation(EXIT_ON_CLOSE);
              setLocationRelativeTo(null);
            
            //accion de mi boton
            pin.addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e){
                    
                    
                    int cont=3;
                    int contraseña=100;
                    int pass;
                       do{
                             String s=JOptionPane.showInputDialog(null, "Ingresa la contraseña:");
                             pass=Integer.parseInt(s);
                             if(pass==contraseña){
                                 JOptionPane.showMessageDialog(null, "Contraseña correcta\n ¡BIENVENIDO AL RECETARIO DOS CIELOS!  ");
                               
                            Menu obj=new Menu();
                           obj.setVisible(true);
                             dispose();
                    
                    
                    }else{
                            
                            --cont;
                            JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA,"+" LE QUEDAN "+ cont +" INTENTOS");
                             }              
                            if(cont==0){
                                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
                                System.exit(0);
                                
                            }
                            
                            
                             }while(pass!=contraseña);
                            
                         
           }           
                       
                       });
    
    }
   public static void main(String args[]){
             new Contraseña();
             
            
}
    
            }
