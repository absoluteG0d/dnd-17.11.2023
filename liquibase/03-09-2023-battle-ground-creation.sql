create table battle_ground
(
    id           bigint not null
        primary key,
    length integer not null,
    width integer not null,
    round_amount bigint not null,
    current_mover bigint not null

);