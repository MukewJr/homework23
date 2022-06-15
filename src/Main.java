import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(0, 2);
        }
        int temp;
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(ran.nextInt(0, 2));
        }
        System.out.println();
        Collections.sort(arrayList);
        System.out.print(arrayList);


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(ran.nextInt(0, 2));
        }
        System.out.println();
        //System.out.print(linkedList);
        Collections.sort(linkedList);
        System.out.print(linkedList);

    }
}
//    public static Comparator<Main> sortArray=new Comparator<Main>() {
//        @Override
//        public int compare(Main o1, Main o2) {
//            return ;
//        }
//    };
