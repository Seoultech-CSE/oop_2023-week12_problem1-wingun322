import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i=0;i<5;i++){
            int n=input.nextInt();
            list.add(n);
        }
        for(int i=0;i<5;i++){
            double n=input.nextDouble();
            list.add(n);
        }          

        sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < list.get(i).doubleValue()) {
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
