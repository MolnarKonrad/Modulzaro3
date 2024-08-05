package vonal;

import java.util.*;

public class MindenTudoGep {
    
    private List<String> zenek;

    public MindenTudoGep() {
        zenek = new ArrayList<>(Arrays.asList(
                "Happy - Pharrell Williams",
                "Shape of You - Ed Sheeran",
                "Blinding Lights - The Weeknd",
                "Despacito - Luis Fonsi",
                "Dance Monkey - Tones and I"
        ));
    }

    public String ErvenyesLottoSzelveny() {
        Random random = new Random();
        Set<Integer> lottoSzamok = new TreeSet<>();
        while (lottoSzamok.size() < 5) {
            lottoSzamok.add(random.nextInt(90) + 1);
        }
        return lottoSzamok.toString().replaceAll("[\\[\\]]", "");
    }

    public String ErvenyesTotoSzelveny() {
        Random random = new Random();
        StringBuilder totoEredmenyek = new StringBuilder();
        char[] lehetosegek = {'1', '2', 'X'};
        for (int i = 1; i <= 14; i++) {
            char eredmeny = lehetosegek[random.nextInt(lehetosegek.length)];
            totoEredmenyek.append(i).append(": ").append(eredmeny).append(" ");
        }
        return totoEredmenyek.toString().trim();
    }

    public String ZeneiAjanlas(String hangulat) {
        Random random = new Random();
        int index = random.nextInt(zenek.size());
        return zenek.get(index);
    }

    public static void main(String[] args) {
        MindenTudoGep gep = new MindenTudoGep();

        System.out.println("Ötös lottó szelvény: " + gep.ErvenyesLottoSzelveny());

        System.out.println("Totó szelvény: " + gep.ErvenyesTotoSzelveny());

        System.out.println("Zenei ajánlás: " + gep.ZeneiAjanlas("boldog"));        
    }
}
