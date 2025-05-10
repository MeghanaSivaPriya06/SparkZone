package socialmedia.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Services.PostService;
import lombok.RequiredArgsConstructor;
import socialmedia.model.Post;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class postController {
    private final PostService postService = new PostService();

    @PostMapping("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return ResponseEntity.ok(postService.createPost(post));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Post>> getPostsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(postService.getPostsByUser(userId));
    }
}