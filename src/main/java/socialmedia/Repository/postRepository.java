package socialmedia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import socialmedia.model.Post;

@Repository
public interface postRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
}