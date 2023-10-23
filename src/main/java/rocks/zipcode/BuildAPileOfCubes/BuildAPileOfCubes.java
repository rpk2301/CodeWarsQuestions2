package rocks.zipcode.BuildAPileOfCubes;

public class BuildAPileOfCubes {

    public static long findNb(long m) {
        long runcount = 0;
        long activeVal =0;
        for (int i = 1; i < m; i++) {

            if (activeVal == m) {
                return runcount;

            } else if (activeVal > m) {
                return -1;
            }

            activeVal += (long) Math.pow(i, 3);
            runcount++;
        }
    return -1;
    }
}
