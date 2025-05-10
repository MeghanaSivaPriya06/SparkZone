package socialmedia.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Services.LikeService;
import socialmedia.model.Like;
import lombok.*;


@RestController
@RequestMapping("/likes")
@RequiredArgsConstructor
public class LikeController {
    private final LikeService likeService = new LikeService();

    @PostMapping("/like")
    public ResponseEntity<Like> likePost(@RequestBody Like like) {
        return ResponseEntity.ok(likeService.likePost(like));
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<List<Like>> getLikesByPost(@PathVariable Long postId) {
        return ResponseEntity.ok(likeService.getLikesByPost(postId));
    }
}