package text01;

/**
 * @author 尤朋
 * @Description:
 * @data 2022 年 11 月 04 日 17:08
 */
//用二维数组打印回形
public class Test01 {
    public static void main(String[] args) {
        int n=6;
        int[][] arr = new int[n][n];
        int minX=0,minY=0,maxX=n-1,maxY=n-1;
        int count=0;
        while (minX<=maxX){
            for (int x = minX; x <= maxX ; x++) {
                arr[minY][x]=++count;
            }
            minY++;
            for (int y = minY; y <=maxY ; y++) {
                arr[y][maxX]=++count;
            }
            maxX--;
            for (int x = maxX; x >=minX ; x--) {
                arr[maxY][x]=++count;
            }
            maxY--;
            for (int y = maxY; y >=minY ; y--) {
                arr[y][minX]=++count;
            }
            minX++;
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }

}
