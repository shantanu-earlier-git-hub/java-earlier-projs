insert into users(user_name, password) values('bob', '1234');
insert into users(user_name, password) values('tom', '1234');
insert into users(user_name, password) values('smith', '1234');


insert into user_details(userid, is_account_locked, is_credential_expired, is_enabled, is_account_expired)
values (1, false, false,true,false);

insert into user_details(userid, is_account_locked, is_credential_expired, is_enabled, is_account_expired)
values (2, false, false,true,false);


insert into authorities(authority)
values('read');

insert into authorities(authority)
values('write');

insert into roles(role_name)
values('admin');

insert into roles(role_name)
values('user');

insert into roles(role_name)
values('manager');


insert into user_authorities(user_id,authority_id)
values(1, 2);

insert into user_authorities(user_id,authority_id)
values(2, 1);

insert into user_authorities(user_id,authority_id)
values(3, 2);


insert into user_roles(user_id,role_id)
values(1, 1);

insert into user_roles(user_id,role_id)
values(2, 2);

insert into user_roles(user_id,role_id)
values(3, 3);
