class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0];
        int x2 = points[1][0];
        int x3= points[2][0];

        int y1 = points[0][1];
        int y2 = points[1][1];
        int y3 = points[2][1];

        int temp1 = (x2-x1)*(y3-y1);
        int temp2 = (x3-x1)*(y2-y1);

        return temp1!=temp2;
    }
}
