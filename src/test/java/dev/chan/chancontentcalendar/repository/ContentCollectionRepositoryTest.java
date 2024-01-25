package dev.chan.chancontentcalendar.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.chan.chancontentcalendar.model.Content;
import dev.chan.chancontentcalendar.model.Status;
import dev.chan.chancontentcalendar.model.Type;

class ContentCollectionRepositoryTest {

    @Test
    void getContent() {
        var repository = new ContentCollectionRepository();
        List<Content> contentResult = repository.findAll();
        Assertions.assertEquals(List.of(new Content(
                1,
                "My First Blog Post",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "")
        ), contentResult);

    }
}