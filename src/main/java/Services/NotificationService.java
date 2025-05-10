package Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import socialmedia.Repository.NotificationRepository;
import socialmedia.model.Notification;
import lombok.*;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository = null;

    public void sendNotification(Long userId, String message) {
        Notification notification = new Notification(null, userId, message, LocalDateTime.now());
        notificationRepository.save(notification);
    }

    public List<Notification> getUserNotifications(Long userId) {
        return notificationRepository.findByUserId(userId);
    }
}