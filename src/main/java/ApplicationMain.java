import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationMain {

    public List<int[]> partition(int[] listIn, int n) {
        System.out.println("**** Number of elements **** : " + n);
        int sizeOfList = listIn.length;
        int z = (int) Math.ceil((double) sizeOfList / n);
        System.out.println("**** Length of list*** : " + z);
        List<int[]> list = new ArrayList();
        for (int i = 0; i < z; i++) {
            int from = i * n;
            int j = (i + 1) * n;
            int to = (j < sizeOfList) ? j : sizeOfList;
            int[] s = Arrays.copyOfRange(listIn, from, to);
            list.add(s);
        }
        list.stream().map(s -> Arrays.toString(s)).forEach(System.out::println);
        return list;
    }
}
