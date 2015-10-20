package cz.cvut.fel.tvs.tvs_hw2;

/**
 *
 * @author Jakub
 */
public class Tvs_hw2 {

    public static void main(String[] args) {

        int[][][] latinsqueares = generateLatinSquares(4, 5);

        String[][] factors = {
            {"CZ", "UK", "US","CZ","CZ"},
            {"Muž", "Žena","Muž","Muž","Muž"},
            {"Student", "Technik", "Důchodce", "Důchodce", "Důchodce"},
            {"Svobodný", "rozvedený","Svobodný","Svobodný","Svobodný"},
            {"Venkov", "Město","Město","Město","Město"},
            {"Garsonka", "Chata", "Kolej","Kolej","Kolej"}
        };

        for (int k = 0; k < latinsqueares.length; k++) {

            for (int i = 0; i < latinsqueares[k].length; i++) {
                for (int j = 0; j < latinsqueares[k][i].length; j++) {
                    System.out.print(latinsqueares[k][i][j] + " ");

                }
                System.out.println("\n");

            }

            System.out.println("\n\n");

        }

        
        int count=1;
        
        for(int i=0;i<latinsqueares[0].length;i++){
        
            for(int j=0;j<latinsqueares[0][i].length;j++){
            
                System.out.println(count++ +": "+ factors[0][i] +", "+factors[1][j]+", "+factors[2][latinsqueares[0][i][j]]
                +", "+factors[3][latinsqueares[1][i][j]]+", "+factors[4][latinsqueares[2][i][j]]+", "+factors[5][latinsqueares[3][i][j]]);
            
            }
        }
        
        
        
        
        
        
    }

    public static int[][][] generateLatinSquares(int length, int size) {

        int[][][] latinSquares = new int[length][size][size];

        for (int k = 1; k <= length; k++) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    latinSquares[k - 1][i - 1][j - 1] = (k * (i - 1) + (j - 1)) % size;
                }
            }

        }

        return latinSquares;

    }
}
