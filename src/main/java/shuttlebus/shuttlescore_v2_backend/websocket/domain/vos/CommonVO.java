package shuttlebus.shuttlescore_v2_backend.websocket.domain.vos;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public class CommonVO {
    private String scoreA;
    private String scoreB;

    @JsonCreator
    public CommonVO(String scoreA, String scoreB){
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }
}
