package Services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import socialmedia.Repository.CommentRepository;
import socialmedia.model.Comment;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository = null;

    public List<Comment> getCommentsByPost(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }
}