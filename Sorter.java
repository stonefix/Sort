import java.util.*;

public class Sorter {
    public List<String> sortDesc(String[] data) {
        Set<String> unique = new HashSet<>(Arrays.asList(data));
        addParents(unique, data);
        List<String> resultList = new ArrayList<>(unique);
        resultList.sort((o1, o2) -> {
            int res = 0;
            char[] first = o1.toCharArray(), second = o2.toCharArray();
            int i = 0, j = 0;
            while ((i < first.length) && (j < second.length)) {
                char ch1 = first[i++];
                char ch2 = second[j++];
                if (ch1 != ch2) {
                    return ch1 > ch2 ? -1 : 1;
                }
            }

            if ((i < first.length) && (res == 0)) {
                res = 1;
            } else if ((j < second.length) && (res == 0)) {
                res = -1;
            }

            return res;
        });
        return resultList;
    }


    private void addParents(Set<String> result, String[] data) {
        for (String str : data){
            int index = str.lastIndexOf('\\');
            while (index != -1) {
                String parent = str.substring(0, index);
                result.add(str.substring(0, index));
                index = parent.lastIndexOf('\\');
            }
        }
    }

}
