import java.util.*;

public class backtracking {

    public static void main(String[] args) {
        ArrayList< ArrayList<Integer> > javab = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int sum = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0;i<arr.length;i++){
            int t = Integer.parseInt(arr[i]);
            array.add(t);
        }

        comb(javab,array,sum,0,temp);

        for (Object i : javab){
            System.out.println(i);
        }

    }

    public static void comb(ArrayList< ArrayList<Integer> > javab, ArrayList<Integer> array , int sum,int index, ArrayList<Integer> temp){

        if (sum==0){
            javab.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index;i<array.size();i++){
            if (sum- array.get(i) >=0){
                temp.add(array.get(i));
                comb(javab,array,sum-array.get(i),i,temp);
                temp.remove(array.get(i));
            }
        }
    }
}
