package ifma.lista02;

public class ExercicioMatriz {
    public static void main(String[] args) {
        q01();
        System.out.println("-------");
        q02();
        System.out.println("-------");
        q03();
        System.out.println("-------");
        q04();
        System.out.println("-------");
        q05();
        System.out.println("-------");
        q06();
        System.out.println("-------");
        q07();
        System.out.println("-------");
        q08();
        System.out.println("-------");
        q09();
        System.out.println("-------");
        q10();

    }

    public static int[][] matriz() {
        int[][] matriz = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        return matriz;
    }

    public static void q01() {
       int[][] mat = matriz();
       for (int i = 0; i < mat.length; i++){
           for (int j = 0; j < mat.length; j++) {
               if (i == j) {
                   mat[i][j] = 0;
               }
               System.out.print(mat[i][j] + "  ");
           }
           System.out.println();
       }
    }

    public static void q02() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                if (i + j == 2) {
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void q03() {
        int[][] mat = matriz();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                if (i + j == 2) {
                    System.out.print(" " + mat[i][j]);
                }
            }
        }
        System.out.println();
    }

    public static void q04() {
        int[][] mat = matriz();
        int soma = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++) {
                if (i + j == 2) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal secundaria: " + soma);
    }

    public static void q05() {
        int[][] mat = matriz();
        int tamanho = mat.length;

        System.out.print("Elementos da diagonal secundária e abaixo: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j >= tamanho - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q06() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j >= tamanho - 1) {
                    soma += mat[i][j];
                    contador++;
                }
            }
        }

        double media = (double) soma / contador;

        System.out.printf("Média dos elementos da diagonal secundária e abaixo: %.1f%n", media);
    }

    public static void q07() {
        int[][] mat = matriz();
        int tamanho = mat.length;

        System.out.print("Elementos abaixo da diagonal secundária: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j > tamanho - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q08() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        int maior = 0;

        boolean primeiroValor = true;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j > tamanho - 1) {
                    if (primeiroValor) {
                        maior = mat[i][j];
                        primeiroValor = false;
                    } else if (mat[i][j] > maior) {
                        maior = mat[i][j];
                    }
                }
            }
        }

        System.out.println("Maior valor abaixo da diagonal secundária: " + maior);
    }

    public static void q09() {
        int[][] mat = matriz();
        int tamanho = mat.length;

        System.out.print("Elementos da diagonal secundária e acima: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j <= tamanho - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void q10() {
        int[][] mat = matriz();
        int tamanho = mat.length;
        int menor = 0;

        boolean primeiroValor = true;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j <= tamanho - 1) {
                    if (primeiroValor) {
                        menor = mat[i][j];
                        primeiroValor = false;
                    } else if (mat[i][j] < menor) {
                        menor = mat[i][j];
                    }
                }
            }
        }

        System.out.println("Menor valor da diagonal secundária e acima: " + menor);
    }



}
