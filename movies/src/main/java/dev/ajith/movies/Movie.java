package dev.ajith.movies;
import org.bson.types.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;
@Document(collection = "movies")
@Data
@AllArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
}
