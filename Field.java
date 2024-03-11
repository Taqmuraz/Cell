
public interface Field
{
    Cell at(int x, int y);

    static Field create(Cell[] buffer, int width, int height)
    {
        return (x, y) -> buffer[x + y * width];
    }
    default Field loop(int width, int height)
    {
        return (x, y) ->
        {
            if(x < 0) x = width - x % width;
            if(y < 0) x = height - y % height;
            return at(x % width, y % height);
        };
    }
    default Field nullIsDead()
    {
        return (x, y) ->
        {
            var cell = at(x, y);
            if(cell == null) return Cell.alwaysDead();
            return cell;
        };
    }
}