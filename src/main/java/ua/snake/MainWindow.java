package ua.snake;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("SNAKE1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
