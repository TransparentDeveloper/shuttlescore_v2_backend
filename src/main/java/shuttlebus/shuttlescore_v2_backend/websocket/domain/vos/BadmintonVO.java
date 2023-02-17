package shuttlebus.shuttlescore_v2_backend.websocket.domain.vos;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public class BadmintonVO extends CommonVO {
    private String totalSet;
    private String setA;
    private String setB;

    @JsonCreator
    public BadmintonVO(String scoreA,
                       String scoreB,
                       String totalSet,
                       String setA,
                       String setB)
    {
        super(scoreA,scoreB);
        this.totalSet = totalSet;
        this.setA = setA;
        this.setB = setB;
    }
}
