package technicalblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<Post>  posts = new ArrayList<>();
        Post post1= new Post();
        post1.setTitle("p1 title");
        post1.setDate(new Date());
        post1.setBody("post1 body");

        Post post2= new Post();
        post2.setTitle("p2 title");
        post2.setDate(new Date());
        post2.setBody("post2 body");

        posts.add(post1);
        posts.add(post2);
        model.addAttribute("posts",posts);
        return "index";


    }

}
