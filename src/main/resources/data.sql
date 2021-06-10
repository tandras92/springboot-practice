-- INSERT INTO author (author_id, first_nm, last_nm)
-- VALUES ('7de95e63-41cf-4ebc-be66-00a62ecafc85', 'James', 'Bond');
--
-- INSERT INTO publisher (publisher_id, publisher_address,
--                        publisher_city, publisher_nm, publisher_state_cd, publisher_zipcode)
-- VALUES ('c1027673-9ebf-4fa1-bec0-7a722e43fbb7', '0132 Spencer Radial',
--         'South Billland', 'Brill Publishers', 'FL', '30476');
--
-- INSERT INTO book (book_id, record_create_ts, book_genre, book_isbn, book_title,
--                   publisher_id)
-- VALUES ('2b0beb26-a342-4db1-a32b-8e35160c02bb',
--         '2020-04-20T14:30:40.100', 'suspense', '9783161484100',
--         'Shaken, Not Stirred', '4f273973-774e-497f-9b72-6730659b21ac');

SELECT * FROM book;
SELECT * FROM publisher;
SELECT * FROM author;