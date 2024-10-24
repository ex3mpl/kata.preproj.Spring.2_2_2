package web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Component
public class Car {

    private Long id;
    private String model;
    private int series;

    //getters and setters created by @Data lombok annotation, AllArgs and NoArgs created constructors
}
