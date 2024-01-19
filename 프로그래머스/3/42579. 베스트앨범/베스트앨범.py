def solution(genres, plays):
    answer = []
    
    # 장르 종류
    counter = { s : 0 for s in set(genres) }
    
    # 고유번호 + 장르 + 재생 수
    list = [(index,a,b) for index, (a,b) in enumerate(zip(genres, plays)) ]
    
    # 장르 우선 순위
    for index, a, b in list:
        counter[a] += b
    
    rank = sorted(counter.items(), key = lambda counter: counter[1], reverse = True)

    # 재생 수를 기반으로 내림차순 정렬
    sorted_plays = sorted(list, key=lambda x : x[2], reverse = True)
    
    for kind, cnt in rank:
        pick = 0
        for index, a, count in sorted_plays:
            if kind == a:
                answer.append(index)
                pick += 1
                
            if pick == 2:
                break
    
    return answer