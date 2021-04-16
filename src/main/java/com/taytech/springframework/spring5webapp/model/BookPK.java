package com.taytech.springframework.spring5webapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.sql.Timestamp;
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
    private Timestamp recordCreateTime;

    public BookPK(final UUID bookId, final Timestamp recordCreateTime) {
        this.bookId = bookId;
        this.recordCreateTime = recordCreateTime;
    }

    @Override
    public String toString() {
        return "BookPK{" +
                "bookId=" + bookId +
                ", recordCreateTime=" + recordCreateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookPK bookPK = (BookPK) o;

        if (!bookId.equals(bookPK.bookId)) return false;
        return recordCreateTime.equals(bookPK.recordCreateTime);
    }

    @Override
    public int hashCode() {
        int result = bookId.hashCode();
        result = 31 * result + recordCreateTime.hashCode();
        return result;
    }
}
