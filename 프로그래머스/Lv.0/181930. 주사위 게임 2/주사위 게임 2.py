def solution(a, b, c):
    answer = 0
    count = len(''.join(set(f"{a}{b}{c}")))
    if count == 3:
        answer = a + b + c
    elif count == 2:
        answer = (a+b+c) * (a**2 + b**2 + pow(c,2))
    else:
        answer = (a+b+c) * (a**2 + b**2 + pow(c,2)) * (a**3 + b**3 + pow(c,3))
    return answer