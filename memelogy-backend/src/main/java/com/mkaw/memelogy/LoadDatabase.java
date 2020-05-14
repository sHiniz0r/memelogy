package com.mkaw.memelogy;

import com.mkaw.memelogy.comment.Comment;
import com.mkaw.memelogy.comment.CommentRepository;
import com.mkaw.memelogy.meme.MemeRepository;
import com.mkaw.memelogy.post.Post;
import com.mkaw.memelogy.post.PostRepository;
import com.mkaw.memelogy.tag.Tag;
import com.mkaw.memelogy.tag.TagRepository;
import com.mkaw.memelogy.user.User;
import com.mkaw.memelogy.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository, MemeRepository memeRepository,
                                   TagRepository tagRepository) {
        return args -> {
            User krzywans = new User("Krzywans", "Krzywans@aws.com", "akf9kso", new byte[]{2, 2});
            userRepository.save(krzywans);
            User siedlecky = new User("Siedlecky", "siedl@ptc.com", "akf9kssfjasf9o", new byte[]{3, 1});
            userRepository.save(siedlecky);
            userRepository.save(new User("Jankowsky", "artur@pivotal.com", "2142351akf9kso", new byte[]{5, 9}));

            Post post = new Post(krzywans, null, 0L, 0L);
            post.getTags().add(new Tag("Awesome"));
            postRepository.save(post);
            Post anotherPost = new Post(siedlecky, null, 0L, 0L);
            postRepository.save(anotherPost);
            postRepository.save(new Post(siedlecky, null, 0L, 0L));

            commentRepository.save(new Comment(krzywans, post, "Awesome stuff"));
            commentRepository.save(new Comment(siedlecky, anotherPost, "Oh, really?"));
        };
    }
}
