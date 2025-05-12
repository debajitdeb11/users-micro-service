package in.trelic.user_service_micro.service;

import in.trelic.user_service_micro.model.QuestionDto;
import in.trelic.user_service_micro.model.User;
import in.trelic.user_service_micro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    public List<QuestionDto> getQuizForUserId(String userUuid) {
        User user = this.userRepository.findById(UUID.fromString(userUuid)).orElseGet(null);

//        HttpRequest httpRequest = httpClient.

    }
}
