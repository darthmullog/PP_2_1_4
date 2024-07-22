package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TimerBean {
    @Qualifier("TimerBean")
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
