package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // init:
        int gridW, gridH, posHX = 0, posHY=0,posGX=0, posGY=0;
        int GemX, GemY;

        Scanner in = new Scanner(System.in);

        //game start GUI
        System.out.println("    Humans VS Goblins   \n" +
                "Game Start:\n" +
                "Lets create the Land, then Human and Goblin will randomly show up.\n");

        // input land size:
        System.out.println("Width of the land(5-20):");
        gridW = in.nextInt();
        System.out.println("Height of the land(5-20)");
        gridH = in.nextInt();



        //create Grid
        //random locate Human & Goblin
        System.out.println("This is your land: ");
        System.out.println("Let's randomly locate Human and Goblin.");

        posHX = (int) (Math.random() * (gridW) );
        posHY = (int) (Math.random() * (gridH));
        do{
        posGX = (int) (Math.random() * (gridW));
        posGY = (int) (Math.random() * (gridH));}
        while(posHX == posGX && posHY ==posGY);

        GemX = (int) (Math.random() * (gridW));
        GemY = (int) (Math.random() * (gridW));



        System.out.format("Human locates on [%d ,%d ]\n",posHX,posHY);
        System.out.format("Goblin locates on [%d ,%d ]\n",posGX,posGY);

        Grid grid = new Grid(posHX, posHY, posGX, posGY,gridW,gridH, GemX,GemY);

        System.out.println();

        // move Human with 4 input:
        String button;
        boolean playing = true;
        System.out.println("Control Human to fight with Goblin!");
        System.out.println("Enter your control buttons: n(up),s(down),w(left),e(right)");

        do{
            button = in.nextLine();
            switch (button){
                case "n": //up
                    posHY--;
                    break;
                case "s": //down
                    posHY++;
                    break;
                case "e": //left
                    posHX++;
                    break;
                case "w": //right
                    posHX--;
                    break;

            }
            new Grid(posHX, posHY, posGX, posGY,gridW,gridH,GemX,GemY);

        if (posHX == posGX && posHY ==posGY){
            System.out.println("Start fight!!");
            Human human = new Human();
            Goblin goblin = new Goblin();

            while (!(Goblin.goblinhp <=0) && !(Human.humanhp <=0)) {
                Goblin.goblinhp -= human.humanattack;
                Human.humanhp -= goblin.goblinattack;
            }
            if(Goblin.goblinhp == 0) {
                System.out.println("Victory!");
                if ((Goblin.drop = (int) (Math.random() * 2)) == 0)
                    System.out.println("Bad luck, Goblin didn't drop anything!");
                else {
                    System.out.println("Lucky! Goblin drops a weapon, pick up!");
                    human.humanattack += (int) (Math.random() * (7 - 3 + 1)) + 3;
                }
                playing = false;
            }

            else {
                System.out.println("You died! Game Over!");
                playing = false;
            }





        }
        else if(posHX == GemX && posHY == GemY){
            GemX += gridW;
            GemY += gridH;

            Human human = new Human();
            human.humanattack+=10;
            System.out.println("You upgrade your weapon, attack + 10!");


        }


        }while(playing);
        System.out.println("Thank you for playing!");

    }

    static class Grid{
        public int width;
        public int height;
        public int area;


        public Grid(int hx, int hy,int gx, int gy, int width, int height, int gemX, int gemY){
            for (int h = 0;h<height;h++){
                for (int w = 0; w<width; w++){
                    if (hx ==w && hy ==h){
                        System.out.print(" H "); //0048
                    }
                    else if( gx ==w && gy ==h){
                        System.out.print(" G "); //0047
                    }
                    else if (gemX ==w && gemY ==h){
                        System.out.print(" T ");
                    }
                    else{
                        System.out.print("[ ]"); //005B 005D
                    }
                }
                System.out.println();

            }
            System.out.println();

        }
    }


    static class Human{

        public static int humanhp= 50;
        public int humanattack = (int) (Math.random() * (15-10+1))+10;



    }


    static class Goblin{
        public static int goblinhp = 30;
        public int goblinattack= (int) (Math.random() * (20-15+1))+15 ;
        public static int drop=0;


    }

}
