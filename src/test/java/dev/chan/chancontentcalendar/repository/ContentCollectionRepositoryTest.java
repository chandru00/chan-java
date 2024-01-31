package dev.chan.chancontentcalendar.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.chan.chancontentcalendar.model.Content;
import dev.chan.chancontentcalendar.model.Status;
import dev.chan.chancontentcalendar.model.Type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContentCollectionRepositoryTest {

    @Test
    void getContent() {
        var repository = new ContentCollectionRepository();
        List<Content> contentResult = repository.findAll();
        assertEquals(List.of(new Content(
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
    @Test
    void testFindById() {
        var repository = new ContentCollectionRepository();
        Content content1 = new Content(22,
                                     "My 22 Blog Post",
                                     "My 22 blog post",
                                     Status.IDEA,
                                     Type.ARTICLE,
                                     LocalDateTime.now(),
                                     null,
                                     "");
        Content content2 = new Content(23,
                                       "My 23 Second Blog Post",
                                       "My 23 blog post",
                                       Status.IDEA,
                                       Type.ARTICLE,
                                       LocalDateTime.now(),
                                       null,
                                       "");

        repository.save(content1);
        repository.save(content2);

        Optional<Content> foundContent = repository.findById(22);
        assertTrue(foundContent.isPresent());
        assertEquals(content1, foundContent.get());
        Optional<Content> notFoundContent = repository.findById(999);
        assertFalse(notFoundContent.isPresent());
    }

}