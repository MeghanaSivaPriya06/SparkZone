package socialmedia.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Services.MessageService;
import lombok.RequiredArgsConstructor;
import socialmedia.model.Message;


@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService = new MessageService();

    @GetMapping("/{receiverId}")
    public ResponseEntity<List<Message>> getMessages(@PathVariable Long receiverId) {
        return ResponseEntity.ok(messageService.getMessagesForUser(receiverId));
    }

    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(@RequestBody Message message) {
        return ResponseEntity.ok(messageService.sendMessage(message));
    }
}