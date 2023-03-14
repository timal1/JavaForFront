package com.geekbrains.lesson6;

import java.util.ArrayList;
import java.util.List;

public class StoreNotebook {

    public static List<NoteBook> noteBookList = new ArrayList<>(List.of(new NoteBook[]{
            new NoteBook("2Гб", "500Гб", "Windows", "черный"),
            new NoteBook("4Гб", "1000Гб", "Linux", "белый"),
            new NoteBook("6Гб", "2000Гб", "Dos", "красный"),
            new NoteBook("8Гб", "25000Гб", "Windows", "серый"),
            new NoteBook("10Гб", "1500Гб", "Linux", "черный"),
            new NoteBook("2Гб", "1500Гб", "Windows", "черный"),
            new NoteBook("6Гб", "1500Гб", "Windows", "серый"),
            new NoteBook("8Гб", "2000Гб", "Windows", "черный"),
            new NoteBook("10Гб", "1500Гб", "Windows", "белый"),
            new NoteBook("4Гб", "500Гб", "Dos", "черный")
    }));
}
