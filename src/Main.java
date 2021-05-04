import MernisReference.HLNKPSPublicSoap;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean result;
        HLNKPSPublicSoap client = new HLNKPSPublicSoap();
        result = client.TCKimlikNoDogrula(Long.parseLong("20110008900"), "Emre", "Solmaz", 1989);
        System.out.println(result);

    }
}
//TC Kimlik No doğru girildiğinde true döner.
//Classların ilk 3 harfini eklenti random atıyor. Önemli değil.
