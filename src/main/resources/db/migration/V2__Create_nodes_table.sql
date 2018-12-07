CREATE TABLE IF NOT EXISTS nodes(
    id  bigint PRIMARY KEY,
    name varchar(50),
    hive bigint,
    destination Geometry(point, 26910)
);