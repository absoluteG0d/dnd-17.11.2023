create table cell
(
    id                    bigint not null primary key,
    terrain               varchar(255),
    battle_participant_id bigint,
    battle_ground_id      bigint,
    constraint cell_battle_ground_fk FOREIGN KEY (battle_ground_id) REFERENCES battle_ground (id),
    constraint cell_battle_participant_fk FOREIGN KEY (battle_participant_id) REFERENCES battle_participant (id)
);