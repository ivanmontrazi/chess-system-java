package boardgame;

public class Position {
	
		private int row;
		private int column;
		
		public Position () {
			
		}
		
		public Position(int row, int column) {
			this.row = row;
			this.column = column;
		}

		public int getrow() {
			return row;
		}

		public void setrow(int row) {
			this.row = row;
		}

		public int getcolumn() {
			return column;
		}

		public void setcolumn(int column) {
			this.column = column;
		}
		
		@Override
		public String toString() {
			return row + "," + column;
		}
		
		
}
