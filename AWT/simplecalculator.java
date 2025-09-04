import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,clr,eq;
    Calculator(){
        display=new TextField("0");
        display.setBounds(40,100,100,30);
        b1=new Button("1");
        b1.setBounds(50,200,50,50);
        b1.addActionListener(this);
        b2=new Button("2");
        b2.setBounds(100,200,50,50);
        b2.addActionListener(this);
        b3=new Button("3");
        b3.setBounds(150,200,50,50);
        b3.addActionListener(this);
        div=new Button("/");
        div.setBounds(200,200,50,50);
        div.addActionListener(this);
        b4=new Button("4");
        b4.setBounds(50,250,50,50);
        b4.addActionListener(this);
        b5=new Button("5");
        b5.setBounds(100,250,50,50);
        b5.addActionListener(this);
        b6=new Button("6");
        b6.setBounds(150,250,50,50);
        b6.addActionListener(this);
        mul=new Button("*");
        mul.setBounds(200,250,50,50);
        mul.addActionListener(this);
        b7=new Button("7");
        b7.setBounds(50,300,50,50);
        b7.addActionListener(this);
        b8=new Button("8");
        b8.setBounds(100,300,50,50);
        b8.addActionListener(this);
        b9=new Button("9");
        b9.setBounds(150,300,50,50);
        b9.addActionListener(this);
        clr=new Button("C");
        clr.setBounds(200,300,50,50);
        clr.addActionListener(this);
        add=new Button("+");
        add.setBounds(50,350,50,50);
        add.addActionListener(this);
        b0=new Button("0");
        b0.setBounds(100,350,50,50);
        b0.addActionListener(this);
        sub=new Button("-");
        sub.setBounds(150,350,50,50);
        sub.addActionListener(this);
        eq=new Button("=");
        eq.setBounds(200,350,50,50);
        eq.addActionListener(this);
        add(display);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(add);
        add(sub);
        add(div);
        add(mul);
        add(clr);
        add(eq);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b0){
            String expression=display.getText();
            expression+='0';
            display.setText(expression);
        }
        if(e.getSource()==b1){
            String expression=display.getText();
            expression+='1';
            display.setText(expression);
        }
        if(e.getSource()==b2){
            String expression=display.getText();
            expression+='2';
            display.setText(expression);
        }
        if(e.getSource()==b3){
            String expression=display.getText();
            expression+='3';
            display.setText(expression);
        }
        if(e.getSource()==b4){
            String expression=display.getText();
            expression+='4';
            display.setText(expression);
        }
        if(e.getSource()==b5){
            String expression=display.getText();
            expression+='5';
            display.setText(expression);
        }
        if(e.getSource()==b6){
            String expression=display.getText();
            expression+='6';
            display.setText(expression);
        }
        if(e.getSource()==b7){
            String expression=display.getText();
            expression+='7';
            display.setText(expression);
        }
        if(e.getSource()==b8){
            String expression=display.getText();
            expression+='8';
            display.setText(expression);
        }
        if(e.getSource()==b9){
            String expression=display.getText();
            expression+='9';
            display.setText(expression);
        }
        if(e.getSource()==clr){
            String expression="";
            display.setText(expression);
        }
        if(e.getSource()==add){
            String expression=display.getText();
            expression+='+';
            display.setText(expression);
        }
        if(e.getSource()==sub){
            String expression=display.getText();
            expression+='-';
            display.setText(expression);
        }
        if(e.getSource()==mul){
            String expression=display.getText();
            expression+='*';
            display.setText(expression);
        }
        if(e.getSource()==div){
            String expression=display.getText();
            expression+='/';
            display.setText(expression);
        }
        if(e.getSource()==eq){
            int a,b,i;
            char operator='+';
            String expression=display.getText();
            String tempA="",tempB="";

            for(i=0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    tempA+=expression.charAt(i);
                }else{
                    operator=expression.charAt(i);
                    break;
                }
            }
            tempB=expression.substring(i+1);
            a=Integer.parseInt(tempA);
            b=Integer.parseInt(tempB);
            int ans=0;
            switch(operator){
                case '+':
                    ans=a+b;
                    break;
                case '-':
                    ans=a-b;
                    break;
                case '*':
                    ans=a*b;
                    break;
                case '/':
                    ans=a/b;
                    break;

            }
            display.setText(ans+"");
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
