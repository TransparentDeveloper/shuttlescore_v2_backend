package shuttlebus.shuttlescore_v2_backend.websocket.domain;
import lombok.Getter;
import java.util.Objects;

@Getter
public class CommonStatus {
    /**
     * scoreA: A팀 점수
     * scoreB: B팀 점수
     * channelId: (Counter_Device) 와 (Monitor_Device)의 채널 식별자
     */
    private String scoreA;
    private String scoreB;
    private int channelId;
    public CommonStatus(String scoreA,
                        String scoreB,
                        String seed){
        this.scoreA = scoreA;
        this.scoreB = scoreB;

        /*
        웹소켓 테스트용 channelId : 1234
        추후에 client에서 전달된 seed 값으로 channelId 변경!
        */
        this.channelId = 1234;
                //= createChannelId(seed);
    }

    // channelId 생성 (Counter device와 Monitor device의 소통 채널을 숨긴다.)
    public int createChannelId(String matchIdSeed) {
        return Objects.hash(matchIdSeed);
    }
}
