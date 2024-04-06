package abm.blog.javablog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlog extends JpaRepository<Blog, Integer> {
    
}
