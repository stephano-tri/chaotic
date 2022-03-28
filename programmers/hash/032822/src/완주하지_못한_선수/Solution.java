package 완주하지_못한_선수;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String , Long> participantMap = Arrays.stream(participant)
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println(participantMap);

        for(String name : completion){
            Long uqVal = participantMap.get(name) - 1L;
            if(uqVal == 0L) participantMap.remove(name);
            else { participantMap.put(name,uqVal); }
        }

        return participantMap.keySet().iterator().next();
    }
}
