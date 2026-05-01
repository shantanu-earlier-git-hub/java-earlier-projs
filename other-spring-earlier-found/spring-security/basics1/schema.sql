drop table if exists users;
drop table if exists user_details;
drop table if exists otp;
drop table if exists roles;
drop table if exists authorities;
drop table if exists user_authorities;
drop table if exists user_roles;

create table users
(id serial primary key, user_name varchar(20) not null, password text not null);

create table otp
(id serial primary key, user_id numeric not null, code numeric not null);

create table modules
(id serial primary key, module varchar(40) not null);


create table role_modules
(id serial primary key, role_id numeric not null,module_id numeric not null,  authority_id numeric not null);


create table user_details
(id serial primary key ,
 userid numeric,
 is_account_locked boolean,
 is_credential_expired boolean,
 is_enabled boolean,
 is_account_expired boolean);

create table roles
(id serial primary key , role_name varchar(20) not null unique);

create table authorities
(id serial primary key , authority varchar(10) not null unique);

create table user_authorities
(id serial primary key , user_id numeric, authority_id numeric not null, unique (user_id, authority_id));

create table user_roles
(id serial primary key , user_id numeric, role_id numeric not null, unique (user_id, role_id));