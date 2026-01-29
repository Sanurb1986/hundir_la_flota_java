public class ConsoleUI {

    public static void mostrarArray(char [][] x){

        for(int i = 0; i < x.length;i++){
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+" ");   
            }
            System.out.println();
        }
    }
}
