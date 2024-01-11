def solution(str1, str2):
    answer = ''
    for a, b in zip(str1, str2):
        answer += a + b
        
    for i in range(7, 0 , -1):
        print(i)
    return answer