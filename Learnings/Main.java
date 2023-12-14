package Learnings;
// import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int tc = scanner.nextInt();
         while(tc-- >0) {
             int n = scanner.nextInt();
              int k=  scanner.nextInt();
              int ans = n/(k+1);
              System.out.println(n - ans*k);

         }
 

        int x = scanner.nextInt();
        int k = scanner.nextInt();
        int maxAcc = x;
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0; i<k; i++) 
        {
           List<Integer> li = new ArrayList<>();
           while (scanner.hasNextInt()) {
            li.add(scanner.nextInt());
           }
           lists.add(li);
        }
        int size = lists.get(0).size()-1;
        for(int i=0; i<size; i++) {
            if(x + lists.get(i).get(i) > 0) {
                x = x + lists.get(i).get(i);
            }
        }
        System.out.println(x);
    }

    import java.util.ArrayList;

public class Pair {
    private int type;
    private ArrayList<Integer> nutritionValues;

    public Pair(int type, ArrayList<Integer> nutritionValues) {
        this.type = type;
        this.nutritionValues = nutritionValues;
    }

    public int getType() {
        return type;
    }

    public ArrayList<Integer> getNutritionValues() {
        return nutritionValues;
    }
}
Collections.sort(fruits, Comparator.comparingInt(Pair::getFirst)); 
}
