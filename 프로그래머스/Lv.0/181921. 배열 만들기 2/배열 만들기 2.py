import re
def solution(l, r):
    answer = []
    let = set(['5','0'])
    for num in range(l,r+1):
        if not set(str(num)) - let:
            answer.append(num)
    
    if not answer:
        answer.append(-1)
    return answer