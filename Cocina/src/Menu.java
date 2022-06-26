import java.awt.*;//DESARROLLO DE INTERFACES DE USUARIO GRÀFICAS
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; //CAJAS DE TEXTO, BOTONES, LISTAS DESPLEGABLES Y TABLAS
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Menu extends JFrame{
    public Menu (){
        super("                                               R E C E T A R I O");
        JDesktopPane prin=new JDesktopPane();
        //imagen
        JLabel i=new JLabel();
        i.setIcon(new ImageIcon(getClass().getResource("pizza.jpg"))); //insertar mi imagen
       prin.add(i);
        i.setBounds(0,0,415,415);
       
   JLabel Lcielo=new JLabel ("»  DOS CIELOS  «");
       //   JLabel Ldato=new JLabel("Elije un Estado para conocer su platillo típico    →");
         //JCOMBOBOX
         // JComboBox estados=new JComboBox();
       // estados.addItem("-Seleccionar-");
		//estados.addItem("Aguascalientes");
            
                
         JButton postres=new JButton("P o s t r e s");
        // postres.setIcon(new javax.swing.ImageIcon(getClass().getResource("postr.png")));
        
         JButton comidas=new JButton("C o m i d a s");
        // comidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("postr.png")));
         
         JButton ensaladas=new JButton("E n s a l a d a s");
         
          JButton desayuno=new JButton("D e s a y u n o s");
        JButton pastas=new JButton("P a s t a s");
        
        JButton salir=new JButton("Salir del recetario");
        JButton contacto=new JButton("»  DOS CIELOS  «");
        
       prin.add(postres);
      prin.add(comidas);
       prin.add(ensaladas);
       prin.add(desayuno);
       prin.add(pastas);
       prin.add(salir);
       prin.add(contacto);
       
         //prin.add(Ldato);
        //prin.add(estados);
        prin.add(Lcielo);
        Lcielo.setBounds(610,10,100,20);
         //Ldato.setBounds(425,45,400,25);
        // estados.setBounds(745,45,140,25);
         
       
        postres.setBounds(576, 90,150,30);//450 lado derecho
          ensaladas.setBounds(576,130,150,30);
          desayuno.setBounds(576,170,150,30);
       comidas.setBounds(576,210,150,30);//660 lado izquierdo
         pastas.setBounds(576,250,150,30);
          
         salir.setBounds(600,360,250,30);
            contacto.setBounds(650,320,150,30);
                      

   prin.setBackground(Color.getHSBColor(600,800,500));
       add(prin,BorderLayout.CENTER);
            setVisible(true);
            setResizable(false);
            setSize(900,445);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
              
           postres.addActionListener(new ActionListener(){//Se usa para detectar y manejar eventos de acciòn
        public void actionPerformed(ActionEvent e){
            Postres o=new Postres();
           o.setVisible(true);
            dispose();
        }
    });
       /*  comidas.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){//DAR ACCION A MI BOTON
            String cadena;
          cadena = estados.getSelectedItem().toString();
                  if(cadena.equals("Puebla")){
                  mole o=new mole();
                 o.setVisible(true);
                  dispose();
                  }
        }
    });
       
               /* desayuno.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String cadena;
          cadena = estados.getSelectedItem().toString();
                  if(cadena.equals("México")){
                  Molletes o=new Molletes();
                 o.setVisible(true);
                  dispose();
                  }
                 
                      
        }
    });
     */ 
comidas.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           Comidas o=new Comidas();
          o.setVisible(true);
           dispose();
       }
         });
 ensaladas.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Ensaladas o=new Ensaladas();
           o.setVisible(true);
            dispose();
        }
    });
 desayuno.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Desayunos o=new Desayunos();
           o.setVisible(true);
            dispose();
        }
    });

 pastas.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Pastas o=new Pastas();
           o.setVisible(true);
            dispose();
        }
    });

salir.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          System.exit(0);
            dispose();
        }
    });
contacto.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Contáctanos o=new Contáctanos();
           o.setVisible(true); 
            dispose();
        }
    });
    
    } public static void main(String args[]){
             new Menu();
    }
}