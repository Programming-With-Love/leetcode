select p.Email as Email from Person p group by p.Email having count(p.Email) > 1;