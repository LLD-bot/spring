package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class MyJPanel extends JPanel {
    private Block blockA;
    private Block blockB;
    private Rectangle rectangleB;

    public MyJPanel(Block blockA, Block blockB) {

        setSize(500, 500);
        this.blockA = blockA;
        this.blockB = blockB;
        setVisible(true);
        rectangleB = new Rectangle(blockB.getBlock_x(), blockB.getBlock_y(), blockB.getWidth(),
                blockB.getHeight());
    }

    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.setColor(Color.BLUE);

        g.fillRect(getBlockA().getBlock_x(), getBlockA().getBlock_y(), getBlockA().getWidth(), getBlockA().getHeight());

        g.drawString("X:" + blockA.getBlock_x(), 0, 100);
        g.drawString("Y:" + blockA.getBlock_y(), 0, 120);

        g.setColor(Color.CYAN);
        g.fillRect(blockB.getBlock_x(), blockB.getBlock_y(), blockB.getWidth(), blockB.getHeight());

//        g.setColor(Color.GREEN);
//        g.fillRect(getBlockB().getBlock_x(), getBlockB().getBlock_y(), getBlockB().getWidth(), getBlockB().getHeight());

    }

    public Block getBlockA() {
        return blockA;
    }

    public void setBlockA(Block blockA) {
        this.blockA = blockA;
    }

    public Block getBlockB() {
        return blockB;
    }

    public void setBlockB(Block blockB) {
        this.blockB = blockB;
    }

    public Rectangle getRectangleB() {
        return rectangleB;
    }

    public void setRectangleB(Rectangle rectangleB) {
        this.rectangleB = rectangleB;
    }

}
