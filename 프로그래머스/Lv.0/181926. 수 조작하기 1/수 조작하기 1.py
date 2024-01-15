def solution(n, control):
    key = dict(zip(["w","s","d","a"], [1,-1,10,-10]))
    answer = n + sum([key[str] for str in control])
    return answer