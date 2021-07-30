package unionFind;

import java.util.Arrays;

public class _YSurroundedRegions { 

	public static void solve(char[][] board) {
		
		if (board.length == 0 || board[0].length == 0)
			return;

		if (board.length < 2 || board[0].length < 2)
			return;

		int m = board.length, n = board[0].length;

		for (int i = 0; i < m; i++) {

			if (board[i][0] == 'O')
				board[i][0] = '*';

			if (board[i][n - 1] == 'O')
				board[i][n - 1] = '*';

		}

		for (int j = 0; j < n; j++) {

			if (board[0][j] == 'O')
				board[0][j] = '*';

			if (board[m - 1][j] == 'O')
				board[m - 1][j] = '*';
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (board[i][j] == 'O')
					board[i][j] = 'X';
				else if (board[i][j] == '*')
					board[i][j] = 'O';
			}
		}
	}

	public static void main(String[] args) {
		
		char[][] board = {{'X','X','X','X'}, {'X','O','O','X'}, {'X','X','O','X'}, {'X','O','X','X'}};
		solve(board);
		System.out.println(Arrays.deepToString(board)); 
	}
}

/*
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all
 * regions surrounded by 'X'.
 * 
 * A region is captured by flipping all 'O's into 'X's in that surrounded
 * region.
 * 
 * For example, 
 * X X X X 
 * X O O X 
 * X X O X 
 * X O X X 
 * 
 * After running your function, the board should be:
 * 
 * X X X X 
 * X X X X 
 * X X X X 
 * X O X X
 * 
 */
