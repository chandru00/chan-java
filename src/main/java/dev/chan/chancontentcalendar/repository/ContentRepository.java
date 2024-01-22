package dev.chan.chancontentcalendar.repository;

import java.util.List;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import dev.chan.chancontentcalendar.model.Content;
import dev.chan.chancontentcalendar.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content where status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);

}
