create table weapon
(
    id         bigint  not null
        primary key,
    cost       integer not null,
    damage     integer not null,
    weight     integer not null,
    name       varchar(255),
    properties varchar(255),
    notes      varchar(255)
);

CREATE SEQUENCE weapon_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 1000000
    CACHE 1;
