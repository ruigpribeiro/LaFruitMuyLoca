package org.academiadecodigo.catchcoconuts.gfx.fruits;

public enum FruitType {

    LOSCOCOS("coconut.png",45),
    LAPAPAYA("papaya.png",-30),
    LABANANA("banana.png",20),
    LAPINNAPLE("pinapple.png",25);


    private String picture;
    private int points;
    FruitType(String picture,int points){
        this.picture = picture;
        this.points = points;
    }

    public String getPicture() {
        return picture;
    }
    public int getPoints(){
        return points;
    }

}