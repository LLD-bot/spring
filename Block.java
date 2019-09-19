package test;

public class Block {
    private int Block_x = 100;
    private int Block_y = 200;
    private int height = 100;
    private int width = 100;


    public Block(int Block_x, int Block_y, int height, int width) {
        super();
        this.Block_x = Block_x;
        this.Block_y = Block_y;
        this.height = height;
        this.width = width;
    }


    public int getBlock_x() {
        return Block_x;
    }

    public void setBlock_x(int block_x) {
        Block_x = block_x;
    }

    public int getBlock_y() {
        return Block_y;
    }

    public void setBlock_y(int block_y) {
        Block_y = block_y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
