//package com.untitled25;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  ContactForm  extends JFrame {
JTextField name_field, email_field;
JRadioButton male, female;
JCheckBox check;

    public  ContactForm()  {
        super("форма");
        this.setBounds(920, 110,350,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container  container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2,2,12));

JLabel name = new JLabel ( "Введите имя");

name_field = new JTextField ("",  2);
        JLabel email = new JLabel ("Введите email");
    email_field = new JTextField ("@", 2);

container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Мужской");
       female = new JRadioButton("Женский");
       check = new JCheckBox("Cогласен",false);
        JButton send_button = new JButton("Отправить");
        male.setSelected(true);
        container.add(male);
        container.add(female);
        
ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container. add (check);
        container.add(send_button);

    send_button.addActionListener(new ButtonEven());


    }

    class ButtonEven implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
String name = name_field.getText();
            String email = email_field.getText();
String isMale="Мужской";
if (!male.isSelected())
isMale = "Женский";
boolean checkBox = check.isSelected();
JOptionPane.showMessageDialog(null,"Ваша почта"+ email+"" +
        "\nВаш пол:"+isMale+
        "\nВы согласны?"+checkBox,
        "Пример"+name,JOptionPane.PLAIN_MESSAGE);

        }
    }
}
