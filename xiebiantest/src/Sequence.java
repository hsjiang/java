/**
 * Created by riven_chris on 15/4/30.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    class SequenceSelector implements Selector {
        private int i = 0;

        // inner classes cannot have static declarations
//        public static int s = 1;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            Sequence.this.add(1);
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }

        public Sequence sequence() {
            return Sequence.this;
        }

        // inner classes cannot have static declarations
//        public static void method(){
//
//        }
    }

    public SequenceSelector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {

        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

//        SequenceSelector sequenceSelector = sequence.new SequenceSelector();

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + "  ");
            selector.next();
        }
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}
