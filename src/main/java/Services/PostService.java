package Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import lombok.*;

import socialmedia.model.Post;
import socialmedia.Repository.postRepository;
@Service
@RequiredArgsConstructor
public class PostService {
    private final postRepository postRepository = null;

    public Post createPost(Post post) {
        post.setTimestamp(LocalDateTime.now());
        return postRepository.save(post);
    }

    public List<Post> getPostsByUser(Long userId) {
        return postRepository.findByUserId(userId);
    }
}