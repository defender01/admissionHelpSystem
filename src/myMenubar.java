

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class myMenubar {
    public String prevdata = null, from = null, message = "";
    Socket client;
    BufferedReader in;
    PrintWriter out;
    boolean flag = false;

    public myMenubar(String s, String from) {
        try {
            client = new Socket("localhost", 3333);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            out = new PrintWriter(client.getOutputStream(), true);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " con");
        }
        prevdata = s;
        this.from = from;
        createMenuBar();

    }

    public void createMenuBar() {
        System.out.println("menubar received : " + prevdata);
        if (from.equals("signup")) {
            try {
                out.println(prevdata);
                in.close();
                out.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + " crmenu");
            }
        } else if (from.equals("login")) {
            try {
                out.println(prevdata);
                message = in.readLine();
                System.out.println(message);
                if (!(message.equals("not exists")))
                    flag = true;
                System.out.println(message);
                in.close();
                out.close();

            } catch (Exception ex1) {
                System.out.println(ex1 + "1");
            }
        }
        /*JFrame frame = new JFrame();
        frame.setBounds(200, 70, 1000, 600);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(20, 20, 200, 30);
        pf.setEchoChar('*');
        c.add(pf);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu edit = new JMenu("circular");
        JMenuItem circulars = new JMenuItem("Admission Circulars");
        edit.add(circulars);

        JMenu notice = new JMenu("Noticeboard");
        notice.add("University Notice");

        JMenu result = new JMenu("Result");
        JMenuItem published = new JMenuItem("Published Result");
        result.add(published);

        JMenuBar menubar = new JMenuBar();
        menubar.add(edit);
        menubar.add(notice);
        menubar.add(result);
        frame.setJMenuBar(menubar);


        frame.setVisible(true);
        c.setVisible(true);*/

    /*public static void main(String args[]) {
            myMenubar mb = new myMenubar("ki khobor");

    }*/
    }
}