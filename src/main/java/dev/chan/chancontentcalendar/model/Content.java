package dev.chan.chancontentcalendar.model;

import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;

public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Content content = (Content) o;
        return id.equals(content.id) && title.equals(content.title) && desc.equals(content.desc) && status == content.status
                && contentType == content.contentType && url.equals(content.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, desc, status, contentType, url);
    }
}
