
public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan * bilangan;
    }
    public static void main(String[] args){
        // deklrasi bilangan
        Integer bilangan = 10;
        // object integer dipaksa untuk diubah menjadi primitive int
        int hasil = kuadrat(bilangan);
        System.out.println("Hasil kuadrat: " + hasil);
    }
}
