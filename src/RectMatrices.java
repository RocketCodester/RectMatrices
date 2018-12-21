public class RectMatrices {
    public static void main(String[] args) {
        int r1 = 1;
	int c1 = 4;
	int r2 = 4;
	int c2 = 4;
	int r3 = 4;
	int c3 = 3;
	float[] i = { 1, 1, 1, 1 };
	float[] j = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
	float[] k = {0,0,0,1,1,1,2,2,2,3,3,3};
        float[] prod = multMatrices(r1, c1, r2, c2, i, j);
        System.out.println();
        multMatrices(r1, c2, r3, c3, prod, k);
        System.out.println();
        multMatrices(r1, c2, r3, c3, multMatrices(r1, c1, r2, c2, i, j), k);
    }
    static float[] multMatrices(int r1, int c1, int r2, int c2, float i[], float j[]) {
        float[] prod = new float[r1 * c2];
        for (int x = 0; x < r1; x++) { // row number of output
            for (int y = 0; y < c2; y++) { // column number of output
                prod[c2 * x + y] = 0;
                for (int z = 0; z < c2; z++) { // four elements are added for this output
                    prod[c2 * x + y] += i[c1 * x + z] * j[r2 * z + y];
                }
            }
        }
        for (int q = 0; q < r1 * c2; q++) {
            System.out.println(prod[q] + "");
        }
        return prod;
    }
}
