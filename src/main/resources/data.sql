-- noinspection SqlNoDataSourceInspectionForFile

insert into author
values (1, 'Giovanni Bocacchio');
insert into author
values (2, 'F. Scott Fitzgerald');

insert into book
values (1, 'Bible'),
       (2, 'The Decameron'),
       (3, 'The Life of Dante'),
       (4, 'The Great Gatsby'),
       (5, 'The Curious Case of Benjamin Buttons');

insert into book_authorship(author_id, books_id)
values (1, 2),
       (1, 3),
       (2, 4),
       (2, 5),
       (1, 5) -- fictional data - in order to test the many to many relationship
;