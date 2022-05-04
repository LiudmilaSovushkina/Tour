package by.tr.academy.tour;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> guides = new ArrayList<>();

        guides.add("Иванов И.И.");
        guides.add("Петров П.П.");
        guides.add("Сидоров С.С.");

        List<String> languages = new ArrayList<>();

        languages.add("english");
        languages.add("russian");


        WalkingTour oldKazimierz = new WalkingTour("Старый Казимеж",
                "Старая синагога - Фабрика Шиндлера - Площадь героев гетта"
                , 50, "12.06.2022",
                "Краков-Казимеж", "5 km", "4 часа");

        View walkingTour1 = new View();

        String walkingTourStr = walkingTour1.print(oldKazimierz);
        System.out.println(walkingTourStr);


        oldKazimierz.selectLanguage(languages, languages.get(1));
        oldKazimierz.selectGuide(guides, guides.get(0));
    }
}
