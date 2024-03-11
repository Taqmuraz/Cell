
public interface Cell
{
    boolean isAlive();
    Cell next(int x, int y, Field field);

    static Cell alwaysAlive()
    {
        return new Cell()
        {
            @Override
            public boolean isAlive()
            {
                return true;
            }
            @Override
            public Cell next(int x, int y, Field field)
            {
                return this;
            }
        };
    }
    static Cell alwaysDead()
    {
        return new Cell()
        {
            @Override
            public boolean isAlive()
            {
                return false;
            }
            @Override
            public Cell next(int x, int y, Field field)
            {
                return this;
            }
        };
    }
}