package Utility;

import org.rspeer.runetek.api.commons.math.Random;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class RandomHandling {

    public static int randomNumber(int n, int m){
        return ThreadLocalRandom.current().nextInt(n,m);
    }

    public static List<String> characterList(String path) {
        File file = new File(path);
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            return bf.lines().collect(Collectors.toList());
        }
        catch (Exception e){
            System.out.println("Could not read the file properly ");
            e.printStackTrace();
        }

        return null;
    }

    public static List<String> slaves(){
        String path = "C:\\Users\\Martin.DESKTOP-1AEIPCT\\Documents\\RSPeer\\Slaves.txt";
        return characterList(path);
    }

    public static List<String> masters(){
        String path = "C:\\Users\\Martin.DESKTOP-1AEIPCT\\Documents\\RSPeer\\Masters";
        return characterList(path);
    }

    public static int randomReturn(int low, int high){
        return Random.high(low,high);
    }

    public static int randomReturn(){
        return randomReturn(350,425);
    }

    public static void main(String[] args) {
        slaves().stream().forEach(System.out::println);
    }
}