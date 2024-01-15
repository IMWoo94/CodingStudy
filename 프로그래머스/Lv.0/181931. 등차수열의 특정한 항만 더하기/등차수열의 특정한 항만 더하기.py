def solution(a, d, included):
    answer = 0
    for bol in included:
        if bol:
            answer += a
        a += d
        
    return answer