package pack;

import java.util.Random;

public class Demo {
    public static void main(String[] args){
        PersistKit pk;
        HighScore hs;
        int max = 30;
        int min = 5;

        for(int i=0; i<7; i++){
            Random input = new Random();
            int value = input.nextInt(max - min +1)+min;

            if(value < 15)
                pk = new JdbcKit();
            else
                pk = new SrKit();

            System.out.println("Input : "+value);
            hs = pk.makeKit();
            hs.WhoAreYou();
        }
    }
}
