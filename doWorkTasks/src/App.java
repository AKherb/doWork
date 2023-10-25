import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public int ev17()
    {
        return 10;
    }

    public int[][] creList(int r, int c)
    {

        Random rand = new Random();
        int[][] hi = new int[r][c];

        for(int i = 0; i < r; i++)
        {
            for(int z = 0; z < c; z++)
            {
                hi[i][z] = rand.nextInt(50);
            }
        }

        return hi;

    }


}
