
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AnhVuNAV
 */
public class MyRadio implements IRadio {

    private boolean checkDigitString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int f1(List<Radio> t) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() > max && checkDigitString(t.get(i).getContent())) {
                max = t.get(i).getRate();
            }
        }
        return max;
    }

    @Override
    public void f2(List<Radio> t) {
        for (int i = 0; i < t.size() - 1; i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if (t.get(i).getRate() > t.get(j).getRate()
                        && !Character.isDigit(t.get(i).getContent().charAt(0))
                        && !Character.isDigit(t.get(j).getContent().charAt(0))) {
                    Radio tmp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, tmp);
                }
            }
        }
    }

    public int minRadioRate(List<Radio> t) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if (min > t.get(i).getRate()) {
                min = t.get(i).getRate();
            }
        }
        return min;
    }

    @Override
    public void f3(List<Radio> t) {
        int min = minRadioRate(t);
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() == min
                    && !Character.isDigit(t.get(i).getContent().charAt(0))) {
                t.remove(i);
            }
        }
    }

}
