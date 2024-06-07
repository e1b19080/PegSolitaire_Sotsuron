// Todo
//・sotsuron.javaでできたとこまでGitCraken使いながら複製する．
//・違うクラスを別ファイルで作る方法
//・


public class Main {
    public static void main(String[] args){
        
        //grid:格子点．
        //pin:その格子点のピンの状態，-1=無し，1=あり，(0=盤面外)
        //state:動かす先の候補に入っていたら1,それ以外は0.    
        Grid grid = new Grid();
        grid.pin = new int[]{-1,1,-1,-1,1,-1,-1,-1,-1};
        grid.state = new int[]{0,0,0,0,0,0,0,0,0};
        
        Confirm confirm = new Confirm();
        confirm.confirmBoard(grid);
    }
}