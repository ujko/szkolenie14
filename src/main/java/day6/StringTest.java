package day6;

public class StringTest {
    public static void main(String[] args) {
        StringTest st= new StringTest();
        System.out.println(st.test2());



    }
    private void test1 (){
        String model = "%s ma %10d %10s %.2f";
        String a = "Ala";
        int i = 6;
//        System.out.println(a + " Ma " + i + " lat");
        System.out.printf(model, a, i,i<5?"lata":"lat",Math.PI);
    }
    private String test2(){
        String model = "%s ma %10d %10s %.2f";
        String a = "Ala";
        int i = 6;
        String result = String.format(model, a, i,i<5?"lata":"lat",Math.PI);
        return result;
    }
}
