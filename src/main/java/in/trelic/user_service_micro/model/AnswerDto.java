package in.trelic.user_service_micro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AnswerDto {
    private int aId;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int rightAnswer;
}
