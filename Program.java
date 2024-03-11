public class Program
{
    public static void main(String[] args)
    {
        int width = 100;
        int height = 100;
        Cell[] buffer = new Cell[width * height];
        buffer[0] = Cell.alwaysAlive();
        Field field = Field.create(buffer, width, height)
            .nullIsDead()
            .loop(width, height);
        FieldFrame frame = new FieldFrame(width, height, field);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.callPaint();
    }
}