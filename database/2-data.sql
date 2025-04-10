-- Insertion dans la table users
INSERT INTO users (email, password, name, last_name) VALUES
                                                         ('rabe@example.com', 'itu16', 'Rabe', 'Rakoto'),
                                                         ('sara@example.com', 'itu16', 'Sara', 'Rasoa'),
                                                         ('haja@example.com', 'itu16', 'Haja', 'Andrianina'),
                                                         ('lala@example.com', 'itu16', 'Lala', 'Razafy');

-- Insertion dans la table service_category
INSERT INTO service_category (service_name,src_photo) VALUES
                                                ('Fuite de tuyau','Update one day'),
                                                ('Creuseur de puits','Update one day'),
                                                ('Porteur de bidons','Update one day'),
                                                ('Nettoyeurs de dalle','Update one day'),
                                                ('Nettoyage de plage','Update one day'),
                                                ('Transport d''eau','Update one day'),
                                                ('Sanitaire','Update one day'),
                                                ('Plomberie','Update one day');

-- Insertion dans la table photo
INSERT INTO photo (photo_src) VALUES
                                  ('https://example.com/photos/worker1.jpg'),
                                  ('https://example.com/photos/service1.jpg'),
                                  ('https://example.com/photos/location1.jpg');

-- Insertion dans la table worker
INSERT INTO worker (description, salaire, id_user) VALUES
                                                       ('Mpandrafitra manana traikefa 5 taona', 450000, 1),
                                                       ('Mpamindra entana miavaka', 350000, 2),
                                                       ('Mpanadio birao matihanina', 250000, 3);

-- Insertion dans la table avis
INSERT INTO avis (star, description) VALUES
    (5, 'Tena afa-po tamin''ny serivisy.'),
(4, 'Niasa tsara fa mbola misy fanatsarana.'),
(3, 'Efa tsara fa tsy niaraka tamin''ny fotoana voatondro.');

-- Insertion dans la table request_state
INSERT INTO request_state (state) VALUES
                                      ('Voaray'),
                                      ('An-dalana'),
                                      ('Vita');

-- Insertion dans la table services
INSERT INTO services (description, date_, time_, addresse, id_request_state, id_worker, id_client, id_service) VALUES
                                                                                                                   ('Fanamboarana rindrina simba', '2025-04-01', '08:30', 'Lot 123 Analakely', 1, 1, 4, 1),
                                                                                                                   ('Fanadiovana fiara tao anatin''ny fotoana fohy', '2025-04-02', '10:00', 'Lot 456 Isoraka', 2, 3, 2, 4),
('Famindran-toerana entana avy eny Ambanidia ho eny Andohalo', '2025-04-03', '14:00', 'Lot 789 Ambanidia', 3, 2, 3, 2);

-- Insertion dans la table request_photo
INSERT INTO request_photo (id_service_request, id_photo) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Insertion dans la table avis_user
INSERT INTO avis_user (id_user, id_avis) VALUES
(4, 1),
(3, 2),
(2, 3);

INSERT INTO users (email, password, name, last_name) VALUES
                                                         ('ryan@gmail.com', 'itu16', 'Ryan', 'Lizka');

select
    u1_0.id_user,
    u1_0.email,
    u1_0.last_name,
    u1_0.name,
    u1_0.password
from
    user u1_0
where
        u1_0.email='ryan@gmail.com'