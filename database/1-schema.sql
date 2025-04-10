CREATE TABLE users
(
    id_user   SERIAL,
    email     VARCHAR(100) NOT NULL,
    password  VARCHAR(50)  NOT NULL,
    name      VARCHAR(100) NOT NULL,
    last_name VARCHAR(50)  NOT NULL,
    PRIMARY KEY (id_user),
    UNIQUE (email)
);

CREATE TABLE service_category
(
    id_service   SERIAL,
    service_name VARCHAR(50)  NOT NULL,
    src_photo    VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_service),
    UNIQUE (service_name)
);

CREATE TABLE photo
(
    id_photo  SERIAL,
    photo_src VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_photo)
);

CREATE TABLE worker
(
    id_worker   SERIAL,
    description VARCHAR(255),
    salaire     NUMERIC(15, 2) NOT NULL,
    id_user     INTEGER        NOT NULL,
    PRIMARY KEY (id_worker),
    FOREIGN KEY (id_user) REFERENCES users (id_user)
);

CREATE TABLE avis
(
    id_avis     SERIAL,
    star        INTEGER      NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_avis)
);

CREATE TABLE request_state
(
    id_request_state SERIAL,
    state            VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_request_state),
    UNIQUE (state)
);

CREATE TABLE work
(
    id_work_request  SERIAL,
    description      VARCHAR(255),
    date_work        DATE         NOT NULL,
    time_work        TIME         NOT NULL,
    addresse         VARCHAR(100) NOT NULL,
    id_request_state INTEGER      NOT NULL,
    id_worker        INTEGER      NOT NULL,
    id_client        INTEGER      NOT NULL,
    id_service       INTEGER      NOT NULL,
    PRIMARY KEY (id_work_request),
    FOREIGN KEY (id_request_state) REFERENCES request_state (id_request_state),
    FOREIGN KEY (id_worker) REFERENCES worker (id_worker),
    FOREIGN KEY (id_client) REFERENCES users (id_user),
    FOREIGN KEY (id_service) REFERENCES service_category (id_service)
);

CREATE TABLE request_photo
(
    id_work_request INTEGER,
    id_photo        INTEGER,
    PRIMARY KEY (id_work_request, id_photo),
    FOREIGN KEY (id_work_request) REFERENCES work (id_work_request),
    FOREIGN KEY (id_photo) REFERENCES photo (id_photo)
);

CREATE TABLE avis_user
(
    id_user INTEGER,
    id_avis INTEGER,
    PRIMARY KEY (id_user, id_avis),
    FOREIGN KEY (id_user) REFERENCES users (id_user),
    FOREIGN KEY (id_avis) REFERENCES avis (id_avis)
);
