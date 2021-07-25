package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2Times {
    public static void main(String[] args) {

        /*
        {1,3,5,7} OUTPUT==> {1,1,3,3,5,5,7,7}
         */
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(5);
//        list.add(7);

        list.addAll(Arrays.asList(9,8,7));

        System.out.println(twoTimes(list));

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
//        newList.add(list.get(0));
//        newList.add(list.get(0));
//        newList.add(list.get(1));
//        newList.add(list.get(1));
//        newList.add(list.get(2));
//        newList.add(list.get(2));

        for (int i = 0; i <list.size(); i++){
            newList.add(list.get(i));
            newList.add(list.get(i));
        }
        return newList;
    }
}
