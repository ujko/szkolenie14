package day7.wyjatki;

public class Wyjatek {

    public static void main(String[] args) {
        try {
            metoda(60);

        } catch (NaszWlasnyWyjatek e) {
            System.err.println("NaszWlasnyWyjatek");

            System.out.println(e.getMessage());

            e.printStackTrace();

        } catch (IllegalArgumentException e) {
            System.out.println("i ma byc wieksze od 0");

        } catch (Exception e) {
            System.out.println("inny blad");

        } finally {
            System.out.println("blok finalny");
        }
    }

    private static void metoda(int i) throws NaszWlasnyWyjatek {
        if (i < 0) {
            throw new IllegalArgumentException("i powinno byc wieksze od 0");
        }else if (i > 50){
            throw new NaszWlasnyWyjatek("i powinno byc mniejsze niz 50");
        }

        System.out.println(i + " jest ok");
    }
}
