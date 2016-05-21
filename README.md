# Javarush-2016-probation-task

Тестовое задания для летней стажировки 2016 на Javarush.ru.
Возможные проблемы:
Поиск по возрасту, я указал в allusers.jsp тип относящегося к этому input как number, в некоторых браузерах может не поддерживаться,
у меня работало все по крайней мере в MicrosoftEdge.
Порядок запуска(на всякий случай):
Сначала maven Projects -> clean, install
Потом Run->Edit configuration->+->TomCat server local(порт 8080)->deployment->+->выбрать war

Создание и наполнение БД - скрипт createTestDB.sql
пароль и логин root, порт 3306, название: test, таблица: user
Возможные проблемы(Я столкнулся сначала):
Десинхронизация времени сервера и компьютера, или БД, или Hibernate, я толком не понял, для
решения в src\main\resources\application.properties , jdbc.url = jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Kiev
Возможно это стоит изменить в зависимости от местного времени, или вообще убрать.
