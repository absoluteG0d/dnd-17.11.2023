create table clazz
(
    id              bigint  not null primary key,
    hit_die         integer not null,
    primary_ability varchar(255),
    saves           varchar(255),
    name            varchar(255),
    description     varchar


);

CREATE SEQUENCE clazz_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 1000000
    CACHE 1;