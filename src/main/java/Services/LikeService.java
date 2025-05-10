package Services;

import java.util.List;

import org.springframework.stereotype.Service;

import socialmedia.Repository.LikeRepository;
import socialmedia.model.Like;
import socialmedia.model.Notification;
import lombok.*;

@Service
@RequiredArgsConstructor
public class LikeService {
    private final LikeRepository likeRepository = null;
    private final Notification notificationService = null;

    public Like likePost(Like like) {
        notificationService.sendNotification(like.getUserId(), "Liked a post!");
        return likeRepository.save(like);
    }

    public List<Like> getLikesByPost(Long postId) {
        return likeRepository.findByPostId(postId);
    }
}