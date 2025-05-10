package Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import socialmedia.Repository.MessageRepository;
import socialmedia.model.Message;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository = null;

    public List<Message> getMessagesForUser(Long receiverId) {
        return messageRepository.findByReceiverId(receiverId);
    }

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }
}