## Create schema `human'sfriends`;
## drop schema `human'sfriends`;
use `human'sfriends`;

##  низкоуровневые таблицы
create table cat (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Color VARCHAR(45)
);


create table dog (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Breed VARCHAR(45)
);


create table hamster (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Nutsquantity VARCHAR(45)
);



create table horse (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight VARCHAR(45),
    Name VARCHAR(45),
    Command VARCHAR(45)
	
);


create table camel (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	temperatureResistance VARCHAR(45),
    Name VARCHAR(45),
    Command VARCHAR(45)
);


create table donkey (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	loadSize VARCHAR(45),
    Name VARCHAR(45),
    Command VARCHAR(45)

);

## Создаем таблицы уровня выше
create table pet (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45)
);


create table packAnimal (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45)
);

## Создаем общую таблицу
create table humanFriend(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45)
    );
    
## Заполняем данными низкоуровневые таблицы
    
    insert into cat (Name, Command) values
    ('Барсик', 'Прыгать'),
    ('Мурзик', 'Прыгать'),
	('Месси', 'Прыгать'),
    ('Мурка', 'Прыгать');
    
    select * from cat;

    insert into dog (Name, Command) values
    ('Полкан', 'лаять'),
    ('Хатико', 'лаять'),
	('Юта', 'лаять'),
    ('Микки', 'лаять');
	
    select * from dog;
 
	insert into hamster (Name, Command) values
    ('Хома', 'дрожать'),
    ('Пушок', 'дрожать'),
	('Хомура', 'дрожать'),
    ('Генерал', 'дрожать');
	
    select * from hamster;
     
	insert into camel (camelName, camelCommand, temperatureResistance) values
    ('Агата', 'Плевать', 'сильное'),
    ('Ида', 'Плевать', 'сильное' ),
	('Ланцелот', 'Плевать', 'сильное' ),
    ('Джаред', 'Плеавть', 'сильное');
	
    select * from camel;
     
	insert into horse (Name, Command, liftWeight) values
    ('Мерин', 'Бежать', 150),
    ('Буран', 'Бежать', 50),
	('Плотва', 'Бежать', 200),
    ('Осман', 'Бежать', 250);
	
    select * from horse;    
     
	insert into donkey (Name, Command, loadSize) values
    ('Алдар', 'Сидеть', 'большой'),
    ('Бригелла', 'Сидеть', 'большой'),
	('Зигфрид', 'Сидеть', 'большой'),
    ('Моисей', 'Сидеть', 'большой');
	
    select * from donkey;  	
 
 ## Удаление таблицы верблюдов
 delete from camel where id > 0;
 select * from camel;
 
## Объединение таблицы лошадей и ослов в одну таблицу.
create table packAnimalNew (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select  Name, 
        Command
        from horse union 
select  Name, 
        Command
from donkey;

select * from packAnimalNew;


## Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

create table newhumanFriend (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select  Name, 
        Command,
        'cat' as oldTable
from cat union 
select  Name, 
        Command, 
        'dog' as oldTable
from dog union
select  Name, 
        Command, 
        'hamster' as oldTable
from hamster union 
select  Name, 
        Command,
        'horse' as oldTable
from horse union 
select  Name, 
        Command, 
        'donkey' as oldTable
from donkey;

select * from newhumanFriend;

