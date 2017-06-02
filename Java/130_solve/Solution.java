
public class Solution {
/*	
	public class UnionFind{
		int[] parent;
		public UnionFind(int n){
			parent = new int[n+1];
			for(int i=0; i < n+1; i++) parent[i] = i;
		}
		public int find(int x){
			if(parent[x] == x) return x;
			return parent[x] = find(parent[x]);
		}

		public void union(int a, int b){
			int roota = find(a), rootb = find(b);
			if(roota != rootb)
				parent[roota] = rootb;
		}
	}

	private static final int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
	private boolean inBound(int i, int j, int m, int n){
		return i >= 0 && i < m && j >=0 && j < n; 
	}
	private boolean onEdge(int i, int j, int m, int n){
		return i==0||i == m-1 || j == 0 || j==n-1;
	}

    public void solve(char[][] board){
        if(board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;
        UnionFind uf = new UnionFind(m*n);
        for(int i = 0; i < m; i++)
        	for(int j = 0;j < n; j++){
        		if(board[i][j] != 'O') continue;
        		for(int k = 0; k < 4; k++){
        			int x = i+dx[k], y = j+dy[k];
        			if(inBound(x,y,m,n) && board[x][y] == 'O')
        				uf.union(i*n + j,x*n + y);
        		}
        		if(onEdge(i,j,m,n)) uf.union(i*n+j,m*n);
        	}

        for(int i = 0; i < m; i++)
        	for(int j = 0;j < n; j++){
        		if(uf.find(i*n+j) != uf.find(m*n)) board[i][j] = 'X';
        	}	
    }
*/
    private static int m, n;
    public void solve(char[][] board){
    	if(board == null || board.length == 0) return;
        m = board.length; 
        n = board[0].length;
        for(int i=0; i<n; i++) helper(board,0,i);
        for(int j=1; j<m; j++) helper(board,j,0);
        for(int i=0; i<n; i++) helper(board,m-1,i);
        for(int j=1; j<m-1; j++) helper(board,j,n-1); 

        for(int i = 0;i < m;i++)
        	for(int j = 0;j < n;j++)
        		board[i][j]=(board[i][j]=='#')?'O':'X';

    }

    public void helper(char[][] board,int a, int b){
    	if(board[a][b]=='X' || board[a][b]=='#') return;
    	board[a][b] = '#';
    	if(a+1 < m) helper(board,a+1,b);
    	if(b+1 < n) helper(board,a,b+1);
    	if(a-1 > 0) helper(board,a-1,b);
    	if(b-1 > 0) helper(board,a,b-1);    	
    }

    public static void pirntboard(char[][] board){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++)
				System.out.printf("%c ",board[i][j]);
			System.out.println("");		
		}
		System.out.println("");    	
    }

	public static void main(String[] args) { 
		Solution mySolution = new Solution();
		String[] input = {"OXO","XOX","OXO"};
		char[][] board = new char[input.length][input[0].length()];
		
		for(int i = 0; i < input.length; i++)
			for(int j = 0; j < input[0].length(); j++)
				board[i][j] = input[i].charAt(j);
		pirntboard(board);	

			
		mySolution.solve(board);
		pirntboard(board);
		
	}    
	

}
