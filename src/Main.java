import java.util.*;

public class Main {
    public static String[] strings;
    public static String[] result = new String[100];
    public static int iResult = 0;
    public static String findString(int iNeed, int cnt){
        iResult = 0;
        for (int j = 0; j < strings[iNeed].length()-cnt+1; j++) {
            String current = strings[iNeed].substring(j,j+cnt);
            boolean isEverywere = true;
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].indexOf(current) == -1) {
                    isEverywere = false;
                    break;
                };
            };
            if (isEverywere)  {
                result[iResult++] = current;
            };

        };
        if (iResult==0) return null;
        String min =result[0] ;
        for (int i = 0; i < iResult; i++) {
            if (result[i].compareTo(min)<0) min = result[i];
        }
        return min;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = sc.nextLine().trim().split(" ");
//        strings = "d234fqwere qwer!234 s234dfqwerdg gqwe234rh f234qwefggs werqwer32234rwe".split(" ");
        int iMin = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()< strings[iMin].length()) iMin=i;
        };
        String result;
        for (int i = strings[iMin].length(); i > 0; i--) {
            result = findString(iMin,i);
            if (result!=null){
                System.out.println(result);
                break;
            }

        }

    }
}