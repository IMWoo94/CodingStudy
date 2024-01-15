def solution(my_strings, parts):
    answer = ''
    for str, (s, e) in zip(my_strings, parts):
        answer += str[s:e+1]
    return answer