package com.example.guidechessrush;

import java.util.ArrayList;

class GameData {
    private static String [][] data = new String[][]{
            {"Tier Pawn", "(Pion) 1-10", "https://1.bp.blogspot.com/-gszoVMapqOM/XStZmNF35tI/AAAAAAAAHt8/2Ccs00mqXQsEzpYhZ4vYM0des_kIdlq2wCLcBGAs/s1600/1.%2Brank%2Bpion%2Bchess%2Brush.png"},
            {"Tier Rook", "(Benteng) 1-10", "https://1.bp.blogspot.com/-gmItaq06EGA/XStZmJTW7CI/AAAAAAAAHuA/6qLGCOH4GjsUInKEiAbOxTa4QoPHOV9pgCLcBGAs/s1600/2.%2Brank%2Brook%2Bbenteng%2Bchess%2Brush.png"},
            {"Tier Knight", "(Kesatria) 1-10", "https://1.bp.blogspot.com/-3jK27kKeaPE/XStZmILyREI/AAAAAAAAHuE/p8dSAb5aweshr0zU-43N_ei8SrFmbl0aACLcBGAs/s1600/3.%2Bknight%2Brank%2Bkesatria%2Bchess%2Brush.png"},
            {"Tier Bishop", "(Uskup) 1-10", "https://1.bp.blogspot.com/-OgvYKxjSgGI/XStZnPDdxMI/AAAAAAAAHuI/dOUYuUaRZqUP4zcvewhroUqGiykB_C4kwCLcBGAs/s1600/4.%2Bbishop%2Brank%2Buskup%2Bchess%2Brush.png"},
            {"Tier Queen", "(Ratu) 1-10", "https://1.bp.blogspot.com/-h0vtsEAVxnc/XStZnUpBeaI/AAAAAAAAHuM/f4QChYn2JhYwjKnnKoLfAJQLcVZBpeRogCLcBGAs/s1600/5.%2Bqueen%2Brank%2Bratu%2Bfhess%2Brush.png"},
            {"Tier King", "(Raja)", "https://1.bp.blogspot.com/-N_JRLihu5RI/XStZnYpaY9I/AAAAAAAAHuQ/MrCmX3ikOjAyavu0kVLam13VTKvAUMdOQCLcBGAs/s1600/6.%2Bking%2Brank%2Braja%2Bchess%2Brush.png"},
    };

    static ArrayList<Game> getlisdata(){
        ArrayList<Game> list = new ArrayList<>();
        for (String [] aData: data){
            Game game = new Game();
            game.setName(aData[0]);
            game.setDesc(aData[1]);
            game.setImg(aData[2]);
            list.add(game);
        }
        return list;
    }
}