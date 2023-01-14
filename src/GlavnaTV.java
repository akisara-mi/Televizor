public class GlavnaTV {

    public static void main(String[] args) {

        Televizor t = new Televizor();
        t.pojacajTon();
        t.tvOpis();
        boolean dalijeUkljucen;
        dalijeUkljucen = t.daLiJeUkljucen();
        System.out.println("Televizor je ukljucen:" + dalijeUkljucen);
    }
}
