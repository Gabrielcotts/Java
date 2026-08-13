package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

public class Campeonato {
    public static void main(String[] args) {
        String[] times = {
                "Brasil",
                "Argentina",
                "França",
                "Alemanha",
                "Espanha"
        };

//        for (String time1 : times) {
//            for (String time2 : times) {
//                if (!time1.equals(time2)) {
//                    System.out.println(time1 + " x " + time2);
//                }
//            }
//        }
        
        for (int i = 0; i < times.length; i++) {

            for (int j = i + 1; j < times.length; j++) {

                System.out.println(times[i] + " x " + times[j]);
            }
        }
    }
}
