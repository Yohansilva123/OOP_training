package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

    public OddArrayList(Integer... integers) {
        super(Arrays.stream(integers).filter(OddArrayList::isOdd).collect(Collectors.toList()));
    }

    public OddArrayList(ArrayList<Integer> integers) {
        super(integers.stream().filter(OddArrayList::isOdd).collect(Collectors.toList()));
    }

    @Override
    public boolean add(Integer integer) {
        if (isOdd(integer)) {
            return super.add(integer);
        } else {
            return false;
        }
    }

    @Override
    public void add(int index, Integer integer) {
        if (isOdd(integer)) {
            super.add(index, integer);
        }
    }

    public static boolean isOdd(Integer integer){
        return Math.abs(integer) % 2 == 1;
    }

    public void replaceAll(){
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) % 2 == 0) {
                this.set(i, this.get(i) + 1);
            }
        }
    }

    @Override
    public Integer set(int index, Integer element) {
        if (element % 2 != 0) {
            return super.set(index, element);
        }
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if ((int) o % 2 != 0) {
            return super.remove(o);
        }
        return false;
    }

    @Override
    public Integer remove(int index) {
        if (super.get(index) % 2 != 0) {
            return super.remove(index);
        }
        return null;
    }
}
