package org.seaman.decoration;

public class Main {
    //[参考](https://stackoverflow.com/questions/28531996/android-recyclerview-gridlayoutmanager-column-spacing/28533234#)
    //算法
    //中间间隔S, 周边间隔ES, 列数C, 列索引I, 比例R=ES/S, 递增量D=(2*R-1)*S/C
    //Left = R*S - I*D
    //Right = R*S - (C-(I+1))*D
    public static void main(String[] args) {
        float edgeSpace = 100;
        float space = 80;
        int column = 5;

        float ratio = (float) Arith.div(edgeSpace, space);
        float delta = (2 * ratio - 1) * space / column;
        System.out.println("ratio = " + ratio + " delta = " + delta);

        float left, right, total;
        for (int i = 0; i < column; i++) {
            left = ratio * space - i * delta;
            right = ratio * space - (column - (i + 1)) * delta;
            total = left + right;
            System.out.println("column = " + (i + 1) + " left = " + left + " right = " + right + " total = " + total);
        }
    }
}
