create database dailyReport;

use dailyReport;

INSERT INTO `dailyReport`.`Divisions`
(`createdAt`,`updatedAt`,`description`,`name`,`managerId`)
VALUES
(
CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'Bộ phận 5 anh em spring','Bộ phận 1',1);

insert into
        dailyReport.Users
        (createdAt, updatedAt, divisionId, email, name, password, role) 
    values
        (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'test1@gmail.com', 'Trọng Đại', '123123', 1),
        (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'test2@gmail.com', 'Bình', '123123', 1),
        (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'test3@gmail.com', 'Long', '123123', 1),
        (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'manager@gmail.com', 'Vân', '123123', 2),
        (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, null, 'admin@gmail.com', 'Quản lý Kim', '123123', 3),
        (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, null, 'system@gmail.com', 'Hệ thống sun', '123123', 4);

-- insert into
--         dailyReport.Users
--         (createdAt, updatedAt, divisionId, email, name, password, role) 
--     values
--         (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'test1@gmail.com', 'Trọng Đại', '123123', 'user'),
--         (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'test2@gmail.com', 'Bình', '123123', 'user'),
--         (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'test3@gmail.com', 'Long', '123123', 'user'),
--         (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 'manager@gmail.com', 'Vân', '123123', 'manager'),
--         (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, null, 'admin@gmail.com', 'Quản lý Kim', '123123', 'admin'),
--         (CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, null, 'system@gmail.com', 'Hệ thống sun', '123123', 'system');

select * from dailyReport.Users where role = 2;

INSERT INTO `dailyReport`.`Reports`
(`createdAt`,`updatedAt`,`actualTask`,`date`,`issue`,`plannedTask`,`reviewerId`,`userId`)
VALUES
(CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,'Hoàn thành Dao manager', CURRENT_TIMESTAMP, 'Không có vấn đề', 'Dự kiến code Service', 5, 2),
(CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,'Hoàn thành Dao1 manager', CURRENT_TIMESTAMP, 'Không có vấn đề', 'Dự kiến code Service1', 5, 2),
(CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,'Hoàn thành Dao2 manager', CURRENT_TIMESTAMP, 'Không có vấn đề', 'Dự kiến code Service2', 5, 3);

select * from `dailyReport`.`Reports`;
