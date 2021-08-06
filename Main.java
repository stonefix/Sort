import java.util.List;

public class Main {
    public static void main(String[] args){
        String[] data = {"K1\\SK1",
                    "K1\\SK2",
                    "K1\\SK1\\SSK1",
                    "K1\\SK1\\SSK2",
                    "K2",
                    "K2\\SK1\\SSK1",
                    "K2\\SK1\\SSK2"};

        Sorter sorter = new Sorter();
        List<String> result = sorter.sortDesc(data);
        System.out.println(result.toString());
    }
}
