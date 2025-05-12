package in.trelic.user_service_micro.service;

import in.trelic.user_service_micro.feign.QuestionInterface;
import in.trelic.user_service_micro.model.QuestionDto;
import in.trelic.user_service_micro.model.User;
import in.trelic.user_service_micro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private QuestionInterface questionInterface;

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    public List<QuestionDto> getQuizForUserId(String userUuid) {
        User user = this.userRepository.findById(UUID.fromString(userUuid)).orElseGet(null);

        List<QuestionDto> questions = questionInterface.getQuestionsByCategory(user.getCategoryEnum().toString()).getBody();

        return new ArrayList<>(questions);
    }
}
