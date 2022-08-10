
package com.mycompany.login;

import javax.swing.JFrame;


public class Login extends {

    public class login extends JFrame {
        
    }
    
}

JPanel p1 = new JPanel();
    JTextField t1 = new JTextField();
    JPasswordField t2 = new JPasswordField();
Object usuarios [50][10];


   //metodos
    private void inicio() {



       setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 175, 400, 400);
        setVisible(true);
        p1.setLayout(null);
        add(p1);



       JLabel l1 = new JLabel("Nombre:");
        l1.setBounds(50, 75, 80, 40);
        p1.add(l1);



       t1.setBounds(150, 79, 100, 30);
        p1.add(t1);



       JLabel l2 = new JLabel("Contraseña:");
        l2.setBounds(50, 175, 80, 40);
        p1.add(l2);



       t2.setBounds(150, 179, 100, 30);
        p1.add(t2);



       JButton b1 = new JButton("Ingresar");
        b1.setBounds(140, 250, 100, 50);
        p1.add(b1);



       ActionListener verificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



               


user();
           }
        };



       b1.addActionListener(verificar);



   }

private void user()

load();

   public void ejecutar() {
        inicio();



   }



   public static void main(String[] args) {
        login l = new login();
        l.ejecutar();
    }
