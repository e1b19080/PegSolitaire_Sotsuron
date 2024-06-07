//gridの値が変わっているか確認表示するためのプログラム．完成時には使用しない．

public class Confirm{
    public void confirmBoard(Grid grid){
        System.out.println("\ngridCheck");
        System.out.println("********************************");
        
        for(int i=0;i<grid.row;i++){
            for(int j=0;j<grid.column;j++){
                System.out.printf("%2d行,",i+1);
                System.out.printf("%2d列, ",j+1);
                System.out.printf("有無:%2d, ",grid.pin[i*3+j]);
                System.out.printf("状態:%2d\n",grid.state[i*3+j]);
            }
            System.out.println("----------------------------");
        }
        System.out.println("********************************");
        System.out.println("Was it correct?\n\n");
    }
}
