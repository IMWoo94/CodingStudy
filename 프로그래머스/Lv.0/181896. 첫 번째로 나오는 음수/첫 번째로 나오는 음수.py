def solution(num_list):
    answer = -1
    for num in num_list:
        if num < 0:
            return num_list.index(num)
    return answer