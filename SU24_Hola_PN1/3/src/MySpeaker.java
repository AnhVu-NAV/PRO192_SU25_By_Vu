
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AnhVuNAV
 */
public class MySpeaker implements ISpeaker {

    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPower() > 10) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (t.get(i).getPower() > t.get(j).getPower()) {
                    Speaker tmp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, tmp);
                }
            }
        }
    }

    @Override
    public void f3(List<Speaker> t) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPower() < min) {
                min = t.get(i).getPower();
            }
        }
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPower() == min) {
                ++count;
            }
            if (count == 2) {
                t.remove(i);
                return;
            }
        }
    }
}
