package in.trelic.user_service_micro.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuestionDto implements Serializable {
    private int qId;
    private String question;
    private AnswerDto answer;
}
