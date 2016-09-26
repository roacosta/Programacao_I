public class Tabuleiro{
    int[][] tabuleiro = new int[3][3];

    void Tabuleiro(){
        this.zerarTabuleiro();
    }

    void zerarTabuleiro(){
        int i = 0,j = 0;
        for(i = 0; i<3; i++){
            for(j = 0; j <3; j++){
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    void exibeTabuleiro(){
        int i = 0,j = 0;
        for(i = 0; i<3; i++){
            for(j = 0; j <3; j++){
                switch(tabuleiro[i][j]){

                    case -1:  System.out.println("X");
                    case  1:  System.out.println("O");
                    default:  System.out.println(" ");

                }
                if (j < 2) System.out.println("|");

            }
            if (i < 2)  System.out.println("\n___\n");
        }
    }

    int checaLinhas(){
        int i = 0;
        for(i = 0; i<3; i++){
            if(tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2] =  3 ||  tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2] = -3){
                return tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2];
            }
        }
        return 0;
    }

    int checaColunas(){
        int i = 0;
        for(i = 0; i<3; i++){
            if(tabuleiro[0][i] + tabuleiro[1][i] + tabuleiro[2][i] =  3 ||  tabuleiro[0][i] + tabuleiro[1][i] + tabuleiro[2][i] = -3){
                return tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2];
            }
        }
        return 0;
    }

    int checaDiagonais(){
        if(tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] =  3 ||  tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] = -3){
            return tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
        return 0;


        if(tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2] =  3 ||  tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2] = -3){
            return tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro[0][2];
        return 0;
    }

    boolean tabuleioCompleto(){
        for(i = 0; i<3; i++){
            for(j = 0; j <3; j++){
                if(this.tabuleiro[i][j] = 0){
                    return false;
                };
            }
        }
        return true;
    }
}
