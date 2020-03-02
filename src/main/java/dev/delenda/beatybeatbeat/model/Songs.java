package dev.delenda.beatybeatbeat.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Songs {

    private String artistName;
    private String nameOfSong;
    private LocalDate releaseDate;
    private String genre;
    private int songDuration = 0;

}
