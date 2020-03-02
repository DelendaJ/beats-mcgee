package dev.delenda.beatybeatbeat.model;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Songs {

    private UUID id;
    private String artistName;
    private String songName;
    private String albumName;
    private LocalDate releaseDate;
    private String genre;
    private int songDuration = 0;

}
