public class Televizor {

    int jacinaTona = 0;
    boolean ukljucen = false;

    public Televizor() {
    }

    public Televizor(int jacinaTona, boolean ukljucen) {
        if (jacinaTona <= 20)
            this.jacinaTona = jacinaTona;
        this.ukljucen = ukljucen;

    }

    public void pojacajTon() {
        if (this.jacinaTona < 20)
            this.jacinaTona = jacinaTona + 1;
    }

    public void smanjiTon() {
        jacinaTona = jacinaTona - 1;
    }

    public void ukljuci() {
        ukljucen = true;
    }

    public void iskljuci() {
        ukljucen = false;
    }

    public boolean daLiJeUkljucen() {
        return ukljucen;
    }

    public int vratiJacinuTona() {
        return jacinaTona;
    }

    public void tvOpis() {
        System.out.println("Jacina tona je:" + jacinaTona);
        System.out.println("Televizor je ukljucen:" + ukljucen);
    }

}
