from collections import Counter

def solution(clothes):
    answer = 1
#     kind = {}
#     for clothe in clothes:
#         kind[clothe[1]] = kind.get(clothe[1], 0)+ 1
    kind = dict(Counter([kind for name, kind in clothes]))
        
    for num in kind.values():
        answer *= num + 1
        
    return answer -1 
    