CREATE TABLE IF NOT EXISTS springboot.student
(
    id int(32) not null,
    name VARCHAR(32),
    address VARCHAR(32),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS springboot.Address
(
    id int(32) not null,
    street VARCHAR(32),
    city VARCHAR(32),
    state VARCHAR(32),
    country VARCHAR(32),
    PRIMARY KEY(id)
);