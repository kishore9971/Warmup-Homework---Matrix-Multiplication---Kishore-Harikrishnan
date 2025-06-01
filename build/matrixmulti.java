public class Matrix {

       public static Double[][] multiply(Double[][] a, Double[][] b) {
         int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

               if (colsA != rowsB) {
               return new Double[][]{{null, null}};
        }

             Double[][] result = new Double[rowsA][colsB];

             for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0.0; 

                               for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result; 
    }
}

public class Runner {

    public static void main(String[] args) {
             Double[][] m1 = {
            {1.0, 2.0, 3.0, 5.0},
            {4.0, 5.0, 6.0, 7.0},
            {7.0, 8.0, 9.0, 9.0}
        };

                Double[][] m2 = {
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {4.0, 5.0, 6.0, 7.0, 8.0},
            {7.0, 8.0, 9.0, 10.0, 11.0},
            {10.0, 11.0, 12.0, 13.0, 14.0}
        };

       
        Double[][] m3 = Matrix.multiply(m1, m2);

                if (m3[0][0] == null) {
            System.out.println("matrix can’t be solved");
        } else {
                       StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m3.length; i++) {
                for (int j = 0; j < m3[i].length; j++) {
                    sb.append(String.format("%5s", m3[i][j]) + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb); 
        }
    }
}
