package test;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
    private MyJPanel jPanel;


    public MyJFrame(Block blockA, Block blockB) {

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(null);
        jPanel = new MyJPanel(blockA, blockB);
        jPanel.setBounds(0, 0, 500, 500);
        add(jPanel);

    }

    public MyJPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(MyJPanel jPanel) {
        this.jPanel = jPanel;
    }

}
