package abm.blog.javablog;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired  // implements all dependency
    private IBlog repo; // interface repository (repository pattern)

    @GetMapping("/all")
    public Collection<Blog> viewAll(){
        return repo.findAll();
    }

    @PostMapping("/save")
    public String saveBlog(@RequestBody Blog p) {
        repo.save(p);
        return "Blog Saved";
    }
    
}
