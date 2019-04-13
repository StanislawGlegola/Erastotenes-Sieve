public class ErastotenesSieve {
    public static void main(String[] args) {
        int numbersToCheck = 100;
        boolean[] erastotenes = new boolean[numbersToCheck];
        for (int i = 0; i < erastotenes.length; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.print("Is " + i + " a prime number?\t");
                System.out.println(erastotenes[i] = false);
                if (i == 2 || i == 3 || i == 5 || i == 7) {
                    System.out.print("Is " + i + " a prime number?\t");
                    System.out.println(erastotenes[i] = true);
                }
            } else {
                System.out.print("Is " + i + " a prime number?\t");
                System.out.println(erastotenes[i] = true);
            }
        }
    }
}
