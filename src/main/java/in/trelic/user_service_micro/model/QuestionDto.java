package in.trelic.user_service_micro.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {
    private int questionId;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
