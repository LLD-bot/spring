package test;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    private MyJPanel jPanel;
    private Block blockA;
    private Rectangle rectangleA;
    private Rectangle rectangleB;

    public MyKeyListener() {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        switch (i) {
            case 37:
                // ��

                rectangleA = new Rectangle(blockA.getBlock_x() - 5, blockA.getBlock_y(), blockA.getWidth(),
                        blockA.getHeight());

                if (!(rectangleA.intersects(rectangleB))) {
                    blockA.setBlock_x(blockA.getBlock_x() - 5);
                }

                break;
            case 39:
                // ���ƶ�

                rectangleA = new Rectangle(blockA.getBlock_x() + 5, blockA.getBlock_y(), blockA.getWidth(),
                        blockA.getHeight());

                if (!(rectangleA.intersects(rectangleB))) {
                    blockA.setBlock_x(blockA.getBlock_x() + 5);
                }

                break;
            case 38:
                // ���ƶ�
                rectangleA = new Rectangle(blockA.getBlock_x(), blockA.getBlock_y() - 5, blockA.getWidth(),
                        blockA.getHeight());

                if (!(rectangleA.intersects(rectangleB))) {
                    blockA.setBlock_y(blockA.getBlock_y() - 5);
                }

                break;

            case 40:
                // ���ƶ�
                rectangleA = new Rectangle(blockA.getBlock_x(), blockA.getBlock_y() + 5, blockA.getWidth(),
                        blockA.getHeight());

                if (!(rectangleA.intersects(rectangleB))) {
                    blockA.setBlock_y(blockA.getBlock_y() + 5);
                }
                break;

            default:
                break;
        }

        jPanel.repaint();

    }
    // TODO Auto-generated method stub


    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    public MyJPanel getjPanel() {
        return jPanel;
    }

    public void setjPanel(MyJPanel jPanel) {
        this.jPanel = jPanel;

        rectangleB = jPanel.getRectangleB();
    }

    public Block getBlockA() {
        return blockA;
    }

    public void setBlockA(Block blockA) {
        this.blockA = blockA;
    }


    public Rectangle getRectangleB() {
        return rectangleB;
    }

    public void setRectangleB(Rectangle rectangleB) {
        this.rectangleB = rectangleB;
    }

}
