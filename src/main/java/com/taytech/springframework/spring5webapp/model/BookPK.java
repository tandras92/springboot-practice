package com.taytech.springframework.spring5webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Embeddable
@Data
@NoArgsConstructor
public class BookPK implements Serializable {

    private static final long serialVersionUID = 5340546996459134482L;

    @GeneratedValue
    @Column(name = "book_id", nullable = false, length = 36)
    private UUID bookId;

    @Column(name = "record_create_ts", nullable = false)
    private LocalDateTime recordCreateTime;

    public BookPK(final UUID bookId, final LocalDateTime recordCreateTime) {
        this.bookId = bookId;
        this.recordCreateTime = recordCreateTime;
    }
}
