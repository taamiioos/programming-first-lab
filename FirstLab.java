public class FirstLab {
    public static void main(String[] args) {
        long[] d = new long[10];
        for (int i = 0, j = 5; i < 10; i++, j += 2) {
        }
        float[] x = new float[18];
        for (int i = 0; i < 18; i++) {
            x[i] = ((float) (Math.random() * 18.0f - 13.0f));

        }
        double[][] b = new double[10][18];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 18; j++) {
                if (d[i] == 23)
                    b[i][j] = (Math.pow(Math.E, Math.pow((0.25f - Math.asin(x[j] / 26)), 3)));
                else if ((d[i] == 7) || (d[i] == 9) || (d[i] == 11) || (d[i] == 17) || (d[i] == 19))
                    b[i][j] = (Math.pow(Math.pow((2 * (Math.pow(x[j], 4 / (x[j])))), 2), 3));
                else
                    b[i][j] = (Math.pow((Math.atan(Math.cos(Math.sin(Math.pow((2 / 3 * (x[j] - 1)), 2))))), (Math.pow(((Math.pow(((Math.log10(Math.abs(x[j]))) / 2), (Math.asin(x[j] / 26)))) / 2), 2))));
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.printf("%.2f ", b[i][j]);
            }
            System.out.println();
        }
    }
}
