/**
 * Created by petriccione on 10/30/15.
 */
public class Interval {
    int lowerBound;
    int max;

    public Interval(int max, int lowerBound) {
        this.max = max;
        this.lowerBound = lowerBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
