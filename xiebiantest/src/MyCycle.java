/**
 * Created by riven_chris on 15/5/5.
 */

interface Cycle {
    void cycle();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };

    @Override
    public void cycle() {
        System.out.println("this is Unicycle");
    }
}


class Bicycle implements Cycle {

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };

    @Override
    public void cycle() {
        System.out.println("this is Bicycle");
    }
}

class Tricycle implements Cycle {

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };

    @Override
    public void cycle() {
        System.out.println("this is Tricycle");
    }

}

public class MyCycle {

    public void whatCycle(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.cycle();
    }

    public static void main(String[] args) {

        MyCycle myCycle = new MyCycle();
        myCycle.whatCycle(Unicycle.factory);

        myCycle.whatCycle(Bicycle.factory);

        myCycle.whatCycle(Tricycle.factory);

    }

}
