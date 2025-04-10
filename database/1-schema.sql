CREATE TABLE user_
(
    id_user   COUNTER,
    email     VARCHAR(100) NOT NULL,
    password  VARCHAR(50)  NOT NULL,
    name      VARCHAR(100) NOT NULL,
    last_name VARCHAR(50)  NOT NULL,
    PRIMARY KEY (id_user),
    UNIQUE (email)
);

CREATE TABLE service_category
(
    id_service   COUNTER,
    service_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_service),
    UNIQUE (service_name)
);

CREATE TABLE photo
(
    id_photo  COUNTER,
    photo_src VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_photo)
);

CREATE TABLE worker
(
    id_worker   COUNTER,
    description VARCHAR(255),
    salaire     DECIMAL(15, 2) NOT NULL,
    id_user     INT            NOT NULL,
    PRIMARY KEY (id_worker),
    FOREIGN KEY (id_user) REFERENCES user_ (id_user)
);

CREATE TABLE avis
(
    id_avis     COUNTER,
    star        INT          NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_avis)
);

CREATE TABLE request_state
(
    id_request_state COUNTER,
    state            VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_request_state),
    UNIQUE (state)
);

CREATE TABLE services
(
    id_service_request COUNTER,
    description        VARCHAR(255),
    date_              DATE         NOT NULL,
    time_              TIME         NOT NULL,
    addresse           VARCHAR(100) NOT NULL,
    id_request_state   INT          NOT NULL,
    id_worker          INT          NOT NULL,
    id_client          INT          NOT NULL,
    id_service         INT          NOT NULL,
    PRIMARY KEY (id_service_request),
    FOREIGN KEY (id_request_state) REFERENCES request_state (id_request_state),
    FOREIGN KEY (id_worker) REFERENCES worker (id_worker),
    FOREIGN KEY (id_client) REFERENCES user_ (id_user),
    FOREIGN KEY (id_service) REFERENCES service_category (id_service)
);

CREATE TABLE request_photo
(
    id_service_request INT,
    id_photo           INT,
    PRIMARY KEY (id_service_request, id_photo),
    FOREIGN KEY (id_service_request) REFERENCES services (id_service_request),
    FOREIGN KEY (id_photo) REFERENCES photo (id_photo)
);

CREATE TABLE avis_user
(
    id_user INT,
    id_avis INT,
    PRIMARY KEY (id_user, id_avis),
    FOREIGN KEY (id_user) REFERENCES user_ (id_user),
    FOREIGN KEY (id_avis) REFERENCES avis (id_avis)
);
