package digui;

public class Maze {
	public static void main(String[] args) {
		// 建一个8行7列的地图，障碍物是1，非障碍是0
		int[][] map = new int[8][7];
		// 第一行和第八行是障碍物
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;

		}
		// 第一列和第7列是障碍物
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		// 还有单独的两个是障碍物
		map[3][1] = 1;
		map[3][2] = 1;
		// 输出地图的情况
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(map[i][j]);
			}

			System.out.println();
		}
		C c = new C();
		c.findway(map, 1, 1);
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}

			System.out.println();
		}
	}
}

class C {
	public boolean findway(int[][] map, int i, int j) {

		if (map[6][5] == 2) {
			return true;
		} else {
			if (map[i][j] == 0) {// 当前位置是0
				map[i][j] = 2;
				if (findway(map, i + 1, j)) {
					return true;
				} else if (findway(map, i, j + 1)) {
					return true;
				} else if (findway(map, i - 1, j)) {
					return true;
				} else if (findway(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}

			} else {// map[i][j]=1,2,3的时候

				return false;// 当他走到[4][1]的时候，他这个不等于0，所以直接退出，
				// 也就是到3，1的时候，向下走这条路是不通的，所以在3，1的时候向下走退出，返回到3，1里继续向右走的步骤
			}
		}

	}
}
