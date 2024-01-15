def solution(a, b, c, d):
    answer = 0
    l = [a,b,c,d]
    c = [l.count(x) for x in l]
    if max(c) == 4:
        answer = 1111 * l[c.index(4)]
    elif max(c) == 3:
        answer = (10 * l[c.index(3)] + l[c.index(1)]) ** 2
    elif max(c) == 2:
        if min(c) == 1:
            answer = eval('*'.join([str(l[i]) for i, x in enumerate(c) if x == 1]))
        else :
            answer = (max(l) + min(l)) * abs(max(l) - min(l))
        pass
    else:
        answer = min(l)
    print(c)
    return answer