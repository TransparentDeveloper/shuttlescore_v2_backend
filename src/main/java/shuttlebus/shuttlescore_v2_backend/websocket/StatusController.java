package shuttlebus.shuttlescore_v2_backend.websocket;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import shuttlebus.shuttlescore_v2_backend.websocket.domain.BadmintonStatus;
import shuttlebus.shuttlescore_v2_backend.websocket.domain.vos.BadmintonVO;

@Controller
@RequiredArgsConstructor
public class StatusController {
    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/badminton")
    public void playingBadminton(BadmintonStatus status){

        simpMessagingTemplate.convertAndSend("/topic"
                +"/badminton"
                +"/"+status.getChannelId()
                ,new BadmintonVO(
                        status.getScoreA(),
                        status.getScoreB(),
                        status.getTotalSet(),
                        status.getSetA(),
                        status.getSetB()
                )
        );
    }

}
