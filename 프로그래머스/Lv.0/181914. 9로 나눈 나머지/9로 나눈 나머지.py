def solution(number):
    answer = sum(map(int, number))%9
    return answer