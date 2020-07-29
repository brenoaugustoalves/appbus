package appbus.com.example.breno.appbus;

public class Cartaopassageiro {

    private int cartaonumero;
    private float creditocartao;


    public Cartaopassageiro() {

    }

        public Cartaopassageiro( int cartaonumero, float creditocartao) {
        this.cartaonumero = cartaonumero;
        this.creditocartao = creditocartao;

   }

        public int getCartaonumero() {
            return cartaonumero;

}
        public float getCreditocartao() {
            return creditocartao;
        }

}