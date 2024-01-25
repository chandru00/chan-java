package dev.chan.chancontentcalendar.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import dev.chan.chancontentcalendar.model.Content;
import dev.chan.chancontentcalendar.model.Status;
import dev.chan.chancontentcalendar.model.Type;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
        Content c = new Content(1,
                                "My First Blog Post",
                                "My first blog post",
                                Status.IDEA,
                                Type.ARTICLE,
                                LocalDateTime.now(),
                                null,
                                "");
        contentList.add(c);

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content){
        contentList.removeIf(c-> c.id().equals((content.id())));
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c-> c.id().equals(id));
    }

}
