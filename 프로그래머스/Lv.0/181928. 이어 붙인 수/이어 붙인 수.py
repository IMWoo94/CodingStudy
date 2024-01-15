def solution(num_list):
    a, b ="",""
    for num in num_list:
        if num % 2 == 0:
            a += str(num)
        else:
            b += str(num)
    answer = int(a) + int(b)
    return answer