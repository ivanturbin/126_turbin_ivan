import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        int a;
        ArrayList<String> aray1 = new ArrayList<>();
        aray1.add("Речевые практики");
        aray1.add("Информатика");
        aray1.add("Дискретная математика");
        aray1.add("Иностранный язык");
        aray1.add("Иностранный язык");
        aray1.add("Практикум по курсу иностранного языка");
        aray1.add("Информатика");

        ArrayList<Integer> aray2 = new ArrayList<>();
        aray2.add(120);
        aray2.add(45);
        aray2.add(60);
        aray2.add(220);
        aray2.add(25);
        aray2.add(72);
        aray2.add(120);
        TimeController time = new TimeController();
        String result;
        result =  time.getActionWithMaxTime(aray1,aray2);
        System.out.println("Название занятия с максимальным суммарным временем: "+result);
    }
}

