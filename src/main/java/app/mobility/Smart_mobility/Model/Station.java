package app.mobility.Smart_mobility.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Getter
@Setter
@Entity
@Table(name = "station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "LigneID")
    private String ligneID;
    @Column(name = "StationID")
    private String stationID;
    @Column(name = "geom", nullable = false,columnDefinition = "geometry(Point, 32632)")
    private Point geometry;

}