package test;

public class MyApp {

    public static void main(String[] args) {
        Block A = new Block(100, 200, 50, 50);
        Block B = new Block(100, 50, 100, 100);
        // TODO Auto-generated method stub
        MyKeyListener keyListener = new MyKeyListener();

        MyJFrame j = new MyJFrame(A, B);

        keyListener.setjPanel(j.getjPanel());
        keyListener.setBlockA(keyListener.getjPanel().getBlockA());
        j.addKeyListener(keyListener);
        j.setVisible(true);
    }

}
