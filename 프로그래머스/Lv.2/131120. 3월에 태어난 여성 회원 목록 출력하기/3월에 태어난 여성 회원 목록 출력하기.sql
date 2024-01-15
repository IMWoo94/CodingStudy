-- 코드를 입력하세요
SELECT member_id,
member_name,
gender,
date_format(date_of_birth, "%Y-%m-%d") as date_of_birgth
from member_profile
where gender = "W"
and DATE_FORMAT(date_of_birth, "%m") = '03'
and not tlno is null
order by member_id