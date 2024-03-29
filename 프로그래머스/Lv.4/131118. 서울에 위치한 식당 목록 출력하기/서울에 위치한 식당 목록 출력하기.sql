# 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수
SELECT INFO.REST_ID,
INFO.REST_NAME,
INFO.FOOD_TYPE,
INFO.FAVORITES,
INFO.ADDRESS,
REVIEW.REVIEW_SCORE AS SCORE
FROM REST_INFO INFO
INNER JOIN ( SELECT REST_ID, ROUND(AVG(REVIEW_SCORE), 2) AS REVIEW_SCORE
               FROM REST_REVIEW
           GROUP BY REST_ID
            ) REVIEW ON ( INFO.REST_ID = REVIEW.REST_ID)
WHERE INFO.ADDRESS LIKE "서울%"
ORDER BY REVIEW.REVIEW_SCORE DESC, INFO.FAVORITES DESC