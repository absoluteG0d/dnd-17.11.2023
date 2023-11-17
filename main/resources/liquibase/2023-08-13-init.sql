create table race
(
    id           bigint not null
        primary key,
    racial_trait varchar(255)

);

CREATE SEQUENCE race_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 1000000
    CACHE 1;

create table character
(
    id                 bigint  not null
        primary key,
    armor_class        integer not null,
    death_saves        integer not null,
    hit_dice           integer not null,
    initiative         integer not null,
    inspiration        integer not null,
    proficiency_bonus  integer not null,
    speed              integer not null,
    bonds              varchar(255),
    flaws              varchar(255),
    ideals             varchar(255),
    personality_traits varchar(255),
    character_name varchar(255),
    player_name varchar(255),
    lvl integer  not null,
    clazz_id bigint,  FOREIGN KEY (clazz_id) REFERENCES clazz (id),
    race_id bigint,  FOREIGN KEY (race_id) REFERENCES race (id),
    background varchar(255),
    experience_points integer not null
);

CREATE SEQUENCE character_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 1000000
    CACHE 1;


create table spell
(
    id           bigint not null
        primary key,
    area         integer,
    casting_time_unit smallint,
    casting_time integer,
    duration_time_unit smallint,
    duration     integer,
    level        integer,
    range        integer,
    attack       varchar(255),
    components   varchar(255),
    damage       varchar(255),
    description  varchar(255),
    effect       varchar(255),
    save         varchar(255),
    school       varchar(255)
);

CREATE SEQUENCE spell_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 1000000
    CACHE 1;





