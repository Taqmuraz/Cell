import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class FieldPanel extends JPanel
{
    int fieldWidth, fieldHeight;
    Field field;

    public FieldPanel(int fieldWidth, int fieldHeight, Field field)
    {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;

        this.field = field;
    }

    @Override
    public void paint(Graphics graphics)
    {
        Graphics2D g2 = (Graphics2D)graphics;
        int width = getWidth();
        int height = getHeight();
        int cellWidth = width / fieldWidth;
        int cellHeight = height / fieldHeight;

        g2.setColor(Color.black);
        g2.fillRect(0, 0, width, height);
        g2.setColor(Color.white);

        for(int x = 0; x < fieldWidth; x++) for(int y = 0; y < fieldHeight; y++)
        {
            Cell cell = field.at(x, y);
            if(cell.isAlive()) g2.fillRect(cellWidth * x, cellHeight * y, cellWidth, cellHeight);
        }

        invalidate();
    }
}