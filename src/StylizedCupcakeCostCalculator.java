import java.util.Scanner;

public class StylizedCupcakeCostCalculator {
    public static void main(String[] args){
        int t = 0, d = 0, D = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int Cupcake = getCupcake(t, d, D, k, input);
        String CupcakeCost = Cupcake + " Dollars";
        int CupcakeStringLength = CupcakeCost.length();
        String Asterisk = new String(new char[CupcakeStringLength]).replace('\0', '*');
        System.out.println(Asterisk);
        System.out.println(CupcakeCost);
        System.out.println(Asterisk);
    }
        static int getCupcake(int t, int d, int D, int k, String input) {
        String[] wordsList = input.split("\\s+");
        int wordsListLength = wordsList.length;
        for ( int i = 0; i < wordsListLength; i++) {
            StringBuilder build = new StringBuilder();
            for (int j = 2; j < wordsList[i].length(); j++) {
                build.append(wordsList[i].charAt(j));
            }
            int num = Integer.parseInt(build.toString());
            char firstChar = wordsList[i].charAt(0);
            String var = Character.toString(firstChar);
            switch (var) {
                case "t":
                    t = num;
                    break;
                case "k":
                    k = num;
                    break;
                case "d":
                    d = num;
                    break;
                case "D":
                    D = num;
                    break;
            }
        }
        return calculateCupcake(t, d, D, k);
    }
        static int calculateCupcake(int t, int d, int D, int k) {
        int cost;
        if(t > k){
            cost = t*D;
        }
        else {
            cost = t*d;
        }
        return cost;
    }
}