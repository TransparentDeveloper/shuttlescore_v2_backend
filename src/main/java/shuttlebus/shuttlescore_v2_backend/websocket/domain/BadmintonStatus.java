package shuttlebus.shuttlescore_v2_backend.websocket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class BadmintonStatus extends CommonStatus{
    /**
     * totalSet: 전체 세트 수
     * setA: A팀이 이긴 세트 수
     * setB: B팀이 이긴 세트 수
     */
    private String totalSet;
    private String setA;
    private String setB;

    public BadmintonStatus(
            @JsonProperty("scoreA")String scoreA,
            @JsonProperty("scoreB")String scoreB,
            @JsonProperty("seed")String seed,
            @JsonProperty("totalSet")String totalSet,
            @JsonProperty("setA")String setA,
            @JsonProperty("setB")String setB)
    {
        super(scoreA,scoreB,seed);
        this.totalSet = totalSet;
        this.setA = setA;
        this.setB = setB;
    }
}
