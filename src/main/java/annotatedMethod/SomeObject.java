package annotatedMethod;

import annotation.Debug;

public class SomeObject {
    @Debug(
            value = "unit",
            name = "debug1"
    )
    public void doSomething() {
        // ....
    }
}
