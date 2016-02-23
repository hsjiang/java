import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by riven_chris on 15/6/25.
 */
public class PartFactory {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}

interface BaseFactory<T> {
    T create();
}

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<BaseFactory<? extends Part>> partFactories = new ArrayList<BaseFactory<? extends Part>>();

    static {
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }

    private static Random random = new Random(47);

    public static Part createRandom() {
        int n = random.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory implements BaseFactory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory implements BaseFactory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements BaseFactory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements BaseFactory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory implements BaseFactory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements BaseFactory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements BaseFactory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
