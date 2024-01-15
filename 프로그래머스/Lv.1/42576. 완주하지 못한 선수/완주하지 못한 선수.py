from collections import Counter

def solution(participant, completion):
    a = Counter(participant)
    b = Counter(completion)
    
    return list(a-b)[0]