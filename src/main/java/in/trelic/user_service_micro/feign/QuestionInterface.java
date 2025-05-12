package in.trelic.user_service_micro.feign;

import in.trelic.user_service_micro.model.QuestionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("SPRING-MONOLITH-ARCH")
public interface QuestionInterface {
    @GetMapping("questions")
    ResponseEntity<List<QuestionDto>> getQuestionsByCategory(@RequestParam String category);
}
