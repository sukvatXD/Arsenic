package arsenic.module.impl.ghost;

public class HitSelect {
    // Function to provide precise timing for knockback reduction
    private long startTime;

    public HitSelect() {
        startTime = System.currentTimeMillis();
    }

    public void resetTiming() {
        startTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - startTime;
    }

    // Additional methods for knockback reduction can be added here
}