
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AnhVuNAV
 */
public class MyTrain implements ITrain {

    @Override
    public int f1(List<Train> list) {
        int sum = 0;
        for (Train t : list) {
            int count = 0;
            for (int i = 0; i < t.getName().length(); i++) {
                if (t.getName().charAt(i) == 'A' || t.getName().charAt(i) == 'B') {
                    ++count;
                }
            }
            if (count == 1) {
                sum += t.getLoad();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Train> list) {
        Train min = null;
        for (Train t : list) {
            if (min == null || t.getLoad() < min.getLoad() ) {
                min = t;
            }
        }
        int index = list.indexOf(min);
        for (int i = index; i < list.size() - 1; i++) {
                int j = i + 1;
                Train tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
        }
    }

    @Override
    public void f3(List<Train> list) {
        Train max = null;
        for (Train t : list) {
            if (max == null || t.getName().length() > max.getName().length() ) {
                max = t;
            }
        }
        int flag = 0;
        for (Train t : list) {
            if (t.getName().length() == max.getName().length()) {
                ++flag;
            }
            if (flag == 2) {
                list.remove(t);
                break;
            }
        }
    }

}
