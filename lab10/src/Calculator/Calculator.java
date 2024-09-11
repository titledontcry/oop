package Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JButton[] numButton = new JButton[10];
    private JButton[] funcButton = new JButton[7]; 
    private JButton plus, minus, multi, div, ce, clr, eq;
    private JTextField display;  
    private JLabel nowOperate; 
    private JPanel panel; 
    private Font font = new Font("Arial", Font.PLAIN, 20);
    private char operator;  
    private double num1, num2;  
    private double result = 0; 
    private boolean opeCheck;

    public Calculator(String name) {
        super(name);
        display = new JTextField();
        display.setBounds(50,25,300,50);
        display.setFont(font);
        display.setEditable(false);// ห้ามพิมบนtextfield
        add(display);
        nowOperate = new JLabel();
        nowOperate.setBounds(50,100,300,25);
        nowOperate.setFont(new Font("Arial",Font.PLAIN,14));
        add(nowOperate);
       
        for (int i = 0; i < 10; i++) {
            numButton[i] = new JButton(String.valueOf(i));
            numButton[i].setFont(font); 
            numButton[i].addActionListener(this); 
            numButton[i].setFocusable(false);
        }
        plus = new JButton("+");
        minus = new JButton("-");
        multi = new JButton("*");
        div = new JButton("/");
        ce = new JButton("CE");
        clr = new JButton("CLR");
        eq = new JButton("=");

        funcButton[0] = plus;
        funcButton[1] = minus;
        funcButton[2] = multi;
        funcButton[3] = div;
        funcButton[4] = ce;
        funcButton[5] = clr;
        funcButton[6] = eq;

        for (int i = 0; i < 7; i++) {
            funcButton[i].addActionListener(this);
            funcButton[i].setFont(font);
            funcButton[i].setFocusable(false);
        }
        panel = new JPanel();
        panel.setBounds(50, 150, 300, 300);
        panel.setLayout(new GridLayout(5, 4, 10, 10)); 

        // แถว 1
        panel.add(clr);
        panel.add(ce);
        panel.add(div);
        panel.add(multi);
        // แถว 2
        panel.add(numButton[1]);
        panel.add(numButton[2]);
        panel.add(numButton[3]);
        panel.add(plus);
        // แถว 3
        panel.add(numButton[4]);
        panel.add(numButton[5]);
        panel.add(numButton[6]);
        panel.add(minus);
        // แถว 4
        panel.add(numButton[7]);
        panel.add(numButton[8]);
        panel.add(numButton[9]);
        panel.add(eq);
        // แถว 5
        panel.add(numButton[0]);
        add(panel);
        setLayout(null);
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButton[i]) {
                String currentText = display.getText();
                if (opeCheck) {
                    display.setText(String.valueOf(i));
                    opeCheck = false;
                } else {
                    // เพิ่มเลขที่dispaly
                    display.setText(currentText.concat(String.valueOf(i)));
                }
                // update nowOpให้ตรงกับ display
                if (!opeCheck) {
                    nowOperate.setText(display.getText());
                } else {
                    nowOperate.setText(num1 + " " + operator + " " + display.getText());
                }
            }
        }
        if (e.getSource() == ce) {
            display.setText("");
            nowOperate.setText("");
            opeCheck = false;
        }
        if (e.getSource() == clr) {
            display.setText("");
            nowOperate.setText("");
            opeCheck = false; // reset all
        }
        if (e.getSource() == plus) {
            num1 = Double.parseDouble(display.getText());
            opeCheck = true;
            operator = '+';
            display.setText(""); //clear ฟิว
            nowOperate.setText(num1 + " + ");
        }
        if (e.getSource() == minus) {
            num1 = Double.parseDouble(display.getText());
            opeCheck = true;
            operator = '-';
            display.setText(""); 
            nowOperate.setText(num1 + " - ");
        }
        if (e.getSource() == div) {
            num1 = Double.parseDouble(display.getText());
            opeCheck = true;
            operator = '/';
            display.setText(""); 
            nowOperate.setText(num1 + " / ");
        }
        if (e.getSource() == multi) {
            num1 = Double.parseDouble(display.getText());
            opeCheck = true;
            operator = '*';
            display.setText(""); 
            nowOperate.setText(num1 + " x ");
        }
        if (e.getSource() == eq) {
            num2 = Double.parseDouble(display.getText());  // แปลงค่าจาก displayเป็น num2
            switch (operator) { 
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    // checkหาร0
                    if (num2 != 0) {
                        result = num1/num2;
                    } else {
                        display.setText("Error"); 
                        nowOperate.setText("");
                        return; 
                    }
                    break;
            }

            display.setText(String.valueOf(result));  // แสดงผล
            nowOperate.setText(num1 + " " + operator + " " + num2 + " = " + result);  
            num1 = result; 
            opeCheck = false; 
        }
    }
    public static void main(String[] args) {
        new Calculator("Mycal");
    }
}


