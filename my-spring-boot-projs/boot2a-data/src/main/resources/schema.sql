drop table if exists books;
create table books
(
    id          serial primary key,
    book_name    varchar(20) not null,
    author      varchar(40) not null,
    price       numeric(8, 2) not null,
    isAvailable boolean
);
