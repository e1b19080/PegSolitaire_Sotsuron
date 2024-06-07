public class Grid {
    int row = 3;    //3行
    int column = 3; //3列
    int[] pin = new int[row*column];         //マスの状態 
    int[] state = new int[row*column];     //マスの移動先候補
}
