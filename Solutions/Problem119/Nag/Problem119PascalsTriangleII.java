import java.util.ArrayList;
import java.util.List;

public class Problem119PascalsTriangleII {
    public static List<Integer> getRow (int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        if(rowIndex == 0) return result;
        result.add(1);
        if(rowIndex == 1) return result;

        for(int i= 1; i<rowIndex; i++){
            ArrayList<Integer> r = new ArrayList<>();
            r.add(1);
            for(int j=0; j<i; j++){
                r.add(result.get(j)+result.get(j+1));
            }
            r.add(1);
            result = r;
        }
        return result;
    }

    public static void main(String[] args) {
       List<Integer> result = new ArrayList<>();
       result = Problem119PascalsTriangleII.getRow(5);
       for(int i=0; i<result.size(); i++){
           System.out.println(result.get(i));
       }

    }
}
