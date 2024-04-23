import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        Map<String,String> dawa = new HashMap<>();

        while (true) {
            System.out.println("podaj imie partnerki osoby");
            String jedne = sc.nextLine();
            if (jedne.equals("-")){
                break;
            }
            System.out.println("podaj imie partnera osoby");
            String daw = sc.nextLine();
            map.put(jedne,daw);
            dawa.put(daw,jedne);
        }

        while (true){
            System.out.println("podaj imie osoby której chcesz znaleść miłość");
            String imie = sc.nextLine();
            if (imie.equals("-")){
                break;
            }
            if (map.containsKey(imie)) {
                System.out.println(" pratner dla " + imie + " to " + map.get(imie));
            }else if (dawa.containsKey(imie)) {
                System.out.println("partner dla " + imie + " to " + dawa.get(imie));
            }else {
                System.out.println("Nie ma partnera dla " +imie);
            }
        }
    }
}