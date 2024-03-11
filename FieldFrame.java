import javax.swing.JFrame;

public class FieldFrame extends JFrame
{
    FieldPanel panel;

    public FieldFrame(int fieldWidth, int fieldHeight, Field field)
    {
        panel = new FieldPanel(fieldWidth, fieldHeight, field);
        panel.setSize(getSize());
        add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void setSize(int width, int height)
    {
        super.setSize(width, height);
        panel.setSize(width, height);
    }

    public void callPaint()
    {
        panel.invalidate();
    }
}