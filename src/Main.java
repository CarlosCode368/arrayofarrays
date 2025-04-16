
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        char[][] rows = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'},
                //0    1    2 positions in a row
        };

        rows[1][1] = 'X';

        //DISPLAY THE WHOLE BOARD
        for (int r = 0; r < rows.length; r++) {
            for(int c = 0;c <rows[r].length;c++){
                System.out.print(rows[r][c]);
                System.out.print(' ');
            }
            System.out.print('\n'); //newline
        }
    }
}
