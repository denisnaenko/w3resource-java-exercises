package mechanics;

import mechanics.flying.Flyable;
import mechanics.flying.Airplane;
import mechanics.flying.Helicopter;
import mechanics.flying.Spacecraft;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Airplane(), new Helicopter(), new Spacecraft()};
        
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}
