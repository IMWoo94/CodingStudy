def solution(n):
    answer = []
    if n != 1 :
        while n > 1:
            answer.append(n)
            if n % 2:
                n = 3*n+1
            else:
                n = n/2
                
    answer.append(1)
    return answer