package com.example.demo1.entity.character.creation;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access= AccessLevel.PRIVATE)
@Builder
@Embeddable
public class HitPoints {
    @Column(name="max_hit_points")
    private int maxHitPoints;
    @Column(name="current_hit_points")
    private int currentHitPoints;
    @Column(name="temporary_hit_points")
    private int temporaryHitPoints;
}
