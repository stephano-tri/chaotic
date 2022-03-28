import 완주하지_못한_선수.Solution;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> participant = Arrays.asList("leo", "kiki", "eden");
        List<String> completion = Arrays.asList("eden" , "kiki");

        String chosenOne = sol.solution(participant.toArray(new String[0]) , completion.toArray(new String[0]));

        System.out.println(chosenOne);
    }

}
