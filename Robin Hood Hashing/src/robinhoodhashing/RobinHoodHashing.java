package robinhoodhashing;

import java.util.Random;
import java.util.Scanner;

public class RobinHoodHashing {

    public static void main(String[] args) {
        System.out.println("Welcome to RobinHoodHashing By:->\nsalman Arshad\nMohammad Nafees\nAsim Iqbal");
        System.out.println("Enter the size of Hash Table \"prefered odd\":->");
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        Hashing hashing = new Hashing(size);
        Random rnd = new Random(System.currentTimeMillis());
        String[] randomArray = new String[size-2]; 
        for (int i = 0;i<size-2;i++) {
            randomArray[i]=Integer.toString(rnd.nextInt(900)+100);
            System.out.println(randomArray[i]);
        }
        hashing.insert(randomArray);
        hashing.printHashTable();
        hashing.delete(randomArray[2]);
        
        System.out.println("lokup="+hashing.lookUp(randomArray[3]));
        
        
        
    }
    
}
