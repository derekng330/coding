public class GravityPuzzleEasy
{
    static String[] solve(String[] board)
    {
        if(board == null || board.length <= 1)
        {
            return board;
        }

        int[] boxes = new int[board[0].length()];
        String[] ret = new String[board.length];

        for(String s : board)
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == '#')
                {
                    boxes[i]++;
                }
            }
        }

        for(int j = ret.length-1; j >= 0; j--)
        {
            StringBuilder sb = new StringBuilder(boxes.length);

            for(int k = 0; k < boxes.length; k++)
            {
                if(boxes[k] > 0)
                {
                    sb.append('#');
                    boxes[k]--;
                }
                else
                {
                    sb.append('.');
                }
            }
            ret[j] = sb.toString();
        }

        return ret;
    }   
    
    public static void main(String[] args) {
        String[] t1 = {"..#.#",
        "#.#..",
        "...##"}
       ;
       

        String[] r1 = solve(t1);
        for(String s : r1)
        {
            System.out.println(s);

        }
    }
}
